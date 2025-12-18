require('dotenv').config();
const TelegramBot = require('node-telegram-bot-api');
const fs = require('fs');
const path = require('path');
const imageService = require('./imageService');

const token = process.env.TELEGRAM_BOT_TOKEN;

if (!token) {
  console.error('Error: TELEGRAM_BOT_TOKEN is not set in .env file');
  process.exit(1);
}

const bot = new TelegramBot(token, { polling: true });

// Handle /start command
bot.onText(/\/start/, (msg) => {
  const chatId = msg.chat.id;
  const startMessage = `
Welcome to Image Generator Bot! 🎨

Use the command:
/image <description>

Example:
/image a beautiful sunset over the mountains

The bot will generate an image based on your description.
  `.trim();
  
  bot.sendMessage(chatId, startMessage);
});

// Handle /image command
bot.onText(/\/image\s+(.+)/, async (msg, match) => {
  const chatId = msg.chat.id;
  const prompt = match[1];

  // Send "generating" message
  await bot.sendMessage(chatId, '⏳ Generating image, please wait...');

  try {
    console.log(`Generating image for prompt: "${prompt}"`);
    
    // Generate the image
    const imageBuffer = await imageService.generateImage(prompt);

    // Send the image
    await bot.sendPhoto(chatId, imageBuffer, {
      caption: `Generated from: "${prompt}"`
    });

    console.log(`Image sent successfully for chat ${chatId}`);
  } catch (error) {
    console.error(`Error generating image: ${error.message}`);
    await bot.sendMessage(
      chatId,
      `❌ Error generating image: ${error.message}`
    );
  }
});

// Handle any other message
bot.on('message', (msg) => {
  const chatId = msg.chat.id;
  
  // Ignore if it's a command
  if (msg.text && msg.text.startsWith('/')) {
    return;
  }

  const helpMessage = `
📝 Please use the command:
/image <description>

Example:
/image a futuristic city at night
  `.trim();

  bot.sendMessage(chatId, helpMessage);
});

// Handle errors
bot.on('error', (error) => {
  console.error('Bot error:', error);
});

bot.on('polling_error', (error) => {
  console.error('Polling error:', error);
});

console.log('🤖 Image Generator Bot started successfully!');
console.log('Bot is polling for messages...');

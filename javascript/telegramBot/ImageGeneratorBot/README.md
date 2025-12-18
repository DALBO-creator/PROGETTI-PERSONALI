# Image Generator Telegram Bot (JavaScript)

A Telegram bot built with Node.js that generates images from text prompts using the Craiyon API.

## Features

- 🎨 Generate images from text descriptions
- ⚡ Built with Node.js and node-telegram-bot-api
- 🔄 Automatic retry logic for failed requests
- 📦 Easy to set up and deploy

## Prerequisites

- Node.js (v14 or higher)
- npm or yarn
- A Telegram Bot Token (get it from [@BotFather](https://t.me/botfather))

## Installation

1. Clone the repository:
```bash
cd ImageGeneratorBot
```

2. Install dependencies:
```bash
npm install
```

3. Create a `.env` file from the template:
```bash
cp .env.example .env
```

4. Add your Telegram bot token to `.env`:
```
TELEGRAM_BOT_TOKEN=your_bot_token_here
```

## Usage

### Start the bot:
```bash
npm start
```

### Development mode (with auto-reload):
```bash
npm run dev
```

### Using the bot:

1. Open Telegram and search for your bot
2. Send `/start` to see the welcome message
3. Use `/image <description>` to generate an image

Examples:
- `/image a beautiful sunset over the mountains`
- `/image a futuristic city at night`
- `/image a cute cat wearing glasses`

## How it works

1. User sends `/image <prompt>` command
2. Bot sends a "generating..." message
3. Bot calls the Craiyon API with the prompt
4. API returns a base64-encoded image
5. Bot converts it to a buffer and sends it to the user
6. If generation fails, the bot retries up to 3 times with 2-second delays

## Project Structure

```
ImageGeneratorBot/
├── bot.js              # Main bot file with message handlers
├── imageService.js     # Image generation service (Craiyon API wrapper)
├── package.json        # Project dependencies
├── .env.example        # Example environment variables
├── .gitignore          # Git ignore file
└── README.md           # This file
```

## Dependencies

- **node-telegram-bot-api**: Official Telegram Bot API library
- **axios**: HTTP client for API requests
- **dotenv**: Environment variable management

## Development Dependencies

- **nodemon**: Auto-restart the bot on file changes

## API Used

- [Craiyon API](https://www.craiyon.com/) - Free AI image generation service

## License

ISC

## Troubleshooting

### Bot doesn't respond
- Verify your bot token in `.env`
- Check that the bot is running: `npm start`
- Check the console for error messages

### Image generation fails
- The Craiyon API might be temporarily unavailable
- Try a simpler prompt
- Check your internet connection

### Module not found errors
- Run `npm install` again
- Delete `node_modules` folder and run `npm install`

## Notes

- The bot uses long polling by default
- Each image generation can take 10-60 seconds
- The Craiyon API is free but has rate limits

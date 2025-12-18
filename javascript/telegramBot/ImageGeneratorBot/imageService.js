const axios = require('axios');

const CRAIYON_API_URL = 'https://backend.craiyon.com/generate';

class ImageService {
  constructor() {
    this.client = axios.create({
      timeout: 180000, // 3 minutes timeout
      headers: {
        'Content-Type': 'application/json'
      }
    });
  }

  async generateImage(prompt, maxRetries = 3) {
    let lastError;

    for (let attempt = 1; attempt <= maxRetries; attempt++) {
      try {
        return await this.callCraiyon(prompt);
      } catch (error) {
        lastError = error;
        if (attempt < maxRetries) {
          console.log(`Attempt ${attempt} failed: ${error.message}. Retrying in 2 seconds...`);
          await new Promise(resolve => setTimeout(resolve, 2000));
        }
      }
    }

    throw lastError;
  }

  async callCraiyon(prompt) {
    try {
      const response = await this.client.post(CRAIYON_API_URL, {
        prompt: prompt
      });

      if (response.data && response.data.images && response.data.images.length > 0) {
        const base64Image = response.data.images[0];
        // Convert base64 to buffer
        return Buffer.from(base64Image, 'base64');
      } else {
        throw new Error('No image generated from Craiyon API');
      }
    } catch (error) {
      if (error.response) {
        throw new Error(`Craiyon API error: ${error.response.status}`);
      }
      throw new Error(`Failed to generate image: ${error.message}`);
    }
  }
}

module.exports = new ImageService();

const { defineConfig, devices } = require('@playwright/test');
const { on } = require('node:cluster');

module.exports = defineConfig({
  testDir: './tests',
  timeout: 30 * 10000,
  expect: {
    timeout: 10 * 1000
  },
  fullyParallel: false,
  workers: 1,
  retries: process.env.CI ? 2 : 0,

  reporter: [
    ['list'],
    ['html', { outputFolder: 'reports/html', open: 'never' }],
     ['line'],
    ['allure-playwright']

  ],

  use: {
    baseURL: process.env.BASE_URL || 'https://demo.guru99.com/V4/index.php',
    headless: false,
    screenshot: 'only-on-failure',
    video: 'retain-on-failure',
    trace: 'retain-on-failure',
    actionTimeout: 20 * 10000,
    navigationTimeout: 20 * 10000
    
  },

  projects: [
    {
      name: 'chromium',
      use: { ...devices['Desktop Chrome'] }
    }
  ]
});



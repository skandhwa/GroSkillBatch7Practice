# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: NewCustomer.spec.js >> New Customer Creation
- Location: tests\NewCustomer.spec.js:10:1

# Error details

```
Error: page.waitForTimeout: Target page, context or browser has been closed
```

# Test source

```ts
  1  | const {test,expect} = require('@playwright/test')
  2  | 
  3  | const loginData= require ('../test-data/LoginData.json')
  4  | const {getURLFromExcel,generateEmail} =require('../utilities/testdata');
  5  | 
  6  | const { LoginPage1 } = require('../pages/LoginPage1');
  7  | const { NewCustomerPage } = require('../pages/NewCustomerPage');
  8  | 
  9  | 
  10 | test('New Customer Creation', async ({ page }) => {
  11 |  
  12 | const loginPage= new LoginPage1(page);
  13 | const customerPage= new NewCustomerPage(page);
  14 | 
  15 | const url=getURLFromExcel();
  16 | 
  17 | await page.goto(url);
  18 | 
  19 | await loginPage.login
  20 | (
  21 | loginData.username,
  22 | loginData.password
  23 | 
  24 | );
  25 | 
  26 | 
  27 | const customer ={
  28 | 
  29 |     name:'Tom',
  30 |     dob:'05121991',
  31 |     address:'MgRoad',
  32 |     city:'Pune',
  33 |     state:'Maharastra',
  34 |     pin:'713304',
  35 |     mobile:'8010245678',
  36 |     email:generateEmail(),
  37 |     password:'test@5678'
  38 | 
  39 | 
  40 | 
  41 | 
  42 | 
  43 | 
  44 | }
  45 | 
  46 | 
  47 | await customerPage.clickOnNewCustomer();
  48 | await customerPage.createCustomer(customer);
> 49 | await page.waitForTimeout(5000);
     |            ^ Error: page.waitForTimeout: Target page, context or browser has been closed
  50 | 
  51 | 
  52 | 
  53 | 
  54 | });
  55 | 
  56 | 
```
const {test,expect} = require('@playwright/test')

const loginData= require ('../test-data/LoginData.json')
const {getURLFromExcel} =require('../utilities/testdata');

const { LoginPage1 } = require('../pages/LoginPage1');

test('Validate Login', async ({ page }) => {
 
const loginPage= new LoginPage1(page);

const url=getURLFromExcel();

await page.goto(url);

await loginPage.login
(
loginData.username,
loginData.password

);


});


 
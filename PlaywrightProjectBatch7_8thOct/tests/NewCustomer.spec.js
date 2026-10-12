const {test,expect} = require('@playwright/test')

const loginData= require ('../test-data/LoginData.json')
const {getURLFromExcel,generateEmail} =require('../utilities/testdata');

const { LoginPage1 } = require('../pages/LoginPage1');
const { NewCustomerPage } = require('../pages/NewCustomerPage');


test('New Customer Creation', async ({ page }) => {
 
const loginPage= new LoginPage1(page);
const customerPage= new NewCustomerPage(page);

const url=getURLFromExcel();

await page.goto(url);

await loginPage.login
(
loginData.username,
loginData.password

);


const customer ={

    name:'Tom',
    dob:'05121991',
    address:'MgRoad',
    city:'Pune',
    state:'Maharastra',
    pin:'713304',
    mobile:'8010245678',
    email:generateEmail(),
    password:'test@5678'






}


await customerPage.clickOnNewCustomer();
await expect(page).toHaveURL(/addcustomer/i);
await customerPage.createCustomer(customer);
await page.waitForTimeout(5000);




});


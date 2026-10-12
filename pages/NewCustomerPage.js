class NewCustomerPage
{
    constructor(page)
    {
        this.page=page;
        this.newCustomerLink = page.getByText('New Customer', { exact: true });
    this.customerName = page.locator('input[name="name"]');
    this.genderMale = page.locator('input[value="m"]');
  

    this.dateOfBirth = page.locator('input[id="dob"]');
    this.address = page.locator('textarea[name="addr"]');
    this.city = page.locator('input[name="city"]');
    this.state = page.locator('input[name="state"]');
    this.pin = page.locator('input[name="pinno"]');
    this.mobile = page.locator('input[name="telephoneno"]');
    this.email = page.locator('input[name="emailid"]');
    this.password = page.locator('input[name="password"]');
    this.submitButton = page.locator('input[type="submit"]');


    this.customerId = page.locator('td', { hasText: 'Customer ID' }).locator('xpath=following-sibling::td[1]');
    }

    async clickOnNewCustomer() {
    await this.newCustomerLink.click();
  }

  async enterCustomerName(name) {
    await this.customerName.fill(name);
  }

  async selectGender() {
    await this.genderMale.check();
  }

  async enterDOB(dob) {
    if (!dob) return;

    let normalizedDob = dob;
    const legacyDobMatch = /^([0-9]{2})([0-9]{2})([0-9]{4})$/.exec(dob);

    if (legacyDobMatch) {
      const [, day, month, year] = legacyDobMatch;
      normalizedDob = `${year}-${month}-${day}`;
    }

    await this.dateOfBirth.fill(normalizedDob);
  }

  async enterAddress(address) {
    await this.address.fill(address);
  }

  async enterCity(city) {
    await this.city.fill(city);
  }

  async enterState(state) {
    await this.state.fill(state);
  }

  async enterPin(pin) {
    await this.pin.fill(pin);
  }

  async enterMobile(mobile) {
    await this.mobile.fill(mobile);
  }

  async enterEmail(email) {
    await this.email.fill(email);
  }

  async enterPassword(password) {
    await this.password.fill(password);
  }

  async clickOnSubmit() {
    await this.submitButton.click();
  }


   async createCustomer(customer) {
    await this.enterCustomerName(customer.name);
    await this.selectGender();
    
    await this.enterDOB(customer.dob);
    await this.enterAddress(customer.address);
    await this.enterCity(customer.city);
    await this.enterState(customer.state);
    await this.enterPin(customer.pin);
    await this.enterMobile(customer.mobile);
    await this.enterEmail(customer.email);
    await this.enterPassword(customer.password);
    await this.clickOnSubmit();
  }

  async getCustomerId() {
    await this.customerId.waitFor({ state: 'visible' });
    return (await this.customerId.textContent()).trim();
  }




    }

    module.exports= {NewCustomerPage};

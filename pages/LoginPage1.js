class LoginPage1
{

constructor(page)

{
    this.page=page;
    this.username=page.locator('input[name="uid"]');
    this.password=page.locator('input[name="password"]');
    this.loginBtn=page.locator('input[name="btnLogin"]');
}

async enterUserName(username)
{
    await this.username.fill(username);
}

async enterPassword(password)
{
    await this.password.fill(password);
}

async clickLogin()
{
    await this.loginBtn.click();
}


async login(username,password)
{
    await this.enterUserName(username);
    await this.enterPassword(password);
    await this.clickLogin();

}



}

module.exports={ LoginPage1 };

package BankAndCashPage;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankCash extends BasePage {

	WebDriver driver;

	public BankCash(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id ='username']")
	WebElement username;
	@FindBy(how = How.XPATH, using = "//input[@id ='password']")
	WebElement password;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Sign in')]")
	WebElement siginin_button;
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Dashboard')]")
	WebElement dahboardpage;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Bank & Cash')]")
	WebElement Bank_Cash_Field;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'New Account')]")
	WebElement New_Customer_Field;
	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Add New Account')]")
	WebElement Add_customer_Field;

	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement Account_Title_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='description']")
	WebElement Description_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='balance']")
	WebElement Initial_Balance_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']")
	WebElement Account_Number_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_person']")
	WebElement Contact_Person_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_phone']")
	WebElement Phone_Field;
	@FindBy(how = How.XPATH, using = "//input[@id='ib_url']")
	WebElement Internet_Banking_URL_Field;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),' Submit')]")
	WebElement Sumbit_button_Field;

	@FindBy(how = How.XPATH, using = "//div[3]/div[1]")
	WebElement Sucess_Field;

	public void login_and_password_textbox_field(String name, String pasword) {
		username.sendKeys(name);
		password.sendKeys(pasword);
	}

	public void sigin_on_loginpage() {
		siginin_button.click();
	}

	public void verfiying_dahboard_page() {
		String dppage = dahboardpage.getText();
		Assert.assertEquals("Dashboard", dppage);

	}

	public void bank_Cash() throws InterruptedException {
		Bank_Cash_Field.click();
		Thread.sleep(2000);
	}

	public void newcustomer() {

		New_Customer_Field.click();
	}

	public void verify_add_customer_page() {
		String addcustomertext = Add_customer_Field.getText();
		Assert.assertEquals("landed on wrong page", "Add New Account", addcustomertext);
	}

	public void account_field(String acc_name) {
		Account_Title_Field.sendKeys(acc_name + random(100));
	}

	public void description_field(String desc_name) {
		Description_Field.sendKeys(desc_name + random(100));
	}

	public void balance_field(int amount) {

		Initial_Balance_Field.sendKeys("" + amount + random(100));
	}

	public void acc_num_field(int account_number) {
		Account_Number_Field.sendKeys("" + account_number + random(100));
	}

	public void contact_person_field(String person_name) {
		Contact_Person_Field.sendKeys(person_name + random(100));
	}

	public void phone_num_field(int phone_number) {
		Phone_Field.sendKeys("" + phone_number + random(1000));
	}

	public void url_field(String url_name) {
		Internet_Banking_URL_Field.sendKeys(url_name);
	}

	public void sumbit_field() {
		Sumbit_button_Field.click();
	}
	
	public void verify_sucessfully_created() {
		String actual = Sucess_Field.getText();
		//String Excepted = "Account Created Successfully";
		Assert.assertEquals("invalid account exist","×\n" + "Account Created Successfully",actual);
		//System.out.println(actual);
		
	}

}

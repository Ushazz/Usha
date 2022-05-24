package PomScript;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Class
{
	@FindBy(id="firstName")
	private WebElement fname;
	@FindBy(id="lastName")
	private WebElement lname;
	@FindBy(id="userEmail")
	private WebElement email;
	@FindBy(xpath="//label[.='Male']")
	private WebElement mradio;
	@FindBy(xpath="//label[.='Female']")
	private WebElement fradio;
	@FindBy(xpath="//label[.='Other']")
	private WebElement oradio;
	@FindBy(id="userNumber")
	private WebElement mobile;
	@FindBy(id="dateOfBirthInput")
	private WebElement DOB;
	@FindBy(xpath="//div[.='3']")
	private WebElement date;
	@FindBy(id="subjectsContainer")
	private WebElement subject;
	
	
	@FindBy(xpath="(//div[@class='custom-control custom-checkbox custom-control-inline'][1]")
	private WebElement sports;
	@FindBy(xpath="(//div[@class='custom-control custom-checkbox custom-control-inline'][2]")
	private WebElement Reading;
	@FindBy(xpath="(//div[@class='custom-control custom-checkbox custom-control-inline'][3]")
	private WebElement Music;
	@FindBy(id="uploadPicture")
	private WebElement pic;
	@FindBy(id="currentAddress")
	private WebElement address;
	@FindBy(xpath="(//div[.='Select State'])[2]")
	private WebElement state;
	@FindBy(xpath="(//div[.='Select City'])[1]")
	private WebElement city;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	private WebElement dd1;
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	private WebElement dd2;
	
	
	public POM_Class(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void first(String uname)
	{
	fname.sendKeys(uname);
	}
	public void lname(String lame)
	{
	lname.sendKeys(lame);
	}
	public void email(String mail)
	{
	email.sendKeys(mail);
	}
	public void mradio()
	{
	mradio.click();
	}
	public void fradio()
	{
		fradio.click();
	}
	
	public void oradio()
	{
		oradio.click();
	}
	
	public void mobile(String mobileno)
	{
		mobile.sendKeys(mobileno);
	}
	public void DOB()
	{
		DOB.click();
	
	}
	
	public WebElement getdd1()
	{
		return dd1;
	}
	
	public WebElement getdd2()
	{
		return dd2;
	}
	public void dateselect()
	{
		date.click();
	}
	public void cbox1()
	{
		sports.click();
	}
	public void cbox2()
	{
		Reading.click();
	}
	public void cbox3()
	{
		Music.click();
	}
	public void photo(String picture)
	{
		pic.sendKeys(picture);
	}
	public void paaddress(String adress)
	{
		address.sendKeys(adress);
	}
	public void dropdown1()
	{
		state.click();
	}
	public void dropdown2()
	{
		city.click();
	}
	public void lastbutton()
	{
		submit.click();
	}
	
	

}

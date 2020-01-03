package ssms.SSMS_Automation;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Base {

	public static WebDriver driver;
	public static WebDriverWait wait;
	//public Login login=new Login();
	public static WriteConfig writeConfig = new WriteConfig();
	public static DataProvider dataProvider = new DataProvider();
	@BeforeMethod
	public void setup() {
		try {
			  // System Property for Chrome Driver   
	        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\Driver\\chromedriver.exe");  
	          
	             // Instantiate a ChromeDriver class.     
	         driver=new ChromeDriver();  
	         //changingsomething
	         //Instantiate wait
	         wait=new WebDriverWait(driver, 45);
	         
	         //Maximize the browser  
	          driver.manage().window().maximize();
	          
	           // Launch Website  
	        driver.navigate().to("http://demo.horolab.in/#/ecommerce/home");  
	          
  
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public int randomGenerator(int digitNo) {
		// TODO Auto-generated method stub
		int randomInt = 1;
		try {
			int nextInt=1;
			for(int i =1;i<=digitNo;i++){
				nextInt=nextInt*10;
			}
			System.out.println("nextint "+nextInt);
			Random randomGenerator = new Random();
			randomInt = randomGenerator.nextInt(nextInt);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return randomInt;
	}

	//@Override
	public int randomGenerator(int low, int high) {
		// TODO Auto-generated method stub
		int randomInt = 1;
		try {
			Random r = new Random();
			randomInt = r.nextInt(high-low) + low;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return randomInt;
	}
	
	 public String randomString()
	    {
	        String alphabet= "abcdefghijklmnopqrstuvwxyz";
	        String s = "";
	        Random random = new Random();
	        int randomLen = 1+random.nextInt(9);
	        for (int i = 0; i < randomLen; i++) {
	            char c = alphabet.charAt(random.nextInt(26));
	            s+=c;
	        }
	         return  s;
	        //System.out.println(s);
	    }
	
	 public String randomName() {
		  
		    int leftLimit = 97; // letter 'a'
		    int rightLimit = 122; // letter 'z'
		    int targetStringLength = 10;
		    //String ss = "";
		    Random random = new Random();
		    StringBuilder buffer = new StringBuilder(targetStringLength);
		    for (int i = 0; i < targetStringLength; i++) {
		        int randomLimitedInt = leftLimit + (int) 
		          (random.nextFloat() * (rightLimit - leftLimit + 1));
		        buffer.append((char) randomLimitedInt);
		    }
		    String generatedString = buffer.toString();
		 
		    System.out.println(generatedString);
		    return generatedString;
		}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	public String getPropertyData(String key){

		String value=dataProvider.getPropertyvalue("DataStore",key);
		return value;

		}

		public void storeData(String key,String value){

		writeConfig.writeData(key,value,"DataStore");
		}
	

}

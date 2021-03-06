package ssms.SSMS_Automation;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Properties;


/**
 * @author UmaSasmal
 *
 */
public class DataProvider {

	public String getPropertyval(String key){

		String value=getPropertyvalue("Config",key);
		return value;


	}

	protected String getPropertyvalue(String fileName, String key){

		FileInputStream fis;
		String value=null;
		try {
			fis = new FileInputStream(System.getProperty("user.dir") + "\\"+fileName+".properties");

			Properties prop = new Properties();
			prop.load(fis);
			value=prop.get(key).toString();
			if(value==null || value ==""){
				System.out.println("Set "+key);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	} 

	public int getPropertysize(String fileName){

		FileInputStream fis;
		int value=0;
		try {
			fis = new FileInputStream(System.getProperty("user.dir") + "\\"+fileName+".properties");

			Properties prop = new Properties();
			prop.load(fis);
			value=prop.size();
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}

	
}

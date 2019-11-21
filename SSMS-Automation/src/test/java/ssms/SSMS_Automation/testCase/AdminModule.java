package ssms.SSMS_Automation.testCase;

import org.testng.annotations.Test;

import ssms.SSMS_Automation.Base;
import ssms.SSMS_Automation.modules.AdminModulePage;
import ssms.SSMS_Automation.modules.FieldVerificationStateOfAdminModulePage;
import ssms.SSMS_Automation.modules.HomePage;
import ssms.SSMS_Automation.modules.Login;
import ssms.SSMS_Automation.modules.StateTableAdminModulePage;



/**
 * @author uma.sasmal
 *
 */
public class AdminModule extends Base {

	static Login login = new Login();
	static AdminModulePage adminModulePage = new AdminModulePage();
	static FieldVerificationStateOfAdminModulePage fieldVerification = new FieldVerificationStateOfAdminModulePage();
	static StateTableAdminModulePage statetableadmin = new StateTableAdminModulePage();
	
	@Test(priority=0, description="Verify That Appearance of Create State UI Displayed Successfully")
	public void Tc_Location_State01_001()  {
		login.logIn("pawan", "punshegde");
		adminModulePage.addState();
		adminModulePage.adminAppearanceOfCreateStateUI();
	}
	@Test(priority=1, description="Validation on length of textbox, all errorMessge and Validation Message Displayed Successfully")
	public void Tc_Location_State_02_002(){
		login.logIn("pawan", "punshegde");
		adminModulePage.addState();
		adminModulePage.validationLengthOfTextbox();
		
		}
	
	//FieldVerificationStateOfAdminModulePage
	@Test(priority=2, description="Validation on data type of textbox errorMessge and Validation Message Displayed Successfully")
	public void Tc_Location_state_03_003(){
		login.logIn("pawan", "punshegde");
		adminModulePage.addState();
		fieldVerification.codeInputValidationAlphaNumeric();
		fieldVerification.tinInputValidationAlphaNumeric();
		fieldVerification.nameFieldInputValidationAlphaNumericSpecialChar();
		
	}
	
	//duplicateStateValidation
	@Test(priority=3, description="Validate  State name with already existing one")
	public void Tc_Location_State_04_004(){
		login.logIn("pawan", "punshegde");
		adminModulePage.addState();
		fieldVerification.duplicateStateValidation();
	}
	
	//mandatoryFieldsWithoutData
	@Test(priority=4, description="Verify the error message : Mendatory Fields without data")
	public void Tc_Location_State_05_005(){
		login.logIn("pawan", "punshegde");
		adminModulePage.addState();
		fieldVerification.mandatoryFieldsWithoutData();
	}
	
	//clearTextBoxState
	@Test(priority=6, description="Verify the Textbox with a clear (x) button")
	public void Tc_Location_State_07_007(){
		login.logIn("pawan", "punshegde");
		adminModulePage.addState();
		fieldVerification.clearTextBoxState();
	}
	
	@Test(priority=7, description="Create state with valied data")
	public void Tc_Location_State_08_008(){
		login.logIn("pawan", "punshegde");
		adminModulePage.addState();
		fieldVerification.validStateEnter();
		statetableadmin.stateTableIconsValidation();
	}
}

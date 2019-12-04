package ssms.SSMS_Automation.testCase;

import org.testng.annotations.Test;

import ssms.SSMS_Automation.Base;
import ssms.SSMS_Automation.modules.AdminAreaModulePage;
import ssms.SSMS_Automation.modules.AdminCityModulePage;
import ssms.SSMS_Automation.modules.AdminStateModulePage;
import ssms.SSMS_Automation.modules.Login;



/**
 * @author uma.sasmal
 *
 */
public class AdminModule extends Base {

	static Login login = new Login();
	static AdminStateModulePage adminModulePage = new AdminStateModulePage();
	static AdminCityModulePage admincitymodule = new AdminCityModulePage();
	static AdminAreaModulePage adminareamodule = new AdminAreaModulePage();




	@Test(priority=0, description="Verify That Appearance of Create State UI Displayed Successfully")
	public void Tc_Location_State_01_001()  {
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

	//adminModulePageStateOfAdminModulePage
	@Test(priority=2, description="Validation on data type of textbox errorMessge and Validation Message Displayed Successfully")
	public void Tc_Location_state_03_003(){
		login.logIn("pawan", "punshegde");
		adminModulePage.addState();
		adminModulePage.codeInputValidationAlphaNumeric();
		adminModulePage.tinInputValidationAlphaNumeric();
		adminModulePage.nameFieldInputValidationAlphaNumericSpecialChar();

	}

	//duplicateStateValidation
	@Test(priority=3, description="Validate  State name with already existing one")
	public void Tc_Location_State_04_004(){
		login.logIn("pawan", "punshegde");
		adminModulePage.addState();
		adminModulePage.duplicateStateValidation();
	}

	//mandatoryFieldsWithoutData
	@Test(priority=4, description="Verify the error message : Mendatory Fields without data")
	public void Tc_Location_State_05_005(){
		login.logIn("pawan", "punshegde");
		adminModulePage.addState();
		adminModulePage.mandatoryFieldsWithoutData();
	}

	//TC06 Not done

	//clearTextBoxState
	@Test(priority=6, description="Verify the Textbox with a clear (x) button")
	public void Tc_Location_State_07_007(){
		login.logIn("pawan", "punshegde");
		adminModulePage.addState();
		adminModulePage.clearTextBoxState();
	}

	//validStateEnter
	//stateTableIconsValidation
	@Test(priority=7, description="Create state with valid data")
	public void Tc_Location_State_08_008(){
		login.logIn("pawan", "punshegde");
		adminModulePage.addState();
		adminModulePage.validStateEnter();
		adminModulePage.stateTableIconsValidation();
		adminModulePage.deleteNewlyCreatedState();
	}

	//createStateInvalidData
	@Test(priority=8, description="Create state with Invalid data")
	public void Tc_Location_State_09_009(){
		login.logIn("pawan", "punshegde");
		adminModulePage.addState();
		adminModulePage.createStateInvalidData();
	}

	//mandatoryFieldsWithoutData
	@Test(priority=9, description="Create state without data")
	public void Tc_Location_State_09_009_duplicate(){
		login.logIn("pawan", "punshegde");
		adminModulePage.addState();
		adminModulePage.mandatoryFieldsWithoutData();
	}

	//cancelWithAllDataFilled
	@Test(priority=10, description="'Cancle' With data in all field")
	public void Tc_Location_State_10_010(){
		login.logIn("pawan", "punshegde");
		adminModulePage.addState();
		adminModulePage.cancelWithAllDataFilled();
	}

	//cancelWithoutDataFieldsEntry
	@Test(priority=11, description="'Cancle' Without data in all field")
	public void Tc_Location_State_11_011(){
		login.logIn("pawan", "punshegde");
		adminModulePage.addState();
		adminModulePage.cancelWithoutDataFieldsEntry();
	}

	@Test(priority=12, description="Check the  radio checkbox switcher gets selected using mouse cursor action")
	public void Tc_Location_State_12_012(){
		login.logIn("pawan", "punshegde");
		adminModulePage.addState();
		adminModulePage.validStateEnter();
		adminModulePage.toggleISActivate();
		adminModulePage.deleteNewlyCreatedState();

	}
	@Test(priority=13, description="Check the radio button allows for more then one selection")
	public void Tc_Location_State_13_013(){
		login.logIn("pawan", "punshegde");
		adminModulePage.addState();
		adminModulePage.validStateEnter();
		adminModulePage.toogle2Active();
		adminModulePage.deleteNewlyCreatedState();

	}
	//Appearance of Edit Row UI
	@Test(priority=16, description="Appearance of Edit Row UI")
	public void Tc_Location_State_16_016(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		adminModulePage.editClickFirstState();
		adminModulePage.uiValidationEditState();
	}

	@Test(priority=17, description="Edit state with valid data")
	public void Tc_Location_State_17_017(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		//statetableadmin.editClickFirstState();
		adminModulePage.updateStateValidEntry();
		adminModulePage.updateDataSave();
		adminModulePage.deleteNewlyCreatedState();

	}
	@Test(priority=18, description="Cancle Edited State")
	public void Tc_Location_State_18_018(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		adminModulePage.updateStateValidEntry();
		adminModulePage.updateDataCancel();

	}

	@Test(priority=19, description="Cancle Edited State")
	public void Tc_Location_State_19_019(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		adminModulePage.updateStateInValidEntry();

	}
	//deleteParagraphValidation
	@Test(priority=20, description="Appearance of Delete Row UI")
	public void Tc_Location_State_20_020(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		adminModulePage.deleteParagraphValidation();

	}
	@Test(priority=21, description="Delete: Yes : Pop up window get displayed with :Item deleted and displayed Undo option")
	public void Tc_Location_State_21_021(){
		login.logIn("pawan", "punshegde");
		adminModulePage.addState();
		adminModulePage.validStateEnter();
		adminModulePage.deleteNewlyCreatedState();
		adminModulePage.validateDeleteStateSuccessMsg();

	}

	@Test(priority=22, description="Functionality of Undo option")
	public void Tc_Location_State_22_022(){
		login.logIn("pawan", "punshegde");
		adminModulePage.addState();
		String stateName=adminModulePage.validStateEnter();
		adminModulePage.deleteNewlyCreatedState();
		adminModulePage.validateDeleteStateSuccessMsg();
		adminModulePage.undoFunctionDeleteYesState();
		adminModulePage.verifyCreatedStateName(stateName);
		adminModulePage.deleteNewlyCreatedState();
	}

	//deleteNoValidation
	@Test(priority=23, description="Functionality of 'No' button")
	public void Tc_Location_State_23_023(){
		login.logIn("pawan", "punshegde");
		adminModulePage.addState();
		String stateName=adminModulePage.validStateEnter();
		adminModulePage.deleteNoValidation();
		adminModulePage.verifyCreatedStateName(stateName);
		adminModulePage.deleteNewlyCreatedState();
	}


	@Test(priority=24, description="Functionality of View timelines")
	public void Tc_Location_State_24_024(){
		login.logIn("pawan", "punshegde");
		adminModulePage.addState();
		adminModulePage.validStateEnter();
		adminModulePage.viewTimeLinesFirstRecordClick();
		adminModulePage.viewTimeLinesFirstRecordAssertion();
		//adminModulePage.viewTimeLinesOldRecordAssertion();
		adminModulePage.deleteNewlyCreatedState();
	}

	@Test(priority=25, description="Functionality of Search Icon")
	public void Tc_Location_State_25_025(){
		login.logIn("pawan", "punshegde");
		adminModulePage.addState();
		String stateName=adminModulePage.validStateEnter();
		adminModulePage.verifyCreatedStateName(stateName);
		adminModulePage.searchLocationClick();
		adminModulePage.searchTextBoxLocationEnter(stateName);
		adminModulePage.verifyCreatedStateName(stateName);
		adminModulePage.deleteNewlyCreatedState();
	}

	/**********************************Location City*******************************************/



	@Test(priority=26, description="Appearance of Create City UI")
	public void Tc_Location_City_25_025_(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		admincitymodule.adminCityLinkClick();
		admincitymodule.adminCityAddClick();
		admincitymodule.adminCityUIValidation();
	}

	@Test(priority=27, description="Validation on length of textbox")
	public void Tc_Location_City_26_026(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		admincitymodule.adminCityLinkClick();
		admincitymodule.adminCityAddClick();
		admincitymodule.cityNameEnter("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
		admincitymodule.cityNameFieldValidation();
	}
	@Test(priority=28, description="Validation on data type of  textbox")
	public void Tc_Location_City_27_027(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		admincitymodule.adminCityLinkClick();
		admincitymodule.adminCityAddClick();
		admincitymodule.cityNameEnter("!@#$%");
		admincitymodule.cityNameFieldValidation();
		admincitymodule.cityNameClear();
		admincitymodule.cityNameEnter("ASSS FFFF 1");
		admincitymodule.cityNameFieldValidation();
		admincitymodule.cityNameClear();
		admincitymodule.cityNameEnter("@@@ XYZ FFFF 1");
		admincitymodule.cityNameFieldValidation();
		admincitymodule.cityNameClear();
		admincitymodule.cityNameEnter("12121212121212");
		admincitymodule.cityNameFieldValidation();
	}


	@Test(priority=29, description="Validate  Existing 'City' name with already existing  'State'  within same State")
	public void Tc_Location_City_28_028(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		admincitymodule.adminCityLinkClick();
		admincitymodule.adminCityAddClick();
		admincitymodule.cityNameEnter("AYOODHYA");
		admincitymodule.stateSelect();
		admincitymodule.saveCityClick();
		admincitymodule.duplicateCityEnteredUnderSameStateErrorMessageValidation();
	}

	@Test(priority=30, description="Mendatory Fields without data")
	public void Tc_Location_City_30_30(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		admincitymodule.adminCityLinkClick();
		admincitymodule.adminCityAddClick();
		admincitymodule.saveCityClick();
		admincitymodule.mandatoryFieldsWithoutDataSaveErrorMessageValidation();
	}

	@Test(priority=31, description="Textbox with a clear (x) button")
	public void Tc_Location_City_32_32(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		admincitymodule.adminCityLinkClick();
		admincitymodule.adminCityAddClick();
		admincitymodule.cityNameEnter("AYOODHYA");
		admincitymodule.closeButtonClick();

	}
	@Test(priority=32, description="Create City with valied data")
	public void Tc_Location_City_33_33(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		admincitymodule.adminCityLinkClick();
		admincitymodule.adminCityAddClick();
		admincitymodule.cityNameEnter("AYOODHYATest");
		admincitymodule.stateSelect();
		admincitymodule.saveCityClick();

	}

	@Test(priority=33, description="Create City with  invalied data")
	public void Tc_Location_City_34_34(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		admincitymodule.adminCityLinkClick();
		admincitymodule.adminCityAddClick();
		admincitymodule.cityNameEnter("AYOODHYATestabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
		admincitymodule.invalidCityAddErrorMessageGet();

	}

	@Test(priority=34, description="Create City without giving any data")
	public void Tc_Location_City_35_35(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		admincitymodule.adminCityLinkClick();
		admincitymodule.adminCityAddClick();
		admincitymodule.saveCityClick();
		admincitymodule.invalidCityAddErrorMessageGet();

	}
	@Test(priority=35, description="'Cancle' With data in all field")
	public void Tc_Location_City_36_36(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		admincitymodule.adminCityLinkClick();
		admincitymodule.adminCityAddClick();
		admincitymodule.cityNameEnter("AYOODHYATestCancel");
		admincitymodule.stateSelect();
		admincitymodule.cancelCityClick();

	}
	@Test(priority=36, description="'Cancle' without data in all fields ")
	public void Tc_Location_City_37_37(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		admincitymodule.adminCityLinkClick();
		admincitymodule.adminCityAddClick();
		admincitymodule.cancelCityClick();

	}

	@Test(priority=37, description="Check the  radio checkbox switcher gets selected using mouse cursor action")
	public void Tc_Location_City_38_38(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		admincitymodule.adminCityLinkClick();
		adminModulePage.toggleISActivate();

	}

	@Test(priority=38, description="Check the  radio checkbox switcher gets selected using mouse cursor action")
	public void Tc_Location_City_39_39(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		admincitymodule.adminCityLinkClick();
		adminModulePage.toogle2Active();

	}
	@Test(priority=39, description="Appearance of Edit Row UI")
	public void Tc_Location_City_42_42(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		admincitymodule.adminCityLinkClick();
		admincitymodule.editCityClickFirstRow();
		admincitymodule.adminCityUIValidation();

	}

	@Test(priority=40, description="Edit city with valid data")
	public void Tc_Location_City_43_43(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		admincitymodule.adminCityLinkClick();
		admincitymodule.editCityClickFirstRow();
		admincitymodule.cityNameClear();
		admincitymodule.randomCityNameEnter();
		admincitymodule.stateSelect();
		admincitymodule.saveCityClick();

		admincitymodule.citySearch();
		admincitymodule.cityNameValidationAftrModification();

	}
	@Test(priority=41, description="Cancle Edited City")
	public void Tc_Location_City_44_44(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		admincitymodule.adminCityLinkClick();
		admincitymodule.editCityClickFirstRow();
		admincitymodule.cityNameClear();
		admincitymodule.randomCityNameEnter();
		admincitymodule.stateSelect();
		admincitymodule.cancelCityClick();
	}

	@Test(priority=42, description="Edit City with invalied data")
	public void Tc_Location_City_45_45(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		admincitymodule.adminCityLinkClick();
		admincitymodule.editCityClickFirstRow();
		admincitymodule.cityNameClear();
		admincitymodule.cityNameEnter("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
		admincitymodule.stateSelect();
		admincitymodule.saveCityClick();
		admincitymodule.ErrorMessageCityNameMorethan100();
	}
	@Test(priority=43, description="Appearance of Delete Row UI")
	public void Tc_Location_City_46_46(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		admincitymodule.adminCityLinkClick();
		admincitymodule.adminCityAddClick();
		admincitymodule.randomCityNameEnter();
		admincitymodule.stateSelect();
		admincitymodule.saveCityClick();
		admincitymodule.citySearch();
		admincitymodule.deleteUIvalidationNewCity();
	}
	@Test(priority=44, description="Functionality of 'Yes' button")
	public void Tc_Location_City_47_47(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		admincitymodule.adminCityLinkClick();
		admincitymodule.adminCityAddClick();
		admincitymodule.randomCityNameEnter();
		admincitymodule.stateSelect();
		admincitymodule.saveCityClick();
		admincitymodule.citySearch();
		admincitymodule.deleteUIvalidationNewCity();
	}
	@Test(priority=45, description="Functionality of Undo option")
	public void Tc_Location_City_48_48(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		admincitymodule.adminCityLinkClick();
		admincitymodule.adminCityAddClick();
		admincitymodule.randomCityNameEnter();
		admincitymodule.stateSelect();
		admincitymodule.saveCityClick();
		admincitymodule.citySearch();
		admincitymodule.undoDeleteUIvalidationNewCity();
	}
	@Test(priority=46, description="Functionality of Undo option")
	public void Tc_Location_City_49_49(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		admincitymodule.adminCityLinkClick();
		admincitymodule.adminCityAddClick();
		admincitymodule.randomCityNameEnter();
		admincitymodule.stateSelect();
		admincitymodule.saveCityClick();
		admincitymodule.citySearch();
		admincitymodule.deleteNoFuncNewCity();
		adminModulePage.deleteNewlyCreatedState();
	}
	@Test(priority=47, description="Functionality of View timelines")
	public void Tc_Location_City_50_50(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		admincitymodule.adminCityLinkClick();
		admincitymodule.adminCityAddClick();
		admincitymodule.randomCityNameEnter();
		admincitymodule.stateSelect();
		admincitymodule.saveCityClick();
		admincitymodule.citySearch();
		adminModulePage.toggleISActivate();
		adminModulePage.viewTimeLinesFirstRecordClick();
		admincitymodule.viewTimeLinesFirstRecordAssertion();
		admincitymodule.citySearch();
		adminModulePage.deleteNewlyCreatedState();
	}

	@Test(priority=48, description="Functionality of Search Icon")
	public void Tc_Location_City_51_51(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		admincitymodule.adminCityLinkClick();
		admincitymodule.adminCityAddClick();
		admincitymodule.randomCityNameEnter();
		admincitymodule.stateSelect();
		admincitymodule.saveCityClick();
		admincitymodule.citySearch();
		adminModulePage.deleteNewlyCreatedState();
	}

	@Test(priority=49, description="Appearance of Create Area UI")
	public void Tc_Location_Area_51_51(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		adminareamodule.adminAreeaLinkClick();
		adminareamodule.adminAreaAddClick();
		adminareamodule.areaAddUIValidation();
	}

	@Test(priority=50, description="Validation on length of textbox")
	public void Tc_Location_Area_52_52(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		adminareamodule.adminAreeaLinkClick();
		adminareamodule.adminAreaAddClick();
		admincitymodule.cityNameEnter("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
		admincitymodule.saveCityClick();
		adminareamodule.errorMsgValidationArea();
	}

	@Test(priority=51, description="Validation on data type of  textbox")
	public void Tc_Location_Area_53_53(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		adminareamodule.adminAreeaLinkClick();
		adminareamodule.adminAreaAddClick();
		admincitymodule.cityNameEnter("!@#$%");
		adminareamodule.selectCityWithState();
		admincitymodule.saveCityClick();
		adminareamodule.errorMesgValidationEnteringInvalidAreaName();
		adminareamodule.areaClearCloseButtonClick();		
		admincitymodule.cityNameEnter("ASSS FFFF 1");
		adminareamodule.selectCityWithState();
		admincitymodule.saveCityClick();
		adminareamodule.errorMesgValidationEnteringInvalidAreaName();
		adminareamodule.areaClearCloseButtonClick();
		admincitymodule.cityNameEnter("@@@ XYZ FFFF 1");
		adminareamodule.selectCityWithState();
		admincitymodule.saveCityClick();
		adminareamodule.errorMesgValidationEnteringInvalidAreaName();
		adminareamodule.areaClearCloseButtonClick();
		admincitymodule.cityNameEnter("12121212121212");
		adminareamodule.selectCityWithState();
		admincitymodule.saveCityClick();
		adminareamodule.errorMesgValidationEnteringInvalidAreaName();
	}
	@Test(priority=52, description="Validate  Existing 'City' name with already existing  'State'  within same State")
	public void Tc_Location_Area_54_54(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		adminareamodule.adminAreeaLinkClick();
		adminareamodule.adminAreaAddClick();
		adminareamodule.duplicateAreaValidation("KARELI","PRAYAGRAJ");
	}
	@Test(priority=53, description="Check  for Drop down box ")
	public void Tc_Location_Area_55_55(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		adminareamodule.adminAreeaLinkClick();
		adminareamodule.adminAreaAddClick();
		adminareamodule.entertextintodropdownNegativeValidation();
	}

	@Test(priority=54, description="Mendatory Fields without data")
	public void Tc_Location_Area_56_56(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		adminareamodule.adminAreeaLinkClick();
		adminareamodule.adminAreaAddClick();
		admincitymodule.saveCityClick();
		admincitymodule.mandatoryFieldsWithoutDataSaveErrorMessageValidation();
	}
	@Test(priority=55, description="Textbox with a clear (x) button")
	public void Tc_Location_Area_58_58(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		adminareamodule.adminAreeaLinkClick();
		adminareamodule.adminAreaAddClick();
		admincitymodule.cityNameEnter("Marathahalli");
		adminareamodule.selectCityWithState();
		adminareamodule.areaClearCloseButtonClick();
	}

	@Test(priority=56, description="Create Area with valied data")
	public void Tc_Location_Area_59_59(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		adminareamodule.adminAreeaLinkClick();
		adminareamodule.adminAreaAddClick();
		adminareamodule.areaNameEnter();
		adminareamodule.selectCityWithState();
		admincitymodule.saveCityClick();
		adminareamodule.areaSearch();
		adminModulePage.deleteNewlyCreatedState();
	}

	@Test(priority=58, description="Create City with  invalied data")
	public void Tc_Location_Area_60_60(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		adminareamodule.adminAreeaLinkClick();
		adminareamodule.adminAreaAddClick();
		adminareamodule.areaNameEnter();
		admincitymodule.saveCityClick();
		adminareamodule.areaAddInvalidSelectErrorMsgValidation();
	}
	@Test(priority=59, description="Create Area with invalied data")
	public void Tc_Location_Area_61_61(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		adminareamodule.adminAreeaLinkClick();
		adminareamodule.adminAreaAddClick();
		admincitymodule.cityNameEnter("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
		admincitymodule.saveCityClick();
		adminareamodule.areaName_CityErrorMsgValidation();

	}

	@Test(priority=60, description="Create Area without giving any data")
	public void Tc_Location_Area_62_62(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		adminareamodule.adminAreeaLinkClick();
		adminareamodule.adminAreaAddClick();
		admincitymodule.saveCityClick();
		adminareamodule.areaName_CityErrorMsgValidation();

	}

	@Test(priority=61, description="'Cancle' With data in all field")
	public void Tc_Location_Area_63_63(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		adminareamodule.adminAreeaLinkClick();
		adminareamodule.adminAreaAddClick();
		admincitymodule.cityNameEnter("invalida cancel testing");
		adminareamodule.selectCityWithState();
		admincitymodule.cancelCityClick();

	}
	@Test(priority=62, description="Cancle' without data in all fields ")
	public void Tc_Location_Area_64_64(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		adminareamodule.adminAreeaLinkClick();
		adminareamodule.adminAreaAddClick();
		admincitymodule.cancelCityClick();

	}
	@Test(priority=63, description="Check if the  user response of YES or NO  are saved in the right data base coloumn")
	public void Tc_Location_Area_65_65(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		adminareamodule.adminAreeaLinkClick();
		adminareamodule.adminAreaAddClick();
		adminareamodule.areaNameEnter();
		adminareamodule.selectCityWithState();
		admincitymodule.saveCityClick();
		adminareamodule.areaSearch();
		adminModulePage.toggleISActivate();
		adminModulePage.deleteNewlyCreatedState();
	}
	@Test(priority=64, description="Check the radio button allows for more then one selection")
	public void Tc_Location_Area_66_66(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		adminareamodule.adminAreeaLinkClick();
		adminModulePage.toogle2Active();
	}
	@Test(priority=65, description="Area : Appearance of Edit Row UI")
	public void Tc_Location_Area_69_69(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		adminareamodule.adminAreeaLinkClick();
		adminModulePage.editClickFirstState();
		adminareamodule.adminAreaEditUIValidation();
	}
	@Test(priority=66, description="Edit Area with valid data")
	public void Tc_Location_Area_70_70(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		adminareamodule.adminAreeaLinkClick();
		adminModulePage.editClickFirstState();
		adminareamodule.adminAreaEditUIValidation();
		adminareamodule.areaClearCloseButtonClick();
		adminareamodule.areaNameEnter();
		adminareamodule.selectCityWithState();
		admincitymodule.saveCityClick();
		adminareamodule.areaSearch();
	}
	@Test(priority=67, description="Cancle Edited Area")
	public void Tc_Location_Area_71_71(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		adminareamodule.adminAreeaLinkClick();
		adminModulePage.editClickFirstState();
		adminareamodule.adminAreaEditUIValidation();
		adminareamodule.areaClearCloseButtonClick();
		adminareamodule.areaNameEnter();
		adminareamodule.selectCityWithState();
		admincitymodule.cancelCityClick();
	}
	@Test(priority=68, description="Edit Area with invalid data")
	public void Tc_Location_Area_72_72(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		adminareamodule.adminAreeaLinkClick();
		adminModulePage.editClickFirstState();
		adminareamodule.areaNameClear();
		admincitymodule.cityNameEnter("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
		admincitymodule.saveCityClick();
		adminareamodule.errorMesgValidationEnteringInvalidAreaName();
	}
	@Test(priority=69, description="Appearance of Delete Row UI")
	public void Tc_Location_Area_73_73(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		adminareamodule.adminAreeaLinkClick();
		adminModulePage.deleteParagraphValidation();
}
	@Test(priority=70, description="Functionality of 'Yes' button")
	public void Tc_Location_Area_74_74(){
		login.logIn("pawan", "punshegde");
		adminModulePage.adminTableLinkClick();
		adminareamodule.adminAreeaLinkClick();
		adminareamodule.adminAreaAddClick();
		adminareamodule.areaNameEnter();
		adminareamodule.selectCityWithState();
		admincitymodule.saveCityClick();
		adminareamodule.areaSearch();
		admincitymodule.deleteUIvalidationNewCity();
}
}
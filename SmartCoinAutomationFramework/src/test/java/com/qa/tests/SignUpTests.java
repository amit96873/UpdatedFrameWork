package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.qa.BaseTest;
import com.qa.pages.LanguagePage;
import com.qa.pages.PermissionPage;
import com.qa.pages.RegisterNameMobileNumberPage;
import com.qa.pages.SignupPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.InputStream;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.Assert;
import org.testng.annotations.AfterClass;


public class SignUpTests extends BaseTest {
	SignupPage signupPage;
	LanguagePage languagePage;
	PermissionPage permissionpage;
	RegisterNameMobileNumberPage registrationpage;
	InputStream datais;
	JSONObject loginuser;

	@BeforeClass
	public void beforeClass() throws Exception {
		try {
			String dataFileName = "data/loginuser.json";
			datais = getClass().getClassLoader().getResourceAsStream(dataFileName);
			JSONTokener tokener= new JSONTokener(datais);
			loginuser = new JSONObject(tokener);
			signupPage= new SignupPage();
			languagePage = signupPage.pressSignUpBtn();
			registrationpage = languagePage.langToRegistration();

		}catch(Exception e) {

			e.printStackTrace();


		}
		finally {
			if(datais!=null) {
				datais.close();
			}

		}

	}
	@AfterClass
	public void afterClass() {

	}

	/*
	@BeforeMethod
	public void beforeMethod(Method m) {
		signupPage= new SignupPage();
		System.out.println("\n"+"******** starting test:"+m.getName() + "********");


	}
	 */




	@Test
	public void checkRegistrationInvalidName() {
		System.out.println("checkRegistrationInvalidName");
		SoftAssert sa= new SoftAssert();
		registrationpage.enterFullName(loginuser.getJSONObject("invalidusername").getString("full_name"));
		registrationpage.enterMobileNumber(loginuser.getJSONObject("invalidusername").getString("Mobile_Number"));
		registrationpage.pressRegContinueBtn();
		String errortextforname= registrationpage.getErrTxtName();
		String expectedNameErrorText=strings.get("fullName_Error_text");
		sa.assertEquals(errortextforname, expectedNameErrorText);
		sa.assertAll();
		System.out.println("Actual ErrorText:- " + errortextforname + "\n" + "Expected ErrorText:- "+expectedNameErrorText);


	}

	@Test
	public void checkRegistrationInvalidNameAndNumber () {
		System.out.println("checkRegistrationInvalidNameAndNumber");
		SoftAssert sa= new SoftAssert();
		registrationpage.enterFullName(loginuser.getJSONObject("invalidnamenumber").getString("full_name"));
		registrationpage.enterMobileNumber(loginuser.getJSONObject("invalidnamenumber").getString("Mobile_Number"));
		registrationpage.pressRegContinueBtn();
		String errortextforname= registrationpage.getErrTxtName();
		String expectedNameErrorText=strings.get("fullName_Error_text");
		sa.assertEquals(errortextforname, expectedNameErrorText);
		String errortextfornumber= registrationpage.getErrTxtMobileNumber();
		String expectedNumberErrorText=strings.get("mobileNumber_Error_text");
		sa.assertEquals(errortextfornumber, expectedNumberErrorText);
		sa.assertAll();
		System.out.println("Actual ErrorText:- " + errortextforname + "\n" + "Expected ErrorText:- "+expectedNameErrorText);
		System.out.println("actual ErrorText:- " + errortextfornumber + "\n" + "expected ErrorText:- "+expectedNumberErrorText);


	}

	@Test
	public void checkRegistrationInvalidNumber() {
		System.out.println("checkRegistrationInvalidNumber");
		SoftAssert sa= new SoftAssert();
		registrationpage.enterFullName(loginuser.getJSONObject("invalidnumber").getString("full_name"));
		registrationpage.enterMobileNumber(loginuser.getJSONObject("invalidnumber").getString("Mobile_Number"));
		registrationpage.pressRegContinueBtn();
		String errortextfornumber= registrationpage.getErrTxtMobileNumber();
		String expectedNumberErrorText=strings.get("mobileNumber_Error_text");
		sa.assertEquals(errortextfornumber, expectedNumberErrorText);
		sa.assertAll();
		System.out.println("actual ErrorText:- " + errortextfornumber + "\n" + "expected ErrorText:- "+expectedNumberErrorText);
	}
	@Test
	public void checkRegistrationInvalidNameBySpacelChar() { 
		System.out.println("checkRegistrationInvalidNameBySpacelChar");
		SoftAssert sa= new SoftAssert();
		registrationpage.enterFullName(loginuser.getJSONObject("invalidusernamebyspacealchar").getString("full_name"));
		registrationpage.enterMobileNumber(loginuser.getJSONObject("invalidusernamebyspacealchar").getString("Mobile_Number"));
		registrationpage.pressRegContinueBtn();
		String errortextforname= registrationpage.getErrTxtName();
		String expectedNameErrorText=strings.get("fullName_Error_text");
		sa.assertEquals(errortextforname, expectedNameErrorText);
		sa.assertAll();
		System.out.println("Actual ErrorText:- " + errortextforname + "\n" + "Expected ErrorText:- "+expectedNameErrorText);


	}

	@Test
	public void checkRegistrationEmptyNameAndNumber() {
		System.out.println("checkRegistrationEmptyNameAndNumber");
		SoftAssert sa= new SoftAssert();
		registrationpage.enterFullName(loginuser.getJSONObject("emptynameandnumber").getString("full_name"));
		registrationpage.enterMobileNumber(loginuser.getJSONObject("emptynameandnumber").getString("Mobile_Number"));
		registrationpage.pressRegContinueBtn();
		String errortextforname= registrationpage.getErrTxtName();
		String expectedNameErrorText=strings.get("fullName_Error_text");
		sa.assertEquals(errortextforname, expectedNameErrorText);
		String errortextfornumber= registrationpage.getErrTxtMobileNumber();
		String expectedNumberErrorText=strings.get("mobileNumber_Error_text");
		sa.assertEquals(errortextfornumber, expectedNumberErrorText);
		sa.assertAll();
		System.out.println("Actual ErrorText:- " + errortextforname + "\n" + "Expected ErrorText:- "+expectedNameErrorText);
		System.out.println("actual ErrorText:- " + errortextfornumber + "\n" + "expected ErrorText:- "+expectedNumberErrorText);



	}

	@Test
	public void checkRegistrationEmptyNameValidNumber() {
		System.out.println("checkRegistrationEmptyNameValidNumber");
		SoftAssert sa= new SoftAssert();
		registrationpage.enterFullName(loginuser.getJSONObject("emptynamevalidnumber").getString("full_name"));
		registrationpage.enterMobileNumber(loginuser.getJSONObject("emptynamevalidnumber").getString("Mobile_Number"));
		registrationpage.pressRegContinueBtn();
		String errortextforname= registrationpage.getErrTxtName();
		String expectedNameErrorText=strings.get("fullName_Error_text");
		sa.assertEquals(errortextforname, expectedNameErrorText);
		sa.assertAll();
		System.out.println("Actual ErrorText:- " + errortextforname + "\n" + "Expected ErrorText:- "+expectedNameErrorText);



	}

	@Test
	public void checkRegistrationEmptyNumberValidName() {
		System.out.println("checkRegistrationEmptyNumberValidName");
		SoftAssert sa= new SoftAssert();
		registrationpage.enterFullName(loginuser.getJSONObject("emptynumbervalidname").getString("full_name"));
		registrationpage.enterMobileNumber(loginuser.getJSONObject("emptynumbervalidname").getString("Mobile_Number"));
		registrationpage.pressRegContinueBtn();
		String errortextfornumber= registrationpage.getErrTxtMobileNumber();
		String expectedNumberErrorText=strings.get("mobileNumber_Error_text");
		sa.assertEquals(errortextfornumber, expectedNumberErrorText);
		sa.assertAll();
		System.out.println("actual ErrorText:- " + errortextfornumber + "\n" + "expected ErrorText:- "+expectedNumberErrorText);

	}

	@Test
	public void checkRegistrationSpaceInNumber() {
		System.out.println("checkRegistrationSpaceInNumber");
		SoftAssert sa= new SoftAssert();
		registrationpage.enterFullName(loginuser.getJSONObject("spaceinnumber").getString("full_name"));
		registrationpage.enterMobileNumber(loginuser.getJSONObject("spaceinnumber").getString("Mobile_Number"));
		registrationpage.pressRegContinueBtn();
		String errortextfornumber= registrationpage.getErrTxtMobileNumber();
		String expectedNumberErrorText=strings.get("mobileNumber_Error_text");
		sa.assertEquals(errortextfornumber, expectedNumberErrorText);
		sa.assertAll();
		System.out.println("actual ErrorText:- " + errortextfornumber + "\n" + "expected ErrorText:- "+expectedNumberErrorText);


	}

	@Test
	public void checkRegistrationEightDigitsNumber() {
		System.out.println("checkRegistrationlessThanTenDigitsNumber");
		SoftAssert sa= new SoftAssert();
		registrationpage.enterFullName(loginuser.getJSONObject("lessthantendigitnumber").getString("full_name"));
		registrationpage.enterMobileNumber(loginuser.getJSONObject("lessthantendigitnumber").getString("Mobile_Number"));
		registrationpage.pressRegContinueBtn();
		String errortextfornumber= registrationpage.getErrTxtMobileNumber();
		String expectedNumberErrorText=strings.get("mobileNumber_Error_text");
		sa.assertEquals(errortextfornumber, expectedNumberErrorText);
		sa.assertAll();
		System.out.println("actual ErrorText:- " + errortextfornumber + "\n" + "expected ErrorText:- "+expectedNumberErrorText);

	}


	@Test
	public void checkRegistrationWithValidNameAndNumber() {
		System.out.println("checkRegistrationWithValidNameAndMobile_Number");
		SoftAssert sa= new SoftAssert();
		registrationpage.enterFullName(loginuser.getJSONObject("validnameandnumber").getString("full_name"));
		registrationpage.enterMobileNumber(loginuser.getJSONObject("validnameandnumber").getString("Mobile_Number"));
		permissionpage = registrationpage.pressRegContinueBtn();
		String actualResult= permissionpage.getTitlepermission();
		String expectedResult=strings.get("Permission_Page_Title");
		Assert.assertEquals(actualResult, expectedResult);
		sa.assertAll();
		System.out.println("actual title - " + actualResult + "\n" + "expected title - "+expectedResult);

	}

	@AfterMethod
	public void afterMethod() {

	}


}

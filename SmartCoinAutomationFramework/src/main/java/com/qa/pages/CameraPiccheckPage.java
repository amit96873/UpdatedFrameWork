package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CameraPiccheckPage extends BaseTest {
	
	
	
	@AndroidFindBy (id = "com.android.camera2:id/done_button") private MobileElement donebtn;
	@AndroidFindBy (id = "com.android.camera2:id/cancel_button") private MobileElement canclebtn;
	@AndroidFindBy (id = "com.android.camera2:id/retake_button") private MobileElement retakebtn;
	

}

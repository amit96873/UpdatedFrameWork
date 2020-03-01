package com.qa.pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MenuPage extends BaseTest {
	
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Welcome!' and @index='1']") private MobileElement menuepagetitletext;
	@AndroidFindBy (xpath = "//android.widget.CheckedTextView[@text='Home!' and @index='0']") private MobileElement homebtn;
	@AndroidFindBy (xpath = "//android.widget.CheckedTextView[@text='My Loans' and @index='0']") private MobileElement myloanbtn;
	@AndroidFindBy (xpath = "//android.widget.CheckedTextView[@text='My Profile' and @index='0']") private MobileElement myprofilebtn;
	@AndroidFindBy (xpath = "//android.widget.CheckedTextView[@text='My Bank Details' and @index='0']") private MobileElement mybankdetailsbtn;
	@AndroidFindBy (xpath = "//android.widget.CheckedTextView[@text='All Transactions' and @index='0']") private MobileElement alltransactionbtn;
	@AndroidFindBy (xpath = "//android.widget.CheckedTextView[@text='Help & Support' and @index='0']") private MobileElement helpandsupportbtn;
	@AndroidFindBy (xpath = "//android.widget.CheckedTextView[@text='FAQ' and @index='0']") private MobileElement faqbtn;
	@AndroidFindBy (xpath = "//android.widget.CheckedTextView[@text='Language Settings' and @index='0']") private MobileElement languagesettingbtn;
	@AndroidFindBy (xpath = "//android.widget.CheckedTextView[@text='Troubleshoot' and @index='0']") private MobileElement troubleshootbtn;




	public String getTitleMenuePage() {
		return getAttribute(menuepagetitletext, "text");
	}

	public HomePageSmartCoin pressHomeBtn() {

		click(homebtn);
		return new HomePageSmartCoin();
	}
	public MyLoansPage pressMyLoanBtn() {

		click(myloanbtn);
		return new MyLoansPage();
	}
	public MyProfilePage pressMyProfileBtn() {

		click(myprofilebtn);
		return new MyProfilePage();
	}

	public BankAccountPendingPage pressMyBankDetailsBtn() {

		click(mybankdetailsbtn);
		return new BankAccountPendingPage();
	}
	public AllTransactionPage pressAllTransactionBtn() {

		click(alltransactionbtn);
		return new AllTransactionPage();
	}
	public HelpAndSupportPage pressHelpAndSupportBtn() {

		click(helpandsupportbtn);
		return new HelpAndSupportPage();
	}
	public FAQPage pressFAQBtn() {

		click(faqbtn);
		return new FAQPage();
	}
	public LanguageSettingPage pressLanguageSettingBtn() {

		click(languagesettingbtn);
		return new LanguageSettingPage();
	}
	public TroubleShootPage pressTroubleShootBtn() {

		click(troubleshootbtn);
		return new TroubleShootPage();
	}
	



}

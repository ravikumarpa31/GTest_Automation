package com.gtn.qa.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gtn.qa.PageObjectRepository.JobDetailPage;
import com.gtn.qa.PageObjectRepository.JobListPage;
import com.gtn.qa.TestBase.TestBase;


public class JobDetailPageTestCase extends TestBase
{
	static JobListPage listPage;
	static JobDetailPage detailPage;
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException
	{
		initialize();
		listPage= new JobListPage();
		detailPage=listPage.jobDetailValidation();
		//Creating this object to trigger constructor of Job list page
		//indirectly to initialize web elements to driver(PageFactory.initElements(driver, this))
		//if we don't do that we cannot use web elements of JobListPage class
	}
	
		
	@Test(priority=0)
	public void titleTest()
	{
		String listPageTitle=detailPage.detailPageTitleValidation();
		Assert.assertEquals(listPageTitle, "GT Nexus - TM Optimizer Job Control","Page title is not correct");
	}
	
	@Test(priority=1)
	public void gtnLogoTest()
	{
		boolean flag=detailPage.detailPageGtnlogo();
		Assert.assertTrue(flag, "logo missing");
	}
	
		
	@AfterMethod
	public static void teaDown()
	{
		clearAll();
	}

}

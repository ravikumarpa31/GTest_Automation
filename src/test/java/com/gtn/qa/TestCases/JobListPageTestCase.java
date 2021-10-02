package com.gtn.qa.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gtn.qa.PageObjectRepository.JobListPage;
import com.gtn.qa.TestBase.TestBase;
	
public class JobListPageTestCase extends TestBase
{
	static JobListPage listPage;
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		initialize();
		listPage = new JobListPage();
		//Creating this object to trigger constructor of Job list page
		//indirectly to initialize web elements to driver(PageFactory.initElements(driver, this))
		//if we don't do that we cannot use web elements of JobListPage
	}
	
	@Test(priority=0)
	public void titleTest()
	{
		String listPageTitle=listPage.listPageTitleValidation();
		Assert.assertEquals(listPageTitle, "GT Nexus - TM Optimizer Job Control","Page title is not correct");
	}
	
	@Test(priority=1)
	public void gtnLogoTest()
	{
		boolean flag=listPage.listPageGtnlogo();
		Assert.assertTrue(flag, "logo missing");
	}
	
//	@Test(priority=3)
//	public void tmoJobUploadDetailpageTest() throws InterruptedException
//	{
//		listPage.tmoJobFileUploadValidation("C:\\Users\\ramasegowda\\Downloads\\instance-2Stop_LTL_MMRE_2122606594.xml","AutoJob2");
//	}
	
	@AfterMethod
	public static void teaDown()
	{
		clearAll();
	}
}

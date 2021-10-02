package com.gtn.qa.PageObjectRepository;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gtn.qa.TestBase.TestBase;

public class JobListPage extends TestBase
{
	
	//Page Factory - Object Repository - OR
	
	@FindBy(xpath="//a[@href='http://www.gtnexus.com']")
	WebElement gtnHome;
	
	@FindBy(id="logo")
	WebElement gtnLogo;
	
	@FindBy(linkText="Job List")
	WebElement jobList;
	
	@FindBy(linkText="Data Job List")
	WebElement dataJobList;
	
	@FindBy(linkText="Job Details")
	WebElement jobDetails;
	
	@FindBy(xpath="//li//a[text()='Status']")
	WebElement jobDetailsStatus;
	
	@FindBy(linkText="Job Details")
	WebElement jobDetailsSolutions;
	
	@FindBy(linkText="Job Details")
	WebElement jobDetailsPerformance;
	
	@FindBy(linkText="Job Details")
	WebElement jobDetailsSteps;
	
	@FindBy(linkText="Job Details")
	WebElement jobDetailsRequirements;
	
	@FindBy(xpath="//button[text()='New Optimization Job']")
	WebElement newOptimizationJob;
	
	@FindBy(id="instance")
	WebElement filePath;
	
	@FindBy(id="name")
	WebElement jobName;
	
	@FindBy(xpath="//button[text()='Create Job']")
	WebElement createJob;
	
	@FindBy(xpath="//button[text()='Close']")
	WebElement cancelJobpost;

	@FindBy(xpath="//button[text()='New Data Job']")
	WebElement newDataJob;
	
	@FindBy(id="instance")
	WebElement dtmfilePath;
	
	@FindBy(id="name")
	WebElement dtmjobName;
	
	@FindBy(xpath="//button[text()='Create Job']")
	WebElement dtmcreateJob;
	
	@FindBy(xpath="//button[text()='Close']")
	WebElement dtmcancelJobpost;

	@FindBy(xpath="//button[contains(text()='Filter Jobs')]")
	WebElement filterJobsbootstrapdrop;

	@FindBy(xpath="//a[@text='ALL']")
	WebElement filterJobsbootstrapdropALL;

	@FindBy(xpath="//a[@text='STARTED']")
	WebElement filterJobsbootstrapdropSTARTED;

	@FindBy(xpath="//a[@text='REVOKED']")
	WebElement filterJobsbootstrapdropREVOKED;

	@FindBy(xpath="//a[@text='FAILURE']")
	WebElement filterJobsbootstrapdropFAILURE;
	
	@FindBy(xpath="//a[@text='PENDING']")
	WebElement filterJobsbootstrapdropPENDING;

	@FindBy(xpath="//table[@id='job-table']//tbody//tr//td[contains(text(),'AutoJob2')]")
	WebElement jobLink;
	
	
	
	
	
	
	//JobListPage constructor: 
		/*initialization of all the web element to web driver*/
		public JobListPage()
		{
			PageFactory.initElements(driver, this);
		}
	
	
	
	
	
	//Actions: Features: Methods
	public String listPageTitleValidation()
	{
		String title=driver.getTitle();
		System.out.println("Job List Page title: "+title);
		return title;
	}
	
	public boolean listPageGtnlogo()
	{
		boolean b=gtnLogo.isDisplayed();
		System.out.println("Logo displayed: "+b);
		return b;
	}
	
	public JobListPage jobListBtnValidation()
	{
		jobList.click();
		return new JobListPage();
	}
	
	
	public JobDetailPage jobDetailsStatusBtn() throws IOException
	{
		jobDetailsStatus.click(); 
		return new JobDetailPage();
	}
	
	public JobDetailPage tmoJobFileUploadValidation(String fileLocation, String optiJobName) throws InterruptedException
	{
		newOptimizationJob.click();
		filePath.sendKeys(fileLocation);
		jobName.sendKeys(optiJobName);
		Thread.sleep(1000);
		createJob.click();
		Thread.sleep(10000);
		return new JobDetailPage();
	}
	
	public JobDetailPage jobDetailValidation() throws InterruptedException
	{
		jobLink.click();
		System.out.println("Clicked on JobId and navigating to detail page");
		Thread.sleep(5000);
		return new JobDetailPage();
	}
	
	public JobListPage filterAllJobs()
	{
		filterJobsbootstrapdrop.click();
		filterJobsbootstrapdropALL.click();
		return new JobListPage();
	}
	
}

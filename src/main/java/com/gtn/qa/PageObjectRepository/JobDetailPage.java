package com.gtn.qa.PageObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gtn.qa.TestBase.TestBase;

public class JobDetailPage extends TestBase
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
	
	@FindBy(id="requeue-task")
	WebElement restartJob;
	
	@FindBy(id="cancel-task")
	WebElement cancelJob;
	
	@FindBy(id="delete-task")
	WebElement deleteJob;
	
	@FindBy(xpath="//dt[text()='Name']//following::dd")
	WebElement jobsName;
	
	@FindBy(xpath="//dt[text()='Status']//following::dd")
	WebElement jobStatus;
	
	@FindBy(xpath="//dt[text()='Job ID']//following::dd")
	WebElement jobId;
	
	@FindBy(xpath="//dt[text()='Worker Version']//following::dd")
	WebElement tmoWorkerVersion;
	
	@FindBy(xpath="//dt[text()='Create Time']//following::dd")
	WebElement jobCreateTime;
		
	@FindBy(xpath="//dt[text()='Enqueue Time']//following::dd")
	WebElement jobEnqueueTime;
	
	@FindBy(xpath="//dt[text()='Start Time']//following::dd")
	WebElement jobStartTime;
	
	@FindBy(xpath="//dt[text()='First Solution Time']//following::dd")
	WebElement jobFirstSolTime;
	
	@FindBy(xpath="//dt[text()='Bin packing sol costs']//following::dd")
	WebElement JobBinPackingcost;
	
	@FindBy(xpath="//dt[text()='Bin packing published count']//following::dd")
	WebElement jobBinPackPubcount;
	
	@FindBy(xpath="//dt[text()='Possible Minimum Constraint related issue']//following::dd")
	WebElement jobMinCapIssue;
	
	@FindBy(xpath="//dt[text()='Solutions failed for min-constraint']//following::dd")
	WebElement jobMinCapCount;
	
	@FindBy(xpath="//dt[text()='First Solution Secs']//following::dd")
	WebElement jobFirstSolSecs;
	
	@FindBy(xpath="//dt[text()='Best Solution Secs']//following::dd")
	WebElement jobBestSolSecs;
	
	@FindBy(xpath="//dt[text()='Last Solution Time']//following::dd")
	WebElement JobLastSolTime;
	
	@FindBy(xpath="//dt[text()='Revoke Time']//following::dd")
	WebElement jobRevokeTime;
	
	@FindBy(xpath="//dt[text()='Submitted From']//following::dd")
	WebElement jobSubmittedFrom;

	@FindBy(xpath="//dt[text()='Submitted To']//following::dd")
	WebElement jobSubmittedTo;
	
	@FindBy(xpath="//dt[text()='Submitted By Org']//following::dd")
	WebElement jobSumittedOrgId;
	
	@FindBy(xpath="//dt[text()='Submitted by User']//following::dd")
	WebElement jobSubmittedUserId;
	
	@FindBy(xpath="//dt[text()='Submitter Org Name']//following::dd")
	WebElement jobSumittedOrgName;
	
	@FindBy(xpath="//dt[text()='Submitter User Name']//following::dd")
	WebElement jobSubmittedUserName;
	
	@FindBy(xpath="//dt[text()='Raw Step Count']//following::dd")
	WebElement jobRawStepCount;

	@FindBy(xpath="//dt[text()='Cleaning Time (secs)']//following::dd")
	WebElement jobCleantimesecs;
	
	@FindBy(xpath="//dt[text()='Step Count']//following::dd")
	WebElement jobCleanStepCount;
	
	@FindBy(xpath="//dt[text()='Requirement Count']//following::dd")
	WebElement jobReqCount;
	
	@FindBy(xpath="//dt[text()='Initial Cost']//following::dd")
	WebElement jobInitialCost;
	
	@FindBy(xpath="//dt[text()='Best Cost ']//following::dd")
	WebElement jobBestCost;
		
	@FindBy(xpath="//dt[text()='Clean Instance Data']//following::dd//a[text()='xml']")
	WebElement jobCleanXml;
	
	@FindBy(xpath="//dt[text()='Clean Instance Data']//following::dd//a[text()='thrift']")
	WebElement jobCleanThrift;
		
	@FindBy(xpath="//dt[text()='Raw Instance Data']//following::dd//a[text()='xml']")
	WebElement jobRawXml;
	
	@FindBy(xpath="//dt[text()='Supply Chain Graph']//following::dd//a[text()='svg']")
	WebElement jobSupplyChainSvg;
	
	@FindBy(xpath="//dt[text()='Supply Chain Graph']//following::dd//a[text()='svg_new']")
	WebElement jobSupplyChainSvgNew;
	
	@FindBy(xpath="//dt[text()='Supply Chain Graph']//following::dd//a[text()='png']")
	WebElement jobSupplyChainPng;
	
	@FindBy(xpath="//dt[text()='Supply Chain Graph']//following::dd//a[text()='pdf']")
	WebElement jobSupplyChainPdf;

	@FindBy(xpath="//dt[text()='Req. Src. Dest. Graph']//following::dd//a[text()='svg']")
	WebElement jobReqSrcDestGraphSvg;
		
	@FindBy(xpath="//table[@class='table table-striped table-bordered']//tbody//tr")
	WebElement jobError;
	
	@FindBy(xpath="//table[@class='table table-striped table-bordered']//tbody//tr//td")
	WebElement jobErrorCode;
	
	@FindBy(xpath="//table[@class='table table-striped table-bordered']//tbody//tr//td//td")
	WebElement jobErrorMessage;
	
	
	
	
	
	
		//JobListPage constructor: 
		/*initialization of all the web element to web driver*/
		public JobDetailPage()
		{
			PageFactory.initElements(driver, this);
		}
	
	
	
	
	//Actions: Features: Methods
		public String detailPageTitleValidation()
		{
			String title=driver.getTitle();
			System.out.println("Page Title is : "+title);
			return title;
		}
		
		public boolean detailPageGtnlogo()
		{
			boolean b=gtnLogo.isDisplayed();
			System.out.println("Logo displayed : "+b);
			return b;
		}
		
		public String detailPageUrlValidation()
		{
			String url=driver.getCurrentUrl();
			System.out.println("Job Detail Page Url is : "+url);
			return url;	
		}
		
		
		public JobListPage jobListBtnValidation()
		{
			jobList.click();
			return new JobListPage();
		}
			
		
		public JobDetailPage jobDetailsStatusBtn()
		{
			jobDetailsStatus.click(); 
			return new JobDetailPage();
		}
		
		public JobDetailPage tmoJobFileUploadValidation(String fileLocation,String optiJobName) throws InterruptedException
		{
			newOptimizationJob.click();
			filePath.sendKeys(fileLocation);
			jobName.sendKeys(optiJobName);
			Thread.sleep(1000);
			createJob.click();
			Thread.sleep(10000);
			return new JobDetailPage();
		}
		
		
		public void restartJobBtnValidation()
		{
			restartJob.click();
		}
		
		public void cancelJobBtnValidation()
		{
			cancelJob.click();
		}
		
		public void deleteJobBtnValidation()
		{
			deleteJob.click();
		}
		
		public String jobsNameValidation()
		{
			return jobsName.getText();
		}
		
		public String jobStatusValidation()
		{
			return jobStatus.getText();
		}
		
		public String jobIdValidation()
		{
			return jobId.getText();
		}
		
		public String tmoWorkerVersionValidation()
		{
			return tmoWorkerVersion.getText();
		}
		
		public String jobCreateTimeValidation()
		{
			return jobCreateTime.getText();
		}
		
		public String jobEnqueueTimeValidation()
		{
			return jobEnqueueTime.getText();
		}
		
		public String jobStartTimeValidation()
		{
			return jobStartTime.getText();
		}
		
		public String jobFirstSolTimeValidation()
		{
			return jobFirstSolTime.getText();
		}
		
		public String JobBinPackingcostValidation()
		{
			return JobBinPackingcost.getText();
		}
		
		public String jobBinPackPubcountValidation()
		{
			return jobBinPackPubcount.getText();
		}
		
		public String jobMinCapIssueValidation()
		{
			return jobMinCapIssue.getText();
		}
		
		public String jobMinCapCountValidation()
		{
			return jobMinCapCount.getText();
		}
		
		public String jobFirstSolSecsValidation()
		{
			return jobFirstSolSecs.getText();
		}
		
		public String jobBestSolSecsValidation()
		{
			return jobBestSolSecs.getText();
		}
		
		public String JobLastSolTimeValidation()
		{
			return JobLastSolTime.getText();
		}
		
		public String jobRevokeTimeValidation()
		{
			return jobRevokeTime.getText();
		}
		
		public String jobSubmittedFromValidation()
		{
			return jobSubmittedFrom.getText();
		}
		
		public String jobSubmittedToValidation()
		{
			return jobSubmittedTo.getText();
		}
		
		public String jobSumittedOrgIdValidation()
		{
			return jobSumittedOrgId.getText();
		}
		
		public String jobSubmittedUserIdValidation()
		{
			return jobSubmittedUserId.getText();
		}
		
		public String jobSumittedOrgNameValidation()
		{
			return jobSumittedOrgName.getText();
		}
		
		public String jobSubmittedUserNameValidation()
		{
			return jobSubmittedUserName.getText();
		}
		
		public String jobRawStepCountValidation()
		{
			return jobRawStepCount.getText();
		}
		
		public String jobCleantimesecsValidation()
		{
			return jobCleantimesecs.getText();
		}
		
		public String jobCleanStepCountValidation()
		{
			return jobCleanStepCount.getText();
		}
		
		public String jobReqCountValidation()
		{
			return jobReqCount.getText();
		}
		
		public String jobInitialCostValidation()
		{
			return jobInitialCost.getText();
		}
		
		public String jobBestCostValidation()
		{
			return jobBestCost.getText();
		}
		
		
		public String errorCode()
		{
			String code = null;
			List<WebElement>list=driver.findElements(By.xpath("//table[@class='table table-striped table-bordered']//tbody//tr"));
			System.out.println(list.size());
			if(list.size()>0)
			{
				for(int i=0;i<1;i++)
				{
					code=jobErrorCode.getText();
				}
			}
			return code;
		}

		public String errorMessage()
		{
			String message = null;
			List<WebElement>list=driver.findElements(By.xpath("//table[@class='table table-striped table-bordered']//tbody//tr"));
			System.out.println(list.size());
			if(list.size()>0)
			{
				for(int i=0;i<1;i++)
				{
					message=jobErrorMessage.getText();
				}
			}
			return message;
		}

}

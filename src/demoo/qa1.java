package demoo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class qa1 {
	public static File src=new File("C:\\Users\\Varun\\workspace\\Exceldemoqa\\Excel\\demoqa2.xlsx");
	
	public static XSSFWorkbook workbook;
	   public static XSSFSheet sheet;
	   public static XSSFCell cell;
	   public static WebElement searchelement;
	   
	   //Creation of object for the class methods
	  static qa2 obj = new qa2();
	   static WebDriver driver;
	   
	   
  @Test
  public void input() throws InterruptedException, IOException {
	  
	  FileInputStream finput = new FileInputStream(src);

	  // Load the workbook.
	  workbook = new XSSFWorkbook(finput);

	// Load the sheet in which data is stored.
	sheet= workbook.getSheetAt(0);

	//Getting the row count value and storing
	int rc=sheet.getLastRowNum();

	for(int i=1; i<=rc; i++)      
	   
	   {    
	     Row row = sheet.getRow(i);
	     
	     if(row == null || row.getCell(1)==null)
	     {      
	      continue;
	     }
	         
	     String testcase = row.getCell(1).toString();        
	     System.out.println(testcase);
	     
	     //storing the test caseid value  
	     String testcaseid = row.getCell(0).toString();        
	       
	     switch(testcase)
	     {
	     
	     case "Function":
		     
		     System.out.println(testcaseid + ":" + testcase);
		    
		         obj.Function();    
		         Thread.sleep(5000);
		         updateresult("html/body/div[1]/div/div[2]/aside[1]/div[2]/div/ul/li/a",i);
		     break;
	     
	     
	     
	     
	     case "Registration":
	     
	     System.out.println(testcaseid + ":" + testcase);
	    
	         obj.Registration();    
	         Thread.sleep(5000);
	         updateresult("html/body/div[1]/div/div[1]/main/article/div/div/div[3]/form/ul/li[3]/div/div/label[3]",i);
	     break;
	     
	     case "interaction":
		     
		     System.out.println(testcaseid + ":" + testcase);
		         obj.interaction();    
		         Thread.sleep(5000);
		         updateresult("html/body/div[1]/div/div[1]/main/article/div/div/div/ul/li[2]/a",i);
		     break;
		     
	     case "widget":
		     
		     System.out.println(testcaseid + ":" + testcase);
		         obj.widget();    
		         Thread.sleep(5000);
		         updateresult("html/body/div[1]/div/div[1]/main/article/div/div/div[1]/div/div/h3[2]",i);
		     break;  
		     
		     
	     case "frameswindows":
		     
		     System.out.println(testcaseid + ":" + testcase);
		         obj.frameswindows();    
		         Thread.sleep(5000);
		         updateresult("html/body/div[1]/div/div[1]/main/article/div/div/div[1]/div/p/a",i);
		     break;    
		     
		          
}
	    
	     
}
	
	}
	 
	 @SuppressWarnings("static-access")
     public static void updateresult(String componentname,int i) throws IOException, InterruptedException
     {
        
        int a =obj.driver.findElements(By.xpath(componentname)).size();
        
        
        // Specify the message needs to be written.          
           String message = "Pass";
           String message1 = "Fail";
           if(a==1)
        
        {    
        
        Thread.sleep(3000);  
       sheet.getRow(i).createCell(4).setCellValue(message);
      
        }
      
       else
             {
              Thread.sleep(3000);
              sheet.getRow(i).createCell(4).setCellValue(message1);                    
              
             }
           FileOutputStream foutput=new FileOutputStream(src);
        
           workbook.write(foutput);
              
           foutput.close();


     }  
	  
  }


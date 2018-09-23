package taiwan;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Nostroposition {
	
	WebDriver login1;
	public WebDriver login_screen(String user,String pwd)
	{
		WebDriver login1;
	File file = new File("D:/Vikas kapoor selenium notes/chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	login1 = new ChromeDriver();
	login1.get("http://172.21.163.65:24000/Bancs/common/dologin.jsp?method=authMode&JSLoadingMode=null");
	login1.navigate().refresh();
	login1.manage().window().maximize();
try{
	   WebElement username = login1.findElement(By.id("userId"));
	   username.sendKeys(user);
	   WebElement password = login1.findElement(By.id("password"));
	   password.sendKeys(pwd);
 	   Thread.sleep(100L);
 	   //WebElement oupca =  login1.findElement(By.id("entity"));
 	   



password.sendKeys(Keys.RETURN);
 	   //oupca.sendKeys("BTMU Taipei Branch");
 	   //Select select = new Select(oupca);
 	   //select.selectByValue("BTMU Taipei Branch");
 	   WebElement login = login1.findElement(By.id("Login"));
 	   login.click();
 	   login1.manage().window().maximize();
 	   System.out.println("logged in");
 	   Thread.sleep(1000);
 	   login1.manage().timeouts().implicitlyWait(70L, TimeUnit.SECONDS);
 	   
}

      catch (InterruptedException e) {
			e.printStackTrace();
		}

	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
return login1; 
   	    






}
	
	public void createNostro (WebDriver wd)
	{
		try{
			
			Thread.sleep(3000);
			wd.findElement(By.id("userMenu")).click();
			wd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	        System.out.println("menu clicked");
	        Thread.sleep(2000);
	         wd.findElement(By.xpath("//a[@title='Nostro Monitoring']")).click();
		       
	        
		       System.out.println("Clciked Nostro position");
		       Thread.sleep(4000);
		       
		       WebElement webobject1 = wd.findElement(By.xpath("//a[@title='Nostro Position List']"));
		       ((JavascriptExecutor) wd).executeScript("arguments[0].click();", webobject1);
		      // wd.findElement(By.xpath("//a[@title='Nostro Position List']")).click();
		       System.out.println("Nostro position clicked");
	        
		       
		   	wd.switchTo().frame("panel2");
		   	
		    Thread.sleep(4000);
		    
			wd.findElement(By.id("MCB_SearchWC_wca_STATUS_RNGVAL-button")).click();
			 System.out.println("drop down clicked");
			 Thread.sleep(2000);
			 wd.findElement(By.xpath("/html/body/form/div[2]/ul/li[6]/ul/li/div/div/div/ul/li[3]")).click();
			 System.out.println("generated selected");
			 
			 wd.findElement(By.id("Search")).click();
			 System.out.println("search clicked");
			 Actions oAction = new Actions(wd);
				WebElement ab= wd.findElement(By.xpath("html/body/form/span/fieldset/div[2]/table/tbody/tr/td[2]"));
				oAction.moveToElement(ab);
				oAction.contextClick(ab).build().perform();  /* this will perform right click */
				System.out.println("right click is performed");	
				Thread.sleep(5000);
				wd.findElement(By.xpath("/html/body/form/div/div/ul/li/input")).click();
				
				System.out.println("create click is performed");
				Thread.sleep(3000);
				wd.switchTo().defaultContent();
			 	wd.switchTo().frame("panel3");
			 	System.out.println("frame switched");	
			 	wd.findElement(By.id("butName_1")).click();
			 	
			 	System.out.println("Get Positon clicked");	
			 	Alert save = wd.switchTo().alert();
				save.accept();
				
				
				wd.switchTo().defaultContent();
				
				wd.switchTo().frame("panel2");
					Thread.sleep(2000);
				    
					//wd.findElement(By.id("MCB_SearchWC_wca_STATUS_RNGVAL-button")).click();
					 //System.out.println("drop down clicked");
					 //Thread.sleep(2000);
					 //wd.findElement(By.xpath("/html/body/form/div[2]/ul/li[6]/ul/li/div/div/div/ul/li[3]")).click();
					 //System.out.println("generated selected");
					 
					 //wd.findElement(By.id("Search")).click();
					 //System.out.println("search clicked");
					 Actions fAction = new Actions(wd);
						WebElement abc= wd.findElement(By.xpath("html/body/form/span/fieldset/div[2]/table/tbody/tr/td[2]"));
						fAction.moveToElement(abc);
						fAction.contextClick(abc).build().perform();  /* this will perform right click */
						System.out.println("right click is performed");	
						Thread.sleep(5000);
						wd.findElement(By.xpath("/html/body/form/div/div/ul/li/input")).click();
						
						System.out.println("create click is performed");
						Thread.sleep(3000);
						wd.switchTo().defaultContent();
					 	wd.switchTo().frame("panel4");
					 	System.out.println("frame switched");	
					 	wd.findElement(By.id("plm_ct_NostroGetPostion_wca_POSITION_TYPE_rb1")).click();
					 	System.out.println("clicked Message details");
					 	wd.findElement(By.id("plm_ct_NostroGetPostion_wca_TXN_LIQ_TYP-button")).click();
					 	
					 	System.out.println("drop down clicked");
					 	
					 	wd.findElement(By.xpath("/html/body/form/ul[2]/li/ul/li/fieldset/ul/li[2]/div/div/ul/li[2]")).click();
					 	System.out.println("All clicked");
					 	wd.findElement(By.id("butName_1")).click();
					 	
					 	System.out.println("Get Positon clicked");	
					 	Alert save1 = wd.switchTo().alert();
						save.accept();
				
						wd.switchTo().defaultContent();
						
						wd.switchTo().frame("panel2");
							Thread.sleep(2000);
						    
							//wd.findElement(By.id("MCB_SearchWC_wca_STATUS_RNGVAL-button")).click();
							 //System.out.println("drop down clicked");
							 //Thread.sleep(2000);
							 //wd.findElement(By.xpath("/html/body/form/div[2]/ul/li[6]/ul/li/div/div/div/ul/li[3]")).click();
							 //System.out.println("generated selected");
							 
							 //wd.findElement(By.id("Search")).click();
							 //System.out.println("search clicked");
							 Actions cAction = new Actions(wd);
								WebElement bc= wd.findElement(By.xpath("html/body/form/span/fieldset/div[2]/table/tbody/tr/td[2]"));
								cAction.moveToElement(bc);
								cAction.contextClick(bc).build().perform();  /* this will perform right click */
								System.out.println("right click is performed");	
								Thread.sleep(5000);
								wd.findElement(By.xpath("/html/body/form/div/div/ul/li/input")).click();
								
								System.out.println("create click is performed");
								Thread.sleep(3000);
								wd.switchTo().defaultContent();
							 	wd.switchTo().frame("panel4");
							 	System.out.println("frame switched");	
							 	wd.findElement(By.id("plm_ct_NostroGetPostion_wca_POSITION_TYPE_rb1")).click();
							 	System.out.println("clicked Message details");
							 	wd.findElement(By.id("plm_ct_NostroGetPostion_wca_TXN_LIQ_TYP-button")).click();
							 	
							 	System.out.println("drop down clicked");
							 	
							 	wd.findElement(By.xpath("/html/body/form/ul[2]/li/ul/li/fieldset/ul/li[2]/div/div/ul/li[2]")).click();
							 	System.out.println("All clicked");
							 	wd.findElement(By.id("butName_1")).click();
							 	
							 	System.out.println("Get Positon clicked");	
							 	Alert save3 = wd.switchTo().alert();
								save3.accept();
								wd.switchTo().defaultContent();
								
								wd.switchTo().frame("panel2");
									Thread.sleep(2000);
								    
									//wd.findElement(By.id("MCB_SearchWC_wca_STATUS_RNGVAL-button")).click();
									 //System.out.println("drop down clicked");
									 //Thread.sleep(2000);
									 //wd.findElement(By.xpath("/html/body/form/div[2]/ul/li[6]/ul/li/div/div/div/ul/li[3]")).click();
									 //System.out.println("generated selected");
									 
									 //wd.findElement(By.id("Search")).click();
									 //System.out.println("search clicked");
									 Actions mAction = new Actions(wd);
										WebElement oc= wd.findElement(By.xpath("html/body/form/span/fieldset/div[2]/table/tbody/tr/td[2]"));
										mAction.moveToElement(oc);
										mAction.contextClick(oc).build().perform();  /* this will perform right click */
										System.out.println("right click is performed");	
										Thread.sleep(5000);
										wd.findElement(By.xpath("/html/body/form/div/div/ul/li/input")).click();
										
										System.out.println("create click is performed");
										Thread.sleep(3000);
										wd.switchTo().defaultContent();
									 	wd.switchTo().frame("panel4");
									 	System.out.println("frame switched");	
									 	wd.findElement(By.id("plm_ct_NostroGetPostion_wca_POSITION_TYPE_rb1")).click();
									 	System.out.println("clicked Message details");
									 	wd.findElement(By.id("plm_ct_NostroGetPostion_wca_TXN_LIQ_TYP-button")).click();
									 	
									 	System.out.println("drop down clicked");
									 	
									 	wd.findElement(By.xpath("/html/body/form/ul[2]/li/ul/li/fieldset/ul/li[2]/div/div/ul/li[3]")).click();
									 	System.out.println("Recon clicked");
									 	wd.findElement(By.id("butName_1")).click();
									 	
									 	System.out.println("Get Positon clicked");	
									 	Alert save4 = wd.switchTo().alert();
										save4.accept();
										wd.switchTo().defaultContent();
										
										wd.switchTo().frame("panel2");
											Thread.sleep(2000);
										    
											//wd.findElement(By.id("MCB_SearchWC_wca_STATUS_RNGVAL-button")).click();
											 //System.out.println("drop down clicked");
											 //Thread.sleep(2000);
											 //wd.findElement(By.xpath("/html/body/form/div[2]/ul/li[6]/ul/li/div/div/div/ul/li[3]")).click();
											 //System.out.println("generated selected");
											 
											 //wd.findElement(By.id("Search")).click();
											 //System.out.println("search clicked");
											 Actions nAction = new Actions(wd);
												WebElement p= wd.findElement(By.xpath("html/body/form/span/fieldset/div[2]/table/tbody/tr/td[2]"));
												nAction.moveToElement(p);
												nAction.contextClick(p).build().perform();  /* this will perform right click */
												System.out.println("right click is performed");	
												Thread.sleep(5000);
												wd.findElement(By.xpath("/html/body/form/div/div/ul/li/input")).click();
												
												System.out.println("create click is performed");
												Thread.sleep(3000);
												wd.switchTo().defaultContent();
											 	wd.switchTo().frame("panel4");
											 	System.out.println("frame switched");	
											 	wd.findElement(By.id("plm_ct_NostroGetPostion_wca_POSITION_TYPE_rb1")).click();
											 	System.out.println("clicked Message details");
											 	wd.findElement(By.id("plm_ct_NostroGetPostion_wca_TXN_LIQ_TYP-button")).click();
											 	
											 	System.out.println("drop down clicked");
											 	
											 	wd.findElement(By.xpath("/html/body/form/ul[2]/li/ul/li/fieldset/ul/li[2]/div/div/ul/li[4]")).click();
											 	System.out.println("wired Deposit clicked");
											 	wd.findElement(By.id("butName_1")).click();
											 	
											 	System.out.println("Get Positon clicked");	
											 	Alert save8 = wd.switchTo().alert();
												save8.accept();
												wd.switchTo().defaultContent();
												
												wd.switchTo().frame("panel2");
													Thread.sleep(2000);
												    
													//wd.findElement(By.id("MCB_SearchWC_wca_STATUS_RNGVAL-button")).click();
													 //System.out.println("drop down clicked");
													 //Thread.sleep(2000);
													 //wd.findElement(By.xpath("/html/body/form/div[2]/ul/li[6]/ul/li/div/div/div/ul/li[3]")).click();
													 //System.out.println("generated selected");
													 
													 //wd.findElement(By.id("Search")).click();
													 //System.out.println("search clicked");
													 Actions qAction = new Actions(wd);
														WebElement q= wd.findElement(By.xpath("html/body/form/span/fieldset/div[2]/table/tbody/tr/td[2]"));
														qAction.moveToElement(q);
														qAction.contextClick(q).build().perform();  /* this will perform right click */
														System.out.println("right click is performed");	
														Thread.sleep(5000);
														wd.findElement(By.xpath("/html/body/form/div/div/ul/li/input")).click();
														
														System.out.println("create click is performed");
														Thread.sleep(3000);
														wd.switchTo().defaultContent();
													 	wd.switchTo().frame("panel4");
													 	System.out.println("frame switched");	
													 	wd.findElement(By.id("plm_ct_NostroGetPostion_wca_POSITION_TYPE_rb1")).click();
													 	System.out.println("clicked Message details");
													 	wd.findElement(By.id("plm_ct_NostroGetPostion_wca_TXN_LIQ_TYP-button")).click();
													 	
													 	System.out.println("drop down clicked");
													 	
													 	wd.findElement(By.xpath("/html/body/form/ul[2]/li/ul/li/fieldset/ul/li[2]/div/div/ul/li[5]")).click();
													 	System.out.println(" Return clicked");
													 	wd.findElement(By.id("butName_1")).click();
													 	
													 	System.out.println("Get Positon clicked");	
													 	Alert save11 = wd.switchTo().alert();
														save11.accept();
														wd.switchTo().defaultContent();
														
														wd.switchTo().frame("panel2");
															Thread.sleep(2000);
														    
															//wd.findElement(By.id("MCB_SearchWC_wca_STATUS_RNGVAL-button")).click();
															 //System.out.println("drop down clicked");
															 //Thread.sleep(2000);
															 //wd.findElement(By.xpath("/html/body/form/div[2]/ul/li[6]/ul/li/div/div/div/ul/li[3]")).click();
															 //System.out.println("generated selected");
															 
															 //wd.findElement(By.id("Search")).click();
															 //System.out.println("search clicked");
															 Actions uAction = new Actions(wd);
																WebElement u= wd.findElement(By.xpath("html/body/form/span/fieldset/div[2]/table/tbody/tr/td[2]"));
																uAction.moveToElement(u);
																uAction.contextClick(u).build().perform();  /* this will perform right click */
																System.out.println("right click is performed");	
																Thread.sleep(5000);
																wd.findElement(By.xpath("/html/body/form/div/div/ul/li/input")).click();
																
																System.out.println("create click is performed");
																Thread.sleep(3000);
																wd.switchTo().defaultContent();
															 	wd.switchTo().frame("panel4");
															 	System.out.println("frame switched");	
															 	wd.findElement(By.id("plm_ct_NostroGetPostion_wca_POSITION_TYPE_rb1")).click();
															 	System.out.println("clicked Message details");
															 	wd.findElement(By.id("plm_ct_NostroGetPostion_wca_TXN_LIQ_TYP-button")).click();
															 	
															 	System.out.println("drop down clicked");
															 	
															 	wd.findElement(By.xpath("/html/body/form/ul[2]/li/ul/li/fieldset/ul/li[2]/div/div/ul/li[6]")).click();
															 	System.out.println("treasury clicked");
															 	wd.findElement(By.id("butName_1")).click();
															 	
															 	System.out.println("Get Positon clicked");	
															 	Alert save15 = wd.switchTo().alert();
																save15.accept();
																wd.switchTo().defaultContent();
																
																wd.switchTo().frame("panel2");
																	Thread.sleep(2000);
																    
																	//wd.findElement(By.id("MCB_SearchWC_wca_STATUS_RNGVAL-button")).click();
																	 //System.out.println("drop down clicked");
																	 //Thread.sleep(2000);
																	 //wd.findElement(By.xpath("/html/body/form/div[2]/ul/li[6]/ul/li/div/div/div/ul/li[3]")).click();
																	 //System.out.println("generated selected");
																	 
																	 //wd.findElement(By.id("Search")).click();
																	 //System.out.println("search clicked");
																	 Actions dAction = new Actions(wd);
																		WebElement d= wd.findElement(By.xpath("html/body/form/span/fieldset/div[2]/table/tbody/tr/td[2]"));
																		dAction.moveToElement(abc);
																		dAction.contextClick(d).build().perform();  /* this will perform right click */
																		System.out.println("right click is performed");	
																		Thread.sleep(5000);
																		wd.findElement(By.xpath("/html/body/form/div/div/ul/li/input")).click();
																		
																		System.out.println("create click is performed");
																		Thread.sleep(3000);
																		wd.switchTo().defaultContent();
																	 	wd.switchTo().frame("panel4");
																	 	System.out.println("frame switched");	
																	 	wd.findElement(By.id("plm_ct_NostroGetPostion_wca_POSITION_TYPE_rb1")).click();
																	 	System.out.println("clicked Message details");
																	 	wd.findElement(By.id("plm_ct_NostroGetPostion_wca_TXN_LIQ_TYP-button")).click();
																	 	
																	 	System.out.println("drop down clicked");
																	 	
																	 	wd.findElement(By.xpath("/html/body/form/ul[2]/li/ul/li/fieldset/ul/li[2]/div/div/ul/li[7]")).click();
																	 	System.out.println("Interbank clicked");
																	 	wd.findElement(By.id("butName_1")).click();
																	 	
																	 	System.out.println("Get Positon clicked");	
																	 	Alert save12 = wd.switchTo().alert();
																		save12.accept();
																
				
				
				
				
				
		}	
		
	      catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		   catch(Exception e)
		   {
			   e.printStackTrace();
		   }
      
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		Nostroposition BL = new Nostroposition();
		
		WebDriver WD2 = BL.login_screen("renukatm","verma5");
		
		BL.createNostro(WD2);
	
	}

}

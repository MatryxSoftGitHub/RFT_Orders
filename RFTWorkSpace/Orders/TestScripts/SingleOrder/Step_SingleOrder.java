package TestScripts.SingleOrder;
import resources.TestScripts.SingleOrder.Step_SingleOrderHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  
/**
 * Description   : Functional Test Script
 * @author msadmin
 */
public class Step_SingleOrder extends Step_SingleOrderHelper
{
	/**
	 * Script Name   : <b>Step_SingleOrder</b>
	 * Generated     : <b>11-Jan-2021 3:10:39 pm</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 18363 ()
	 * 
	 * @since  2021/01/11
	 * @author msadmin
	 * @throws InterruptedException 
	 */

	
	
	public void testMain(Object[] args) throws InterruptedException 
	{
		// To Launch the application 
		startApp("Orders");
		
		// Window: Orders.exe: Untitled - Orders
		Menu_Orders().click(atPath("Orders"));
		Menu_Orders().click(atPath("Orders->New order..."));

	
		// Window: Orders.exe: New order

     	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
		LocalDateTime now = LocalDateTime.now(); 
		String sDate=now.toString();
		System.out.println(dtf.format(now)); 
		  
		// Data Driven Code inserted on 11-Jan-2021
		//	comboBoxcomboBox4().performTest( ComboBox_SelectedValuesVP() );
		Cbo_Product().select(dpString("ComboBox")); 
		
		System.out.println(dpString("ComboBox"));
		
		String sSelectedTextFromDb=dpString("ComboBox");
		String sSelectedText=Cbo_Product().getSelectedText();
		//	System.out.println(" This Value is fetched from sSelected Text "+sSelectedText);
		//	System.out.println(" This Value is fetched from sSelected Text "+sSelectedTextFromDb);

		
		// Data Verfication
		vpManual (sSelectedText,sSelectedTextFromDb).performTest();
	
	    System.out.println(vpManual (sSelectedText,sSelectedTextFromDb).performTest());


		sysDateTimePick32calendar2().click();
		
		Win_NewOrder().inputKeys("{ExtLeft}");
		Win_NewOrder().inputKeys("{ExtLeft}");
		
		//13,11,2021
		Win_NewOrder().inputKeys(dpString("sDate"));
		//Win_NewOrder().inputKeys("13,11,2021");
		
		Txt_CustomerName().setText(dpString("CustomerName"));
		Txt_Street().setText(dpString("Street"));
		Txt_City().setText(dpString("City"));
		Txt_State().setText(dpString("State"));
		Txt_Zip().setText(dpString("Zip"));
		Txt_Card().setText(dpString("CardNo"));
		
		sysDateTimePick32calendar().click();
		
		Win_NewOrder().inputKeys("{ExtLeft}");
		Win_NewOrder().inputKeys("{ExtLeft}");
		Win_NewOrder().inputKeys("13,11,2023");
		
		Btn_Ok().click();
		
		System.out.println(Wnd_MainTable().isShowing());
		
		if(Wnd_MainTable().isShowing()==true)

		{
			logInfo("Dialog is still Present.");
			
		}
		else
		{
			logInfo("Dialog is Closed sucessfully.");
		}


		callScript("TestScripts.Steps.Step_Save.SaveOrder");

	}
}



	


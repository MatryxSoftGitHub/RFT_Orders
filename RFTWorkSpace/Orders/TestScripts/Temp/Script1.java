package TestScripts.Temp;
import resources.TestScripts.Temp.Script1Helper;
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
/**
 * Description   : Functional Test Script
 * @author msadmin
 */
public class Script1 extends Script1Helper
{
	/**
	 * Script Name   : <b>Script1</b>
	 * Generated     : <b>12-Jan-2021 10:00:56 am</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 18363 ()
	 * 
	 * @since  2021/01/12
	 * @author msadmin
	 */
	public void testMain(Object[] args) 
	{
		startApp("Orders");
		
		// Window: Orders.exe: Untitled - Orders
		applicationmenuBar().click(atPath("Orders"));
		applicationmenuBar().click(atPath("Orders->New order..."));
		
		// Window: Orders.exe: New order
		sysDateTimePick32calendar().click(atPoint(137,12));
		
		// 
		sysMonthCal32calendar().click(atPoint(92,14));
		sysMonthCal32calendar().click(atDate(1, 1, 2021));
		
		// Window: Orders.exe: New order
		sysDateTimePick32calendar().click(atPoint(74,7));
		sysDateTimePick32calendar().click(atPoint(137,7));
		sysDateTimePick32calendar().click(atPoint(139,12));
		sysDateTimePick32calendar().click(atPoint(139,11));
		sysDateTimePick32calendar2().click(atPoint(139,12));
		sysDateTimePick32calendar2().click(atPoint(137,12));
		
		// 
		sysMonthCal32calendar().click(YEAR);
		
		// Window: Orders.exe: New order
		sysDateTimePick32calendar2().click(atPoint(140,13));
		sysDateTimePick32calendar().click(atPoint(45,18));
		sysDateTimePick32calendar().click(atPoint(138,9));
		sysDateTimePick32calendar2().click(atPoint(108,12));
		sysDateTimePick32calendar2().click(atPoint(141,9));
		
		// 
		sysMonthCal32calendar().click(MONTH);
		
		// Window: Orders.exe: Context
		contextpopupMenu().click(atPath("January"));
		
		// 
		sysMonthCal32calendar().click(YEAR);
		sysMonthCal32calendar().click(atPoint(128,17));
		sysMonthCal32calendar().inputKeys("{BKSP}3");
	}
}


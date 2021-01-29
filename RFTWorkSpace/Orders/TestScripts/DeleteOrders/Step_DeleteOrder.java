package TestScripts.DeleteOrders;
import resources.TestScripts.DeleteOrders.Step_DeleteOrderHelper;
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
public class Step_DeleteOrder extends Step_DeleteOrderHelper
{
	/**
	 * Script Name   : <b>Step_DeleteOrder</b>
	 * Generated     : <b>13-Jan-2021 2:41:43 pm</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 18363 ()
	 * 
	 * @since  2021/01/13
	 * @author msadmin
	 */
	public void testMain(Object[] args) 
	{
		startApp("Orders");
		
		// Window: Orders.exe: Untitled - Orders
		applicationmenuBar().click(atPath("File"));
		applicationmenuBar().click(atPath("File->Open..."));
		
		// Window: Orders.exe: Open
		comboBoxcomboBox().click();
		comboBoxcomboBox().click(atText("Local Disk (C:)"));
		folderViewtable().click(atText("PlacedOrders1.tbl"), atPoint(69,10));
		comboBoxcomboBox2().click(atPoint(92,7));
		comboBoxcomboBox2().click(atPoint(102,8));
		openbutton().click(atPoint(28,17));
		
		// Window: Orders.exe: PlacedOrders1.tbl - Orders
		sysListView32table().click(atCell(atRow(atText("MatryxSoft")), 
                                    atColumn(atText("Product"))));
		sysListView32table().click(RIGHT, atCell(
                                        atRow(atText("MatryxSoft")), 
                                        atColumn(atText("Product"))));
		
		// Window: Orders.exe: Context
		contextpopupMenu().click(atPath("Delete order"));
		
		// Window: Orders.exe: Orders
		yesbutton().click();
		
		// Window: Orders.exe: PlacedOrders1.tbl - Orders
		placedOrders1TblOrderswindow(ANY,MAY_EXIT).click(CLOSE_BUTTON);
		
		// Window: Orders.exe: Orders
		yesbutton(ANY,MAY_EXIT).click(atPoint(45,8));
	}
}


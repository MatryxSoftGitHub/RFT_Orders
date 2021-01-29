package TestScripts.Steps.Step_Save;
import resources.TestScripts.Steps.Step_Save.SaveOrderHelper;
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
public class SaveOrder extends SaveOrderHelper
{
	/**
	 * Script Name   : <b>SaveOrder</b>
	 * Generated     : <b>18-Jan-2021 12:07:28 pm</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 18363 ()
	 * 
	 * @since  2021/01/18
	 * @author msadmin
	 */
	public void testMain(Object[] args) 
	{
		// Window: Orders.exe: File - Save Orders
		
				Menu_File().click(atPath("File"));
				Menu_File().click(atPath("File->Save"));
				
				// Window: Orders.exe: Save
//				Cbo_SaveIn().click(ARROW);
//				Cbo_SaveIn().click(atText("Local Disk (C:)"));
//				Cbo_FileName().click();

				Txt_FileName().inputKeys(dpString("SaveLocation"));
				Btn_Save().click();
				if(Btn_Yes().isShowing()==true) 
				{
					Btn_Yes().click();
				}
			
				
				//Tear down 
				
				Wnd_MainTable(ANY,MAY_EXIT).click(CLOSE_BUTTON);
				
			
			}
	}
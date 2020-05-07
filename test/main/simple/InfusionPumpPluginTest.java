package main.simple;


import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotButton;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(SWTBotJunit4ClassRunner.class)
public class InfusionPumpPluginTest {

	private static SWTWorkbenchBot bot;
//	static Display display;
//	static Shell shell;
//	static SWTBotButton onOffBtn;

	@BeforeClass
	public static void beforeClass() throws Exception{
		bot = new SWTWorkbenchBot();
	}
	
	@AfterClass
	public static void afterClass(){
		bot.resetWorkbench();
	}

	public void testSettingRate(){
		// slow down tests
		SWTBotPreferences.PLAYBACK_DELAY = 10;
		// set to the default timeout of 5 seconds
		SWTBotPreferences.TIMEOUT = 5000;
		
		//test environment
		bot.viewByTitle("Project Explorer").show();
		bot.tree().getTreeItem("InfusionPumpPlugin").getNode("src").expand();
		bot.tree().getTreeItem("InfusionPumpPlugin").getNode("src").getNode("main.simple").expand();
		bot.tree().getTreeItem("InfusionPumpPlugin").getNode("src").getNode("main.simple").getNode("InfusionPumpPlugin.java").select();

//		bot.button("onOffBtn").setFocus();
//		bot.button("onOffBtn").click(); // power on -- double click
//		bot.label().getText(); // check status -- update later
//		bot.button("yesStartBtn").setFocus();
//		bot.button("yesStartBtn").click(); // start to configure -- doulbe click
//		bot.button("upBtn").click(); // add volume by 1
//		bot.button("upBtn").click();	// add rate by 1
//		bot.button("upBtn").click();	// add rate by 1
//		bot.button("yesStartBtn").click(); // confirm settings and start confusion	
//		bot.button("noStopBtn").click();	// pause confusion
//		bot.button("yesStartBtn").click(); // re-start confusion
//		bot.label().getText().contains("infusing"); // check status -- update later
		
	}

}

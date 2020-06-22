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
		
}

}

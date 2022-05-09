import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Trail1 {

	public static void main(String[] args) throws AWTException, IOException, URISyntaxException, InterruptedException {
		Robot robot = new Robot();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the link: ");
		String link = input.nextLine();
		
		Desktop d = Desktop.getDesktop();
		d.browse(new URI("https://ytmp3.cc/en3f98ccqp/"));
		
		StringSelection s = new StringSelection(link);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(s, null);
		Thread.sleep(3500);
		for(int i = 1; i <=4; i++) {
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		}
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		input.close();
	}

}

package Taoche.Wap.Util;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class KeyBoardUtil {
	// 按Tab键的封装方法
	public static void pressTabKey() {
		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		// 调用keyPress方法来实现按下Tab�?
		robot.keyPress(KeyEvent.VK_TAB);
		// 调用keyRelease方法来实现释放Tab�?
		robot.keyRelease(KeyEvent.VK_TAB);
	}

	// 按Enter键的封装方法
	public static void pressEnter() {
		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		// 调用keyPress方法来实现按下Tab�?
		robot.keyPress(KeyEvent.VK_ENTER);
		// 调用keyRelease方法来实现释放Tab�?
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	/*
	 * 将指定字符串设为剪切板的内容，然后执行粘贴操�? 将页面焦点切换到输入框后，调用此函数可以将指定字符串粘贴到输入框�?
	 */
	public static void setAndctrlVClipboardData(String string) {
		StringSelection stringSelection = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard()
				.setContents(stringSelection, null);
		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		// 以下4行代码表示按下和释放Ctrl+V组合�?
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}
}

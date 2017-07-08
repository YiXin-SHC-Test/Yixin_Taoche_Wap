package Taoche.Wap.TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import Taoche.Wap.PageObjects.SellcarPage;
import Taoche.Wap.Util.WaitUtil;

public class SecllCarPage_Test {
	WebDriver driver;
	String baseUrl = "http://m.taoche.com/sellcar/sellcar.aspx?source=1";

	@Test
	public void MCreateCar() throws Exception {
		SellcarPage sellcarPage = new SellcarPage(driver);
		//�ϴ�������Ƭ
		sellcarPage.UploadPicID1().click();
		WaitUtil.sleep(2000);
		Runtime.getRuntime().exec("D:\\�Զ���\\test.exe");
		WaitUtil.sleep(2000);
		//ѡ����Ϣ
		sellcarPage.CarName().click();
		WaitUtil.sleep(2000);
		sellcarPage.CarPinpai().click();
		WaitUtil.sleep(2000);
		sellcarPage.CarChexi().click();
		WaitUtil.sleep(2000);
		sellcarPage.CarChexing().click();
		WaitUtil.sleep(2000);
		// �༭����ʱ��
		sellcarPage.LicenseTime().click();
		WaitUtil.sleep(2000);
		sellcarPage.Year().click();
		WaitUtil.sleep(2000);
		sellcarPage.Month().click();
		WaitUtil.sleep(2000);
		// �༭�������ڵ�
		sellcarPage.LicenseArea().click();
		WaitUtil.sleep(2000);
		sellcarPage.Province().click();
		WaitUtil.sleep(2000);
		sellcarPage.City().click();
		WaitUtil.sleep(2000);
		// �������
		sellcarPage.KM().sendKeys("1");
		// ѡ����ɫ��Ϣ
		sellcarPage.Color().click();
		WaitUtil.sleep(2000);
		sellcarPage.CarColor().click();
		WaitUtil.sleep(2000);
		// Ԥ�ۼ۸�
		sellcarPage.Carmoney().sendKeys("1");
		// ��д�û�����
		sellcarPage.Username().sendKeys("����");
		WaitUtil.sleep(2000);
		// ��д�û��ֻ���
		sellcarPage.UserMobile().sendKeys("13333333333");
		// ѡ���û����ڳ���
		sellcarPage.CarArea().click();
		sellcarPage.CarAreaProvince().click();
		sellcarPage.CarAreaCity().click();
		WaitUtil.sleep(2000);
		sellcarPage.DayForm().click();
		// �ύ
		sellcarPage.SetButton().click();
		// �����Ƿ�ɹ�
		Assert.assertTrue(driver.getPageSource().contains("�����ɹ�"));
		WaitUtil.sleep(3000);
	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		WaitUtil.sleep(3000);
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
		driver.quit();
	}

}

package DOC_Prescribe_Medications;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Prescribe_Medications {

	public void Physicians_Prescribe_Medications_Edge(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		try {

			Thread.sleep(3000);

			// Fill in the form
			By click_ICD11_Diagnosis = By
					.xpath("//*[@id=\"IPORDERS#0#PASTMEDICAL\"]/div/div/app-directive-linked/div/div[2]/input");
			driver.findElement(click_ICD11_Diagnosis).click();

			By select_Diagnosis = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/div[1]/div[2]/div[2]/div[1]/div");
			driver.findElement(select_Diagnosis).click();

			Thread.sleep(2000);

			By select_Diagnosis_Classification = By
					.xpath("//*[@id=\"1E70#0#SYSDIAGCAT\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(select_Diagnosis_Classification).click();

			By select_Nature = By
					.xpath("//*[@id=\"1E70#0#DI00001\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(select_Nature).click();

			By select_Accuracy = By
					.xpath("//*[@id=\"1E70#0#DIAGACCU\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(select_Accuracy).click();

			Select Onset_Since_dropdown = new Select(
					driver.findElement(By.xpath("//*[@id=\"1E70#0#DIAGONSET\"]/div/div/app-timeperiod/div/select")));
			Onset_Since_dropdown.selectByVisibleText("Days");

			By enter_Onset_Since = By.xpath("//*[@id=\"1E70#0#DIAGONSET\"]/div/div/app-timeperiod/div/input");
			driver.findElement(enter_Onset_Since).sendKeys("5");

			Thread.sleep(3000);

			// Prescription section

			By select_Prescription_section = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[1]/div[4]/div/span[2]");
			driver.findElement(select_Prescription_section).click();

			Thread.sleep(1000);

			By search_Prescription_Order = By.xpath("//*[@id=\"cns-pres-search\"]");
			driver.findElement(search_Prescription_Order).sendKeys("Paracetamol" + Keys.ENTER);

			Thread.sleep(3000);

			By Select_Prescription_order = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[1]/div[2]/app-consultation-note-section/div/div/app-consultation-note-prescription/div/div/div[1]/div[2]/div[3]/div[1]");
			driver.findElement(Select_Prescription_order).click();

			Thread.sleep(4000);

			// Fill Prescription Order
			By select_Route = By
					.xpath("//*[@id=\"200-00337#0#PRESROUTE\"]/div/div/app-segment/div/div/div[2]/div[1]/div/input");
			driver.findElement(select_Route).click();

			Thread.sleep(3000);

			By select_Frequency = By
					.xpath("//*[@id=\"200-00337#0#PRESFRQ\"]/div/div/app-segment/div/div/div[2]/div[2]/div/input");
			driver.findElement(select_Frequency).click();

			By select_Duration = By
					.xpath("//*[@id=\"200-00337#0#\"]/div/div/app-composite-field/div/div[2]/span[4]/input");
			driver.findElement(select_Duration).click();

			Thread.sleep(2000);

			By Close_Button = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-consultation-note/div/div/div[2]/button[3]");
			driver.findElement(Close_Button).click();

			Thread.sleep(1000);

			By Submit_Button = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-patient-view/app-crm-forms-list/app-activity-modal/div[1]/div[2]/div/div[2]/div[2]/app-clinicalform/div/div[2]/div[2]/div[2]/button[4]");
			driver.findElement(Submit_Button).click();

			Thread.sleep(5000);

			JavascriptExecutor java = (JavascriptExecutor) driver;
			java.executeScript("scroll(0,250)");
		} catch (InterruptedException ex) {
			Logger.getLogger(Prescribe_Medications.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
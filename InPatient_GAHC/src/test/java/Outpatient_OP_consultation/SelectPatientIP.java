package Outpatient_OP_consultation;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SelectPatientIP {

	public void selectpatientID_Edge(WebDriver driver) {
		try {
			// Search for patient
			Thread.sleep(10000);

			// Find a Patient
			By findPatient = By.xpath("/html/body/app-root/app-crm/div/div/app-crm-leads/div[1]/div[2]/div[1]/div[1]");
			driver.findElement(findPatient).click();

			By searchText = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-leads/div[2]/div/div[1]/app-crm-quick-filters/div/div/div[2]/div[2]/div/input");
			driver.findElement(searchText).sendKeys("A200000403" + Keys.ENTER);

			Thread.sleep(8000);

			// Select the patient
			By patientName = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-leads/div[2]/div/div[2]/div[2]/div/app-crm-leads-list/div[2]/div[1]/div/div/div[1]/div[1]");
			driver.findElement(patientName).click();

			By chooseVisit = By.xpath(
					"/html/body/app-root/app-crm/div/div/app-crm-leads/div[2]/div/div[2]/div[2]/div/app-crm-leads-list/div[3]/div[2]/div[2]/div[2]/p[1]");
			driver.findElement(chooseVisit).click();
		} catch (InterruptedException ex) {
			Logger.getLogger(SelectPatientIP.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}

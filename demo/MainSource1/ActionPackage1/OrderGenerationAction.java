package ActionPackage1;

import org.openqa.selenium.support.PageFactory;

import LocatorPackage1.OrderGenerationLocator;
import UtilsPackage1.HelperClass;

public class OrderGenerationAction {
	
	OrderGenerationLocator pro = null;
	
    public OrderGenerationAction() {
    	
        this.pro= new OrderGenerationLocator();
        
        PageFactory.initElements(HelperClass.getDriver(),pro);
    }

	public void masterDataIcon() {
		// TODO Auto-generated method stub
		pro.masterData.click();
		HelperClass.sleep(2000);
	}

	public void orderGenerationOption(String str) {
		// TODO Auto-generated method stub
		HelperClass.openPage(str);
	}

	public void generationTab() {
		// TODO Auto-generated method stub
		pro.generationTab.click();
		HelperClass.sleep(2000);
	}

	public void addFilter() {
		// TODO Auto-generated method stub
		pro.addFilter.click();
		HelperClass.sleep(2000);
	}

	public void materialAndEO() {
		// TODO Auto-generated method stub
		pro.eoOption.click();
		HelperClass.sleep(2000);
		pro.addFilter1.click();
		HelperClass.sleep(2000);
		pro.materialOption.click();
		HelperClass.sleep(3000);
	}

	public void materialEO(String string, String string2) {
		// TODO Auto-generated method stub
		pro.boxMaterial.sendKeys(string);
		HelperClass.sleep(2000);
		pro.boxEO.sendKeys(string2);
		HelperClass.sleep(2000);
	}

	public void searchIcon() {
		// TODO Auto-generated method stub
		pro.searchQuery.click();
		HelperClass.sleep(2000);
	}

	public void checkBox() {
		// TODO Auto-generated method stub
		pro.checkBox.click();
		HelperClass.sleep(2000);
	}

	public void generateIcon() {
		// TODO Auto-generated method stub
		pro.generateIcon.click();
		HelperClass.sleep(2000);
	}

	public void confirmGenerate() {
		// TODO Auto-generated method stub
		pro.confirmGenerate.click();
		HelperClass.sleep(5000);
	}

	public void generationDate() {
		// TODO Auto-generated method stub
		pro.genDateIcon.click();
		HelperClass.sleep(2000);
		pro.firstDate.click();
		HelperClass.sleep(2000);
		pro.secondDate.click();
		HelperClass.sleep(2000);
	}

}

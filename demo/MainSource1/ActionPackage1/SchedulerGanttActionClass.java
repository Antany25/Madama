package ActionPackage1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import LocatorPackage1.SchedulerGanttLocatorClass;
import UtilsPackage1.HelperClass;

public class SchedulerGanttActionClass {
	
	SchedulerGanttLocatorClass gantt = null;
	
    public SchedulerGanttActionClass() {
    	
        this.gantt= new SchedulerGanttLocatorClass();
        
        PageFactory.initElements(HelperClass.getDriver(),gantt);
    }

	public void scheduleIcon() {
		// TODO Auto-generated method stub
		HelperClass.sleep(4000);
		gantt.scheduleIcon.click();
		HelperClass.sleep(2000);
	}

	public void schedulerGanttOption() {
		// TODO Auto-generated method stub
		gantt.schedulerGantt.click();
		HelperClass.sleep(4000);
	}

	public void newOrderIcon() {
		// TODO Auto-generated method stub
		gantt.newOrder.click();
		HelperClass.sleep(2000);
	}

	public void material(String string) {
		// TODO Auto-generated method stub
		gantt.clickMaterial.click();
		HelperClass.sleep(1000);
		gantt.clickMaterialSearch.sendKeys(string);
		HelperClass.sleep(1000);
		gantt.selectMaterial.click();
		HelperClass.sleep(2000);
	}

	public void quantity(String string) {
		// TODO Auto-generated method stub
		gantt.quantity.clear();
		gantt.quantity.sendKeys(string);
		HelperClass.sleep(2000);
	}

	public void dueDate() {
		// TODO Auto-generated method stub
		gantt.dueDateIcon.click();
		HelperClass.sleep(2000);
		gantt.selectDueDate.click();
		HelperClass.sleep(2000);
	}

	public void machineGroup() {
		// TODO Auto-generated method stub
		gantt.machineGroup.click();
		HelperClass.sleep(2000);
		gantt.selectMachineGroup.click();
		HelperClass.sleep(2000);
	}

	public void confirmNewOrder() {
		// TODO Auto-generated method stub
		gantt.confirmNewOrder.click();
		HelperClass.sleep(4000);
	}

	public void materialOrder(String string, String string2) {
		// TODO Auto-generated method stub
		gantt.orderNumber.sendKeys(string2);
		HelperClass.sleep(2000);
		gantt.orderNumber.sendKeys(Keys.ENTER);
		HelperClass.sleep(2000);
		gantt.orderNumber.sendKeys(Keys.ENTER);
		HelperClass.sleep(2000);
	}

	public void orderCheckBox() {
		// TODO Auto-generated method stub
		gantt.orderCheckBox.click();
		HelperClass.sleep(2000);
	}

	public void scheduleOrderIcon() {
		// TODO Auto-generated method stub
		gantt.scheduleOrder.click();
		HelperClass.sleep(2000);
	}

	public void scheduleForward() {
		// TODO Auto-generated method stub
		gantt.radioButton.click();
		HelperClass.screenshot();
		HelperClass.sleep(2000);
	}

	public void confirmOrder() {
		// TODO Auto-generated method stub
		gantt.confirmScheduleOrder.click();
		HelperClass.sleep(5000);
	}

	public void schedulerPage(String str) {
		// TODO Auto-generated method stub
		HelperClass.openPage(str);
		HelperClass.sleep(3000);
	}
}

package LocatorPackage1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SchedulerGanttLocatorClass {
	
	@FindBy(xpath="/html/body/app-root/done-ui-portal/mat-drawer-container/mat-drawer/div/div/done-sidenav/div/div[1]/div[2]/a[2]/done-icon/mat-icon")
	public WebElement scheduleIcon;
	
	@FindBy(xpath="/html/body/app-root/done-ui-portal/mat-drawer-container/mat-drawer-content/div/done-externaldrawer/div/a[1]")
	public WebElement schedulerGantt;
	
	@FindBy(xpath="/html/body/app-root/done-ui-portal/mat-drawer-container/mat-drawer-content/div/div/done-fac-factory/div/done-fac-schedular/div/div[2]/div[2]/done-fac-tabs-panel/div/mat-tab-group/div/mat-tab-body[1]/div/done-fac-new-orders/div/div[1]/button[1]/span[1]/mat-icon")
	public WebElement newOrder;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div/mat-dialog-container/done-fac-new-enterprise-order/div/div/div[2]/div[1]/div/div/doui-select/div/mat-form-field")
	public WebElement clickMaterial;
	
	@FindBy(xpath="/html/body/div[4]/div[4]/div/div/div/div/div[1]/mat-form-field/div/div[1]/div[3]/input")
	public WebElement clickMaterialSearch;
	
	@FindBy(xpath="/html/body/div[4]/div[4]/div/div/div/div/div[2]/div/mat-option")
	public WebElement selectMaterial;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div/mat-dialog-container/done-fac-new-enterprise-order/div/div/div[2]/div[1]/div/mat-form-field[2]/div/div[1]/div[3]/div/input")
	public WebElement quantity;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div/mat-dialog-container/done-fac-new-enterprise-order/div/div/div[2]/div[1]/div/mat-form-field[3]/div/div[1]/div[4]/mat-datepicker-toggle/button")
	public WebElement dueDateIcon;
	
	@FindBy(xpath="/html/body/div[4]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[6]/td[5]")
	public WebElement selectDueDate;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div/mat-dialog-container/done-fac-new-enterprise-order/div/div/div[2]/div[1]/div/mat-form-field[4]/div/div[1]/div[3]/mat-select")
	public WebElement machineGroup;
	
	@FindBy(xpath="/html/body/div[4]/div[4]/div/div/div/mat-option[1]")
	public WebElement selectMachineGroup;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div/mat-dialog-container/done-fac-new-enterprise-order/div/div/div[3]/div/button[2]")
	public WebElement confirmNewOrder;
	
	@FindBy(xpath="/html/body/app-root/done-ui-portal/mat-drawer-container/mat-drawer-content/div/div/done-fac-factory/div/done-fac-schedular/div/div[2]/div[2]/done-fac-tabs-panel/div/mat-tab-group/div/mat-tab-body[1]/div/done-fac-new-orders/div/form/div/div/div[1]/mat-form-field/div/div[1]/div[3]/input")
	public WebElement orderNumber;
	
	@FindBy(xpath="/html/body/app-root/done-ui-portal/mat-drawer-container/mat-drawer-content/div/div/done-fac-factory/div/done-fac-schedular/div/div[2]/div[2]/done-fac-tabs-panel/div/mat-tab-group/div/mat-tab-body[1]/div/done-fac-new-orders/div/div[2]/table/thead/tr/th[1]/mat-checkbox")
	public WebElement orderCheckBox;
	
	@FindBy(xpath="/html/body/app-root/done-ui-portal/mat-drawer-container/mat-drawer-content/div/div/done-fac-factory/div/done-fac-schedular/div/div[2]/div[2]/done-fac-tabs-panel/div/mat-tab-group/div/mat-tab-body[1]/div/done-fac-new-orders/div/form/div/div/div[3]/mat-form-field/div/div[1]/div[3]/input")
	public WebElement materialCode;
	
	@FindBy(xpath="/html/body/app-root/done-ui-portal/mat-drawer-container/mat-drawer-content/div/div/done-fac-factory/div/done-fac-schedular/div/div[2]/div[2]/done-fac-tabs-panel/div/mat-tab-group/div/mat-tab-body[1]/div/done-fac-new-orders/div/div[1]/button[4]")
	public WebElement scheduleOrder;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div/mat-dialog-container/done-fac-scheduler-type-selection/div/div[2]/mat-radio-group/mat-radio-button[3]")
	public WebElement radioButton;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div/mat-dialog-container/done-fac-scheduler-type-selection/div/div[4]/button[2]")
	public WebElement confirmScheduleOrder;
	
	
}

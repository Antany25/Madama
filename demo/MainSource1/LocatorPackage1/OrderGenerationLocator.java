package LocatorPackage1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderGenerationLocator {
	
	@FindBy(xpath="/html/body/app-root/done-ui-portal/mat-drawer-container/mat-drawer/div/div/done-sidenav/div/div[1]/div[2]/a[12]/done-icon/mat-icon")
	public WebElement masterData;
	
	@FindBy(xpath="/html/body/app-root/done-ui-portal/mat-drawer-container/mat-drawer-content/div/div/done-fac-factory/div/app-order-generation/div/doui-toolbar/div/mat-toolbar/div[1]/mat-tab-group/mat-tab-header/div[2]/div/div/div[2]")
	public WebElement generationTab;
	
	@FindBy(xpath="/html/body/app-root/done-ui-portal/mat-drawer-container/mat-drawer-content/div/div/done-fac-factory/div/app-order-generation/div/div/done-fac-order-generation-list/div/div[1]/form/div/div[3]/button")
	public WebElement addFilter;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div/div/div/div[1]/button")
	public WebElement eoOption;

	@FindBy(xpath="/html/body/app-root/done-ui-portal/mat-drawer-container/mat-drawer-content/div/div/done-fac-factory/div/app-order-generation/div/div/done-fac-order-generation-list/div/div[1]/form/div/div[4]/button")
	public WebElement addFilter1;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div/div/div/div[2]/button")
	public WebElement materialOption;
	
	@FindBy(xpath="/html/body/app-root/done-ui-portal/mat-drawer-container/mat-drawer-content/div/div/done-fac-factory/div/app-order-generation/div/div/done-fac-order-generation-list/div/div[1]/form/div/div[3]/done-fac-dynamic-filters/div/doui-filter-item/div/div/div[2]/mat-form-field/div/div[1]/div[3]/input")
	public WebElement boxEO;
	
	@FindBy(xpath="/html/body/app-root/done-ui-portal/mat-drawer-container/mat-drawer-content/div/div/done-fac-factory/div/app-order-generation/div/div/done-fac-order-generation-list/div/div[1]/form/div/div[4]/done-fac-dynamic-filters/div/doui-filter-item/div/div/div[2]/mat-form-field/div/div[1]/div[3]/input")
	public WebElement boxMaterial;
	
	@FindBy(xpath="/html/body/app-root/done-ui-portal/mat-drawer-container/mat-drawer-content/div/div/done-fac-factory/div/app-order-generation/div/doui-toolbar/div/mat-toolbar/div[2]/div[1]/mat-icon")
	public WebElement searchQuery;
	
	@FindBy(xpath="/html/body/app-root/done-ui-portal/mat-drawer-container/mat-drawer-content/div/div/done-fac-factory/div/app-order-generation/div/div/done-fac-order-generation-list/div/div[2]/table/thead/tr/th[1]/div/mat-checkbox")
	public WebElement checkBox;
	
	@FindBy(xpath="/html/body/app-root/done-ui-portal/mat-drawer-container/mat-drawer-content/div/div/done-fac-factory/div/app-order-generation/div/doui-toolbar/div/mat-toolbar/div[2]/div[5]/mat-icon")
	public WebElement generateIcon;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div/mat-dialog-container/div/mat-dialog-actions/div/button[2]")
	public WebElement confirmGenerate;
	
	@FindBy(xpath="/html/body/app-root/done-ui-portal/mat-drawer-container/mat-drawer-content/div/div/done-fac-factory/div/app-order-generation/div/div/done-fac-order-generation-list/div/div[1]/form/div/div[2]/div[2]/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button")
	public WebElement genDateIcon;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[5]/td[4]")
	public WebElement firstDate;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[6]/td[5]")
	public WebElement secondDate;
}

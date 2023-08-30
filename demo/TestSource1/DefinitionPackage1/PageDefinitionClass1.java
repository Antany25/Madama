package DefinitionPackage1;

import ActionPackage1.*;
import UtilsPackage1.HelperClass;
import io.cucumber.java.en.*;

public class PageDefinitionClass1 {

	LoginActionClass log=new LoginActionClass();
	SchedulerGanttActionClass gantt=new SchedulerGanttActionClass();
	OrderGenerationAction gen=new OrderGenerationAction();
	
	@Given("User is on DOne Factory Login page {string}")
	public void user_is_on_d_one_factory_login_page(String string) {
		HelperClass.openPage(string);
	}
	@When("User zoom out the page")
	public void user_zoom_out_the_page() {
		HelperClass.zoomOut();
	}
	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String string, String string2) {
		log.enterUserName(string);
		log.enterPassword(string2);
	}
	@Given("User click on the Schedule Icon")
	public void user_click_on_the_schedule_icon() {
		gantt.scheduleIcon();
	}
	@When("User click on the Scheduler Gannt Icon")
	public void user_click_on_the_scheduler_gannt_icon() {
	    gantt.schedulerGanttOption();
	}
	@When("User click on the New Order Icon")
	public void user_click_on_the_new_order_icon() {
	    gantt.newOrderIcon();
	}
	@When("User click on the Material as {string}")
	public void user_click_on_the_material_as(String string) {
	    gantt.material(string);
	}
	@When("User click on the Quantity as {string}")
	public void user_click_on_the_quantity_as(String string) {
		gantt.quantity(string);
	}
	@When("User click on the Due Date")
	public void user_click_on_the_due_date() {
	    gantt.dueDate();
	}
	@When("User click on the Machine Group as Final")
	public void user_click_on_the_machine_group_as_final() {
	    gantt.machineGroup();
	}
	@When("User click on the Confirm order")
	public void user_click_on_the_confirm_order() {
	    gantt.confirmNewOrder();
	}
	@Then("User click on the Master Data Icon")
	public void user_click_on_the_master_data_icon() {
	    gen.masterDataIcon();
	}
	@Then("User click on the Order Generation option {string}")
	public void user_click_on_the_order_generation_option(String str) {
	    gen.orderGenerationOption(str);
	}
	@Then("User click on the Generation tab")
	public void user_click_on_the_generation_tab() {
	    gen.generationTab();
	}
	@Then("User click on the Due Date Generation")
	public void user_click_on_the_due_date_generation() {
		gen.generationDate();
	}
	@Then("User click on the Add Filter")
	public void user_click_on_the_add_filter() {
	    gen.addFilter();
	}
	@Then("User click on the Material and EO")
	public void user_click_on_the_material_and_eo() {
	    gen.materialAndEO();
	}
	@Then("User click on the Material as {string} and EO as {string}")
	public void user_click_on_the_material_as_and_eo_as(String string, String string2) {
	    gen.materialEO(string, string2);
	}
	@Then("User click on the Search Icon")
	public void user_click_on_the_search_icon() {
	    gen.searchIcon();
	}
	@Then("User click on the Check box")
	public void user_click_on_the_check_box() {
	    gen.checkBox();
	}
	@Then("User click on the Generate Icon")
	public void user_click_on_the_generate_icon() {
	    gen.generateIcon();
	}
	@Then("User click on the Confirm Generate button")
	public void user_click_on_the_confirm_generate_button() {
	    gen.confirmGenerate();
	}
	@Then("User click on the Material as {string} and Order as {string}")
	public void user_click_on_the_material_as_and_order_as(String string, String string2) {
	    gantt.materialOrder(string, string2);
	}
	@Then("USer click on the Order Check Box")
	public void u_ser_click_on_the_order_check_box() {
	    gantt.orderCheckBox();
	}
	@Then("User click on the Schedule Order Icon")
	public void user_click_on_the_schedule_order_icon() {
	    gantt.scheduleOrderIcon();
	}
	@Then("User click on the Schedule Forward the Entire Family")
	public void user_click_on_the_schedule_forward_the_entire_family() {
	    gantt.scheduleForward();
	}
	@Then("User click on the Confirm Order Icon")
	public void user_click_on_the_confirm_order_icon() {
	    gantt.confirmOrder();
	}
	@Given("User is on the Scheduler Gantt {string}")
	public void user_is_on_the_scheduler_gantt(String str) {
		gantt.schedulerPage(str);
	}
}

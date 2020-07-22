$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/HRMSB6_340.feature");
formatter.feature({
  "name": "Add Employee Details",
  "description": "  Admin should be able to modify employee personal details:",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@inProgress"
    }
  ]
});
formatter.scenario({
  "name": "Add employee personal details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@inProgress"
    },
    {
      "name": "@inProgress"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am logged with valid admin credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.AddEmpWithExcel.i_am_logged_with_valid_admin_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigated to add employee page",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.AddEmpWithExcel.i_navigated_to_add_employee_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter employee first name and last name and click save button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.HRMSB6_340.i_enter_employee_first_name_and_last_name_and_click_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click edit button after employee added",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.HRMSB6_340.i_click_edit_button_after_employee_added()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter employee personal details information and save employee successfully",
  "rows": [
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.HRMSB6_340.i_enter_employee_personal_details_information_and_save_employee_successfully(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Add employee personal details");
formatter.after({
  "status": "passed"
});
});
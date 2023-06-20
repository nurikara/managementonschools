package stepdef.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.Login;
import pages.US15_ViceDeanStudent;
import pages.US25_AdminCreate;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US25_Steps_Erel {
    Login log=new Login();
    US15_ViceDeanStudent vice=new US15_ViceDeanStudent();
    US25_AdminCreate admin=new US25_AdminCreate();
    @When("Kullanıcı geçerli ADMİN OLARAK user name ve password u girer")
    public void kullanıcı_geçerli_admin_olarak_user_name_ve_password_u_girer() {
        log.username.sendKeys(ConfigReader.getProperty("adminusername"));
        log.password.sendKeys(ConfigReader.getProperty("adminpassword"));
        ReusableMethods.click(vice.accountlogin);
    }

    @And("Kullanıcı menuden sTudent management e tıklar")
    public void kullanıcıMenudenSTudentManagementETıklar() {
        vice.menu.click();
        ReusableMethods.bekle(1);
        admin.studentmanagement.click();
    }
}

package stepdef.ui;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.US02_AdminUserList;
import pages.US06_Dean_ViceDean;

public class US23_Step_Nuri {
    US02_AdminUserList login2 = new US02_AdminUserList();
    US06_Dean_ViceDean login = new US06_Dean_ViceDean();



    @When("Sayganin sol kisminda acilan main menu kisminin altindaki ViseDeanManagement segmesi tiklanir")
    public void sayganin_sol_kisminda_acilan_main_menu_kisminin_altindaki_vise_dean_management_segmesi_tiklanir() throws InterruptedException {

        Thread.sleep(2000);
        utilities.ReusableMethods.click(login.viceDeanManagement);
    }

}

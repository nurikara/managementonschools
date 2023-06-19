package stepdef.ui;

import io.cucumber.java.en.Given;
import pages.US17_US18_TeacherStudentInfo;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US17_Steps_Zeynep {

    US17_US18_TeacherStudentInfo tSI;


    @Given("Kullanıcı {string} alanını tıklar")
    public void kullanıcı_alanını_tıklar(String string) {

        switch (string){
            case "Choose Lesson":
                tSI.chooselessonZeynep.click();
                ;
                break;
            case "Choose Student":
                tSI.choosestudentZeynep.click();
                break;
            case "Choose Education Term":
                tSI.chooseeducationTermZeynep.click();
                break;
            case "Submit":
                tSI.submitButtonZeynep.click();
                break;


        }

    }
    @Given("Kullanıcı {string} alanında açılan derslerden birini seçer")
    public void kullanıcı_alanında_açılan_derslerden_birini_seçer(String string) {
        if (string.equals("Choose Lesson")){
            ReusableMethods.ddmValue(tSI.chooselessonZeynep,"2");
        } else if (string.equals("Choose Student")) {
            ReusableMethods.ddmValue(tSI.choosestudentZeynep,"8");
        } else if (string.equals("Choose Education Term")) {
            ReusableMethods.ddmValue(tSI.chooseeducationTermZeynep,"3");
        }


    }
    /*
    @Given("Kullanıcı {string} alanında açılan öğrencilerden birini seçer")
    public void kullanıcı_alanında_açılan_öğrencilerden_birini_seçer(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Kullanıcı {string} alanında açılan dönemlerden birini seçer")
    public void kullanıcı_alanında_açılan_dönemlerden_birini_seçer(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }*/
    @Given("Kullanıcı {string},{string},{string},{string} alanlarını uygun şekilde doldurur")
    public void kullanıcı_alanlarını_uygun_şekilde_doldurur(String string, String string2, String string3, String string4) {

    }



}

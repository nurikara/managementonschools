package stepdef.ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.US19_US20_TeacherAddMeetList;
import pages.US21_Student;

import java.security.Key;

import static org.junit.Assert.assertEquals;

public class US21_Steps_Burak {
    US19_US20_TeacherAddMeetList Teacher = new US19_US20_TeacherAddMeetList();
    US21_Student Student = new US21_Student();


    @When("Kullanici_gecerli_Student_olarak_Username_ve_Password'u_girer")
    public void kullanici_gecerli_student_olarak_username_ve_password_u_girer() {
        Teacher.username.sendKeys("StudentBurak");
        Teacher.password.sendKeys("12345678");
        Teacher.LoginButton.click();




    }
    @Then("Karsisina cikan sayfada Lesson Teacher Day Start time ve Stop time bilgilerini gorur")
    public void karsisina_cikan_sayfada_lesson_teacher_day_start_time_ve_stop_time_bilgilerini_gorur() {
        assertEquals(Student.ChooseLessonInfo.getText(),"Choose Lesson");
        assertEquals(Student.lessonInfo.getText(),"Lesson");
        assertEquals(Student.teacherInfo.getText(),"Teacher");
        assertEquals(Student.dayInfo.getText(),"Day");
        assertEquals(Student.startTimeInfo.getText(),"Start Time");
        assertEquals(Student.stopTimeInfo.getText(),"Stop Time");

    }


    @And("Karsisina cikan sayfada Choose Lesson altindaki istedigi bir kutucuga basar")
    public void karsisinaCikanSayfadaChooseLessonAltindakiIstedigiBirKutucugaBasar() throws InterruptedException {
        Student.lesson01.click();
        Student.lesson02.click();
        Thread.sleep(2000);
        
    }

    @Then("Istedigi dersleri sectikten sonra en altta bulunan submit butonuna tiklar")
    public void istedigiDersleriSectiktenSonraEnAlttaBulunanSubmitButonunaTiklar() {

        Student.submitManagement.click();
    }
    @And("Karsisina cikan sayfada Choose Lesson altindaki herhangi bir kutucuga basmaz")
    public void karsisinaCikanSayfadaChooseLessonAltindakiHerhangiBirKutucugaBasmaz() {
        Student.lastLesson.click();
        Student.lastLesson.sendKeys(Keys.PAGE_UP);
        Student.submitManagement.click();

    }




    @Then("Istedigi dersleri sectikten sonra en altta bulunan submit butonuna tiklar negative")
    public void istedigiDersleriSectiktenSonraEnAlttaBulunanSubmitButonunaTiklarNegative() {

            Student.submitManagement.click();
        }

    @And("Student istedigi iki dersi secer")
    public void studentIstedigiIkiDersiSecer() {
        Student.sameLesson01.sendKeys(Keys.PAGE_DOWN);
        Student.sameLesson01.sendKeys(Keys.PAGE_DOWN);
        Student.sameLesson01.click();
        Student.sameLesson02.click();

    }

    @Then("Student Submit’e tiklar")
    public void studentSubmitETiklar() {
        Student.submitManagement.click();


    }

    @And("kullanici sayfanin en altina iner")
    public void kullaniciSayfaninEnAltinaIner() {
        for (int i = 0; i < 11; i++) {
            Student.lesson02.sendKeys(Keys.PAGE_DOWN);

        }


    }

    @Then("Lesson Program List’te ekledigi dersleri gorur")
    public void lessonProgramListTeEkledigiDersleriGorur() {
        assertEquals(Student.javaLesson.getText(),"Java");
        assertEquals(Student.CypressLesson.getText(),"Cypress");
        assertEquals(Student.makroIktisatLesson.getText(),"Makro İktisat");
    }

    @And("kullanici Menu'ye tiklar")
    public void kullaniciMenuYeTiklar() {
        Student.menuButton.click();

    }

    @And("Grades and Announcements'e tiklar")
    public void gradesAndAnnouncementsETiklar() {
        Student.gradesAndAnnouncementsButton.click();

    }

    @Then("cikan sayfada midterm exam ve final exami gorur")
    public void cikanSayfadaMidtermExamVeFinalExamiGorur() {
        assertEquals(Student.MidtermExam.getText(),"Midterm Exam");
        assertEquals(Student.FinalExam.getText(),"Final Exam");
    }


    @Then("cikan sayfada Start Time ve Stop Time'i gorur")
    public void cikanSayfadaStartTimeVeStopTimeIGorur() {
        assertEquals(Student.StartTimeMeet.getText(),"Start Time");
        assertEquals(Student.StopTimeMeet.getText(),"Stop Time");
    }
}





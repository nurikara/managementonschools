package stepdef.db;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static utilities.DataBaseUtils.getResultSet;

public class DB_Elif {

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("{string} ile guest useri cagir")
    public void ile_guest_useri_cagir(String username) throws SQLException {

        //Connection ve statement olustur
//        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");
//        statement = connection.createStatement();

        //Query i calıstır
        String query = "SELECT * FROM guest_user WHERE username = '" + username + "'";
        resultSet = getResultSet(query);

    }

    @Then("body sunlari icermeli :{string}, {string} ,{string},{string},{string},{string},{string},{string},{string}")
    public void body_sunlari_icermeli(String name, String surname, String birthplace, String phone, String gender, String dateOfBirth, String ssn, String username, String password) throws SQLException {

        resultSet.next();//Pointer varsayılan olarak sutun isimlerini gosterir.Next Methosu ile table uzerine alınarak data okunabilir.

        String actname = resultSet.getString("name");
        String actusername = resultSet.getString("username");
        String actsurname = resultSet.getString("surname");
        String actBirthPlace = resultSet.getString("birth_place");
        String actPhone = resultSet.getString("phone_number");
        String actGender = resultSet.getString("gender");
        String actDateOfBirth = resultSet.getString("birth_day");
        String actssn = resultSet.getString("ssn");

        assertEquals(name, actname);
        assertEquals(surname, actsurname);
        assertEquals(birthplace, actBirthPlace);
        assertEquals(phone, actPhone);
        assertEquals(gender, actGender);
        assertEquals(dateOfBirth, actDateOfBirth);
        assertEquals(ssn, actssn);
        assertEquals(username, actusername);

    }

    @Given("birthplace {string} ile guest useri cagır")
    public void birthplaceIleGuestUseriCagır(String birthPlace) throws SQLException {

        //Connection ve statement olustur
//        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user", "43w5ijfso");
//        statement = connection.createStatement();

        //Query i calıstır
        String query = "SELECT * FROM guest_user WHERE birth_place = '" + birthPlace + "'";
        resultSet= getResultSet(query);
        //resultSet = statement.executeQuery(query);

    }

    @Then("kac tane user oldugunu bul.")
    public void kacTaneUserOldugunuBul() throws SQLException {

        while(resultSet.next()){
            System.out.println(resultSet.getString("name")+"---"+resultSet.getString("surname"));
        }
    }

    @Given("Silinen {string} ile guest useri cagir")
    public void silinenIleGuestUseriCagir(String username) {
        String query = "SELECT * FROM guest_user WHERE username = '" + username + "'";
        resultSet = getResultSet(query);

    }

    @Then("table nın bos oldugunu dogrula.")
    public void tableNınBosOldugunuDogrula() throws SQLException {
        assertFalse(resultSet.next());  //data yoksa true donecek yani test gececek (false->false) varsa fail olacak(false->true) test.
    }
}

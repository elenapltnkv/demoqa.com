
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.appear;

public class RegistrationFormTest extends Basic {


    @Test
    public void addStudentNameTest() {
        registrationPage.openPage()
                .setFirstName("Heyery")
                .setLastName("ehrgfef")
                .setUserEmail("hsfdhsf@ya.ru")
                .getGender("Female")
                .setUserNumber("79971235228")
                .getDateOfBirth("16", "June", "1985")
                .setHobby("Reading")
                .currentAddress("15 Seryur Angfef")
                .getState()
                .getRegistrationModal()
                .getverifyResult("Student Name", "Heyery ehrgfef")
                .getverifyResult("Student Email", "hsfdhsf@ya.ru")
                .getverifyResult("Gender", "Female")
                .getverifyResult("Date of Birth", "16 June,1985")
                .getverifyResult("Hobbies", "Reading")
                .getverifyResult("Address", "15 Seryur Angfef");


        // $("#firstName").setValue("Bsttere");
        //$("#lastName").setValue("Tjdhjrg");
        //$("#userEmail").setValue("hsfdhsf@ya.ru");
        //$("#genterWrapper").$(byText("Female")).click();
        //$("#userNumber").setValue("79971235228");
        //$("#dateOfBirthInput").click();
        //$(".react-datepicker__month-select").selectOption("06");
        //$(".react-datepicker__year-select").selectOption("1985");
        //$(".react-datepicker__day--016").click();
        //$("#hobbiesWrapper").$(byText("Reading")).click();
        //$("#currentAddress").setValue("15 Seryur Angfef");
        //$("#state").click();
        //$("#react-select-3-option-1").click();
        //$("#submit").click();
//        $(".modal-dialog").should(appear);
//        $(".modal-title h4").shouldHave(text("Thanks for submitting the form"));


    }

}

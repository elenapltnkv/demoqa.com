
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

    }

}

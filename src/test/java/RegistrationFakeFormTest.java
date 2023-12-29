
import org.junit.jupiter.api.Test;

public class RegistrationFakeFormTest extends Basic {


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

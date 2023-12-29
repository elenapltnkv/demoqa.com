
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import static utils.RandomUtils.*;


public class RegistrationFakeFormTest extends Basic {


    @Test
    public void addStudentNameTest() {
        registrationPage.openPage()
                .setFirstName(userName)
                .setLastName(userSurname)
                .setUserEmail(userFakeEmail)
                .getGender("Female")
                .setUserNumber(phoneFakeNumber)
                .getDateOfBirth("16", "June", "1985")
                .setHobby("Reading")
                .currentAddress(userAddress)
                .getState()
                .getRegistrationModal()
                .getverifyResult("Student Name", userName+" "+ userSurname)
                .getverifyResult("Student Email", userFakeEmail)
                .getverifyResult("Gender", "Female")
                .getverifyResult("Date of Birth", "16 June,1985")
                .getverifyResult("Hobbies", "Reading")
                .getverifyResult("Address", userAddress);

    }

}

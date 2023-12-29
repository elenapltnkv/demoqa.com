import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import utils.RandomUtils;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static utils.RandomUtils.randomNumber;
import static utils.RandomUtils.randomString;


public class OldFakerTest extends Basic {

    RandomUtils utils = new RandomUtils();
    static Faker faker = new Faker();


    @Test
    public void addStudentNameTest() {
        String firstName = faker.name().firstName(); // Emory
        String lastName = faker.name().lastName(); // Barton
        String email = faker.internet().emailAddress();
        String phoneNamber = faker.phoneNumber().phoneNumber();
        String address = faker.address().streetAddress();


        open("/automation-practice-form");
        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(email);
        $("#genterWrapper").$(byText("Female")).click();
        $("#userNumber").setValue(randomNumber(11));
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("June");
        $(".react-datepicker__year-select").selectOption("1985");
        $(".react-datepicker__day--016").click();
        $("#hobbiesWrapper").$(byText("Reading")).click();
        $("#currentAddress").setValue(address);
        $("#state").click();
        $("#react-select-3-option-1").click();
        $("#submit").click();
        $(".modal-dialog").should(appear);
        $(".modal-title").shouldHave(text("Thanks for submitting the form"));
    }
}

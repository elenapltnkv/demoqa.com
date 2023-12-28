import static com.codeborne.selenide.Selenide.$;

public class RegistrationForm {
    static String name;
    static String surname;
    static String email;

    static String userNumber;
    static String currentAddress;

    public static void addName() {
        $("#firstName").setValue(name);
        $("#lastName").setValue(surname);
        $("#userEmail").setValue(email);
        $("#userEmail").setValue(userNumber);
        $("#userEmail").setValue(currentAddress);


    }
}

package _2_oop._8_local_and_anonymous_class;

public class App_1_local {
    public static void main(String[] args) {
        final int numberLength = 12;
        // >=JDK8:
        // int numberLength = 12;
        class PhoneNumber {

            private String formattedPhoneNumber;

            PhoneNumber(String phoneNumber) {
                String currentNumber = phoneNumber.replaceAll("[^0-9]", "");
                if (currentNumber.length() <= numberLength)
                    formattedPhoneNumber = currentNumber;
                else
                    formattedPhoneNumber = "";
            }

            public String getNumber() {
                return formattedPhoneNumber;
            }
        }

        PhoneNumber myNumber1 = new PhoneNumber("+375(29)555-55-55");
        PhoneNumber myNumber2 = new PhoneNumber("+375(29)69-69-696");

        System.out.println(myNumber1.getNumber());
        System.out.println(myNumber2.getNumber());
    }
}


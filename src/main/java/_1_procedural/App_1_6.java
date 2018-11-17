package _1_procedural;

public class App_1_6 {
    public static void main(String[] args) {
        int month = 8;
        String monthString;
        //byte, short, char, int, enum, String, wrappers: Character, Byte, Short, Integer
        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            default:
                monthString = "Invalid month";
                //why?
                break;
        }
    }
}

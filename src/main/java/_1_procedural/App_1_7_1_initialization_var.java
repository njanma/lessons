package _1_procedural;

public class App_1_7_1_initialization_var {
    public static void main(String[] args) {
//        int count;
//        count++;// м.б. не проинициализирована

//        int c1;
//        if (returnTrueOrFalse()) {
//            c1 = 0;
//        } else {
//            c1++;
//        }
//
//        int c2;
//        if (true) {
//            c2 = 0;
//        } else {
//            c2++;
//        }

        final int DAYS_PER_WEEK = 7;
//        DAYS_PER_WEEK = 9;

        final int DAYS_IN_FEBRUARY;
        if (returnTrueOrFalse()) {
            DAYS_IN_FEBRUARY = 29;
        } else {
            DAYS_IN_FEBRUARY = 28;
        }
    }

    void someLogic(final int days) {
//        days = 15;
    }

    static boolean returnTrueOrFalse() {
        return true;
    }
}

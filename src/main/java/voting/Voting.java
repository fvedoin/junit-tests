package voting;

import java.util.Calendar;

public class Voting {

    /*
     * Returns a text saying if the person can vote or not
     * by name and birth date
     */
    public static String canVote(String name, int birthYear) {
        String response = null;
        int age = currentYear() - birthYear;

        if (age < 16) {
            response = name + ", you cant vote";

        } else if (age >= 16 && age <= 17 || age > 70) {
            response = name + ", your vote is optional";

        } else if (age >= 18 && age <= 70) {
            response = name + ", your vote is mandatory";
        }

        return response;
    }


    /*
     * Returns the current year
     */
    private static int currentYear() {
        return Calendar.getInstance().get(Calendar.YEAR);
    }
}
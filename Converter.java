public class Converter {
    // 4 public variables that are used throughout the different methods
    public int userInput = 0;
    public int weeks = 0;
    public int days = 0;
    public int hours = 0;

    // The first method: convert
    // Takes a number of hours as input and stores in the public variables the corresponding time in week(s), day(s) and hour(s)
    public void convert(int h) {
        userInput = h;
        hours = h;

        // Convert the hours into weeks (1 week = 168 hours)
        while (hours >= 168) {
            weeks += 1;
            hours -= 168;
        }

        // Convert the remaining hours into days (1 day = 24 hours)
        while (168 > hours && hours >= 24) {
            days += 1;
            hours -= 24;
        }
    }

    // The second method: display
    // Prints out/displays the weeks/days/hours time in the required format
    public void display() {
        // Checking if the user inputed one or more hours
        if (userInput == 1) {
            System.out.println(userInput + " hour in weeks, days and hours is:");
        }
        else {
            System.out.println(userInput + " hours in weeks, days and hours is:");
        }

        // 3 variables (empty strings), one for each part of the final display
        String weeksString = "";
        String daysString = "";
        String hoursString = "";

        // Checking if there is one or more weeks
        if (weeks == 1) {
            weeksString = "1 week";
        }
        else if (weeks > 1) {
            weeksString = weeks + " weeks";
        }

        // Checking if there is one or more days
        if (days == 1) {
            daysString = "1 day";
        }
        else if (days > 1) {
            daysString = days + " days";
        }

        // Checking if there is one or more hours
        if (hours == 1) {
            hoursString = "1 hour";
        }
        else if (hours > 1) {
            hoursString = hours + " hours";
        }

        // Making sure that we are displaying in the correct format:
        // 1. Not printing out "0 weeks", "0 days" or "0 hours"
        // 2. Adding "," and "and" when necessary
        if (weeks > 0) {
            if (days > 0 && hours > 0) {
                System.out.println(weeksString + ", " + daysString + " and " + hoursString);
                System.exit(1); // Exiting the system so that the program stops running
            }
            else if (days == 0) {
                if (hours == 0) {
                    System.out.println(weeksString);
                    System.exit(1);
                }
                else {
                    System.out.println(weeksString + " and " + hoursString);
                    System.exit(1);
                }
            }
            else {
                System.out.println(weeksString + " and " + daysString);
                System.exit(1);
            }
        }
        else {
            if (days > 0 && hours > 0) {
                System.out.println(daysString + " and " + hoursString);
                System.exit(1);
            }
            else if (days == 0) {
                if (hours == 0) {
                    System.out.println("0 hours"); // Prints out "0 hours" only if the user imputs 0
                    System.exit(1);
                }
                else {
                    System.out.println(hoursString);
                    System.exit(1);
                }
            }
            else {
                System.out.println(daysString);
                System.exit(1);
            }
        }
    }
}
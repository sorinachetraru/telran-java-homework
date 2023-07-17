public class Homework6 {

    public static void main(String[] args) {
        int numberOfDays = getNumberOfDaysInMonth(Month.February);
        System.out.println(numberOfDays);

        Season season = getSeason(Month.April);
        System.out.println(season);

    }

    private static int getNumberOfDaysInMonth(Month month){
        if (month == Month.January || month == Month.March || month == Month.May || month == Month.July ||
                month == Month.August || month == Month.October || month == Month.December) {
            return 31;
        }

        if (month == Month.April || month == Month.June || month == Month.September || month == Month.November){
            return 30;
        }

        // February
        return 28;
    }

    private static Season getSeason (Month month) {
        if ( month == Month.January || month == Month.February || month == Month.December) {
            return Season.Winter;
        }
        if (month == Month.March || month == Month.April || month == Month.May) {
            return Season.Spring;
        }
        if ( month == Month.June || month == Month.July || month == Month.August) {
            return Season.Summer;
        }

        return Season.Autumn;
    }
}




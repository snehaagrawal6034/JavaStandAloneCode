package enumerator;


// Benefit - 1. neat and type safety
//           2. Can be created both inside and outside the class
//           3. It cannot extend any class a it already extends Enum class by default whereas it can implement interface
//           4.
public class EnumExample {
//    public static final String MONDAY = "monday";
//    public static final String TUESDAY = "tuesday";
//    public static final String SATURDAY = "saturday";

    enum WeekOfDay { // collection of constants
        MONDAY(true, 1, true),
        TUESDAY(false, 2, false),
        WEDNESDAY(true, 3, false),
        THURSDAY(false, 4, false),
        FRIDAY(true, 5, true),
        SATURDAY(false, 6, false),
        SUNDAY(true, 7, false);

        private final boolean isOddDay;
        private final int dayNumber;
        private final boolean holiday;

         WeekOfDay(boolean isOddDay, int dayNumber, boolean holiday) {
            this.isOddDay = isOddDay;
            this.dayNumber = dayNumber;
            this.holiday = holiday;
        }
    }

    public final WeekOfDay weekOfDay;

    public EnumExample(WeekOfDay weekOfDay) {
        this.weekOfDay = weekOfDay;
    }

    public static void main(String[] args) {
        EnumExample enumExample = new EnumExample(WeekOfDay.FRIDAY);
        System.out.println(enumExample.isHoliday());
        System.out.println(enumExample.isOddDay());
        System.out.println(enumExample.dayNumber());
        System.out.println("------");
        for (WeekOfDay value : WeekOfDay.values()) {
            System.out.println(value.dayNumber);
        }

        System.out.println(WeekOfDay.valueOf("FRIDAY"));
//        WeekOfDay.valueOf("friday");

        WeekOfDay wd[] = WeekOfDay.values();
        for(WeekOfDay weekDay : wd){
            System.out.println(weekDay);
        }
    }



    public boolean isHoliday() {
        return weekOfDay.holiday;
    }

    public boolean isOddDay() { // m, w,f
        return weekOfDay.isOddDay;
    }

    public int dayNumber() { // m, w,f
        return weekOfDay.dayNumber;
    }

}

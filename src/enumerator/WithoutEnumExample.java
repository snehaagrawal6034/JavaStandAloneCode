package enumerator;

public class WithoutEnumExample {

    public static final String MONDAY = "monday";
    public static final String TUESDAY = "tuesday";
    public static final String SUNDAY = "sunday";


    public boolean isHoliday(String day) {
        if(day.equals(SUNDAY)) {
            return false;
        }
        return  true;
    }

    public int dayNumber(String day) {
        if(day.equals(SUNDAY)) {

        }
        return  1;
    }

    public static void main(String[] args) {
        WithoutEnumExample enumExample2 = new WithoutEnumExample();
        enumExample2.dayNumber("ere");
    }

}

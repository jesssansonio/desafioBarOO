import java.util.Objects;

public class Bill {

    public static char gender;
    public static final int BEER = 5;
    public static final int BARBERCUE= 7;
    public static final int SOFT_DRINK = 3;


    public static double cover(double valueConsumption){
        if (valueConsumption > 30) {
            return  0;
        } else {
            return 4.0;
        }
    }

    public static double feeding(double valueConsumption){
        return valueConsumption;

    }
    public static double ticket(char gender){
        if (gender == 'F'){
            return 8;
        } else {
            return 10;
        }
    }

    public static double total(double valueConsumption){
        return ticket(gender) + cover(valueConsumption) + feeding(valueConsumption);
    }


}

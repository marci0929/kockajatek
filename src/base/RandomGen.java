package base;
import java.util.Random;

public class RandomGen {
    public RandomGen(){}


    int thrown_number=0;

    public int cubethrowing(int lower_bound, int upper_bound)
    {
        Random rand = new Random();
        thrown_number = rand.nextInt(upper_bound)+lower_bound;
        return thrown_number;
    }
}

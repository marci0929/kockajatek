package base;
import java.util.Random;

public class RandomGen {
    public RandomGen(){}


    int thrown_number=0;
    int kockak_szama=0;

    public void cubethrowing(int lower_bound, int upper_bound)
    {
        Random rand = new Random();
        thrown_number = rand.nextInt(upper_bound)+lower_bound;
    }
    public void kockaszam(int min_cubes, int max_cubes)
    {
        Random rand = new Random();
        kockak_szama = rand.nextInt(max_cubes)+min_cubes;
    }
}

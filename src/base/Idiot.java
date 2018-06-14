package base;

import java.util.ArrayList;

public class Idiot extends Player {


    public Idiot(){
    }

    public int dobas()
    {
        RandomGen rand = new RandomGen();
        int sum_of_throws=0;
        rand.kockaszam(1,3);
        int cube_num_Idiot = rand.thrown_number;
        for(int l=0;l<cube_num_Idiot;l++)
        {
            rand.cubethrowing(1,6);
            sum_of_throws=sum_of_throws+rand.thrown_number;
        }
        return sum_of_throws;
    }
}

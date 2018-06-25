package base;

public class Genius extends Player{
    public Genius(){
    }

    int cube_num_genius;
    int sum_of_throws=0;
    public int dobas()
    {
        RandomGen rand = new RandomGen();
        rand.kockaszam(1,3);
        cube_num_genius = rand.kockak_szama;
        for(int l=0;l<cube_num_genius;l++)
        {
            rand.cubethrowing(1,6);
            sum_of_throws=sum_of_throws+rand.thrown_number;
        }
        return sum_of_throws;
    }
}

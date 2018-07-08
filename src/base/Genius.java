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

    @Override
    public int score() {
        Genius okos = new Genius();
        score = score+okos.dobas();
        dobasosszeg=okos.sum_of_throws;
        player_cube_num_genius= okos.cube_num_genius;
        return super.score();
    }
}

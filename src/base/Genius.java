package base;

import java.util.ArrayList;

public class Genius extends Player{
    public Genius(){
    }

    int cube_num_genius;
    int sum_of_throws=0;
    public int dobas(GettingBasicDatas adatbeeski,ArrayList<Player> jatekos,Gameplay jatekmenet)
    {
        int distance_from_21=0;
        int average_throw_sum=0;
        RandomGen rand= new RandomGen();
        distance_from_21 = 21-jatekos.get(jatekmenet.current_player).score;
        average_throw_sum=Math.round(distance_from_21/(adatbeeski.num_of_turns-jatekmenet.num_of_current_turn));
        if(adatbeeski.num_of_turns>=21)
        {
            rand.cubethrowing(1,6);
            sum_of_throws=rand.thrown_number;
        }
        else {

                if(average_throw_sum>=1&&average_throw_sum<=6)
                {
                    rand.cubethrowing(1,6);
                    cube_num_genius=1;
                    sum_of_throws=rand.thrown_number;
                }
                else{
                    if(average_throw_sum>=7&&average_throw_sum<=12)
                    {
                        for(int dai=0;dai<2;dai++)
                        {
                            rand.cubethrowing(1,6);
                            cube_num_genius=2;
                            sum_of_throws=sum_of_throws+rand.thrown_number;
                        }
                    }
                    else{
                        for (int dai=0;dai<3;dai++)
                        {
                            rand.cubethrowing(1,6);
                            cube_num_genius=3;
                            sum_of_throws=sum_of_throws+rand.thrown_number;
                        }
                    }
                }
        }
        return sum_of_throws;
    }

    @Override
    public int score(GettingBasicDatas adatbeeski,ArrayList<Player> jatekos,Gameplay jatekmenet) {
        Genius okos = new Genius();
        score = score+okos.dobas(adatbeeski,jatekos,jatekmenet);
        dobasosszeg=okos.sum_of_throws;
        player_cube_num_genius= okos.cube_num_genius;
        return super.score(adatbeeski,jatekos,jatekmenet);
    }
}

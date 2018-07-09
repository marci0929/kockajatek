package base;

import java.util.ArrayList;

public class Idiot extends Player {

    public Idiot(){}
    int cube_num_Idiot=0;
    int sum_of_throws=0;
    public int dobas()
    {
        RandomGen rand = new RandomGen();
        rand.kockaszam(1,3);
        cube_num_Idiot = rand.kockak_szama;
        for(int l=0;l<cube_num_Idiot;l++)
        {
            rand.cubethrowing(1,6);
            sum_of_throws=sum_of_throws+rand.thrown_number;
        }
        return sum_of_throws;
    }

    @Override
    public int score(GettingBasicDatas adatbeeski,ArrayList<Player> jatekos,Gameplay jatekmenet) {
        Idiot buta = new Idiot();
        score = score+buta.dobas();
        dobasosszeg=buta.sum_of_throws;
        player_cube_num_idiot = buta.cube_num_Idiot;
        return super.score(adatbeeski,jatekos,jatekmenet);
    }
}

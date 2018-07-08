package base;

import java.util.ArrayList;

public class Gameplay {

    public Gameplay(){}

    public void flow_of_game(GettingBasicDatas adatbeeski, ArrayList<Player> jatekos,Idiot buta, Genius okos)
    {
        for(int i=0;i<adatbeeski.num_of_turns;i++) {
            for(int t=0;t<adatbeeski.nDumb;t++) {
                jatekos.get(t).score();
                System.out.println(jatekos.get(t).name+ " ugy dont, hogy "+ jatekos.get(t).player_cube_num_idiot+" kockaval dob.");
                System.out.println(jatekos.get(t).name+ " ebben a korben osszesen "+jatekos.get(t).dobasosszeg+"-t dobott.");
                System.out.println("Igy most a pontszama:"+jatekos.get(t).score);
            }
            for(int g=adatbeeski.nDumb;g<(adatbeeski.nGenius+adatbeeski.nDumb);g++)
            {
                jatekos.get(g).score();
                System.out.println(jatekos.get(g).name+ " ugy dont, hogy "+ jatekos.get(g).player_cube_num_genius+" kockaval dob.");
                System.out.println(jatekos.get(g).name+ " ebben a korben osszesen "+jatekos.get(g).dobasosszeg+"-t dobott.");
                System.out.println("Igy most a pontszama:"+jatekos.get(g).score);
            }
        }
    }
}

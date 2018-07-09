package base;

import java.util.ArrayList;

public class Gameplay {

    public Gameplay(){}

    int num_of_current_turn=0;
    int current_player=0;

    public void flow_of_game(GettingBasicDatas adatbeeski, ArrayList<Player> jatekos,ChooseWinner_s_ nyertes,Gameplay jatekmenet)
    {
        for(int i=0;i<adatbeeski.num_of_turns;i++) {
            num_of_current_turn=i;
            for(int t=0;t<adatbeeski.nDumb;t++) {
                jatekos.get(t).score(adatbeeski,jatekos,jatekmenet);
                System.out.println(jatekos.get(t).name+ " ugy dont, hogy "+ jatekos.get(t).player_cube_num_idiot+" kockaval dob.");
                System.out.println(jatekos.get(t).name+ " ebben a korben osszesen "+jatekos.get(t).dobasosszeg+"-t dobott.");
                System.out.println("Igy most a pontszama:"+jatekos.get(t).score);
            }
            for(int g=adatbeeski.nDumb;g<(adatbeeski.nGenius+adatbeeski.nDumb);g++)
            {
                this.current_player=g;
                jatekos.get(g).score(adatbeeski,jatekos,jatekmenet);
                System.out.println(jatekos.get(g).name+ " ugy dont, hogy "+ jatekos.get(g).player_cube_num_genius+" kockaval dob.");
                System.out.println(jatekos.get(g).name+ " ebben a korben osszesen "+jatekos.get(g).dobasosszeg+"-t dobott.");
                System.out.println("Igy most a pontszama:"+jatekos.get(g).score);
            }
        }
        for (int v=0;v<adatbeeski.nDumb+adatbeeski.nGenius;v++)
        {
            nyertes.h=v;
            nyertes.distance_from_21(jatekos);
            System.out.println(jatekos.get(v).name+" tavolsaga a 21-tol: "+nyertes.number_distance);
        }
        nyertes.winner_selection(jatekos,adatbeeski);
    }
}

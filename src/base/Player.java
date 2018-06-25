package base;

import java.util.ArrayList;

public class Player {
    public String name;
    public int score;

    public Player(){}
    int dobasosszeg=0;
    int player_cube_num_idiot;
    int player_cube_num_genius;

    public int idiot_score ()
         {
             Idiot buta = new Idiot();
             score = score+buta.dobas();
             dobasosszeg=buta.sum_of_throws;
             player_cube_num_idiot = buta.cube_num_Idiot;
             return dobasosszeg;
         }

    public int genius_score()
        {
            Genius okos = new Genius();
            score = score+okos.dobas();
            dobasosszeg=okos.sum_of_throws;
            player_cube_num_genius= okos.cube_num_genius;
            return dobasosszeg;
        }

}

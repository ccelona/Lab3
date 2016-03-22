package pokerBase;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by jr on 3/15/2016.
 */
public class Game {

    private UUID GameID;
    private UUID TableID;
    private ArrayList<Player> GamePlayers = new ArrayList<Player>();

    Game(){}

    Game(UUID GID){
        this();
        this.setGameID(GID);
    }

    Game(UUID GID, UUID TID){
        this(GID);
        this.setTableID(TID);
    }

    Game(UUID GID, UUID TID, ArrayList<Player> players){
        this(GID,TID);
        this.setGamePlayers(players);
    }



    public UUID getGameID(){return this.GameID;}
    public ArrayList<Player> getGamePlayers(){return this.GamePlayers;}
    public UUID getTableID(){return this.TableID;}

    public void setGameID(UUID ID){this.GameID = ID;}
    public void setTableID(UUID ID){this.TableID = ID;}
    public void setGamePlayers(ArrayList<Player> players){this.GamePlayers = players;}



}

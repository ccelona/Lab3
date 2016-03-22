package pokerBase;

import java.util.ArrayList;
import java.util.UUID;

public class Table {

    private UUID TableID;
    private ArrayList<Player> TablePlayers = new ArrayList<Player>();

    Table(){}

    Table(UUID ID){
        this();
        this.setTableID(ID);
    }

    Table(UUID ID, ArrayList<Player> playerList){
        this();
        this.setTableID(ID);
        this.setTablePlayers(playerList);
    }

    public UUID getTableID(){return this.TableID;}
    public ArrayList<Player> getTablePlayers(){return this.TablePlayers;}

    public void setTableID(UUID ID){this.TableID = ID;}
    public void setTablePlayers(ArrayList<Player> plyrlst){this.TablePlayers = plyrlst;}

    public void AddPlayerToTable(){
        this.TablePlayers.add(new Player());
    }

    public void AddPlayerToTable(Player dude){
        this.TablePlayers.add(dude);
    }
}
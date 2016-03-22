package pokerBase;

import java.util.UUID;

public class Player {

    private UUID PlayerID;
    private String PlayerName;
    private int PlayerPosition;


    Player(){}

    Player(UUID ID, String name, int position){
        this();
        this.setPlayerID(ID);
        this.setPlayerName(name);
        this.setPlayerPosition(position);
    }
    public UUID getPlayerID() {
        return this.PlayerID;
    }

    public String getPlayerName() {
        return this.PlayerName;
    }

    public int getPlayerPosition() {
        return this.PlayerPosition;
    }

    public void setPlayerID(UUID ID){ this.PlayerID = ID;}
    public void setPlayerName(String name){this.PlayerName = name;}
    public void setPlayerPosition(int pos){this.PlayerPosition = pos;}







}
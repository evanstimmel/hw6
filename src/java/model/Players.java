
package model;


public class Players {
    
    private int playerID;
    private String playerName;
    private int jerseyNumber;
    private int age;
    private int superbowlWins;
    
    
    public Players() {
        this.playerID = playerID = 0;
        this.playerName = playerName ="";
        this.jerseyNumber = jerseyNumber = 0;
        this.age = age = 0;
        this.superbowlWins = superbowlWins = 0;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSuperbowlWins() {
        return superbowlWins;
    }

    public void setSuperbowlWins(int superbowlWins) {
        this.superbowlWins = superbowlWins;
    }

    public Players(int playerID, String playerName, int jerseyNumber, int age, int superbowlWins) {
        this.playerID = playerID;
        this.playerName = playerName;
        this.jerseyNumber = jerseyNumber;
        this.age = age;
        this.superbowlWins = superbowlWins;
    }

    @Override
    public String toString() {
        return "Players{" + "playerID=" + playerID + ", playerName=" + playerName + ", jerseyNumber=" + jerseyNumber + ", age=" + age + ", superbowlWins=" + superbowlWins + '}';
    }

    public String getjerseyNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getsuperbowlWins() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getplayerName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setplayerName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

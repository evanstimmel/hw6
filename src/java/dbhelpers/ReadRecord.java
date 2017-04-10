/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbhelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Players;

/**
 *
 * @author Evan Stimmel
 */
public class ReadRecord {
    
    private Connection conn;
    private ResultSet results;
    
    private Players player = new Players();
    private int playerID;

    
    public ReadRecord (int playerID) {
    
        Properties props = new Properties();  //MWC
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        
        this.playerID = playerID;
        
        
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }

}
    
    public void doRead() {
    
  

        try {
            String query = "SELECT * FROM players WHERE playerID = ?";
            
            
            PreparedStatement  ps = conn.prepareStatement (query);
            
            
            ps.setInt(1, playerID);
            
            this.results = ps.executeQuery();
            
            this.results.next();
            
            player.setPlayerID(this.results.getInt("playerID"));
            player.setPlayerName(this.results.getString("playerName"));
            player.setJerseyNumber(this.results.getInt("jerseyNumber"));
            player.setAge(this.results.getInt("age"));
            player.setSuperbowlWins(this.results.getInt("superbowlWins"));
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
        
        
}   
    
    public Players getPlayer(){
       
        return this.player;
    
}
}
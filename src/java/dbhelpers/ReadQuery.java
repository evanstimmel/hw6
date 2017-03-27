
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


public class ReadQuery {
    
    private Connection conn;
    private ResultSet results;
    
    public ReadQuery(){
        
        Properties props = new Properties();  //MWC
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void doRead(){
     
        
        try{
             String query = "Select * from players";
      
            PreparedStatement ps = conn.prepareStatement(query);
            this.results = ps.executeQuery();
     
        } catch (SQLException ex) {
        Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
   
    
    public String getHTMLTable(){
        
        
        String table = "";
        
        table += "<table border=1>";
        
            try {
                while(this.results.next()){
                    
                    Players player = new Players();
                    player.setPlayerID(this.results.getInt("playerID"));
                    player.setPlayerName(this.results.getString("playerName"));
                    player.setJerseyNumber(this.results.getInt("jerseyNumber"));
                    player.setAge(this.results.getInt("age"));
                    player.setSuperbowlWins(this.results.getInt("superbowlWins"));
                    
                    table += "<tr>";
                    
                    table += "<td>";
                    table += player.getPlayerID();
                    table += "</td>";
                    
                    table += "<td>";
                    table += player.getPlayerName();
                    table += "</td>";
                    
                    table += "<td>";
                    table += player.getJerseyNumber();
                    table += "</td>";
                    
                    table += "<td>";
                    table += player.getAge();
                    table += "</td>";
                    
                    table += "<td>";
                    table += player.getSuperbowlWins();
                    table += "</td>";
                    
                    table += "<td>";
                    table += "<a href=delete?playerID=" + player.getPlayerID() + "> Delete </a>";
                    table += "</td>";
                    
                    table += "</tr>";
                }
            } catch (SQLException ex) {
                Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
            }
          
                
                
        table +="</table>";
        
            return table;
        }
}
        
            
    


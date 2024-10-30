package studio7;
/** 
 * 
 * 
 */



public class HockeyPlayer {
    private String name;
    private String shootDirection; 
    private boolean isLeftHanded;
    private int numGoals;
    private int numAssists;
    private int gamesPlayed;
    
    public HockeyPlayer(String name, String shootDirection, boolean isLeftHanded, int numGoals, int numAssists, int gamesPlayed) {
    	this.name = name;
    	this.shootDirection = shootDirection;
    	this.isLeftHanded = isLeftHanded;
    	this.numGoals = numGoals;
    	this.numAssists = numAssists;
    	this.gamesPlayed = gamesPlayed;    	
    	
    	
       
    }
    public void ScoreGoal() {
    	numGoals++;
    }
    public void Assist() {
    	numAssists++;
    }

    public void playGame(int goalsScored, int assistsMade) {
    	numGoals += goalsScored; 
    	numAssists += assistsMade; 
    	gamesPlayed++;
    }
    
    
    
   
    public String toString() {
    	String handedness = "right-handed";
    	if (isLeftHanded) {
    		handedness = "left-handed";
    	}
    	return name + " has played "+gamesPlayed+ " games, is "+ handedness +", has "+ (numAssists+numGoals)+" total points"+" and shoots "+shootDirection;
    }   
    public static void main(String[] args) {
    	HockeyPlayer jasdf = new HockeyPlayer("george", "left", true, 5, 3, 20);
    	jasdf.playGame(1,3);
    	System.out.println(jasdf);
    	jasdf.playGame(23,3);
    	System.out.println(jasdf);
    	
    }
 }

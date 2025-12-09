public class ArcadeGameCredit {
private String gameName;   // e.g. "Dance Machine"
private int credits;      // how many credits are currently loaded
private int costPerPlay;      // how many credits one play costs
private int playsCompleted;     // used at higher levels 
public ArcadeGameCredit(String givenGameName, int initialCredits, int initialCostPerPlay){
    gameName = givenGameName;
    if(initialCredits < 0){
        credits = 0;
    }
    else{
    credits = initialCredits;
    }
    if (initialCostPerPlay <= 0){
        costPerPlay = 1;
    }
    else{
    costPerPlay = initialCostPerPlay;
    }
    playsCompleted = 0;
}
public String toString(){
    return "Game: " + gameName + ", Credits: " + credits + ", Cost per play: " + costPerPlay;
}
public void playOnce(){
    if (credits >= costPerPlay){
        credits = credits - costPerPlay;
        playsCompleted++;
    }
}
public int getTotalCreditsUsed(){
    return (playsCompleted * costPerPlay);
}

}

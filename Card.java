public class Card {

    private Ranks myRanks;
    private Suits mySuits;

    public Ranks getMyRanks(){
        return myRanks;
    }

    public void setMyRanks(Ranks myRanks) {
        this.myRanks = myRanks;
    }

    public Suits getMySuits() {
        return mySuits;
    }
    public void setMySuits(Suits mySuits){
        this.mySuits = mySuits;
    }

    public String getDescription(){
        return "Twoja karta to: " + myRanks + " of " + mySuits;
    }
























}

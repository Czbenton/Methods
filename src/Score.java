/**
 * Created by Zach on 8/29/16.
 */
// variables for outcome of shoot
public class Score {
    private int score;
    private int targetHit;
    private boolean firstPlace;
    private boolean secondPlace;

    public Score(){}
    public Score(int score, int targetHit, boolean FP, boolean SP) { //constructor
        this.score = score;
        this.targetHit = targetHit;
        firstPlace = FP;
        secondPlace = SP;
    }

    public void setScore(int s){   //setter methods
        if(invalidScore(s)) {
                score = s ;
        }
    }
    public boolean invalidScore(int s){
        return (s > 0);
    }

    public void setTargetHit(int t){
        targetHit = t;
    }
    public void setFirstPlace(boolean FP){
        firstPlace = FP;
    }
    public void setSecondPlace(boolean SP){
        secondPlace = SP;
    }

    public int getScore(){   //getter methods
        return score;
    }
    public int getTargetHit(){
        return targetHit;
    }
    public boolean getFirstPlace(){
        return firstPlace;
    }
    public boolean getSecondPlace(){
        return secondPlace;
    }
}

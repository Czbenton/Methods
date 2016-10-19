/**
 * Created by Zach on 8/29/16.
 */
public class Score {
    private int score;
    private int targetHit;
    private boolean firstPlace;
    private boolean secondPlace;

    public Score() {
    }

    public Score(int score, int targetHit, boolean FP, boolean SP) {
        this.score = score;
        this.targetHit = targetHit;
        firstPlace = FP;
        secondPlace = SP;
    }

    public boolean invalidScore(int s) {
        return (s > 0);
    }

    public int getScore() {   //getter methods
        return score;
    }

    public void setScore(int s) {
        if (invalidScore(s)) {
            score = s;
        }
    }

    public int getTargetHit() {
        return targetHit;
    }

    public void setTargetHit(int t) {
        targetHit = t;
    }

    public boolean getFirstPlace() {
        return firstPlace;
    }

    public void setFirstPlace(boolean FP) {
        firstPlace = FP;
    }

    public boolean getSecondPlace() {
        return secondPlace;
    }

    public void setSecondPlace(boolean SP) {
        secondPlace = SP;
    }
}

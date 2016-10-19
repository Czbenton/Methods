/**
 * Created by Zach on 8/29/16.
 */

public class Archery {
    private int arrows;
    private String bow;
    private String quiver;

    public Archery() {
    }

    public Archery(int arrows, String bow, String quiver) {
        this.arrows = arrows;
        this.bow = bow;
        this.quiver = quiver;
    }

    public boolean isArrowsValid(int a) {
        return (a < 15 && a > 4);
    }

    public int getArrows() {   //getter methods
        return arrows;
    }

    public void setArrows(int a) {
        if (isArrowsValid(a)) {
            arrows = a;
        }
    }

    public int getArrows(int a) {  //this is an overload. the parameter is set to allow an int. then applies that to the code below.
        return arrows + a;
    }

    public String getBow() {
        return bow;
    }

    public void setBow(String b) {
        bow = b;
    }

    public String getQuiver() {
        return quiver;
    }

    public void setQuiver(String q) {
        quiver = q;
    }


}
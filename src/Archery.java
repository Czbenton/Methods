
/**
 * Created by Zach on 8/29/16.
 */

// basic equipment needed for a shoot

public class Archery {
    private int arrows;
    private String bow;
    private String quiver;

    public Archery(){}
    public Archery(int arrows, String bow, String q) { //constructor
        this.arrows = arrows;
        this.bow = bow;
        quiver = q; //does not need 'this.' because its not named quiver in the parameters above
    }

        public void setArrows(int a){   //setter methods
            if(isArrowsValid(a)){   //this is my conditional. arrows only = a if a <15. see refactored below
                arrows = a;
            }
        }
        public boolean isArrowsValid(int a){  //refactored code from setArrows. Now all logic can be done in one location and easily re-used
            return (a <15 && a > 4);
        }

        public void setBow(String b){
            bow = b;
        }
        public void setQuiver(String q){
            quiver = q;
        }

        public int getArrows(){   //getter methods
            return arrows;
        }
        public int getArrows(int a) {  //this is an overload. the parameter is set to allow an int. then applies that to the code below.
            return arrows + a;
        }
        public String getBow(){
            return bow;
        }
        public String getQuiver(){
            return quiver;
        }



}
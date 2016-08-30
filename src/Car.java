/**
 * Created by Zach on 8/29/16.
 */
// my car
public class Car {
    private int doors;
    private int year;
    private String makeModel;
    private double engineSize;

    public Car(){}
    public Car(int doors, int year, String m, double e) {  //constructor
        this.doors = doors;
        this.year = year;
        makeModel = m;  //does not need 'this.' because its not named makeModle in the parameters above
        engineSize = e;
    }

    public void setDoors(int d){   //setter methods ----- this method is refactored below. doors only = d if d is 2 or 4
        if(correctDoors(d)){
            doors = d;
        }
    }
    public boolean correctDoors(int d){
        return (d == 2) || (d == 4);
    }
    public void setYear(int y){
        year = y;
    }
    public void setMakeModel(String m){
        makeModel = m;
    }
    public void setEngineSize(double e){
        engineSize = e;
    }

    public int getDoors(){   //getter methods
        return doors;
    }
    public int getDoors(int a){   //example of overloaded method.
        return doors + a;
    }
    public int getYear(){
        return year;
    }
    public String getMakeModel(){
        return makeModel;
    }
    public double getEngineSize(){
        return engineSize;
    }



}

/**
 * Created by Zach on 8/29/16.
 */
public class Car {
    private int doors;
    private int year;
    private String makeModel;
    private double engineSize;

    public Car() {
    }

    public Car(int doors, int year, String makeModel, double engineSize) {
        this.doors = doors;
        this.year = year;
        this.makeModel = makeModel;
        this.engineSize = engineSize;
    }

    public boolean correctDoors(int d) {
        return (d == 2) || (d == 4);
    }

    public int getDoors() {   //getter methods
        return doors;
    }

    public void setDoors(int d) {
        if (correctDoors(d)) {
            doors = d;
        }
    }

    public int getDoors(int a) {   //example of overloaded method.
        return doors + a;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int y) {
        year = y;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String m) {
        makeModel = m;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double e) {
        engineSize = e;
    }


}

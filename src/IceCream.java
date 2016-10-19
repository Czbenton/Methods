/**
 * Created by Zach on 8/29/16.
 */
public class IceCream {
    private String[] flavors = {"Vanilla", "Chocolate", "Almond"};
    private String size;
    private String size2;
    private String size3;
    private int price;

    public IceCream() {
    }

    public IceCream(String[] flavors, String size, String size2, String size3, int price) {
        this.flavors = flavors;
        this.size = size;
        this.size2 = size2;
        this.size3 = size3;
        this.price = price;
    }

    public void setFlavors(String f, int index) {
        flavors[index] = f;
    }

    public int getPrice() {   //getter methods
        return price;
    }

    public void setPrice(int p) {
        price = p;
    }

    public String[] getFlavors() {
        return flavors;
    }

    public void setFlavors(String[] f) {  //setter methods
        flavors = f;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String s1) {
        size = s1;
    }

    public String getSize2() {
        return size2;
    }

    public void setSize2(String s2) {
        size2 = s2;
    }

    public String getSize3() {
        return size3;
    }

    public void setSize3(String s3) {
        size3 = s3;
    }
}

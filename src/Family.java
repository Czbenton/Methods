/**
 * Created by Zach on 8/29/16.
 */
public class Family {
    private int age;
    private String relation;

    public Family() {
    }

    public Family(int age, String relation) {
        this.age = age;
        this.relation = relation;
    }

    public boolean hasSpace(String a) {
        return a.contains(" ");
    }

    public int getAge() {   //getter methods
        return age;
    }

    public void setAge(int a) {   //setter methods
        age = a;
    }

    public String getRelation() {
        return relation;
    }

    public String getRelation(String a) {
        return a + relation;
    }

    public void setRelation(String r) {
        if (hasSpace(r)) {
            relation = r;
        }
    }


}

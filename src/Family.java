/**
 * Created by Zach on 8/29/16.
 */
// ability to create family members
public class Family {
    private int age;
    private String relation;

    public Family(){}
    public Family(int age, String relation) { //constructor
        this.age = age;
        this.relation = relation;
    }

    public void setAge(int a){   //setter methods
        age = a;
    }
    public void setRelation(String r){  //method with refactored code below. should only allow name with a space.
        if(hasSpace(r)) {
            relation = r;
        }
    }
    public boolean hasSpace(String a){
        return a.contains(" ");
    }


    public int getAge(){   //getter methods
        return age;
    }
    public String getRelation(){
        return relation;
    }
    public String getRelation(String a){   //overload
        return a + relation;
    }



}

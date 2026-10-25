package constructor.in.java;

public class Programmer {
    public String name;
    public int age;
    public String language;

    public Programmer(String name, int age, String language) {
        this.name = name;
        this.age = age;
        this.language = language;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setLanguage(String language){
        this.language = language;
    }

    public  String getLanguage(){
        return  this.language;
    }

}

package OOP.OOP_WorldStory;

public class Human {
    private   String name ;
    private  boolean gender;
    private  int age;
    Human(String name,boolean gender){
        this.name= name;
        this.gender= gender;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {

        return name;
    }
    public boolean isGender() {
        return gender;
    }
    public int getAge() {
        return age;
    }
    public void say(String words){
        System.out.println(words);
    }
    public void eat(String foods){
        System.out.println(foods);
    }
    public void sleep(){
        System.out.println("zzZZ");
    }
}

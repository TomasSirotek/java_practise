package oop_basics.repository_pattern;

public class Entity {
    int id;
    String name;
    int age;

    public Entity(int id,String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}

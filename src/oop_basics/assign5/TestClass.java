package oop_basics.assign5;


import java.util.ArrayList;
import java.util.List;

public class TestClass {
    private List<Person> userList = new ArrayList<>();

    public TestClass(){
       Person p = new Person(100,"Hans Nielsen","yahoo@gmail.com");
       Person p2 = new Person(101,"Niels Hansen","yahoo@gmail.com");
       Person p3 = new Person(102,"Ib Boesen","yahoo@gmail.com");

       Teacher t = new Teacher(202,"Bent H.Pedersen","bhp@easv.dk");
       Teacher t2 = new Teacher(203,"Adam R.Rotter Dam","rip@easv.dk");
        t2.addSubject("Multimedia");
        t2.addSubject("Programming");
       userList.add(p);
       userList.add(p2);
       userList.add(p3);
       userList.add(t);
       userList.add(t2);



    }

    public List<Person> getUserList() {
        return userList;
    }

    public void setUserList(List<Person> userList) {
        this.userList = userList;
    }
}

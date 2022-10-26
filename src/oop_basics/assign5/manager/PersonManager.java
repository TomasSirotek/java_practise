package oop_basics.assign5.manager;

import oop_basics.assign5.models.Person;
import oop_basics.assign5.models.Student;
import oop_basics.assign5.models.Teacher;

import java.util.ArrayList;
import java.util.List;

public class PersonManager implements IPersonManager {
    List<Person> persons = new ArrayList<>();


    public PersonManager(){
    }

    public Person getPersonById(int id){
        return persons.stream().filter((user) ->
                    user.getId() == id).findFirst().orElseThrow();
    }

    public void addPerson(Person p){
        if(!persons.contains(p)){
            persons.add(p);
        }
    }

    public void removePersonById(int id){
        for (Person p: persons) {
            if(p.getId() == id){
                persons.remove(p);
            }
        }
    }

    public List<Person> getAllPersons(){
        return this.persons;
    }
    public List<Student> getAllStudents(){
        return null;
    }
    public List<Teacher> getAllTeachers(){
        return null;
    }
    public void operation(){

    }

}

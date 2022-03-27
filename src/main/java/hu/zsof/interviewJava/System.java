package hu.zsof.interviewJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class System {

    private List<Person> family = new ArrayList<Person>();

    public void addChildren(Parent parent, Children child){
        family.add(parent.addChildren(child));
    }

    public void addParent(Parent parent1, Parent parent2){
        family.add(parent1.addParent(parent2));
    }

    public void removePerson(String name){
        family.removeIf(person -> Objects.equals(person.getName(), name));
    }

    public void changePerson(String name, Person personModified) {
        for(Person person: family){
            if(Objects.equals(person.getName(), name)){
                person.setName(personModified.getName());
            }
        }
    }

    public void setBackground(Person person, String backgroundUrl){
        person.setBackground(backgroundUrl);
    }

    public void setIcon(Person person, String iconUrl){
        person.setIcon(iconUrl);
    }
}
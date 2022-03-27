package hu.zsof.interviewJava;

import javax.persistence.Entity;

@Entity
public class Parent extends Person {

    public Children addChildren(Children child){
       return child;
    }

    public Parent addParent(Parent parent){
        return parent;
    }
}
package hu.zsof.interviewJava;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Getter
@Setter
public class Person {

    @GeneratedValue
    @Id
    private int id;
    private String name;

    @Embedded
    private Settings settings;

    public void setBackground(String backgroundUrl){
       settings.setBackgroundUrl(backgroundUrl);
    }

    public void setIcon(String iconUrl){
        settings.setIconUrl(iconUrl);
    }
}
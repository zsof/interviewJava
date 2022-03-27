package hu.zsof.interviewJava;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Embeddable
@Getter
@Setter
public class Settings {

    @Id
    @GeneratedValue
    private int id;

    private String iconUrl;

    private String backgroundUrl;

    private String menuLayout;
}
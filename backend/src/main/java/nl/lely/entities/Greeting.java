package nl.lely.entities;

import javax.persistence.*;

/**
 * Created by ple20962 on 18-4-2017.
 */
@Entity
@Table(name="greeting")
public class Greeting {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="content")
    private String content;

    protected Greeting() {
    }

    public Greeting(String content) {
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Hello, " + content;
    }
}

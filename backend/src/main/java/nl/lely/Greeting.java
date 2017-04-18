package nl.lely;

/**
 * Created by ple20962 on 18-4-2017.
 */
public class Greeting {

    private final long id;
    private final String content;


    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}

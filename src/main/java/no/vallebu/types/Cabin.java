package no.vallebu.types;

/**
 * Created by ovalle on 17/11/14.
 */
public class Cabin {

    private String name;
    private String moh;

    public Cabin(String name, String moh) {
        this.name = name;
        this.moh = moh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoh() {
        return moh;
    }

    public void setMoh(String moh) {
        this.moh = moh;
    }
}

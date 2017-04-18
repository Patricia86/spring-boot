package nl.lely;

/**
 * Created by ple20962 on 18-4-2017.
 */
public class Adres {

    private long id;
    private String naam;
    private String straatnaam;
    private long huisnummer;
    private String postcode;
    private String plaats;

    public Adres(long id, String naam, String straatnaam, long huisnummer, String postcode, String plaats) {
        this.id = id;
        this.naam = naam;
        this.straatnaam = straatnaam;
        this.huisnummer = huisnummer;
        this.postcode = postcode;
        this.plaats = plaats;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getStraatnaam() {
        return straatnaam;
    }

    public void setStraatnaam(String straatnaam) {
        this.straatnaam = straatnaam;
    }

    public long getHuisnummer() {
        return huisnummer;
    }

    public void setHuisnummer(long huisnummer) {
        this.huisnummer = huisnummer;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPlaats() {
        return plaats;
    }

    public void setPlaats(String plaats) {
        this.plaats = plaats;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}

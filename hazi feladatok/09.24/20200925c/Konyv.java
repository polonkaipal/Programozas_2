public class Konyv {
    private String cim;
    private String szerzo;
    private int oldalszam;

    public String getCim() {
        return cim;
    }

    public int getOldalszam() {
        return oldalszam;
    }

    public void setOldalszam(int oldalszam) {
        this.oldalszam = oldalszam;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public void setSzerzo(String szerzo) {
        this.szerzo = szerzo;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public String toString() {
        return String.format("%s - %s: %d oldal", this.cim, this.szerzo, this.oldalszam);
    }

    public Konyv(String cim, String szerzo, int oldalszam) {
        this.cim = cim;
        this.szerzo = szerzo;
        this.oldalszam = oldalszam;
    }
}

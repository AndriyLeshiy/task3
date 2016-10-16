/**
 * Created by Leshiy on 12.10.2016.
 */
public class Strings {
    private String[] mas1, mas2;
    private String s;
    private String sep;

    public String getSep() {
        return sep;
    }

    public Strings(String s){
        this.s = s;
        if(s!="") {
            mas1 = s.split("[a-zA-Z]+");
            sep = mas1[1];
            mas2 = s.split(sep);
        }
    }

    public String[] getMas2() {
        return mas2;
    }

    public void setS(String s) {
        this.s = s;
        if(s!="") {
            mas1 = s.split("[a-zA-Z]+");
            sep = mas1[1];
            mas2 = s.split(sep);
        }
    }

}

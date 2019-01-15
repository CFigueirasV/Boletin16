package boletin_16;

/**
 *
 * @author cfigueirasvalverde
 */
public class Boletin_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persoa per = new Persoa();
        Canario ca = new Canario();
        Galo ga = new Galo();
        per.cantar();
        ca.cantar();
        ga.cantar();
     
        Tenor te = new Tenor();
        te.cantar();
       
    }
    
}
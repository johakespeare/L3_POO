/**
 * Classe   Entier
 * classe fille de la classe Entier
 * @version 1.0
 *
 * @author Johanna Fericean
 */

import java.util.Random;

public class EntierFou extends Entier {
        /**  ATTRIBUTS **/
    private int niveauDeFolie;
    private Random r = new Random();
    
    /**      CONSTRUCTEURS            **/
    public EntierFou(int borne_inf,int borne_sup, int valeur, int niveauDeFolie){
        super(borne_inf,borne_sup,valeur);
        this.niveauDeFolie = niveauDeFolie;
    }
    
    /**       METHODES                 **/
    @Override
    public void incremente() {
        //** la fonction incremente l'entier entre 0 et niveau de folie
        *//
        int tirage =r.nextInt(niveauDeFolie)
        incremente(tirage);
    }
}

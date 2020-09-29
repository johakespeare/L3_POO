/**
 * Classe DeMemoire
 * classe fille de la classe De
 * @version 1.0
 *
 * @author Johanna Fericean
 */

public class DeMemoire extends De{
    //**  ATTRIBUTS   **//
    private int lancer_precedent;

    //** CONSTRUCTEURS **/
    public DeMemoire(int nbFaces , String nom){
        super(nbFaces,nom);
        this.lancer_precedent=0;
    }

    //**   METHODES     **/
    @Override
    public int lancer(int nbCoups) {
        /* fonction qui lance le Dé plusieurs fois (nbCoups de fois)
        *@param nbCoups = le nombre de fois qu'on lance le Dé
        **/
        int max=0;
        for (int i=0;i<nbCoups;i++){
            int lancer = lancer();
            while (lancer==lancer_precedent){
                lancer = lancer();}
            //System.out.println(lancer + " le lancer précédent"+ lancer_precedent);
            if(max<lancer){
                max=lancer;}
            lancer_precedent=lancer;}
        return(max);}
}

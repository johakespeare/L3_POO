/**
 * Classe DePipe
 * classe fille de la classe De
 * @version 1.0
 *
 * @author Johanna Fericean
 */

public class DePipe extends De {
    //** ATTRIBUTS **//
    private int borne;

    //** CONSTRUCTEURS **/
    public DePipe(int nbFaces , String nom, int borne){
        /**
        @param borne = le nombre minimum qui sera tiré au lancer de Dé
        **/
        super(nbFaces,nom);
        if((borne <= nbFaces )&&(borne >0)){  //si la borne est différente de 0 et qu'elle est plus  petite que nbFaces
        this.borne=borne;
        }
    }

    //**  METHODES  **//
    public  int getBorne(){
        /**
        @return la borne du Dé
        **/
        return(this.borne);
    }

    @Override
    public int lancer() {
        int tirage =r.nextInt(this.getNbFaces()+1);
        while ( tirage <= this.borne) {
            tirage =r.nextInt(this.getNbFaces()+1);
        }
        return (tirage);
    }
}

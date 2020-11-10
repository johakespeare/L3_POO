public abstract class Forme {
    //* ATTRIBUTS */
    public final String nom;
    private static int _n=0;

    //* CONSTRUCTEUR */
     
    /**
         * constructeur de Forme
         *@param nom, le nom de la Forme
         */
    
   
    public Forme(String nom){ 
        this.nom=nom;
        _n++;
    }

    //* METHODES */
   
    
    /**fonction qui retourne True si la première forme est plus grande que
          la forme passée en paramètres.
         * @param forme = une forme
         */
    public boolean estPlusGrande(Forme forme){
        if(this.surface()>forme.surface()){
            return(true);
        }
        else {
            return(false);
        }
        // return(this.surface()>forme.surface();
    }
    
    
    public abstract double surface();
    
    
    /** les mettre en public et pas en abstract **/
    public  abstract String toString();
    public abstract boolean equals(Object objet);
}





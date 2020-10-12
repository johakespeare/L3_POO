public abstract class Forme {
    //* ATTRIBUTS */
    protected String nom;
    protected static int _n=0;

    //* CONSTRUCTEUR */
    public Forme(String nom){
        /**
         * constructeur de Forme
         *@param nom, le nom de la Forme
         */
        this.nom=nom;
        _n++;
    }

    //* METHODES */
    public abstract double surface();

    public boolean estPlusGrande(Forme forme){
        /**fonction qui retourne True si la première forme est plus grande que
          la forme passée en paramètres.
         * @param forme = une forme
         */
        if(this.surface()>forme.surface()){
            return(true);
        }
        else {
            return(false);
        }
    }

    public abstract String toString();
    public abstract boolean equals(Object objet);
}





public class Cercle extends Forme_BiDimension{
    //*   ATTRIBUTS  */
    private double rayon;
    //* CONSTRUCTEURS */
    public Cercle(String nom,double rayon) {
        //**
	 * @param nom, le nom du cercle
	 * @param rayon, le rayon du cercle
	 */
        super(nom);
        this.rayon=rayon;
    }
    
    //* METHODES */

    @Override
    public double perimetre() {
        /**
         *@return le périmètre du cercle 2*pi*rayon
         */
        return 2*Math.PI*this.rayon;
    }

    @Override
    public double surface() {
        /**
         * @return l'aire du cercle
         */
        return Math.PI* Math.pow(this.rayon,2);
    }

    @Override
    public boolean equals(Object objet) {
        boolean egal =false;
        if(objet==this){
            egal= true;
        }
        else if(this.getClass()==objet.getClass()){
            Cercle other = (Cercle) objet;
            if(other.rayon==this.rayon){
                egal= true;
            }
        }
        else{
            egal =false;
        }

        return egal;
    }

    @Override
    public String toString() {
        return("la forme est un cercle nommé "+ this.nom  +" de  rayon "+ this.rayon+
                " de perimetre "+ this.perimetre() + " et de surface "+ this.surface());
    }

}

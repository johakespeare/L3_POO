public class Cercle extends Forme_BiDimension{
    //*   ATTRIBUTS  */
    private double rayon;
    //* CONSTRUCTEURS */
    //**
	 * @param nom, le nom du cercle
	 * @param rayon, le rayon du cercle
	 */
	
	public Cercle(String nom,double rayon) { 
        super(nom);
        this.rayon=rayon;
    }
    
    //* METHODES */

    @Override
	/**
         *@return le périmètre du cercle 2*pi*rayon
         */
    public double perimetre() {
        return 2*Math.PI*this.rayon;
    }

    @Override
    
	/**
         * @return l'aire du cercle
         */
	public double surface() {
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

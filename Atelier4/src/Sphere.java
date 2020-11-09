public class Sphere extends Forme_TriDimension{
    //* ATTRIBUTS */
    private double rayon;
    //*CONSTRUCTEURS */
    
    
    /**
         * constructeur Sphere
         * @param nom = nom de la Sphere
         * @param rayon = rayon de la Sphere
         */
    public Sphere(String nom,double rayon) {
        
        super(nom);
        this.rayon=rayon;
    }

    //* METHODES */
    @Override
    
    /**
         * retourne le volume de la Sphere 4/3 * Pi* r^3
         */
    public double volume() {
        return (4/3)*Math.PI*Math.pow(this.rayon,3);
    }

    @Override
   
    /**
         * retourne la surface de la Sphere
         */
    public double surface() {
         return 4*Math.PI*this.rayon;
    }

    @Override
    public String toString() {
        return("la forme est une Sphere nommée "+ this.nom  +" de rayon "+ this.rayon+" , de volume "+ this.volume() + " et de surface "+ this.surface());
    }

    @Override
    public boolean equals(Object objet) {
        boolean egal =false;
        if(objet==this){
            egal= true;
        }
        else if(this.getClass()==objet.getClass()){
            Sphere other = (Sphere) objet;
            if(other.rayon==this.rayon){
                egal= true;
            }
        }
        else{
            egal =false;
        }

        return egal;
    }




}

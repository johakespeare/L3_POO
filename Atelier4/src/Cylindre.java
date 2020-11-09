public class Cylindre extends Forme_TriDimension {
    //* ATTRIBUTS */
    private double rayon;
    private double hauteur;

    //* CONSTRUCTEURS */
   
    
     /**
         * @param nom, le nom du Cylindre
         * @param rayon, le rayon du Cylindre
         *@param hauteur, la hauteur du Cylindre
         */
    public Cylindre(String nom,double rayon,double hauteur) {
        super(nom);
        this.rayon = rayon;
        this.hauteur = hauteur;

    }

    @Override
      
    /**
         * @eturn le volume du cylindre
         */
    public double volume() { 
        return Math.pow(this.rayon,2)*Math.PI*this.hauteur;
    }



    @Override
     /**
         * @eturn la surface du cylindre
         */
    public double surface() {
        return 2*Math.PI*this.rayon*(this.rayon+this.hauteur);
    }

    @Override
    public boolean equals(Object objet) {
        boolean egal =false;
        if(objet==this){
            egal= true;
        }
        else if(this.getClass()==objet.getClass()){
            Cylindre other = (Cylindre) objet;
            if((other.rayon==this.rayon)&&(other.hauteur==this.hauteur)){
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
        return("la forme est un cylindre nommé "+ this.nom  +" de rayon "+ this.rayon+" d'hauteur "+ this.hauteur +" , de volume "+ this.volume() + " et de surface "+ this.surface());
    }

}

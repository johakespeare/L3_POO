public class Rectangle extends Forme_BiDimension{
    //* ATTRIBUTS */
    private double largeur;
    private double longueur;

    //*CONSTRUCTEURS*/
     /**
         * constructeur de la classe Rectangle
         * @param nom = le nom du Rectangle
         * @param largeur = la largeur du Rectangle
         * @param longueur= la longueur du Rectangle
         */
    
    public Rectangle(String nom, double largeur, double longueur) {
       
        super(nom);
        this.largeur=largeur;
        this.longueur=longueur;
    }

    //* METHODES */
   
    /**
         * retourne le périmètre du rectangle
         */
    @Override
    public double perimetre() {
        
        return (2*largeur+2*longueur);
    }

    
     /**
         * retourne l'aire du rectangle
         */
    @Override
    public double surface() {
       
        return (largeur*longueur);
    }


    @Override
    public boolean equals(Object objet) {
        boolean egal =false;
           if(objet==this){
               egal= true;
           }
           else if(this.getClass()==objet.getClass()){
               Rectangle other = (Rectangle) objet;
               if((other.longueur==this.longueur)&&(other.largeur==this.largeur)){
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
        return("la forme est un rectangle nommé "+ this.nom  +" de  longueur "+ this.longueur+" , de largeur "+ this.largeur +
                " de perimetre "+ this.perimetre() + " et de surface "+ this.surface());
    }

}

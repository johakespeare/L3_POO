public class DePipe extends De {
private int borne;


    public DePipe(int nbFaces , String nom, int borne){
        super();
        this.nbFaces=nbFaces;
        this.nom=nom;
        if((borne <= nbFaces )&&(borne !=0)){
        this.borne=borne;}
        i++;

    }

    public  int getBorne(){
        return(this.borne);
    }

    @Override
    public int lancer() {
        i =r.nextInt(this.getNbFaces() +1);
        while ( i <= this.borne) {
            i =r.nextInt(this.getNbFaces() +1);
        }
        return (i);
    }
}
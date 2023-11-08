public class Creature {
    private String nom;
    private boolean sexe;
    private float poids;
    private float taille;
    private int faim = 100;
    private boolean sommeil = false;
    private int sante = 100;
    private int age = 0;

    public Creature(String nom, boolean sexe, float poids, float taille, int faim, boolean sommeil, int sante, int age) {
        this.nom = nom;
        this.sexe = sexe;
        this.poids = poids;
        this.taille = taille;
        this.faim = faim;
        this.sommeil = sommeil;
        this.sante = sante;
        this.age = age;
    }

    public void setFaim(int faim) {
        this.faim = faim;
    }

    public void manger(){
        if (faim<=90 && faim>0){
            faim += 10;
            System.out.println("La faim de l'animal est à " + faim);
        }
        else{
            System.out.println("Cet animal n'a pas faim");
        }
    }

    public void emmetreSon(){
        System.out.println(nom + " emmet un son !");
    }

    public void soigner(){
        if (sante<=90){
            sante += 10;
            System.out.println("La santé de l'animal est passée à " + sante);
        }
        else{
            System.out.println("Cet animal est déjà en bonne santé");
        }
    }

    public void reveiller(){
        if(sommeil){
            sommeil = false;
            System.out.println("Cet animal se réveil");
        }
        else{
            System.out.println("Cet animal est déjà réveillé");
        }
    }

    public void dormir(){
        if(!sommeil){
            sommeil = true;
            System.out.println("Cet animal s'endors'");
        }
        else{
            System.out.println("Cet animal est déjà endormi");
        }
    }

    public void vieillir(){
        // a voir
    }
}

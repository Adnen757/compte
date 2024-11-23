//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Compte c=new Compte();
c.deposer(1000);
c.retirer(10);
System.out.println(c.solde);
Compte c1=new Compte();
c1.deposer(500  );
c.virervers(75,c1);
System.out.println(c.solde);
Compte[] tcompte =new Compte[10];
for (int i=0;i<tcompte.length;i++){
    tcompte[i]=new Compte();
    tcompte[i].deposer(200+i*100);
}
for (int i=0;i<tcompte.length;i++){
    tcompte[i].virervers(20,tcompte[+1]);
}
for (int i=0;i<tcompte.length;i++){
    System.out.println("les soldes de tous les compte sont "+i+":");
    tcompte[i].afficher();
}
    }
}

public class Compte {
    int solde =0;
    void deposer(int montant){
        solde=solde+montant;

    }
    void retirer(int montant){
        solde=solde-montant;
    }
    void virervers(int montant,Compte destination){
        this.retirer(montant);
        destination.deposer(montant);
    }
    void afficher(){
        System.out.println("solde: "+solde);
    }
}











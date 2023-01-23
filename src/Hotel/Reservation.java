package Hotel;

import java.util.Scanner;


//un commentaire ajouté
public class Reservation {

	private String login;
	private String password;

public  int menu() {
	Scanner sc= new Scanner(System.in);
	
	System.out.println("A- Afficher l'état de l'hôtel");
	System.out.println("B- Afficher le nombre de chambres réservées");
	System.out.println("C- Afficher le nombre de chambres libres");
	System.out.println("D- Afficher le numéro de la première chambre vide");
	System.out.println("E- Afficher le numéro de la dernière chambre vide");
	System.out.println("F- Réserver une chambre");
	System.out.println("G- Libérer une chambre");
	System.out.println("");
	System.out.println("Q- Quitter");
	
	System.out.println("Votre choix ? ");
	int choix;
	choix = sc.nextInt();
	return choix;
	
	}

public void reserverChambre (Hotel h) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Quel type de chambre à réserver?");
	String type = sc.next();
	

	for(Chambre c: h.getListeChambre()) {
	
		if(c.getEtat()==true) {
			if(c.getType().equals(type))
			{
				c.setEtat(false);
			}
			
			}
		}
	}
		
public int compterReservee(Hotel h) {
	int somReservee=0;
	for(Chambre c: h.getListeChambre()) {
	if(c.getEtat()==false) {
		somReservee++;}}
	return somReservee;
	
}
	
	public int compterLibre(Hotel h){
		int somLibre=0;
		for (Chambre c:h.getListeChambre()){
			if(c.getEtat()==true) {
				somLibre++;}

		}
		return somLibre;

	}

	public void libererChambre(Hotel h) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Entrer login");
		String log=sc.next();
		if (log.equals("login")){
			System.out.println("Entrer mot de passe");
			String mdp=sc.next();
			if (mdp.equals("password"));
		for(Chambre c:h.getListeChambre()) {
			if(c.getEtat()==false) {
				c.setEtat(true);
			}}}}
			
	
	public int premierVide(Hotel h) {
		Scanner scanner=new Scanner(System.in);
		int numero=0;
		for(Chambre c:h.getListeChambre()) {
			if(c.getEtat()==true) {
				c.getNumero();
			}
			
			return numero;
		}
		return numero;
		
	}
	

}
	

package Hotel;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class testReservation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("1- Afficher l'état de l'hôtel");
		System.out.println("2- Afficher le nombre de chambres réservées");
		System.out.println("3- Afficher le nombre de chambres libres");
		System.out.println("4- Afficher le numéro de la première chambre vide");
		System.out.println("5- Afficher le numéro de la dernière chambre vide");
		System.out.println("6- Réserver une chambre");
		System.out.println("7- Libérer une chambre");
		System.out.println("");
		System.out.println("8- Quitter");

		System.out.println("Votre choix ? ");
		int choix = sc.nextInt();

		Hotel h = new Hotel();
		h.setNomHotel("test");

		Chambre ch1 = new Chambre();
		ch1.setEtat(true);// libre
		ch1.setNumero(1);
		ch1.setType("Single");
		ArrayList<Chambre> listChambre = new ArrayList<>();
		
		listChambre.add(ch1);
		
		Chambre ch2 = new Chambre();
		ch2.setEtat(true);
		ch2.setNumero(2);
		ch2.setType("twin");

		
		listChambre.add(ch2);
		
		Chambre ch3 = new Chambre();
		ch3.setEtat(true);
		ch3.setNumero(3);
		ch3.setType("Single");
	
		
		listChambre.add(ch3);
		
		

		h.setListeCambre(listChambre);

		Reservation r = new Reservation();

		while (choix != 8) {

			if (choix == 6) {
				r.reserverChambre(h);

				// System.out.println(h.toString()+" Etat actualisé chambre: "+ch1.getEtat());

			}

			else if (choix == 1) {
				h.getListeChambre();
				System.out.println(h.toString());

			}

			else if (choix == 2) {
				r.compterReservee(h);
				System.out.println("Le nombre e chambre réservées " + r.compterReservee(h));

			}

			else if (choix == 3) {
				System.out.println("Nombre de chambre libre: " + r.compterLibre(h));
			}
			
			if (choix==7) {
				r.libererChambre(h);
			}
			
			if (choix==4) {
				r.premierVide(h);
				System.out.println("La première chambre libre est: " +r.premierVide(h));
			}
			
			
			System.out.println("1- Afficher l'état de l'hôtel");
			System.out.println("2- Afficher le nombre de chambres réservées");
			System.out.println("3- Afficher le nombre de chambres libres");
			System.out.println("4- Afficher le numéro de la première chambre vide");
			System.out.println("5- Afficher le numéro de la dernière chambre vide");
			System.out.println("6- Réserver une chambre");
			System.out.println("7- Libérer une chambre");
			System.out.println("");
			System.out.println("8- Quitter");
			System.out.println("Votre choix ? ");
			choix = sc.nextInt();
		
			
			

		}

	

	}

}

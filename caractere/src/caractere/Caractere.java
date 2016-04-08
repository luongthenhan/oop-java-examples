package caractere;

public class Caractere {

	public static void main(String[] args) {
		String beauchain = "Il fait beau !";
		
		// les caractères de 8 à 11
		String beau = beauchain.substring(8, 12);
		System.out.println(beau);
		
		// les caractères à partir de la position 8 jusqu'à la fin
		String chain = beauchain.substring(8);
		System.out.println(chain);
		
		int longeur = beauchain.length();
		System.out.println("La longeur de la chaine des caracteres : " + longeur);
		
		int positionDeF = beauchain.indexOf('f');
		System.out.println("La position de f : " + positionDeF);
		
		int positionDeN = beauchain.indexOf('n');
		System.out.println("La position de n : " + positionDeN);
		
		String salut = "bonjour !";
		salut = salut.substring(0, 3) + "soir !";
		System.out.println(salut);
		
		StringBuilder sb = new StringBuilder();
		sb.append("Bon");
		sb.append("soir");
		sb.append(" !");
		String bonsoir = sb.toString();
		System.out.println(bonsoir);
	}

}

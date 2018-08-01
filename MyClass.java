import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		Client user = new Client("iftene","nada",19,"Oran..",100000.);
		boolean condition = false;
		user.myInfo();
		do{
        System.out.println("Entrer votre identité: ");
        user.id = clavier.nextInt();
        System.out.println("Entrer votre mot de passe: ");
        user.motDePasse = clavier.next();
        if (user.id == 123456 && user.motDePasse.matches("azerty")){
        	condition = true;
        	System.out.println("welcome");
        }
        else {
        	System.out.println("faux !");
        }
		}while(!condition);
	}

}

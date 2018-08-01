
public class Client {
	String nom ;
	String prenom;
	int age;
	Double salaire ;
	String addresse ;
	int id;
	String motDePasse;
	Client(String name,String FirstName ,int a,String add,Double sal){
		nom = name;
		prenom = FirstName;
		age = a;
		addresse = add;
		salaire = sal;
	}
	public void myInfo(){
		System.out.println("Le nom de client est: "+nom);
		System.out.println("Le prenom de client est: "+prenom);
		System.out.println("L'age  de client est: "+age);
		System.out.println("L'addresse de client est: "+addresse);
		System.out.println("Salaire est: "+salaire);
		
	}
	
	

}

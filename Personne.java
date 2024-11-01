public class Personne {
  public String nom;
  public int age;

  // Methode instance (enleve le mot cle static)
  void afficherInfos() {
      System.out.println("Nom : " + nom);
      System.out.println("Age : " + age);
  }

  public static void main(String[] args) {
      Personne myObj = new Personne();
      myObj.nom = "Yassine";
      myObj.age = 45;
      myObj.afficherInfos();  // Appeler la methode nstance
  }
}

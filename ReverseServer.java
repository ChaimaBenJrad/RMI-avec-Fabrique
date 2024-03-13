package server;
import java.rmi.Naming;

public class ReverseServer {
    public static void main(String[] args) {
        try {
            // Cr�ez une instance de l'objet fabrique d'objets
            AppInterface fabrique = new AppImpl();

            // Liez l'objet fabrique dans le registre RMI
            Naming.rebind("Fabrique", fabrique);

            System.out.println("Serveur pr�t. Attente des invocations des clients...");
        } catch (Exception e) {
            System.out.println("Erreur de liaison de l'objet Fabrique");
            System.out.println(e.toString());
        }
    }
}

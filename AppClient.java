package client;

import java.rmi.Naming;

import Fabrique.FabInterface;
import server.AppInterface;

public class AppClient {
    public static void main(String[] args) {
        try {
            // Obtenez une référence à l'objet fabrique distant
            FabInterface fabrique = (FabInterface) Naming.lookup("Fabrique");

            // Créez une instance d'objet distant
            AppInterface reverseInstance = fabrique.newReverse();

            // Appelez la méthode distante pour inverser une chaîne
            String result = reverseInstance.reverseString("Hello, World!");
            System.out.println("Chaîne inversée : " + result);
        } catch (Exception e) {
            System.out.println("Erreur d'accès à l'objet distant.");
            System.out.println(e.toString());
        }
    }
}

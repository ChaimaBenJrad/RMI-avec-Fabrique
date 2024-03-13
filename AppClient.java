package client;

import java.rmi.Naming;

import Fabrique.FabInterface;
import server.AppInterface;

public class AppClient {
    public static void main(String[] args) {
        try {
            // Obtenez une r�f�rence � l'objet fabrique distant
            FabInterface fabrique = (FabInterface) Naming.lookup("Fabrique");

            // Cr�ez une instance d'objet distant
            AppInterface reverseInstance = fabrique.newReverse();

            // Appelez la m�thode distante pour inverser une cha�ne
            String result = reverseInstance.reverseString("Hello, World!");
            System.out.println("Cha�ne invers�e : " + result);
        } catch (Exception e) {
            System.out.println("Erreur d'acc�s � l'objet distant.");
            System.out.println(e.toString());
        }
    }
}

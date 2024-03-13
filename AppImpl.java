package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AppImpl extends UnicastRemoteObject implements AppInterface {
    public AppImpl() throws RemoteException {
        // Constructeur par défaut
    }

    public String reverseString(String chaineOrigine) throws RemoteException {
        int longueur = chaineOrigine.length();
        StringBuilder temp = new StringBuilder(longueur);
        for (int i = longueur; i > 0; i--) {
            temp.append(chaineOrigine.substring(i - 1, i));
        }
        return temp.toString();
    }
}

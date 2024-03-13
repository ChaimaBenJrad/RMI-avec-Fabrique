package server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AppInterface extends Remote {
    String reverseString(String chaine) throws RemoteException;
}
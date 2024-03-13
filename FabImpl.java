package Fabrique;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import server.AppInterface;

public class FabImpl extends UnicastRemoteObject implements FabInterface {
    public FabImpl() throws RemoteException {
        // Constructeur par d�faut
    }

    @Override
    public AppInterface newReverse() throws RemoteException {
        return new Reverse();
    }
}

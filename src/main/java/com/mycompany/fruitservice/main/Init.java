/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fruitservice.main;

import com.mycompany.fruitservice.interfaces.ComputeInterface;
import com.mycompany.fruitservice.services.FruitComputeEngine;
import com.mycompany.fruitservice.tasks.FruitComputeTaskRegistry;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author haamani
 */
public class Init {

    /**
     * @param args the command line arguments
     * @throws java.rmi.RemoteException
     * @throws java.rmi.AlreadyBoundException
     */
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        // TODO code application logic here
        ComputeInterface engine = new FruitComputeEngine();
        FruitComputeTaskRegistry task = new FruitComputeTaskRegistry(engine);        
        task.runTask();
    }
    
}

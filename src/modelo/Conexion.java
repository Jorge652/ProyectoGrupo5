/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Leonardo Obando
 */
public class Conexion {
    try
        {
            MongoClient mongo=new MongoClient("localhost",27017);
            baseDatos= mongo.getDB("Subasta");
            coleccion=baseDatos.getCollection("participantes");
            System.out.println("conexion a base de datos exitoso...");
        }
        catch(Exception e)
        {
                    
        }        
}

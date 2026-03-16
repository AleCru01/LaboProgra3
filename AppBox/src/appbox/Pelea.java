/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appbox;
import java.util.*;

/**
 *
 * @author victo
 */
public class Pelea {
    Peleador[] pe = new Peleador[2];
    Juez[] ju = new Juez[3];
    Scanner in = new Scanner(System.in);
    int i = 0;
    public void designarJuez(String ju1, String ju2, String ju3){
       ju[0] = new Juez();
       ju[0].setNombre(ju1);
       ju[1] = new Juez(); 
       ju[1].setNombre(ju2);
       ju[2] = new Juez();
       ju[2].setNombre(ju3);
       for(Juez a: ju){
           System.out.println("\n"+a.getNombre());
       }
    }
    // UN SELESCT PARA TENER DETERMINADO A PELEADORES:
    //ceamos un
}


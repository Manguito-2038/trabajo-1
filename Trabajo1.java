/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author INTEL
 */
public class Trabajo1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objetoEntrada=new Scanner (System.in);
        System.out.println("cantidad de datos");
        int a =objetoEntrada.nextInt();
        int[] lista =new int [a];
        int i=0;
        while (i<10){
            System.out.println("ingrese dato");
            int y=objetoEntrada.nextInt();
            i++;
            lista[i]=y;}
        System.out.println("lista" +Arrays.toString(lista));

            
        }
        
    }
   

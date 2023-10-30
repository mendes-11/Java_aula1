package com.renato_mendes.java_api;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthEditorPaneUI;


public class Atividade2 {

    Scanner ler = new Scanner(System.in);

    public void resto11(){

        short i = 1000;
        while(i<2000){
            if(i % 11 == 5)
                System.out.println(i);
            i++;
        }
    }

    public void imparPar(){
        short i = 0;
        short countPar = 0;
        short countImpar = 0;

        while(i<=1000){
            if(i % 2 == 0)
                countPar++;
            else
                countImpar++;
            i++;
        }
        System.out.println("Quantidade de numero Par: " + countPar);
        System.out.println("Quantidade de numero Par: " + countImpar);

    }
}


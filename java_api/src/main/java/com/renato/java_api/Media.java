package com.renato.java_api;
import java.util.ArrayList;
import java.util.Scanner;



public class Media {


    Scanner ler = new Scanner(System.in);

    float[] array = new float[];
    ArrayList list = new ArrayList();


    public void Valor(){

        
        System.out.println("Ensira a primeira nota");
        float n1 = ler.nextFloat();
    
        System.out.println("Ensira a segunda nota");
        float n2 = ler.nextFloat();
    
        System.out.println("Ensira a terceira nota");
        float n3 = ler.nextFloat();
    
        System.out.println("Ensira a quarta nota");
        float n4 = ler.nextFloat();

        float soma = n1 + n2 + n3 + n4;
        float media = soma / 4;

        list.add(media);

        for(int i = 0; i < array.size(); i++)
        {
            array[i] = soma;
        }

        if(media > 90)
            System.out.println("Aluno ta de parabéns");
        else if(media > 70)
            System.out.println("Aluno aprovado");
        else if(media < 30)
            System.out.println("Aluno reprovado");

    }

    
}

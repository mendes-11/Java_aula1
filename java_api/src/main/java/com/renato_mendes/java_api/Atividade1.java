package com.renato_mendes.java_api;
import java.util.ArrayList;
import java.util.Scanner;



public class Atividade1 {


    Scanner ler = new Scanner(System.in);

    float[] array = new float[3];
    ArrayList<Float> list = new ArrayList();

    public void valor(){
        float nota = 0;
        float soma = 0;
        float media;

        for(int i = 0; i < 3; i++)
        {
            System.out.print("\nEnsira a " + (i+1) + "° nota: ");
            nota = ler.nextFloat();
            array[i] = nota;
        }

        for(int i = 0; i < 3; i++)
        {
            soma = soma + array[i];
        }

        media = soma / 3;
        list.add(media);

        System.out.printf("\nA soma das notas foi = %.2f", soma);

        if(media > 90)
            System.out.printf("\nAluno ta de parabéns, sua nota foi %.2f", list.get(0));
        else if(media > 70)
            System.out.printf("\nAluno aprovado, sua nota foi %.2f", list.get(0));
        else if(media > 30)
            System.out.printf("\nAluno em recuperação, sua nota foi %.2f", list.get(0));
        else
            System.out.printf("\nAluno reprovado, sua nota foi %.2f", list.get(0));

    }   
}

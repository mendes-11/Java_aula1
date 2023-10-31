package com.renato_mendes.java_api;
import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;
import lombok.Getter;
import lombok.Setter;

public class Atividade3 {

        public class Pessoa{
            int idade;
            String nome;

            public Pessoa(int idade, String nome){
                this.idade = idade;
                this.nome = nome;
            }
        }

        public class Funcionario extends Pessoa{
            public int length;
            public Funcionario(int idade, String nome){
                super(idade, nome);
            }
            int RA;

        }

        public class Usuario extends Pessoa{
            public Usuario(int idade, String nome){
                super(idade, nome);
            }
            String turno;
        }

        public void pessoa(){
            Funcionario funcionario = new Funcionario(19, "Renato");
            funcionario.RA = 220;

            Usuario usuario = new Usuario(21, "Mendes");
            usuario.turno = "manhã";

            System.out.println("\nIdade do funcionario: " + funcionario.idade);
            System.out.println("Nome do funcionario: " + funcionario.nome);
            System.out.println("RA do funcionario: " + funcionario.RA);

            System.out.println("\nIdade do usuario: " + usuario.idade);
            System.out.println("Nome do usuario: " + usuario.nome);
            System.out.println("RA do usuario: " + usuario.turno);

            ArrayList<Funcionario> list = new ArrayList();
            Funcionario[] array = new Funcionario[3];

            list.add(funcionario);

            for(int i = 0; i < funcionario.length; i++){
                array[i] = funcionario;
            }    
        }

        public void list(){
            
            ArrayList<Integer> num = new ArrayList();

            Scanner ler = new Scanner(System.in);
            System.out.print("\nInforme o tamanho da lista: ");
            int N = ler.nextInt();

            for(int i = 0; i < N; i++){
                System.out.print("\nInforme um numero: ");
                num.add(ler.nextInt());
            }
            num.sort(null);
            System.out.print(num.get(N-1));
        }

        public void word(){
            
            Scanner ler = new Scanner(System.in);
            
            System.out.print("\nDigite uma frase: ");
            String frase = ler.nextLine();
            String[] palavra = frase.split(" ");

            if(palavra.length % 2 == 0)
            {
                int num = palavra.length / 2;
                System.out.print(palavra[num]  + " ");
                System.out.println(palavra[num+1]);
            }
           else
           {
                int num = palavra.length / 2;
                System.out.println(palavra[num]);
           }
        }
}

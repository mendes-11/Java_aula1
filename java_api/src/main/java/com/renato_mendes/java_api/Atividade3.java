package com.renato_mendes.java_api;

import java.util.ArrayList;

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

            ArrayList<Usuario> list = new ArrayList();



        }


    
}


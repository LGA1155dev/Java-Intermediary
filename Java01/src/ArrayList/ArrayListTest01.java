package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest01 {
    public static void main(String[] args) {
        // Array (vetor) -> com tamanho fixo de 5 posições
        String[] arrayEstatico = new String[5];
        arrayEstatico[0] = "Gabriel";
        arrayEstatico[1] = "Lucia";
        arrayEstatico[2] = "Json";
        arrayEstatico[3] = "Ines";
        arrayEstatico[4] = "Assembly NASM x86_64";

        // ArrayListTest01:

        //Sintaxe: ArrayListTest01<Tipo> nome = new ArrayListTest01<Tipo>();
        // Semelhante a criação de objeto: Classe nome = new Classe();

        java.util.ArrayList<String> arrayDinamico = new java.util.ArrayList<>();
        java.util.ArrayList<Integer> numeros = new ArrayList<Integer>();

        for (int indice = 0; indice <= 10; indice++){
            numeros.add(indice);
            System.out.println(numeros);
        }

        arrayDinamico.add("Gabriel");
        arrayDinamico.add("PHP");
        arrayDinamico.add("Python");
        arrayDinamico.add("Rust");
        arrayDinamico.add("Assembly");
        arrayDinamico.add("Java");
        arrayDinamico.add("JavaScript");
        arrayDinamico.add("C");
        arrayDinamico.add("C#");
        arrayDinamico.add("C++");
        arrayDinamico.add("Ruby");
        arrayDinamico.add("Go lang");
        arrayDinamico.add("Groovy");
        arrayDinamico.add("Kotlin");
        arrayDinamico.add("Bash");
        arrayDinamico.add("Awk");
        arrayDinamico.add("C bless");

        arrayDinamico.remove(1);

        for (int indices = 0; indices < arrayDinamico.size(); indices++){
            System.out.println("Estamos na posição: " + indices + " e no elemento: " + arrayDinamico.get(indices));
        }


        class Pessoa {
            public String name;
            public int age;

            public Pessoa() { }

            public Pessoa(String name, int age){
                this.name = name;
                this.age = age;
            }

            void main() {
                Pessoa p1 = new Pessoa("Gabriel", 15);
                Pessoa p2 = new Pessoa("Ines", 21);
                Pessoa p3 = new Pessoa("Ana", 20);

                ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
                pessoas.add(p1);
                pessoas.add(p2);
                pessoas.add(p3);

                for (Pessoa pessoa : pessoas) {
                    System.out.println("Pessoa: " + pessoa.name);
                }
            }
        }

        Pessoa pessoa = new Pessoa();
        pessoa.main();
    }
}

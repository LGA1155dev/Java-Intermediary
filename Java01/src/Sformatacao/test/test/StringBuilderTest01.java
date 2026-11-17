package Sformatacao.test.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String name = "Gabriel";
        System.out.println(name);
        String sobrenome = name.concat(" DevDojo");
        name.substring(0, 3);
        System.out.println(name);
        System.out.println(sobrenome);


        StringBuilder sb = new StringBuilder("Gabriel");
        sb.append(" DevDojo").append(" Academy");
        sb.reverse();
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);
    }
}

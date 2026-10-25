package constructor.in.java;

public class ProgrammerTest01 {
    public static void main(String[] args) {
        Programmer p = new Programmer("Ines", 15, "Java");
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getLanguage());
    }
}

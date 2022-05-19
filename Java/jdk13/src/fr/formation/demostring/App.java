package fr.formation.demostring;

public class App {
    public static void main(String[] args) {
        String json = """
            dqsdsq
                    dsq
                dsq
                dsq""";
        
        System.out.println(json);
        System.out.println("test");


        String format = String.format("démo %s", "variable");
        System.out.println(format);

        String format13 = "démo %s".formatted("variable 13");
        System.out.println(format13);
    }
}

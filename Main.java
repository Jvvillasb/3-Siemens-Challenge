public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String output = "";
            
            if (i % 3 == 0) output += "Foo";
            if (i % 5 == 0) output += "Baa";

            switch (output) {
                case "FooBaa" -> System.out.println("FooBaa");
                case "Foo" -> System.out.println("Foo");
                case "Baa" -> System.out.println("Baa");
                default -> System.out.println(i);
            }
        }
    }
}

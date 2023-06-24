public class App {
    public static void main(String[] args) throws Exception {
        Macaco macaco1 = new Macaco();
        Macaco macaco2 = new Macaco();

        macaco1.comer("maçã");
        System.out.println("Macaco1: " + macaco1.verBucho());

        macaco1.comer("pera");
        System.out.println("Macaco1: " + macaco1.verBucho());

        macaco1.comer("banana");
        System.out.println("Macaco1: " + macaco1.verBucho());

        macaco2.comer("abacaxi");
        System.out.println("Macaco2: " + macaco2.verBucho());

        macaco2.comer("copo");
        System.out.println("Macaco2: " + macaco2.verBucho());

        /*
         * macaco2.comer(macaco1.verBucho());
         * System.out.println("Macaco2: " + macaco2.verBucho());
         */
    }
}

public class Classroom {
    public static void main(String[] args) {

        Wilder thomas = new Wilder("Thomas", true);
        Wilder antoine = new Wilder("Antoine", false);
        Wilder mickael = new Wilder("Mickaël", true);
        Wilder etienne = new Wilder("Etienne", false);

        System.out.println(thomas.whoAmI());
        System.out.println(antoine.whoAmI());
        System.out.println(mickael.whoAmI());
        System.out.println(etienne.whoAmI());

    }
}

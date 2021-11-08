public class Farm {

    public static void main(String[] args) {

        Animal a = new Animal();
        print(a.eat());
        print(a.sleep());

        a.setColor("merah");
        print(a.getColor());
        a.setName("tetsuya");
        print(a.getName());
        print("Aku punya hewan bernama " + a.getName() + " dan berwarna " + a.getColor());

        Sheep c = new Sheep();
        print(c.eat());
        print(c.sleep());
        print(c.mbek());

        Cow b = new Cow();
        print(b.eat());
        print(b.sleep());
        print(b.run());

    }

    private static void print(String s) {
        System.out.println(s);
    }
}
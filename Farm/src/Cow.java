public class Cow extends Animal {

    public Cow() {
        // super();
        System.out.println("Ada sapi lahir");
    }

    @Override
    public String sleep() {
        return "A sapi tidur";
    }

    @Override
    public String eat() {
        return "A sapi makan";
    }


    public String run() {
        return "Ada sapi lari...";
    }
}
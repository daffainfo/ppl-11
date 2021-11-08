public class Sheep extends Animal {

    public Sheep() {
        super();
        System.out.println("Domba telah lahir");
    }

    @Override
    public String sleep() {
        return "Ada domba tidur...";
    }

    @Override
    public String eat() {
        return "Ada domba makan...";
    }

    public String mbek() {
        return "mbekk...";
    }

}
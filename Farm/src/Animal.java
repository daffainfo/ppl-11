public class Animal {

    private String color;
    private String name;
    private int jumlah;

    public void setColor(String c){
        color = c;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }

    public int getJumlah(){
        return jumlah;
    }

    public Animal() {
        System.out.println("Hewan baru telah lahir");
    }

    public String sleep() {
        return "Hewan tidur...";
    }
    public String eat() {
        return "Hewan makan...";
    }
}
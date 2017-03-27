/**
 * Created by Роман on 28.03.2017.
 */
public class Tree {

    static int counter = 0;
    private String name = "tree";
    private double height = 1.0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Tree(String name) {
        this.name = name;
        counter++;
    }

    public Tree(String name, double height) {

        this.name = name;
        this.height = height;
        counter++;
    }
}

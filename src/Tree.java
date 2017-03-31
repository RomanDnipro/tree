/**
 * Created by Роман on 28.03.2017.
 */
public class Tree {

    static int counter = 0;
    static final String DEFAULT_NAME =  "sprout" ;
    static final double DEFAULT_HEIGHT = 1;
    private String name;
    private double height;

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
        this(name,DEFAULT_HEIGHT);
    }

    public Tree(String name, double height) {
        this.name = name;
        this.height = height;
        counter++;
    }

    void info() {
        System.out.println("name: " + this.name + ", height: " + this.height);
    }
}

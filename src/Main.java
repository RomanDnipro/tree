public class Main {

    public static void main(String[] args) {

//        void info(Tree t){
//            System.out.println("name: " + t.getName());
//            System.out.println("height: " + t.getHeight());
//        }

        System.out.println(Tree.counter);

        Tree[] wood = new Tree[10];

        wood[0] = new Tree("oak", 1);
        wood[1] = new Tree("birch", 2);
        wood[2] = new Tree("ash", 3);
//        wood[3] = new Tree("poplar", 4);
//        wood[4] = new Tree("cedar", 5);

            for (int i = Tree.counter; i < wood.length; i++){
            wood[i] = new Tree(Tree.DEFAULT_NAME + i);
        }

        for (int i = 0; i < wood.length; i++){
            wood[i].info();
        }

        System.out.println(Tree.counter);
    }
}

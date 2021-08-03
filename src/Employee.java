public class Employee {
    private final String id;
    private final String name;
    private final int height;

    public Employee(String id, String name, int height){
        this.id = id;
        this.name = name;
        this.height = height;
    }

    public static void test(){
//        this.id = "11";
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }
}

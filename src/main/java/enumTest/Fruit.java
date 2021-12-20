package enumTest;

public enum Fruit {
    Child("0001"),
    Parent("0002"),
    Teacher("0003");

    private final String resultFruit;

    Fruit(String resultFruit) {
        this.resultFruit = resultFruit;
    }

    public String getResultFruit() {
        return resultFruit;
    }
}

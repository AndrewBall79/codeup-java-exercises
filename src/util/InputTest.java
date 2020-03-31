package util;

public class InputTest {
    public static void main(String[] args) {
    Input test1 = new Input();
    test1.getString("s");

    Input test2 = new Input();
    test2.yesNo();

    Input test3 = new Input();
    test3.getInt(1, 10, "s");

//    Input test4 = new Input();
//    test4.getInt(1, 10);

    Input test5 = new Input();
    test5.getDouble(1, 10);
    }
}

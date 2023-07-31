
interface Addable {
    int addition(int a, int b);
}

class Sum implements Addable {

    @Override
    public int addition(int a, int b) {
        // TODO Auto-generated method stub
        return a + b;
    }

}

public class LambdaParametes {
    public static void main(String[] args) {
        Addable Add = (a, b) -> (a + b);
        int result = Add.addition(10, 20);
        System.out.println(result);
    }
}

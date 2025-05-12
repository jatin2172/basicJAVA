class A {

    public static int add(int a, int b) {
        return a + b;
    }
}

public class staticmethod {

    public static void main(String[] args) {
        int res = A.add(4, 3);
        System.out.println("addition is" + res);
    }
}
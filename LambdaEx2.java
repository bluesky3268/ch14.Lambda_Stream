@FunctionalInterface
interface MyFunction {
    void myMethod(); // = public abstract void myMethod()
}

public class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction f = () -> {
        }; // 형변환
        Object obj = (MyFunction) (() -> {
        }); // Object타입 형변환 생략
        String str = ((Object) (MyFunction) (() -> {
        })).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

        System.out.println((MyFunction) (() -> {
        }));
        System.out.println(((Object) (MyFunction) (() -> {
        })).toString());
    }

}

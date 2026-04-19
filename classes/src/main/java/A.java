public class A {

    private Integer A1;
    private Float A2;

    public Integer getA1() {
        return A1;
    }

    public void setA1(Integer a1) {
        A1 = a1;
    }

    public Float getA2() {
        return A2;
    }

    public void setA2(Float a2) {
        A2 = a2;
    }

    public static void MA1() {
        System.out.println("MA1");
    }

    public static void MA2() {
        System.out.println("MA2");
    }

    public static void MA3() {
        System.out.println("Alteração a classe A partir do clone");
    }
}

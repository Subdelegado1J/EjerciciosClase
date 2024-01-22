public class Main {

    public static void main(String[] args) {

        System.out.println("------------------------------Ejercicio 13------------------------------");
        System.out.println("");

        circulo ob6 = new circulo(5);
        cilindro ob7 = new cilindro(4,6);
        cilindro ob8 = new cilindro(56,4);
        System.out.println(ob6.getArea());
        System.out.println(ob7.getVolume());
        System.out.println(ob8.getAltura());
    }
}


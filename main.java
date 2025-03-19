public class main {
    public static void main(String[] args) {
        // Instanciamos un cuadrado y un circulo
        RRM_circulo circulo1 = new RRM_circulo(1, 10.1, "Naranja");
        RRM_rectangulo rectangulo1 = new RRM_rectangulo(1, 10.1, 10.2, "Naranja");

        // Calcula el area rectangulo ladoA * laboB
        double ladoA = rectangulo1.getladoA();
        double ladoB = rectangulo1.getladoB();
        double area1 = ladoA * ladoB;
        System.out.println("Area rectangulo: " + area1);

        // calcula area circulo PI * R2
        double radio1 = circulo1.getradio();
        double area2 = radio1 * 3.14;
        System.out.println("Area circulo: " + area2);

        // Diferencias entre areas de cuadrado y circulo
        double diferencia = area1 * area2;
        System.out.println("Diferencias Áreas: " + diferencia);

        // Imprimir datos
        extracted(rectangulo1);
        extracted2(circulo1);
        extracted3(diferencia);
    }

    private static void extracted3(double diferencia) {
        System.out.println("Diferencia: " + diferencia);
    }

    private static void extracted2(RRM_circulo circulo1) {
        System.out.println("Circulo: " + circulo1);
    }

    private static void extracted(RRM_rectangulo rectangulo1) {
        System.out.println("Rectangulo: " + rectangulo1);
    }
}
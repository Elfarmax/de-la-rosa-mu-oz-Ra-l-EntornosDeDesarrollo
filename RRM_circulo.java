public class RRM_circulo {
    // Clase
    int id;
    double radio;
    String color;

    public RRM_circulo(Integer id, double radio, String color) {
        // Constructor
        this.id = id;
        this.radio = radio;
        this.color = color;
    }

    // Getter y Setter
    public Integer getid() {
        return id;
    }

    public double getradio() {
        return radio;
    }

    public String getcolor() {
        return color;
    }

    public void setid(Integer id) {
        this.id = id;
    }

    public void setradio(double radio) {
        this.radio = radio;
    }

    public void setcolor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "RRM_circulo [id=" + id + ", radio=" + radio + ", color=" + color + "]";
    }

    private static void extracted(RRM_circulo circulo1) {
    double radio1 = circulo1.getradio();
    double area2 = radio1 * 3.14;
    System.out.println("Area circulo: " + area2);
}
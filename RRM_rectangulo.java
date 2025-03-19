public class RRM_rectangulo {
    // Clase
    int id = 1;
    double ladoA = 10.1;
    double ladoB = 10.2;
    String color = "Naranja";

    public RRM_rectangulo(Integer id, double ladoA, double ladoB, String color) {
        // Constructor
        this.id = id;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.color = color;
    }

    // Getter y Setter
    public Integer getid() {
        return id;
    }

    public double getladoA() {
        return ladoA;
    }

    public double getladoB() {
        return ladoB;
    }

    public String getcolor() {
        return color;
    }

    public void setid(Integer id) {
        this.id = id;
    }

    public void setladoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public void setladoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public void setcolor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "RRM_circulo [id=" + id + ", ladoA=" + ladoA + ", ladoB=" + ladoB + ", color=" + color + "]";
    }
}
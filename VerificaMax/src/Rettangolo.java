public class Rettangolo {
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double calcolaArea() {
        return base * altezza;
    }


    public int compareTo(double altro) {
        double areaQuesto = this.calcolaArea();
        return Double.compare(areaQuesto, altro);
    }

    /**
     * we use this method to calculate the perimeter of the rectangle, it's useful to have this types of methods in classes because it shorts the amount of code that we have in the main, so the code it's more clean, and it's more useful because it's more accessible to use in every part of te code.
     *
     * @return it returns the perimeter of the rectangle that we have
     * */
    public double calcolaPerimetro() {
        return 2 * (this.base + this.altezza);
    }

    public String getInformazioni(){
        return String.format("Rettangolo: base=%.2f, altezza=%.2f, area = %.2f", this.base, this.altezza, calcolaArea());
    }
}


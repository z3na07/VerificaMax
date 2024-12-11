public class TriangoloRettangolo {
    private double base;
    private double altezza;

    public TriangoloRettangolo(double base, double altezza) {
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
        return (base * altezza) / 2;
    }


    /**
     * compareTO method that we use to compare two areas of two cubes or two triangles or anything else. but they must be the exact same type of object
     *
     * @param prova2 the area that we are going to compare
     *
     * @return 1 if the actual object's area is bigger than the other, 0 if they are the same, and -1 if it's smaller
     * */
    public int compareTo(double prova2){

        if(this.calcolaArea() > prova2){
            return 1;
        } else if (this.calcolaArea() == prova2) {
            return 0;
        }else{
            return -1;
        }

    }

    public String getInformazioni(){
        return String.format("base = %.2f, altezza = %.2f, area = %.2f", base, altezza, calcolaArea());
    }
}

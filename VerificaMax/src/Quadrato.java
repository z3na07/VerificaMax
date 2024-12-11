public class Quadrato {
    private double lato;

    public Quadrato(double lato) {
        this.lato = lato;
    }

    public double getLato() {
        return lato;
    }

    public void setLato(double lato) {
        this.lato = lato;
    }

    public double calcolaArea() {
        return lato * lato;
    }

    /**
     * compareTO method that we use to compare two areas of two cubes or two triangles or anything else. but they must be the exact same type of object
     *
     * @param area2 he area that we are going to compare
     *
     * @return 1 if the actual object's area is bigger than the other, 0 if they are the same, and -1 if it's smaller
     * */
    public int compareTo(double area2){

        if(this.calcolaArea() > area2){
            return 1;
        } else if (this.calcolaArea() == area2) {
            return 0;
        }else{
            return -1;
        }

    }

    public String getInformazioni(){
        return String.format("Quadrato: lato=%.2f, area=%.2f", lato, calcolaArea());
    }
}


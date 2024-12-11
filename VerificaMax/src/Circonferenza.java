public class Circonferenza {
    private double raggio;

    public Circonferenza(double raggio) {
        this.raggio = raggio;
    }

    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    public double calcolaArea() {
        return Math.PI * raggio * raggio;
    }

    /**
     * compareTo method that we use to compare two areas of two cubes or two triangles or anything else. but they must be the exact same type of object
     *
     * @param prova2 the second object that we are going to compare
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
}


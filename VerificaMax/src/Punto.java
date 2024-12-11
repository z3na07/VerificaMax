public class Punto {
    public double x;
    public double y;

    /**
     * the builder of the method, this is used to create a new instance of the class Punto, we create one and we don't use the default one because if we create a new istance with the default one we cannot manipulate the opbject as we want
     * */
    public Punto(double x, double y) {
            this.x = x;
            this.y = y;
    }

    /**
     * get method of the param x
     *
     * @return the param x
     * */
    public double getX() {
        return x;
    }

    /**
     * get method of the param y
     *
     * @return the param y
     * */
    public double getY() {
        return y;
    }

    /**
     * set method of the param x
     * */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * set method of the param y
     * */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Method that calculate the distance between two points
     *
     * @param altro on of the two pointd that we are gonna use
     *
     * @return it returns the distance between this two points
     * */
    public double distanzaPP(Punto altro){
        return Math.sqrt(Math.pow(altro.x - this.x, 2) + Math.pow(altro.y - this.y, 2));
    }

}

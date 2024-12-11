public class Poligono {

    public int numeroLati;
    public double lunghezzaLato;
   /**
    * the builder of the method, this is used to create a new instance of the class Poligono, we create one and we don't use the default one because if we create a new istance with the default one we cannot manipulate the opbject as we want
    * */
    public Poligono(int numeroLati, double lunghezzaLato) {
        this.numeroLati = numeroLati;
        this.lunghezzaLato = lunghezzaLato;
    }

    /**
     * get method of the param numeroLati
     *
     * @return the param numeroLati
     * */
    public int getNumeroLati() {
        return numeroLati;
    }

    /**
     * set m,ethod of the param lunghezzaLato
     * */
    public void setLunghezzaLato(double lunghezzaLato) {
        this.lunghezzaLato = lunghezzaLato;
    }

    /**
     * set m,ethod of the param numeroLati
     * */
    public void setNumeroLati(int numeroLati) {
        this.numeroLati = numeroLati;
    }

    /**
     * get method of the param lunghezzaLato
     *
     * @return the param lunghezzaLato
     * */
    public double getLunghezzaLato() {
        return lunghezzaLato;
    }

    /**
     * method that we use for calculate the perimeter of the polygon
     *
     * @return it returns the perimeter of the polygon
     * */
    public double calcolaPerimetro() {
        return this.numeroLati * this.lunghezzaLato;
    }

    @Override
    public String toString() {
        return String.format("Poligono [numeroLati = %d, lunghezzaLato = %.2f, Perimetro = %.2f]", numeroLati, lunghezzaLato, calcolaPerimetro());
    }
}

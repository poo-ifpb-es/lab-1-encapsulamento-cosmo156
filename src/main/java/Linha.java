public class Linha {
    private Ponto inicio;
    private Ponto fim;

    public Linha(Ponto inicio, Ponto fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public Ponto getInicio() {
        return inicio;
    }

    public void setInicio(Ponto inicio) {
        this.inicio = inicio;
    }

    public Ponto getFim() {
        return fim;
    }

    public void setFim(Ponto fim) {
        this.fim = fim;
    }

    public double getComprimento() {
        double dx = fim.getX() - inicio.getX();
        double dy = fim.getY() - inicio.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}

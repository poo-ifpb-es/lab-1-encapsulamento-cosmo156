public class CarroAluguel {
    private float valorPorKm;
    private float distanciaPercorrida;
    private boolean disponivel;
    private boolean sinistro;
    private float debito;

    public CarroAluguel(float valorPorKm) {
        this.valorPorKm = valorPorKm;
        this.distanciaPercorrida = 0.0f;
        this.disponivel = true;
        this.sinistro = false;
        this.debito = 0.0f;
    }
    public void setSinistro(boolean sinistro) {
        this.sinistro = sinistro;
    }
    public void setValorPorKm(float valor) {
        this.valorPorKm = valor;
    }

    public float getValorPorKm() {
        return valorPorKm;
    }

    public void setDistanciaPercorrida(float distancia) throws CarroIndisponivelException {
        if (disponivel) {
            this.distanciaPercorrida = distancia;
        } else {
            throw new CarroIndisponivelException("O carro está indisponível.");
        }
    }

    public float getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void alugar() throws CarroIndisponivelException{
        if (disponivel) {
            disponivel = false;
        } else {
            throw new CarroIndisponivelException("O carro está indisponível.");
        }
    }

    public void devolver() throws CarroNaoPagoException, CarroDisponivelException {
        if (!disponivel) {
            if (debito == 0.0f) {
                disponivel = true;
                sinistro = false;
                distanciaPercorrida = 0;
            } else {
                throw new CarroNaoPagoException("O carro não foi pago.");
            }
        } else {
            throw new CarroDisponivelException("O carro está disponível.");
        }
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public boolean hasSinistro() {
        return sinistro;
    }

    public float getDebito() {
        if (sinistro) {
            return debito + (0.6f * debito); // Adiciona 60% ao valor do débito em caso de sinistro
        } else {
            return debito;
        }
    }

    public void pagar() throws CarroDisponivelException{
        if (this.disponivel==false) {
            distanciaPercorrida = 0.0f;
            sinistro = false;
        } else {
            throw new CarroDisponivelException("O carro está disponível.");
        }
    }
}



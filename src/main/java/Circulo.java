public class Circulo {
    private float raio;
    private float pi;
    public Circulo(float raio){
       this.raio=raio;
       this.pi=3.14159f;
    }

    public float getRaio(){
        return this.raio;
    }
    public void setRaio(float raio){
        this.raio=raio;
    }
    public float getArea(){
        return (this.pi * (this.raio*this.raio));
    }
    public float getCircunferencia(){
        return ((2*this.pi)*this.raio);
    }
}

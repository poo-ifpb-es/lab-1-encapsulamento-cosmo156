public class RelogioDigital {
    private int hora;
    private int minuto;

  public RelogioDigital(){
    this.hora=12;
    this.minuto=20;
  }

    public int getHora() {
        return this.hora;

    }

    public int getMinuto() {
        
        return this.minuto;
    }
    public void tick(){
        if(this.minuto<59){
            setMinuto(this.minuto+1);
        }
        else if (this.hora<23 && this.minuto>=59){
            setMinuto(0);
            setHora(this.hora+1);

        }
        else if(this.hora>=23 && this.minuto>=59){
            setHora(0);
            setMinuto(0);
        }

        
    }
    public void setHora(int hor){
        this.hora=hor;
    }
    public void setMinuto(int min){
        this.minuto=min;
    }
}

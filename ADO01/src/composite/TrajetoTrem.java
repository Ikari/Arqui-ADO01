package composite;

/**
 *
 * @author roger
 */
public class TrajetoTrem extends Trajeto {
    
    private String linha;
    private String partida;
    private String chegada;
    private Boolean interestadual;
    
    public TrajetoTrem(int id, String linha, String partida, String chegada, Boolean interestadual) {
        this.linha = linha;
        this.partida = partida;
        this.chegada = chegada;
        this.interestadual = interestadual;
    }
    
    @Override
    public void getInfo(){
        System.out.printf("Trecho por Trem %n"
                + "Linha: %s %n"
                + "Partida: %s %n"
                + "Chegada: %s %n"
                + "É interestadual: %s %n %n",
                this.linha,
                this.partida,
                this.chegada,
                this.interestadual ? "sim" : "não");
    }   
}

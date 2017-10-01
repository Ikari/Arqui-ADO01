package composite;

/**
 *
 * @author roger
 */
public class TrajetoMetro extends Trajeto {
    
    private String linha;
    private String partida;
    private String chegada;
    private Boolean subterraneo;
    
    public TrajetoMetro(int id, String linha, String partida, String chegada, Boolean subterraneo) {
        this.linha = linha;
        this.partida = partida;
        this.chegada = chegada;
        this.subterraneo = subterraneo;
    }
    
    @Override
    public void getInfo(){
        System.out.printf("Trecho por Metrô %n"
                + "Linha: %s %n"
                + "Partida: %s %n"
                + "Chegada: %s %n"
                + "É subterrâneo: %s %n %n",
                this.linha,
                this.partida,
                this.chegada,
                this.subterraneo ? "sim" : "não");
    }
}

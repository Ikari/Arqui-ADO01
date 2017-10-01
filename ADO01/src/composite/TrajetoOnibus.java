package composite;

/**
 *
 * @author roger
 */
public class TrajetoOnibus extends Trajeto {
        
    private String linha;
    private String partida;
    private String chegada;
    private int assentos;
    
    public TrajetoOnibus(int id, String linha, String partida, String chegada, int assentos) {
        this.linha = linha;
        this.partida = partida;
        this.chegada = chegada;
        this.assentos = assentos;
    }
    
    @Override
    public void getInfo(){
        System.out.printf("Trecho por Onibus %n"
                + "Linha: %s %n"
                + "Partida: %s %n"
                + "Chegada: %s %n"
                + "Assentos disponíveis: %s %n %n",
                this.linha,
                this.partida,
                this.chegada,
                this.assentos);
    }   
}

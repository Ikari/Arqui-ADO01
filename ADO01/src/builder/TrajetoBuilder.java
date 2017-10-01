/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import composite.*;

/**
 *
 * @author roger
 */
public class TrajetoBuilder {
    enum TipoTrajeto{
        ONIBUS,
        TREM,
        METRO
    }
    
    private int id;
    
    public TrajetoBuilder(){
        this.id = 0;
    }
    
    public TrajetoBuilder(int id){
        this.id = id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
    public TrajetoOnibus gerarTrajetoOnibus(){
        return new TrajetoOnibus(id++, "723-D", "10:00", "20:00", 45);
    }
    
    public TrajetoTrem gerarTrajetoTrem(){
        return new TrajetoTrem(id++, "Esmeralda", "11:30", "12:10", false);
    }
    
    public TrajetoTrem gerarTrajetoMetro(){
        return new TrajetoTrem(id++, "Vermelha", "12:10", "12:15", true);
    }
    
    public IModal gerarTrajeto(TipoTrajeto tipo){
        switch(tipo)
        {
            case ONIBUS:
                return new TrajetoOnibus(id++, "723-D", "10:00", "11:30", 45);
            case TREM:
                return new TrajetoTrem(id++, "Esmeralda", "11:30", "12:10", false);
            case METRO:
                return new TrajetoMetro(id++, "Vermelha", "12:10", "12:15", true);
            default:
                return null;                
        }
    }
}

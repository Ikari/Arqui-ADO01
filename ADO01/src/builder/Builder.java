/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import composite.Trajeto;

/**
 *
 * @author roger
 */
public class Builder {
    public static void main(String[] args) {
        TrajetoBuilder builder = new TrajetoBuilder();
        
        Trajeto trajeto = new Trajeto();
        
        trajeto.addTrajeto(builder.gerarTrajeto(TrajetoBuilder.TipoTrajeto.ONIBUS));
        trajeto.addTrajeto(builder.gerarTrajeto(TrajetoBuilder.TipoTrajeto.TREM));
        trajeto.addTrajeto(builder.gerarTrajeto(TrajetoBuilder.TipoTrajeto.METRO));
        
        trajeto.getInfo();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author roger
 */
public class AppEnviroment {
    
    private String processador;
    private String memoria;
    private String sistemaOperacional;
    
    private static AppEnviroment instance;
    
    private AppEnviroment(){
        this.processador = "Intel Core I7";
        this.memoria = "8GB DDR3";
        this.sistemaOperacional = "Windows 10";
    }
    
    public static AppEnviroment getInstance()
    {
        if (instance == null)
            instance = new AppEnviroment();
        
        return instance;
    }
    
    public void imprimeDadosSistema(){
        System.out.printf(
                "Processador: %s %n"
               +"Memória: %s %n"
               +"Sistema Operacional: %s %n",
                this.processador,
                this.memoria,
                this.sistemaOperacional
        );
    }
}

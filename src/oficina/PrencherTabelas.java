/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficina;

import MenuContents.Faturas;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Denilson
 */
public class PrencherTabelas {
    
    public String[][] conteudo(){
        String dados[][] = {
            {"Janeiro","200000"},
            {"Fevereiro","200000"},
            {"Março","200000"},
            {"Abril","200000"},
            {"Maio","200000"},
            {"Junho","200000"},
            {"Julho","200000"},
            {"Agosto","200000"},
            {"Setembro","200000"},
            {"Outubro","200000"},
            {"Novembro","200000"},
            {"Dezembro","200000"},
            {"Denilson","2000"}
        };
        
        return dados;
    }
    
    public void preencherTabela(){
        String colunas[] = {"Mês da faturação", "Total faturado"};
        String[][] dados = conteudo(); 
        DefaultTableModel model = new DefaultTableModel (dados,colunas);
        //Faturas.jTable3.setModel(model);
    }
    
}


package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class PlanoDeSaudeDao {
    private static ArrayList<PlanoDeSaude> planoDeSaude = new ArrayList<>();
    
    public static void gravar(PlanoDeSaude e) { //CREATE
        planoDeSaude.add(e);
    }
    
    public static ArrayList<PlanoDeSaude> getPlanoDeSaudes(){ //READ
        return planoDeSaude;
    }
    
    public static PlanoDeSaude getPlanoDeSaude(Integer codigo) { // READ

        for (PlanoDeSaude e : planoDeSaude) {
            if (e.getCodigo() == codigo) {
                return e;
            }
        }
        
        return null;
      
    }
    
    public static void atualizar(PlanoDeSaude planoAtualizado) { // UPDATE
        for (PlanoDeSaude plano : planoDeSaude) {
            if (plano.getCodigo()== planoAtualizado.getCodigo()) {    
                planoDeSaude.set(planoDeSaude.indexOf(plano), planoAtualizado);
                break;
            }
        }
    }
    
    public static void excluir(Integer codigo) { // DELETE

        for (PlanoDeSaude plano : planoDeSaude) {
            if (plano.getCodigo() == codigo) {
                planoDeSaude.remove(plano);
                break;
            }
        }

    }
    
    public static void criarListaPlanos(){
        PlanoDeSaude plano1 = new PlanoDeSaude("Amil", "One 5000 Black", "067296783", LocalDate.of(2024, 12, 30));
        PlanoDeSaude plano2 = new PlanoDeSaude("Bradesco", "Nacional Flex", "343 920 297885 007", LocalDate.of(2025, 12, 30));
        PlanoDeSaude plano3 = new PlanoDeSaude("Unimed", "Master", "2 077 573690267849 2", LocalDate.of(2027, 12, 30));
        PlanoDeSaude plano4 = new PlanoDeSaude("Notre Dame", "Advance", "4534 3456 3456 2222 989 0004", LocalDate.of(2026, 12, 30));
        
        planoDeSaude.add(plano1);
        planoDeSaude.add(plano2);
        planoDeSaude.add(plano3);
        planoDeSaude.add(plano4);
    }
    
    public static DefaultTableModel getPlanoDeSaudeModel (){
        
        String[] titulos = {"CÓDIGO", "OPERADORA", "CATEGORIA", "NÚMERO", "VALIDADE"};
        String[][] dados = new String[planoDeSaude.size()] [5]; 
        //o int tem que ser fora do for
        
        int i = 0;
        
        for (PlanoDeSaude e : planoDeSaude){
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getOperadora();
            dados[i][2] = e.getCategoria();
            dados[i][3] = e.getNumero();
            dados[i][4] = e.getValidade().toString();
            i++;
        }
        
        return new DefaultTableModel(dados, titulos);
    }
    
    
    
    
    
    
    
}

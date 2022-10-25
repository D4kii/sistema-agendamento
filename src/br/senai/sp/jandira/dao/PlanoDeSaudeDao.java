
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class PlanoDeSaudeDao {
    private static ArrayList<PlanoDeSaude> planoDeSaude = new ArrayList<>();
    
    public static void gravar(PlanoDeSaude plano) { //CREATE
        planoDeSaude.add(plano);
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
        PlanoDeSaude plano1 = new PlanoDeSaude("Amil", "One 5000 Black", "067296783", "31/12/2026");
        PlanoDeSaude plano2 = new PlanoDeSaude("Bradesco", "Nacional Flex", "343 920 297885 007", "31/12/2024");
        PlanoDeSaude plano3 = new PlanoDeSaude("Unimed", "Master", "2 077 573690267849 2", "31/12/2026");
        PlanoDeSaude plano4 = new PlanoDeSaude("Notre Dame", "Advance", "4534 3456 3456 2222 989 0004", "31/12/2027");
        
        planoDeSaude.add(plano1);
        planoDeSaude.add(plano2);
        planoDeSaude.add(plano3);
        planoDeSaude.add(plano4);
    }
    
    public static DefaultTableModel getPlanoDeSaudeModel (){
        
        String[] titulos = {"CÓDIGO", "OPERADORA", "CATEGORIA", "NÚMERO", "VALIDADE"};
        String[][] dados = new String[planoDeSaude.size()] [3]; 
        //o int tem que ser fora do for
        
        int i = 0;
        
        for (PlanoDeSaude plano : planoDeSaude){
            dados[i][0] = plano.getCodigo().toString();
            dados[i][1] = plano.getOperadora();
            dados[i][2] = plano.getCategoria();
            dados[1][3] = plano.getNumero();
            dados[1][4] = plano.getValidade().toString();
            i++;
        }
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        
        return model;
    }
    
    
    
    
    
    
    
}

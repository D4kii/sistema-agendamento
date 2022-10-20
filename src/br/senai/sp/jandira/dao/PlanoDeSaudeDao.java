
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.util.ArrayList;


public class PlanoDeSaudeDao {
    private static ArrayList<PlanoDeSaude> planoDeSaude = new ArrayList<>();
    
    public static void gravar(PlanoDeSaude plano) { //CREATE
        planoDeSaude.add(plano);
    }
    
    public static ArrayList<PlanoDeSaude> getPlanoDeSaudes(){ //READ
        return planoDeSaude;
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
    
    
    
    
}

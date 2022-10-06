package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;

public class EspecialidadeDao {

    /*
    Essa classe será responsável pela persistência de dados
    das especialidades, por exemplo, adicionar uma nova especialidade
    excluir uma especialidade, etc.
     */
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    public static void gravar(Especialidade e) { // CREATE
        especialidades.add(e);
    }

    public static ArrayList<Especialidade> getEspecialidades() { // READ
        return especialidades;
    }

    public static Especialidade getEspecialidade(Integer codigo) { // READ

        for (Especialidade e : especialidades) {
            if (e.getCodigo() == codigo) {
                return e;
            }
        }
        
        return null;
      
    }
    
    public static void atualizar(Especialidade especialidadeAtualizada) { // UPDATE
        for (Especialidade e : especialidades) {
            if (e.getCodigo() == especialidadeAtualizada.getCodigo()) {
                especialidades.set(especialidades.indexOf(e), especialidadeAtualizada);
                break;
            }
        }
    }
        
    public static void excluir(Integer codigo) { // DELETE

        for (Especialidade e : especialidades) {
            if (e.getCodigo() == codigo) {
                especialidades.remove(e);
                break;
            }
        }

    }
    
    // Criar uma lista inicial de especialidades
    public static void criarListaEspecialidades() {
        Especialidade e1 = new Especialidade("Cardiologia", "Parte da medicina que cuida do coração");
        Especialidade e2 = new Especialidade("Nefrologia", "Parte da medicina que estuda doenças relacionadas ao rim");
        Especialidade e3 = new Especialidade("Otorrinolaringologia", "Parte da medicina que cuida das vias nasais");
        Especialidade e4 = new Especialidade("Fisioterapia", "Parte da medicina que cuida dos musculos e da coluna");
        
        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);
        especialidades.add(e4);
        
    }

}

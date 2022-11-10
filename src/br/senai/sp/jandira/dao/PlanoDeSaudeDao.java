
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PlanoDeSaudeDao {
    public static final String URL = "C:\\Users\\22282183\\Java\\PlanoDeSaude.txt";
    public static final Path PATH = Paths.get(URL);
    
    
    private static ArrayList<PlanoDeSaude> planoDeSaude = new ArrayList<>();
    
    public static void gravar(PlanoDeSaude e) { //CREATE
        planoDeSaude.add(e);
        
        try {
            BufferedWriter escritor;
            escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            escritor.write(e.getCodigo() + ";" + e.getOperadora() + ";" + e.getCategoria() + ";" + e.getNumero() + ";" + e.getValidade());
            escritor.newLine();
            escritor.close();
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }
        
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
        
                
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            
            String linha= leitor.readLine();
            
            while(linha != null) {
                
                // Transformar os dados da linha em uma especialidade
                String[] vetorPlano = linha.split(";");
                String[] data = vetorPlano[4].split("/");
                PlanoDeSaude e = new PlanoDeSaude(
                        vetorPlano[1],
                        vetorPlano[2],
                        vetorPlano[3], 
                        LocalDate.of(
                                Integer.parseInt(data[2]), 
                                Integer.parseInt(data[1]), 
                                Integer.parseInt(data[0])),
                        Integer.valueOf(vetorPlano[0]));
                
                    
                
                //Guardar Especialidade na lista
                planoDeSaude.add(e);
                
                //Ler a próxima linha
                linha = leitor.readLine();
            }
            leitor.close();
            
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu um erro ao ler o arquivo");
        }
        
        System.out.println(planoDeSaude.size());
        
        
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

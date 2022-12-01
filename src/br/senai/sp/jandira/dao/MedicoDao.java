package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDao {

    private final static String URL = "C:\\Users\\22282183\\Java\\Medico.txt";
    private final static String URL_TEMP = "C:\\Users\\22282183\\Java\\Medico-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<Medico> medico = new ArrayList<>();

    public static void gravar(Medico e) { //CREATE
        medico.add(e);

        try {
            BufferedWriter escritor;
            escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            escritor.write(e.getCodigo() + ";" + e.getCrm() + ";" + e.getNome() + ";" + e.getTelefone() + ";" + e.getEmail() + ";" + e.getNascimentoMedico() + ";" + e.getEspecialidades());
            escritor.newLine();
            escritor.close();
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }

    }

    public static ArrayList<Medico> getPlanoDeSaudes() { //READ
        return medico;
    }

    public static Medico getMedico(Integer codigo) { // READ

        for (Medico e : medico) {
            if (e.getCodigo().equals(codigo)) {
                return e;
            }
        }

        return null;

    }

    public static void atualizar(Medico medicoAtualixado) { // UPDATE
        for (Medico e : medico) {
            if (Objects.equals(
                    e.getCodigo(),
                    e.getCodigo())) {
                medico.set(
                        medico.indexOf(e),
                        medicoAtualixado);
                break;
            }
        }
        atualizarArquivo();
    }

    public static void excluir(Integer codigo) { // DELETE

        for (Medico e : medico) {
            if (e.getCodigo().equals(codigo)) {
                medico.remove(e);
                break;
            }
        }
        atualizarArquivo();
    }

    private static void atualizarArquivo() {

        //PASSO 01 - Criar uma representação dos arquivos que serão manipulados
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);

        try {
            //Criar o arquivo temporário
            arquivoTemp.createNewFile();

            //Abrir o arquivo temporáril para escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            for (Medico e : medico) {
                bwTemp.write(e.getMedicoSeparadoPorPontoEVirgula());
                bwTemp.newLine();
            }

            bwTemp.close();

            arquivoAtual.delete();

            arquivoTemp.renameTo(arquivoAtual);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static ArrayList<Especialidade> separarEspecialidades(String linha) {
        String[] vetor = linha.split("_");
        int codigoEsp = 5;

        ArrayList<Especialidade> especialidades = new ArrayList<>();

        while (vetor.length > codigoEsp) {
            especialidades.add(EspecialidadeDao.getEspecialidade(Integer.valueOf(vetor[codigoEsp])));
            codigoEsp++;

        }
        return especialidades;
    }

    public static void criarListaMedicos() {

        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {

                // Transformar os dados da linha em uma especialidade
                String[] vetor = linha.split(";");
                String[] data = vetor[6].split("/");
                Medico med;

                

                med = new Medico(
                        vetor[2],
                        vetor[3],
                        vetor[4],
                        vetor[1],
                        LocalDate.of(
                                Integer.parseInt(data[2]),
                                Integer.parseInt(data[1]),
                                Integer.parseInt(data[0])),
                        Integer.valueOf(vetor[0]),
                        separarEspecialidades(linha));

                //Guardar Especialidade na lista
                medico.add(med);

                //Ler a próxima linha
                linha = leitor.readLine();
            }

            leitor.close();

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(
                    null,
                    "Ocorreu um erro ao ler o arquivo");
        }

        System.out.println(medico.size());

    }

    public static DefaultTableModel getMedicoModel() {

        String[] titulos = {"CÓDIGO", "CRM", "NOME", "TELEFONE"};
        String[][] dados = new String[medico.size()][4];
        //o int tem que ser fora do for

        int i = 0;
        for (Medico e : medico) {
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getCrm();
            dados[i][2] = e.getNome();
            dados[i][3] = e.getTelefone();
            
            i++;
        }

        return new DefaultTableModel(dados, titulos);
    }
}

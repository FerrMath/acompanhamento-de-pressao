/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade4.logica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 *
 * @author ma_fe
 */
public class FormularioCSV {
    private static final String FILE_NAME = "./src/data/Formularios.csv";
    
    public static void addFormulario(Formulario f){
        // Cria a entrada que será adicionada ao CSV
        String entry = String.format(
                "%s,%s,%s,%s,%s\n",
                f.getDataStr(),
                f.getHora(),
                f.getSistolica(),
                f.getDiastolica(),
                f.isEstresseStr()
        );
        
        try {
            // Verifica a existencia do arquivo CSV
            boolean fileExists = new File(FILE_NAME).exists();
            long fileLenght = new File(FILE_NAME).length();
            FileWriter writer = new FileWriter(FILE_NAME, StandardCharsets.UTF_8, true);
            
            // Cria header se o arquivo não existir ou estiver em branco
            if (!fileExists || fileLenght == 0){
                writer.write("Data,Hora,Press Sist,Press Dias,Estresse\n");
            }
            
            // Insere a entrada no arquivo CSV
            writer.write(entry);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static ArrayList<Formulario> readFormularios(){
        ArrayList<Formulario> formularios = new ArrayList<>();
        BufferedReader reader;
        String linha;
        boolean isPrimeiraLinha = true;
        boolean fileExists = new File(FILE_NAME).exists();
        
        // Retorna ArrayList vazia se arquivo não existir
        if (!fileExists) return formularios;
        
        try {
            String[] data;
            reader = new BufferedReader(new FileReader(FILE_NAME, StandardCharsets.UTF_8));
            Formulario f;
            
            // Itera pelas linhas do arquivo CSV
            while ((linha = reader.readLine()) != null){
                
                // Ignora o header do arquivo
                if (isPrimeiraLinha){
                    isPrimeiraLinha = false;
                    continue;
                }
                
                // Formata e cria instacia de Formulario
                data = linha.split(",");
                boolean estresse = data[4].equals("Sim");
                f = new Formulario(data[0], data[1], data[2], data[3], estresse);
                formularios.add(f);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return formularios;
    }
}

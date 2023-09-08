/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade4.logica;

import java.io.File;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author ma_fe
 */
public class FormularioCSV {
    private static final String FILE_NAME = "./src/data/Formularios.csv"; 
    
    public static void addFormulario(Formulario f){
        String entry = String.format("%s,%s,%s,%s,%s\n", f.getDataStr(),f.getHora(),f.getSistolica(),f.getDiastolica(),f.isEstresseStr());
        try {
            boolean fileExists = new File(FILE_NAME).exists();
            FileWriter writer = new FileWriter(FILE_NAME, StandardCharsets.UTF_8, true);
            if (!fileExists){
                writer.write("Data,Hora,Press Sist,Press Dias,Estresse\n");
            }
            writer.write(entry);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

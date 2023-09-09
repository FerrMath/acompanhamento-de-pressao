/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade4.logica;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ma_fe
 */
public class Formulario {
    private final LocalDate data;
    private final  LocalTime hora;
    private final  int sistolica;
    private final  int diastolica;
    private final  boolean estresse;

    public Formulario(LocalDate data, LocalTime hora, int sistolica, int diastolica, boolean estresse) {
        this.data = data;
        this.hora = hora;
        this.sistolica = sistolica;
        this.diastolica = diastolica;
        this.estresse = estresse;
    }

    public Formulario(String data, String hora, String sistolica, String diastolica, boolean estresse){
        DateTimeFormatter formatData = DateTimeFormatter.ofPattern("d/MM/yyyy");
        this.data = LocalDate.parse(data, formatData);
        DateTimeFormatter formatHora = DateTimeFormatter.ofPattern("HH:mm");
        this.hora = LocalTime.parse(hora, formatHora);
        this.sistolica = Integer.parseInt(sistolica);
        this.diastolica = Integer.parseInt(diastolica);
        this.estresse = estresse;
    }
    
    public String[] getDados(){
        // Gera dados que vão ser utilizados no arquivo CSV
        String dataStr = getDataStr();
        String horaStr = getHora().toString();
        String sist = ""+getSistolica();
        String diast = ""+getDiastolica();
        String estres = isEstresseStr();
        String[] dados = {dataStr,horaStr,sist,diast,estres};

        return dados;           
    }

    public String getDataStr() {
        // Formata data para formato dd/MM/yyyy
        try {
            DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String dataStr = this.data.format(format);
            return dataStr;
        } catch (Exception e) {
            System.out.println("Ue");
        }
        return "";
    }
    
    public String isEstresseStr(){
        if (estresse){
            return "Sim";
        }
        else {
            return "Não";
        }
    }

    public LocalDate getData() {
        return data;
    }
    
    public LocalTime getHora() {
        return hora;
    }

    public int getSistolica() {
        return sistolica;
    }

    public int getDiastolica() {
        return diastolica;
    }

    public boolean isEstresse() {
        return estresse;
    }
}

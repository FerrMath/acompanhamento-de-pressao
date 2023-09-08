/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade4.logica;

import atividade4.erros.ErrorManeger;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ma_fe
 */
public class Formulario {
    private LocalDate data;
    private LocalTime hora;
    private int sistolica;
    private int diastolica;
    private boolean estresse;

    public Formulario(LocalDate data, LocalTime hora, int sistolica, int diastolica, boolean estresse) {
        this.data = data;
        this.hora = hora;
        this.sistolica = sistolica;
        this.diastolica = diastolica;
        this.estresse = estresse;
    }

    public Formulario(String data, String hora, String sistolica, String diastolica, boolean estresse){
        
        if (ErrorManeger.temCampoVazio(data,hora,sistolica,diastolica)) return;
        else if (ErrorManeger.temFormatoDeDataInvalido(data)) return;
        else if (ErrorManeger.temFormatoDeHoraInvalido(hora)) return;
        else if (ErrorManeger.temCampoIntInvalido(sistolica, diastolica)) return;
        
        DateTimeFormatter formatData = DateTimeFormatter.ofPattern("d/MM/yyyy");
        this.data = LocalDate.parse(data, formatData);
        DateTimeFormatter formatHora = DateTimeFormatter.ofPattern("HH:mm");
        this.hora = LocalTime.parse(hora, formatHora);
        this.sistolica = Integer.parseInt(sistolica);
        this.diastolica = Integer.parseInt(diastolica);
        this.estresse = estresse;
    }

    public String getDataStr() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = this.data.format(format);
        return data;
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

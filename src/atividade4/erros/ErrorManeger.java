/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade4.erros;

import java.security.InvalidParameterException;
import javax.swing.JOptionPane;
import java.util.regex.Pattern;

/**
 *
 * @author ma_fe
 */
public class ErrorManeger {
    public static boolean temCampoVazio(String... campos){
        try {
            for (String campo: campos){
                if (campo.isEmpty() || campo.isBlank()){
                    throw new EmptyInputException();
                }
            }
        } catch (EmptyInputException e) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para registrar.");
            return true;
        }
        
        return false;
    }
    
    public static boolean temCampoIntInvalido(String... campos){
        try {
            for (String campo: campos){
                if(Integer.parseInt(campo) <= 0){
                    throw new InvalidParameterException();
                }
            }
        } catch (InvalidParameterException e) {
            JOptionPane.showMessageDialog(null, "Campos de pressão invalidos, verifique os valores e tente novamente.");
            return true;
        }
        return false;
    }
    
    public static boolean temFormatoDeDataInvalido(String data){
        String pattern = "\\d{2}/\\d{2}/\\d{4}";
        try {
            if (!Pattern.matches(pattern, data)){
                throw new InputFormatException();
            }
        } catch (InputFormatException e) {
            JOptionPane.showMessageDialog(null, "Formato de data invalido, verifique o valor e tente novamente.\nEx data: 23/09/2023");
            return true;
        }
        return false;
    }
    
    public static boolean temFormatoDeHoraInvalido(String hora){
        try {
            if(!Pattern.matches("^([01]?[0-9]|2[0-3]):[0-5][0-9]$", hora)){
                throw new InputFormatException();

            }
        } catch (InputFormatException e) {
            JOptionPane.showMessageDialog(null, "Formato de hora invalido, verifique o valor e tente novamente.\nEx hora: 16:54");
            return true;
        }
        return false;
    }
}

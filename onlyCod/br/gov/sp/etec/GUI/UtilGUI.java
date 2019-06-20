package br.gov.sp.etec.GUI;

import com.sun.media.sound.InvalidDataException;

public class UtilGUI {

    public static String validaDados(String str) throws InvalidDataException {
        if (str != null && str.length() > 0) {
            return str;
        } else {
            throw new InvalidDataException("Dado obrigatório não preenchido!");
        }
    }

}

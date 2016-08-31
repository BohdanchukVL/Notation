package com.example.bohdan.notation;

/**
 * Created by Bohdan on 13.09.2015.
 */
public class Translate {
    public static String poryado, Xarakterustuka, Mantusa, Mant;
    public static double number, Mantu;
    public static long  poryadok, znak, Xarakterustuk, lowN = 0, n;
    public static double drobPart(double x){
        long res = (long) x;
        double res2 = x - res;
        return res2;
    }

    public String formFloatingPoint(String numberString){
        number = Double.parseDouble(numberString);
        if (numberString.indexOf("-") >= 0) {
            znak = 1;
            number = number * -1;
            if (number < 0.1) {
                n = 1;
                for (int t = 0; t < numberString.length(); t++) {
                    if (number < 0.1) {
                        number = number * 10;
                        lowN++;
                    }else{
                        break;
                    }
                }
            }else{
                n = 0;
            }
            numberString = String.valueOf(number);

            poryadok = (long)numberString.indexOf(".");
            poryado = numberString.substring(0, Integer.parseInt(String.valueOf(poryadok)));
            poryadok = Long.parseLong(poryado);
            poryado = Long.toBinaryString(poryadok);
            poryadok = (long)poryado.length() - 1;

            if (drobPart(number) > 0) {
                Mant = numberString.substring(0, numberString.indexOf("."));
                numberString = numberString.replace(Mant + "." , "");
                numberString = "0." + numberString;
                Mantu = Double.parseDouble(numberString);
                Mantusa = poryado.substring(1);

                for (int t = 0; t < 20; t++){
                    Mantu = Mantu * 2;
                    if (Mantu < 1){
                        Mantusa = Mantusa + "0";
                    }else {
                        Mantusa = Mantusa + "1";
                        Mantu = Mantu - 1;
                    }
                }

            } else {
                numberString = numberString.replace(".0", "");
                Mantusa = poryado.substring(1);
                Mant = Mantusa;

                for (int t = 0; t < 23 - Mant.length(); t++){
                    Mantusa = Mantusa + "0";
                }
            }

            if (n == 1){
                Xarakterustuk = 127 - lowN + 1;
                Xarakterustuka = Long.toBinaryString(Xarakterustuk);
            }else{
                Xarakterustuk = poryadok + 127;
                Xarakterustuka = Long.toBinaryString(Xarakterustuk);
            }

        } else {
            znak = 0;
            if (number < 0.1) {
                n = 1;
                for (int t = 0; t < numberString.length(); t++) {
                    if (number < 0.1) {
                        number = number * 10;
                        lowN++;
                    }else{
                        break;
                    }
                }
            }else{
                n = 0;
            }

            numberString = String.valueOf(number);

            poryadok = (long)numberString.indexOf(".");
            poryado = numberString.substring(0, Integer.parseInt(String.valueOf(poryadok)));
            poryadok = Long.parseLong(poryado);
            poryado = Long.toBinaryString(poryadok);
            poryadok = (long)poryado.length() - 1;

            if (drobPart(number) > 0) {
                Mant = numberString.substring(0, numberString.indexOf("."));
                numberString = numberString.replace(Mant + "." , "");
                numberString = "0." + numberString;
                Mantu = Double.parseDouble(numberString);
                Mantusa = poryado.substring(1);

                for (int t = 0; t < 20; t++){
                    Mantu = Mantu * 2;
                    if (Mantu < 1){
                        Mantusa = Mantusa + "0";
                    }else {
                        Mantusa = Mantusa + "1";
                        Mantu = Mantu - 1;
                    }
                }

            } else {
                numberString = numberString.replace(".0", "");
                Mantusa = poryado.substring(1);
                Mant = Mantusa;

                for (int t = 0; t < 23 - Mant.length(); t++){
                    Mantusa = Mantusa + "0";
                }
            }

            if (n == 1){
                Xarakterustuk = 127 - lowN + 1;
                Xarakterustuka = Long.toBinaryString(Xarakterustuk);
            }else{
                Xarakterustuk = poryadok + 127;
                Xarakterustuka = Long.toBinaryString(Xarakterustuk);
            }
        }
        return String.valueOf(znak) + " " + Xarakterustuka + " " + Mantusa;

    }
}
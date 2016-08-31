package com.example.bohdan.notation;

/**
 * Created by bohdanchukvl on 27.04.16.
 */
public class FromFloatingPoint {
    public double decimal(String zna, String xarak, String mantusa) {
        Integer xarak1 = Integer.parseInt(xarak, 2);
        xarak1 = xarak1 - 127;
        StringBuilder mantusa1 = new StringBuilder(mantusa);
        mantusa1.insert(xarak1, ".");
        mantusa1.insert(0, 1);
        int index = mantusa1.indexOf(".");
        String mantusaC = mantusa1.substring(0, index);
        String mantusaD = mantusa1.substring(index + 1, mantusa1.length());
        Integer mantusaC2 = Integer.parseInt(mantusaC, 2);
        double suma = 0;
        for (int c = 0; c < mantusaD.length(); c++){
            String cc = String.valueOf(mantusaD.charAt(0 + c));
            int cc1 = Integer.parseInt(cc);
            double res = cc1 * Math.pow(2, (c + 1) * -1);
            suma = suma + res;
        }
        double resultF = mantusaC2 + suma;
        if (Integer.parseInt(zna) == 1){
            resultF = resultF * -1;
        }
        return resultF;
    }
}

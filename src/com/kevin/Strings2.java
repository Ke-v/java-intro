package com.kevin;

public class Strings2 {
    public static void main(String[] args) {
        String mpesa = "NBS12MTPK Confirmed. Ksh 600000.00 sent to Tom Matata +254789541265 on 28/6/19 at 6:10PM. New M-PESA balance is Ksh 3400. Transaction cost, Ksh 15.00";
        int pos_ksh = mpesa.indexOf("Ksh");
        int pos_sent = mpesa.indexOf("sent");
        String amount = mpesa.substring(pos_ksh,pos_sent);
        System.out.println(amount);

        int pos_on = mpesa.indexOf(" on ")+4;
        int pos_at = mpesa.indexOf(" at ");
        String date =mpesa.substring(pos_on,pos_at);
        System.out.println(date);

        int pos_bal = mpesa.indexOf(" is ")+4;
        int pos_endbal = mpesa.indexOf(". Transaction");
        String balance = mpesa.substring(pos_bal,pos_endbal);
        System.out.println(balance);

    }
}

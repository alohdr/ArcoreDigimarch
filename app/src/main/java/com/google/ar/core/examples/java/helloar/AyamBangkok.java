package com.google.ar.core.examples.java.helloar;

public class AyamBangkok extends Ayam {


    @Override
    void tambahSayap(){
        jumlahsayap = jumlahsayap + 3;
    }

    @Override
    public void panggilmethod(){
        tambahSayap(5);
    }
}

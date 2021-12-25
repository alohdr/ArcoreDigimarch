package com.google.ar.core.examples.java.helloar;

public abstract class Ayam {

    int jumlahsayap;
    int kecepatan;


    void tambahSayap(){
        jumlahsayap = jumlahsayap + 1;
    }

    void tambahSayap(int sayapbaru){
        jumlahsayap = jumlahsayap + sayapbaru;
    }
    void tambahSayap(String sayapbaru){
        jumlahsayap = jumlahsayap + 1;

    }
    public abstract void panggilmethod();

    Ayam(){
        jumlahsayap = 2;
        kecepatan = 5;
    }
    Ayam(int sayapawal, int kecepatanawal){
        jumlahsayap = sayapawal;
        kecepatan = kecepatanawal;
    }
}

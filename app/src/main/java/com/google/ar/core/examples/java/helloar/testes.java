package com.google.ar.core.examples.java.helloar;

public class testes {

    void bikinAyam(){
        Ayam petok = new Ayam();
        Ayam petak = new Ayam(3,3);
        AyamBangkok sipoy = new AyamBangkok();
        sipoy.jumlahsayap = 6;
        sipoy.tambahSayap();

        Ayam petik = new Ayam(4,"babi"){

            @Override
            void tambahSayap() {
                super.tambahSayap(5);
            }
        };

        Ayam petuk = new Ayam("gsg"){
            @Override
            void tambahSayap() {
                super.tambahSayap();
            }
        };


    }
}

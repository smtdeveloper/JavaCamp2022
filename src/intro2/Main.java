package intro2;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
        String ortaMetin = "�lginizi �ekebilir";
        String altMetin = "Vade S�resi";
        System.out.println(ortaMetin);
        // integer veri tipi say�sal de�erler tutar
        int vade = 12;

        // double veri tipi ondal�kl� say�sal de�erler tutar
        double dolarDun = 18.20;
        double dolarBugun = 18.30;

        // boolean veri tipi true veya false de�erler tutar
        boolean dolarDustuMu = false;
        String okYonu = "";
        if (dolarBugun < dolarDun) {
            okYonu = "down.svg";
            System.out.println(okYonu);
        }else if(dolarBugun > dolarDun){
            okYonu = "up.svg";
            System.out.println(okYonu);
        } else {
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }

        // Array veri tipi birden fazla veriyi tutar
        String[] krediler = {"H�zl� Kredi","Maa��n� Halkban'tan Alanlar","Mutlu Emekli"};
        System.out.println(krediler[0]); // Arraylerde ilk eleman 0'dan ba�lar. Kodlamada saymaya 0'dan ba�lar.
        System.out.println(krediler[1]);
        System.out.println(krediler[2]);
        System.out.println("-----------------------------------");
        // for d�ng�s�
        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }

        System.out.println("-----------------------------------");
    }

}

/*
* Java da Main kodu �al��t�rmak i�in gerekli metottur.
* Java da her sat�r�n sonuna noktal� virg�l (;) konulur.
* System.out.println(); kodu ekrana yazd�rma i�lemi yapar.
* // Tekli yorum sat�r�
* De�i�ken tan�mlamak i�in de�i�kenin tipi ve de�i�kenin ad� yaz�l�r.
De�i�kenin tipi String, int, double, float, boolean, char, long, short, byte olabilir.
De�i�kenTipi de�i�kenAd� = de�er;
* if (ko�ul) {
    // Ko�ul sa�land���nda �al��acak kodlar
}else if(ko�ul2){
    // Ko�ul2 sa�land���nda �al��acak kodlar
} else {
    // Ko�ul sa�lanmad���nda �al��acak kodlar
}
* For D�ng�s�
* for(ba�lang��; ko�ul; art��) {
    // Ko�ul sa�land��� s�rece �al��acak kodlar
}
*  */
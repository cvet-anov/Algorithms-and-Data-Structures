package LaboratoryExercises1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class RabotnaNedela{

    int [] casovi;
    private int brNedela;
    public void setCasovi(int[] casovi) {
        this.casovi = casovi;
    }
    public RabotnaNedela(int[] casovi, int brNedela) {
        super();
        this.casovi = casovi;
        this.brNedela = brNedela;
    }
    public int EdnaNedela() {
        int vkupno=0;
        for (int i=0; i<5; i++)
            vkupno+=casovi[i];
        return vkupno;
    }
    @Override
    public String toString() {
        String out = "";
        out += EdnaNedela();
        return out;
    }
}

class Rabotnik{

    private String ime;
    private RabotnaNedela [] nedeli;

    public Rabotnik(String ime, RabotnaNedela[] nedeli) {
        super();
        this.setIme(ime);
        this.setNedeli(nedeli);
    }
    public String getIme() {
        return ime;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public void setNedeli(RabotnaNedela [] nedeli) {
        this.nedeli = nedeli;
    }
    public RabotnaNedela[] getNedeli() {
        return nedeli;
    }
    public int SumNedeli()
    {
        int vkupno=0;
        for (int i=0; i<4; i++)
        {
            vkupno+=nedeli[i].EdnaNedela();
        }
        return vkupno;
    }
    @Override
    public String toString() {
        String out=ime+"   ";
        for(int i=0; i<4; i++)
            out+=nedeli[i].toString()+"   ";
        out+=SumNedeli()+"\n";
        return out;
    }

}

public class Main {

    public static Rabotnik najvreden_rabotnik(Rabotnik [] niza)
    {
        int index=0;
        int max=0;
        for (int i=0; i<niza.length; i++)
        {
            if (niza[i].SumNedeli()>max)
            {
                max = niza[i].SumNedeli();
                index=i;
            }
        }
        return niza[index];
    }
    public static void table(Rabotnik [] niza)
    {
        String out="Rab   1   2   3   4   Vkupno\n";
        for (int i=0; i<niza.length; i++)
            out+=niza[i];
        System.out.println(out);
    }

    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        Rabotnik [] niza = new Rabotnik[n];

        for(int i=0;i<n;i++)
        {
            String ime = input.next();
            List<RabotnaNedela> nedeli = new ArrayList<RabotnaNedela>();
            for(int j=0; j<4; j++)
            {
                int [] casovi = new int[5];
                for (int k=0; k<5; k++)
                    casovi[k] = input.nextInt();

                RabotnaNedela ned = new RabotnaNedela(casovi,j+1);
                nedeli.add(ned);
            }
            niza[i] = new Rabotnik(ime, nedeli.toArray(new RabotnaNedela[nedeli.size()]));
        }

        table(niza);
        System.out.println("NAJVREDEN RABOTNIK: " +najvreden_rabotnik(niza).getIme());

    }
}



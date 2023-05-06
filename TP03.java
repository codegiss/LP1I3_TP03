import java.util.Scanner;

class Hora {
    private int hora;
    private int min;
    private int seg;

    void Hora() {
        setHor();
        setMin();
        setSeg();
    }

    void Hora(int h, int m, int s) {
        setHor(h);
        setMin(m);
        setSeg(s);
    }

    void setHor(int h) {
        this.hora = h;
    }

    void setMin(int m) {
        this.min = m;
    }

    void setSeg(int s) {
        this.seg = s;
    }

    void setHor() {
        Scanner ler = new Scanner(System.in);
        int h;

        do {
            System.out.print("Digite as horas: ");
            h = ler.nextInt();
        } while (h < 0 || h > 23);

        this.hora = h;
    }

    void setMin() {
        Scanner ler = new Scanner(System.in);
        int m;

        do {
            System.out.print("Digite os minutos: ");
            m = ler.nextInt();
        } while (m < 0 || m > 59);

        this.min = m;
    }

    void setSeg() {
        Scanner ler = new Scanner(System.in);
        int s;

        do {
            System.out.print("Digite os segundos: ");
            s = ler.nextInt();
        } while (s < 0 || s > 59);

        this.seg = s;
    }

    int getHor() {
        return hora;
    }

    int getMin() {
        return min;
    }

    int getSeg() {
        return seg;
    }

    String getHora1() {
        return getHor() + ":" + getMin() + ":" + getSeg();
    }

    String getHora2() {
        int h = getHor();
        
        if (h<=12)
            return h + ":" + getMin() + ":" + getSeg() + " AM";
        else
            return (h-12) + ":" + getMin() + ":" + getSeg() + " PM";
    }

    String getSegundos() {
        int h, m, s;

        h=getHor();
        m=getMin();
        s=getSeg();

        return h + ":" + m + ":" + s + " = " + (h*360 + m*60 + s) + " segundos.";
    }
}

public class TP03 {
    public static void main(String[] args) {
        int resp;
        Scanner ler = new Scanner(System.in);
        do {
            do {
                System.out.println("Menu:");
                System.out.println("1 - Inserir hora 1");
                System.out.println("2 - Inserir hora 2");
                System.out.println("3 - Mostrar hora formato 13:00:00");
                System.out.println("4 - Mostrar hora formato 1:00:00 PM");
                System.out.println("5 - Sair");
            resp = ler.nextInt();
            } while (resp < 1 || resp>5);

            switch (resp)
            {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        } while (resp != 5);
    }
}
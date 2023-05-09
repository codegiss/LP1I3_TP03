/*  Giselle e Miguel ADS 371
// Exercício 1: O construtor Hora() deve permitir ao usuário digitar os valores de hora, minuto e segundos e com eles inicializar os atributos da
//              classe. Os valores digitados deverão ser consistidos e só aceitos se válidos,caso contrário,exigir ao usuário redigitar;
//              O construtor Hora(int h,int m,int s)deverá receber os valores de hora,minuto e segundos e com eles inicializa as propriedades da classe;
//              Os métodos setHor(int h),setMin(int m)e setSeg(int s)devem receber um valor e atribuí-lo ao respectivo atributo; Os métodos
//              setHor(),setMin()e setSeg()devem permitir que o usuário digite um valor e atribuí-lo ao respectivo atributo. Os valores digitados
//              deverão ser consistidos e só aceitos se válidos,caso contrário,exigir ao usuário redigitar; Os métodos getHor(),getMin() e getSeg() devem
//              devolver as respectivas propriedades; O método getHora1() deve nos devolver a hora no formato:hh:mm:ss; O método getHora2() deve nos
//              devolver a hora no formato:hh:mm:ss(AM/PM); O método getSegundos()deve nos devolver a quantidade de segundos expressa na hora em questão,
//              (exemplo:01:00:01=3601 segundos). Conveniente colocar tratamento de exceção para as possíveis inconsistências na entrada de dados.
// Exercício 2: Agora, desenvolva um programa capaz de testar a classe e os métodos desenvolvidos no exercício anterior.
*/

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
        int h=-1;

        do {
            try {
                System.out.print("Digite as horas: ");
                h = ler.nextInt();
            } catch (Exception ex) {
                System.out.println("Digite apenas numeros");
                ler.nextLine();
            }
        } while (h < 0 || h > 23);

        setHor(h);
    }

    void setMin() {
        Scanner ler = new Scanner(System.in);
        int m=-1;

        do {
            try {
                System.out.print("Digite os minutos: ");
                m = ler.nextInt();
            } catch (Exception ex) {
                System.out.println("Digite apenas numeros");
                ler.nextLine();
            }
        } while (m < 0 || m > 59);

        setMin(m);
    }

    void setSeg() {
        Scanner ler = new Scanner(System.in);
        int s=-1;

        do {
            try {
                System.out.print("Digite os segundos: ");
                s = ler.nextInt();
            } catch (Exception ex) {
                System.out.println("Digite apenas numeros");
                ler.nextLine();
            }
        } while (s < 0 || s > 59);

        setSeg(s);
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
        return this.getHor() + ":" + this.getMin() + ":" + this.getSeg();
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
        Hora tp = new Hora();
        do {
            do {
                System.out.println("Menu:");
                System.out.println("1 - Inserir hora");
                System.out.println("2 - Mostrar hora formato 13:00:00");
                System.out.println("3 - Mostrar hora formato 1:00:00 PM");
                System.out.println("4 - Mostrar segundos");
                System.out.println("5 - Sair");
            resp = ler.nextInt();
            } while (resp < 1 || resp > 5);

            switch (resp)
            {
                case 1:
                    tp.Hora();
                    System.out.println("Hora gravada com sucesso.");
                    break;
                case 2:
                    System.out.println(tp.getHora1());
                    break;
                case 3:
                    System.out.println(tp.getHora2());
                    break;
                case 4:
                    System.out.println(tp.getSegundos());
                    break;
            }
        } while (resp != 5);
    }
}
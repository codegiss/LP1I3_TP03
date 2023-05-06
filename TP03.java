import java.util.Scanner;

class Hora {
    private int hora;
    void Hora() {
        Scanner ler = new Scanner(System.in);

        do{
            System.out.print("Digite a hora: ");
        } while(hora<0 || hora>23);
    }
}

public  class TP03 {
    public static void main(String[] args) {
        System.out.print("");
    }
}
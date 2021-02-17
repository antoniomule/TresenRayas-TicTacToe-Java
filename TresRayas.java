/**
 * @author antoniomule
 * @version 1.0
 * @see Casilla
 */


import java.util.Scanner;

public class TresRayas {
    private Casilla matriz[][];

    protected TresRayas(){
        this.matriz= new Casilla[3][3];

        for (int fil = 0; fil < this.matriz.length; fil++) {
            for (int col = 0; col < this.matriz[fil].length; col++) {
                matriz[fil][col] = new Casilla();
                matriz[fil][col].setOcupada(false);
            }
        }
    }


    protected void mostrarTablero(){
        System.out.println("MOSTRANDO TABLERO");
        for (int fil = 0; fil < this.matriz.length; fil++) {
            for (int col = 0; col < this.matriz[fil].length; col++) {
                if(!this.matriz[fil][col].getOcupada()){
                    System.out.print("\033[36m"+" ▢"+"\u001B[0m"+ "\t");
                }else{
                    if(this.matriz[fil][col].getCasilla() == 'X'){
                        System.out.print("\033[31m"+" X"+"\u001B[0m"+ "\t");
                    }else if(this.matriz[fil][col].getCasilla() == 'O'){
                        System.out.print(" O"+ "\t");
                    }
                }
            }
            System.out.println("");
        }
    }

    protected void AñadirX(){
        Scanner sc = new Scanner(System.in);
        int fil, col;
        do {
            System.out.print("Fila para X: ");
            fil = sc.nextInt();
        }while (fil<0 || fil>2);
        do {
            System.out.print("Columna para X: ");
            col = sc.nextInt();
        }while (col<0 || col>2);

        if(this.matriz[fil][col].getOcupada()) {
            do {
                System.out.println("No puedes añadir una X, en ésta posición, ya está ocupada");
                do {
                    System.out.print("Fila para X: ");
                    fil = sc.nextInt();
                } while (fil < 0 || fil > 2);
                do {
                    System.out.print("Columna para X: ");
                    col = sc.nextInt();
                } while (col < 0 || col > 2);
            } while (this.matriz[fil][col].getOcupada());
            this.matriz[fil][col].setCasilla('X');
            this.matriz[fil][col].setOcupada(true);
        }else{
            this.matriz[fil][col].setCasilla('X');
            this.matriz[fil][col].setOcupada(true);
        }
    }
    protected void AñadirO(){
        Scanner sc = new Scanner(System.in);
        int fil, col;
        do {
            System.out.print("Fila para O: ");
            fil = sc.nextInt();
        }while (fil<0 || fil>2);

        do {
            System.out.print("Columna para O: ");
            col = sc.nextInt();
        }while (col<0 || col>2);
        if(this.matriz[fil][col].getOcupada()){
            do{
                System.out.println("No puedes añadir una O, en ésta posición, ya está ocupada");
                do {
                    System.out.print("Fila para O: ");
                    fil = sc.nextInt();
                }while (fil<0 || fil>2);
                do {
                    System.out.print("Columna para O: ");
                    col = sc.nextInt();
                }while (col<0 || col>2);
            }while (this.matriz[fil][col].getOcupada());
            this.matriz[fil][col].setCasilla('O');
            this.matriz[fil][col].setOcupada(true);
        }else{
            this.matriz[fil][col].setCasilla('O');
            this.matriz[fil][col].setOcupada(true);
        }
    }

    protected boolean Ganador(){
                boolean fin=false;
                //FILAS
                if(this.matriz[0][0].getOcupada()  && this.matriz[0][0].getCasilla() == this.matriz[0][1].getCasilla() && this.matriz[0][0].getCasilla() == this.matriz[0][2].getCasilla()){
                    if(this.matriz[0][0].getCasilla() == 'X'){
                        System.out.println("Gana las X");
                    }else if(this.matriz[0][0].getCasilla() == 'O'){
                        System.out.println("Gana las O");

                    }
                    fin=true;
                }

                if(this.matriz[1][0].getOcupada() && this.matriz[1][0].getCasilla() == this.matriz[1][1].getCasilla() && this.matriz[1][0].getCasilla() == this.matriz[1][2].getCasilla()){
                    if(this.matriz[1][0].getCasilla() == 'X'){
                        System.out.println("Gana las X");
                    }else if(this.matriz[1][0].getCasilla() == 'O'){
                        System.out.println("Gana las O");
                    }
                    fin=true;
                }
                if(this.matriz[2][0].getOcupada() && this.matriz[2][0].getCasilla() == this.matriz[2][1].getCasilla() && this.matriz[2][0].getCasilla() == this.matriz[2][2].getCasilla()){
                    if(this.matriz[2][0].getCasilla() == 'X'){
                        System.out.println("Gana las X");
                    }else if(this.matriz[2][0].getCasilla() == 'O'){
                        System.out.println("Gana las O");
                    }
                    fin=true;

                }
                //COLUMNAS

                if(this.matriz[0][0].getOcupada() && this.matriz[0][0].getCasilla() == this.matriz[1][0].getCasilla() && this.matriz[0][0].getCasilla() == this.matriz[2][0].getCasilla()){
                    if(this.matriz[0][0].getCasilla() == 'X'){
                        System.out.println("Gana las X");
                 }else if(this.matriz[0][0].getCasilla() == 'O'){
                        System.out.println("Gana las O");
                    }
                    fin=true;
                }


                if(this.matriz[0][1].getOcupada() && this.matriz[0][1].getCasilla() == this.matriz[1][1].getCasilla() && this.matriz[0][1].getCasilla() == this.matriz[2][1].getCasilla()){
                    if(this.matriz[0][1].getCasilla() == 'X'){
                        System.out.println("Gana las X");
                    }else if(this.matriz[0][1].getCasilla() == 'O'){
                        System.out.println("Gana las O");
                    }
                    fin=true;
                }

                if(this.matriz[0][2].getOcupada() && this.matriz[0][2].getCasilla() == this.matriz[1][2].getCasilla() && this.matriz[0][2].getCasilla() == this.matriz[2][2].getCasilla()){
                    if(this.matriz[0][2].getCasilla() == 'X'){
                        System.out.println("Gana las X");
                    }else if(this.matriz[0][2].getCasilla() == 'O'){
                        System.out.println("Gana las O");
                    }
                    fin=true;

                }

                //DIAGONLES
                if(this.matriz[0][0].getOcupada() && this.matriz[0][0].getCasilla() == this.matriz[1][1].getCasilla() && this.matriz[0][0].getCasilla() == this.matriz[2][2].getCasilla()){
                    if(this.matriz[0][0].getCasilla() == 'X'){
                        System.out.println("Gana las X");
                    }else if(this.matriz[0][0].getCasilla() == 'O'){
                        System.out.println("Gana las O");
                    }
                    fin=true;
                }

                if(this.matriz[2][0].getOcupada() && this.matriz[2][0].getCasilla() == this.matriz[1][1].getCasilla() && this.matriz[2][0].getCasilla() == this.matriz[0][2].getCasilla()){
                    if(this.matriz[2][0].getCasilla() == 'X'){
                        System.out.println("Gana las X");
                 }else if(this.matriz[2][0].getCasilla() == 'O'){
                        System.out.println("Gana las O");
                    }
                    fin=true;
                }
                return fin;
            }


    public static void main(String[] args) {
        int cont=1;
        TresRayas juego1 = new TresRayas();
        juego1.mostrarTablero();

        do{
            if(cont%2==0){
                juego1.AñadirO();
                juego1.mostrarTablero();
            }else{
                juego1.AñadirX();
                juego1.mostrarTablero();
            }
            cont++;
        }while(!juego1.Ganador() && cont<10);
        if(cont==10){
            System.out.println("Lo siento no hay ningún ganador");
        }
    }
}

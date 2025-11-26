package Oxo;

public class Main {

    public static void main(String[] args) {
        Bord bord = new Bord();
        bord.generateBoard();






        bord.setTurn(0,0, 'X');
        bord.setTurn(1,1, 'O');
        bord.setTurn(2,2,'X');
        bord.setTurn(2,2,'O');
        bord.printBoard();
    }
}

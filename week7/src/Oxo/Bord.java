package Oxo;

public class Board {
    private char[][] bord;
    private final int WIDTH = 7;
    private final int HEIGHT = 7;

    public Board() {
        this.bord = new char[HEIGHT][WIDTH];
    }

    public char[][] generateBoard() {
        for (int i = 0; i < this.HEIGHT; i++) {
            for (int j = 0; j < this.WIDTH; j++) {
                this.bord[i][j] = ' ';
            }

        }
        int counter = 0;
        for (int i = 2; i < this.WIDTH;i++){
            if (i % 2 == 0){
                this.bord[0][i] = (char)('0'+counter);
                counter++;
            } else {
                this.bord[0][i] = ' ';
            }
        }

        counter = 0;
        for (int i = 2; i < this.WIDTH;i++){
            if (i % 2 == 0){
                this.bord[i][0] = (char)('0'+counter);
                counter++;
            } else {
                this.bord[i][0] = ' ';
            }
        }


        for (int i = 2; i < this.WIDTH; i++) {
            for (int j = 2; j < this.HEIGHT; j++)
                this.bord[j][i] = (i % 2 == 0) ? ' ' : '|';
        }

        for (int i = 2; i < this.HEIGHT; i++) {
            for (int j = 2; j < this.WIDTH; j++)
                if (i % 2 != 0){
                    this.bord[i][j] = (equals('|')) ? '|' : '_';
                }
        }
        return this.bord;
    }


    public void printBoard() {
        for (char[] row : this.bord) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public void setTurn(int x, int y, char symbol){
        int posX = switch (x){
            case 0 -> 2;
            case 1 -> 4;
            case 2 -> 6;
            default -> 2;
        };
        int posY = switch (y){
            case 0 -> 2;
            case 1 -> 4;
            case 2 -> 6;
            default -> 2;
        };

        if (this.bord[posX][posY] == ' '){
            this.bord[posX][posY] = symbol;
        } else {
            System.out.println("Positie is al bezet!");
        }
    }

}


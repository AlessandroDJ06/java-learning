package Beeldscherm;

public class Screen {
    private char[][] screen;
    final int MAX_WIDTH = 80;
    final int MAX_HEIGHT = 25;

    public Screen(){
        this.screen = new char[MAX_HEIGHT][MAX_WIDTH];
    }

    public void clear(){
        for (int i = 0; i < MAX_HEIGHT; i++){
            for (int j = 0; j < MAX_WIDTH ;j++){
                this.screen[i][j] = ' ';
            }
        }
    }

    public void print(){
        for (char[] row : this.screen){
            for (char element : row){
                System.out.print(element);
            }
            System.out.println();
        }
    }

    public void setCharacter(int x, int y, char character){
        if (x >= 0  && x < MAX_WIDTH || y >= 0 && y < MAX_HEIGHT){
            this.screen[y][x] = character;
        }
    }


}

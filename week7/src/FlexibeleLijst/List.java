package FlexibeleLijst;

public class List {
    private final int[] numbers;
    private int size;

    public List(int capacity) {
        this.numbers = new int[capacity];
        this.size = 0;

    }

    public boolean add(int number) {
        if (this.size >= this.numbers.length) {
            return false;
        }else {
            this.numbers[this.size] = number;
            this.size ++;
            return true;
        }
    }

    public int size() {
        return this.size;
    }

    public int get(int i) {
        return (i >= this.size)? -1:this.numbers[i];
    }

    public boolean remove(int index) {
        if (index >= this.size){
            return false;

        }else if (index == this.size-1){
            numbers[index] = 0;
            this.size--;
            return true;
        }else {
            for (int i = index ; i < this.numbers.length-1;i++) {
                this.numbers[i] = this.numbers[i+1];
            }
            this.numbers[this.numbers.length-1] = 0;
            this.size--;
            return true;
        }
    }
}


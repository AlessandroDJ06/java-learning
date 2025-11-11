package ZoekeEnTellen;

public class Numbers {
    private int[] numbers;

    public Numbers(int[] theNumbers) {
        this.numbers = theNumbers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("getallen: ");
        for (int number : this.numbers) {
            sb.append(number).append(" ");
        }
        return sb.toString();
    }

    public String numberOfTimes(int number) {
        int aantal = 0;
        for (int i : this.numbers) {
            if (i == number) {
                aantal++;
            }
        }
        return String.format("Het getal %d komt %d keer voor", number, aantal);
    }

    public boolean isPresent(int number) {
        int aantal = 0;
        for (int i : this.numbers) {
            if (i == number) {
                aantal++;
            }
        }

        return (aantal != 0);


    }
}

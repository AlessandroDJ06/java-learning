import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lottogetallen {
    private List<Integer> numbers;
    private int[] lottoNumbers;

    public Lottogetallen(){
        this.numbers = new ArrayList<>();

        for (int i = 1 ; i <= 45 ; i++){
            this.numbers.add(i);
        }

        this.lottoNumbers = new int[6];
     }

     public void generateLottoNumbers(){
         Collections.shuffle(numbers);

         for (int i = 0; i < lottoNumbers.length; i++) {
             lottoNumbers[i] = numbers.get(i);
         }
     }

     public String 


}

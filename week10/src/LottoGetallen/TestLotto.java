package LottoGetallen;

public class TestLotto {
    public static void main(String[] args) {
        Lottogetallen lottoNumbers = new Lottogetallen();
        for (int i = 0; i < 10; i++) {
            lottoNumbers.generateLottoNumbers();
            System.out.println(lottoNumbers.showLottoNumbers());
        }
    }
}

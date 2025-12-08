package Transportmiddelen;

public class Main {
    public static void main(String[] args) {
        MeansOfTransport[] meansOfTransport = new MeansOfTransport[] {
                new Bus(50), new Tram(40), new Trein(120), new Fiets(25),
                new TeVoet(5), new Step(20)
        };

        for (MeansOfTransport transport: meansOfTransport) {
            System.out.println(transport.travelDistance(11));
        }
    }
}

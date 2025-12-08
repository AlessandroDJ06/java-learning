package VirtualReality;

public class Main {
    public static void main(String[] args) {
        Entity[] entities = new Entity[8];
        entities[0] = new Room("kitchen", new double[] {0, 0, 0});
        entities[1] = new Table("kitchen table", new double[] {10, 10, 0});
        entities[2] = new Room("dining room", new double[] {100, 100, 0});
        entities[3] = new Table("dining table", new double[] { 110, 110, 0});
        entities[4] = new NonPlayableCharacter("ghost", new double[] { 20, 20, 0}, 2);
        entities[5] = new NonPlayableCharacter("monster", new double[] { 120, 120, 0}, 0);
        entities[6] = new Player("player1", new double[] { 30, 30, 0 }, 3 );
        entities[7] = new Player("player2", new double[] { 130, 130, 0 }, 1 );

        double[] position = {5,5,5};

        for(Entity entity : entities) {
            System.out.println(entity);

            if (entity instanceof Movable){
                ((Movable) entity).move(position);
            }

            if (entity instanceof Alive){
                for (int i = 0; i < 3 ; i++){
                    ((Alive) entity).kill();
                }
            }

            if (entity instanceof NonPlayableCharacter){
                ((NonPlayableCharacter) entity).animate();
            }

            if (entity instanceof Visible){
                ((Visible) entity).draw();
            }
        }




    }
}

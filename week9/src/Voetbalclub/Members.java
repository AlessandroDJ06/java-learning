package Voetbalclub;

public class Members {
    private final int MAX_CAPACITY = 100;
    private Member[] members;
    private int amount;

    public Members(){
        this.members = new Member[MAX_CAPACITY];
        this.amount = 0;
    }

    public void addMember(Member member){
        if (amount < MAX_CAPACITY){
            members[amount++] = member;
        }
    }

    public Member getMember(int index){
        return (index < amount)? members[index]:null;
    }

    public int getAmount() {
        return amount;
    }

    public int getAmountOfActiveMembers(){
        int count = 0;
        for (int i = 0; i < amount;i++){
            if (!members[i].getType().equals(MemberType.SUPPORTING)){
                count += 1;
            }
        }
        return count;
    }

    public void printActiveMembers(){
        System.out.printf("Aantal actieve leden: %d \n",getAmountOfActiveMembers());
        for (int i = 0; i < amount;i++){
            if (!members[i].getType().equals(MemberType.SUPPORTING)){
                System.out.println(members[i]);
            }
        }


    }
}

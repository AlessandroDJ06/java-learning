package Voetbalclub;

public class TestMembers {
    public static void main(String[] args) {
        Members leden = new Members();

        leden.addMember(new Member(1001, "Luka", MemberType.NORMAL));
        leden.addMember(new Member(1002, "Gevorg", MemberType.HONOURLY));
        leden.addMember(new Member(1003, "Lorenzo", MemberType.SUPPORTING));
        leden.addMember(new Member(1004, "Pavel", MemberType.NORMAL));
        leden.addMember(new Member(1005, "Sarah", MemberType.NORMAL));
        leden.addMember(new Member(1006, "Noam", MemberType.HONOURLY));

        leden.printActiveMembers();
    }
}

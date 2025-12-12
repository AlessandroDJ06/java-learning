package TodoList;

import java.time.LocalDate;

public class TestTodo {
    public static void main(String[] args) {
        TodoList list = new TodoList();

        list.addTodoItems("Boodschappen doen", 2, LocalDate.of(2025, 1, 15));
        list.addTodoItems("Sportschool", 1, LocalDate.of(2025, 1, 12));
        list.addTodoItems("Project afmaken", 3, LocalDate.of(2025, 2, 1));
        list.addTodoItems("Afspraak tandarts", 1, LocalDate.of(2025, 1, 20));
        list.addTodoItems("Hardlopen", 1, LocalDate.of(2025, 1, 10));
        list.addTodoItems("Belastingaangifte", 2, LocalDate.of(2025, 1, 18));
        list.addTodoItems("Auto wassen", 2, LocalDate.of(2025, 1, 12));
        list.addTodoItems("Studeren", 3, LocalDate.of(2025, 2, 5));
        list.addTodoItems("Verjaardagscadeau kopen", 1, LocalDate.of(2025, 1, 25));
        list.addTodoItems("Tuin opruimen", 3, LocalDate.of(2025, 1, 28));

        list.show();
    }
}

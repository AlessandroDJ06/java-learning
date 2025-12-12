package TodoList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TodoList {
    private List<TodoItem> items;

    public TodoList(){
        this.items = new ArrayList<>();
    }

    public void addTodoItems(String description, int priority, LocalDate deadline){
        TodoItem todo = new TodoItem(description,priority,deadline);
        if (items.isEmpty()){
            items.add(todo);
        } else {
            int startIndex = 0;
            int eindIndex = 0;

            while(startIndex < items.size() && items.get(startIndex).getPriority() < todo.getPriority()){
                startIndex++;
            }
            eindIndex=startIndex;

            while(eindIndex < items.size() && items.get(eindIndex).getPriority() == todo.getPriority()){
                eindIndex++;
            }

            if (eindIndex-startIndex == 0){
                items.add(startIndex,todo);
                return;
            }
            for (int i = startIndex ; i < eindIndex ; i++){
                if (items.get(i).getDeadline().isAfter(todo.getDeadline())){
                    items.add(i,todo);
                    return;
                }
            }
            items.add(eindIndex, todo);

        }
    }

    public void show(){
        for (TodoItem todo : items){
            System.out.println(todo);
        }
    }

}

import java.util.ArrayList;

//        1. As a note keeper I want to add items to my todo list.
//        2. As a note keeper I want to remove items from my todo list.
//        3. As a note keeper, I want to be able to bring back the removed items. (un remove)
//        4. As a note keeper, I want to toggle between completed and not completed.
public class ToDoList {
    static ArrayList<String> notes1 = new ArrayList<>();
    static ArrayList<String> notes2 = new ArrayList<>();
    static ArrayList<String> notes3 = new ArrayList<>();
    static ArrayList<String> toDoList = new ArrayList<>();
    static ArrayList<String> todoListCompleted = new ArrayList<>();
    static ArrayList<String> todoListNotCompleted = new ArrayList<>();


    public ArrayList<String> getItemsOfNotes1() {
        return notes1;
    }

    public void addItemsToTheTodoList(String item) {
        notes1.add(item);
    }

    public void addItemsToSecondList(String item) {
        notes2.add(item);
    }

    public void addItemsToThirdList(String item) {
        notes3.add(item);
    }

    public ArrayList<String> removeItemsFromTheTodoList(String item) {
        notes3.add(item);
        notes2.remove(item);
        return notes2;

    }

    public ArrayList<String> unRemoveItemsFromTheToDoList() {
        System.out.println(notes3);
        return notes3;
    }

    public void addBothCompletedAndUncompletedItems(String item, boolean completedItem) {
        if (completedItem) {
            todoListCompleted.add(item);
            toDoList.addAll(todoListCompleted);
        } else {
            todoListNotCompleted.add(item);
            toDoList.addAll(todoListNotCompleted);
        }
    }

    public boolean completedOrNotCompletedItemsInList(String completedOrNotCompletedItem) {
        boolean flag = false;
        for (String list : todoListCompleted) {
            if (list == completedOrNotCompletedItem) {
                flag = true;
                break;
            }
        }
        for (String list : todoListNotCompleted) {
            if (list == completedOrNotCompletedItem) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}

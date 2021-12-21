//        1. As a note keeper I want to add items to my todo list.
//        2. As a note keeper I want to remove items from my todo list.
//        3. As a note keeper, I want to be able to bring back the removed items. (un remove)
//        4. As a note keeper, I want to toggle between completed and not completed.

import java.util.ArrayList;


class ToDoLists {
    String item;
    boolean completed;

    ToDoLists(String item, boolean completed) {
        this.item = item;
        this.completed = completed;
    }
}

class Notes {
    ToDoLists task1 = new ToDoLists("Drink Water", true);
    ToDoLists task2 = new ToDoLists("Do Exercise", true);
    ToDoLists task3 = new ToDoLists("Eat Breakfast", false);
    ToDoLists task4 = new ToDoLists("Do Study", true);
    ToDoLists removedTask;
    ArrayList<ToDoLists> notes = new ArrayList<>();

    public boolean addedItemsInToDoList(ToDoLists addTask) {
        notes.add(addTask);
        return notes.contains(addTask);
    }

    public void addItems() {
        notes.add(task1);
        notes.add(task2);
        notes.add(task3);
        notes.add(task4);
    }

    public boolean removeItemFromToDoList(String item, boolean completed) {
        removedTask = new ToDoLists(item, completed);
        notes.add(removedTask);
        return notes.remove(removedTask);//returns boolean
    }

    public boolean unRemoveItemFromTheToDoList() {
        return notes.add(removedTask);
    }

    public boolean completedOrNotCompleted(ToDoLists task1) {
        return task1.completed;
    }
}



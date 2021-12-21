import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListsTest {
    Notes notes = new Notes();

    @BeforeEach
    public void addItems() {
        ToDoLists task1 = new ToDoLists("Drink Water", true);
        ToDoLists task2 = new ToDoLists("Do Exercise", true);
        ToDoLists task3 = new ToDoLists("Eat Breakfast", false);
        ToDoLists task4 = new ToDoLists("Do Study", true);
        notes.addItems();
    }

    @Nested
    class AddingItemsToToDoListTest {
        @Test
        public void checkIfTaskEatLunchIsAddedToToDoList() {
            ToDoLists addTask = new ToDoLists("Eat lunch", true);
            boolean actualTask = notes.addedItemsInToDoList(addTask);
            assertTrue(actualTask);
        }
    }

    @Nested
    class RemovingItemFromToDoListTest {
        @Test
        public void checkIfTaskDoExerciseIsRemovedFromTheToDoList() {
            boolean actualTask = notes.removeItemFromToDoList("Do Exercise", true);
            assertTrue(actualTask);
        }
    }

    @Nested
    class UnRemovingItemFromToDoListTest {
        @Test
        public void checkIfRemovedTaskIsUnRemovedFromToDoList() {
            boolean actualTask = notes.unRemoveItemFromTheToDoList();
            assertTrue(actualTask);
        }
    }

    @Nested
    class TasksCompletedOrNotCompletedTest {
        @Test
        public void checkIfTaskOneIsCompletedInToDoList() {
            boolean actualTask = notes.completedOrNotCompleted(notes.task1);
            assertTrue(actualTask);
        }

        @Test
        public void checkIfTaskThreeIsNotCompletedInToDoList() {
            boolean actualTask = notes.completedOrNotCompleted(notes.task3);
            assertFalse(actualTask);
        }
    }

}


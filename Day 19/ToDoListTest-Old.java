import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ToDoListTest {
    ToDoList toDoList = new ToDoList();

    @Nested
    public class AddItemsToToDoListTest {
        @Test
        public void checkItemsAddedToTodoList() {
            toDoList.addItemsToTheTodoList("Drinking Water");
            toDoList.addItemsToTheTodoList("Cycling");
            toDoList.addItemsToTheTodoList("Have Breakfast");
            ArrayList<String> actualNotes = toDoList.getItemsOfNotes1();
            ArrayList<String> expectedNotes = new ArrayList<>(List.of("Drinking Water", "Cycling", "Have Breakfast"));
            assertEquals(expectedNotes, actualNotes);
        }
    }

    @Nested
    public class RemoveItemsFromToDoListTest {
        @Test
        public void checkItemsRemovedFromTodoList() {
            toDoList.addItemsToSecondList("Drinking Water");
            toDoList.addItemsToSecondList("Cycling");
            toDoList.addItemsToSecondList("Have Breakfast");
            ArrayList<String> actualNotes = toDoList.removeItemsFromTheTodoList("Cycling");
            ArrayList<String> expectedNotes = new ArrayList<>(List.of("Drinking Water", "Have Breakfast"));
            assertEquals(expectedNotes, actualNotes);
        }
    }

    @Nested
    public class UnRemoveItemsFromToDoListTest {
        @Test
        public void checkIfItemUnRemovedFromToDoList() {
            toDoList.addItemsToThirdList("Drinking Water");
            toDoList.addItemsToThirdList("Cycling");
            toDoList.addItemsToThirdList("Have Breakfast");

            ArrayList<String> actualNotes = toDoList.unRemoveItemsFromTheToDoList();
            ArrayList<String> expectedNotes = new ArrayList<>(List.of("Drinking Water", "Cycling", "Have Breakfast"));
            assertEquals(expectedNotes, actualNotes);

        }
    }

    @Nested
    public class toggleBetweenCompletedAndNotCompletedTodoListTest {

        @Test
        public void checkIfItemInToDoListIsCompleted() {
            toDoList.addBothCompletedAndUncompletedItems("Drinking Water", true);
            toDoList.addBothCompletedAndUncompletedItems("Cycling", false);
            toDoList.addBothCompletedAndUncompletedItems("Have Breakfast", true);
            boolean actualList = toDoList.completedOrNotCompletedItemsInList("Drinking Water");
            assertTrue(actualList);
        }

        @Test
        public void checkIfItemInToDoListIsNotCompleted() {
            toDoList.addBothCompletedAndUncompletedItems("Drinking Water", true);
            toDoList.addBothCompletedAndUncompletedItems("Cycling", false);
            toDoList.addBothCompletedAndUncompletedItems("Have Breakfast", true);
            boolean actualList = toDoList.completedOrNotCompletedItemsInList("Cycling");
            assertFalse(actualList);
        }
    }
}
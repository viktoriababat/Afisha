import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    @Test

    public void addTest() {
        Manager manager = new Manager();
        manager.add("x");
        manager.add("y");
        manager.add("z");
        String[] expected = {"x", "y", "z"};
        Assertions.assertArrayEquals(manager.findAll(), expected);
    }

    @Test
    public void findLastTest() {
        Manager manager = new Manager();
        manager.add("x");
        manager.add("y");
        manager.add("z");
        String[] expected = {"z", "y", "x"};
        Assertions.assertArrayEquals(manager.findLast(), expected);
    }

    @Test
    public void findLastTest2() {
        Manager manager = new Manager(2);
        manager.add("x");
        manager.add("y");
        manager.add("z");
        String[] expected = {"z", "y"};
        Assertions.assertArrayEquals(manager.findLast(), expected);
    }

    @Test
    public void findLastTest3() {
        Manager manager = new Manager();
        for (int i = 0; i <= 12; ++i) {
            manager.add(i + "");
        }
        String[] expected = new String[10];
        for (int i = 12; i > 2; --i) {
            expected[12 - i] = i + "";
        }
        Assertions.assertArrayEquals(manager.findLast(), expected);
    }
}

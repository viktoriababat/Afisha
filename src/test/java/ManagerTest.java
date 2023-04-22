import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    @Test

    public void addTest() {
        Manager m = new Manager();
        m.add("x");
        m.add("y");
        m.add("z");
        String[] a = {"x", "y", "z"};
        Assertions.assertArrayEquals(m.findAll(), a);


    }

    @Test
    public void findLastTest() {
        Manager m = new Manager();
        m.add("x");
        m.add("y");
        m.add("z");
        String[] a = {"z", "y", "x"};
        Assertions.assertArrayEquals(m.findLast(), a);


    }

    @Test
    public void findLastTest2() {
        Manager m = new Manager(2);
        m.add("x");
        m.add("y");
        m.add("z");
        String[] a = {"z", "y"};
        Assertions.assertArrayEquals(m.findLast(), a);


    }

    @Test
    public void findLastTest3() {
        Manager m = new Manager();
        for (int i = 0; i <= 12; ++i) {
            m.add(i + "");
        }
        String[] a = new String[10];
        for (int i = 12; i > 2; --i) {
            a[12 - i] = i + "";
        }
        Assertions.assertArrayEquals(m.findLast(), a);


    }
}

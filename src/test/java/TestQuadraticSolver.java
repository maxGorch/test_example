import org.junit.Assert;
import org.junit.Test;
import IO_module.*;
import Math_module.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;

import static java.lang.Double.NaN;
import static org.junit.Assert.*;

public class TestQuadraticSolver {
    ArrayList<Double> arr_test = new ArrayList<>();
    QuadraticSolver solver;
    ArrayList<Double> roots;
//            1 0 1
//            2 5 -3.5
//            1 1 1
//            1 4 1
@Test
public void textWriterStreamTest1() {
    arr_test.add(1.0);
    arr_test.add(0.0);
    arr_test.add(1.0);
    solver = new QuadraticSolver(arr_test);
    roots = solver.solve();
    assertEquals(1,roots.size());
    assertTrue(roots.contains(NaN));
}
    @Test
    public void textWriterStreamTest2() {
        arr_test.add(2.0);
        arr_test.add(5.0);
        arr_test.add(-3.5);
        solver = new QuadraticSolver(arr_test);
        roots = solver.solve();
        assertEquals(2,roots.size());
        assertTrue(roots.contains(0.5700274723201295));
        assertTrue(roots.contains(-3.0700274723201293));

    }
    @Test
    public void textWriterStreamTest3() {
        arr_test.add(1.0);
        arr_test.add(1.0);
        arr_test.add(1.5);
        solver = new QuadraticSolver(arr_test);
        roots = solver.solve();
        assertEquals(1,roots.size());
        assertTrue(roots.contains(NaN));

    }
    @Test
    public void textWriterStreamTest4() {
        arr_test.add(1.0);
        arr_test.add(4.0);
        arr_test.add(1.0);
        solver = new QuadraticSolver(arr_test);
        roots = solver.solve();
        assertEquals(2,roots.size());
        assertTrue(roots.contains(-0.2679491924311228));
        assertTrue(roots.contains(-3.732050807568877));
    }
    @Test
    public void textWriterStreamTest5() {
        arr_test.add(0.0);
        arr_test.add(25.0);
        arr_test.add(5.0);
        solver = new QuadraticSolver(arr_test);
        roots = solver.solve();
        assertEquals(1,roots.size());
        assertTrue(roots.contains(-0.2));
    }

}

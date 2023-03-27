import data.Point;
import org.junit.jupiter.api.Test;
import processor.Processor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TabulationTest {
    Processor processor = new Processor();
    double start = 1;
    double finish = 2;
    double step = 0.3;
    List<Point> testPoints = new ArrayList<>(Arrays.asList(
            new Point(1,    0.95782),
            new Point(1.3,  0.36172),
            new Point(1.6,  0.41497),
            new Point(1.9,  0.46239)
    ));
    public static double eps = 1e-5;
    @Test
    void checkPointsTest() {
        for (int i = 0; i < testPoints.size(); i++) {
            assertEquals(testPoints.get(i).y(), processor.tabulating(start,finish,step).get(i).y(), eps);
        }
    }
}
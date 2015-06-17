package pika.de.wwpointswizard2.core.wwpoints;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pika.de.wwpointswizard2.core.wwpoints.simple.point.QuarterRounder;

import static org.junit.Assert.*;

/**
 * Created by pika on 17.06.15.
 */
public class WWPointTypeTest {

    @BeforeClass
    public static void setUpClass() {
        WWPointType.setPointRounder(new QuarterRounder());
    }

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testGetPointValue() throws Exception {
        double points = 2.345;
        WWPointType pointType = new WWPointType(points);
        assertEquals(2.5, pointType.getPointValue(), 0.0);
    }

    @Test
    public void testAdd() throws Exception {
        double pointA = 2.74;
        double pointB = 2.76;
        double sumPoints = 2.5 + 3.0;
        WWPointType pointTypeA = new WWPointType(pointA);
        WWPointType pointTypeB = new WWPointType(pointB);
        WWPointType sumPointTypes = pointTypeA.add(pointTypeB);
        assertEquals(sumPoints, sumPointTypes.getPointValue(), 0.0);
    }

    @Test
    public void testSub() throws Exception {
        double pointA = 4.74;
        double pointB = 2.76;
        double diffPoints = 4.5 - 3.0;
        WWPointType pointTypeA = new WWPointType(pointA);
        WWPointType pointTypeB = new WWPointType(pointB);
        WWPointType diffPointTypes = pointTypeA.sub(pointTypeB);
        assertEquals(diffPoints, diffPointTypes.getPointValue(), 0.0);
    }

    @Test
    public void testCompareTo() throws Exception {
        double pointA = 6.34;
        double pointB = 4.98;
        double pointC = pointB;
        WWPointType pointTypeA = new WWPointType(pointA);
        WWPointType pointTypeB = new WWPointType(pointB);
        WWPointType pointTypeC = new WWPointType(pointC);
        assertEquals(0, pointTypeA.compareTo(pointTypeA));
        assertEquals(0, pointTypeB.compareTo(pointTypeC));
        assertTrue(pointTypeA.compareTo(pointTypeB) > 0);
        assertTrue(pointTypeB.compareTo(pointTypeA) < 0);
    }

    @Test
    public void testEquals() throws Exception {
        double pointA = 8.64;
        WWPointType pointTypeA = new WWPointType(pointA);
        WWPointType pointTypeB = new WWPointType(pointA);
        assertFalse(pointTypeA.equals(null));
        assertFalse(pointTypeA.equals(new Object()));
        assertTrue(pointTypeA.equals(pointTypeA));
        assertTrue(pointTypeA.equals(pointTypeB));
    }
}
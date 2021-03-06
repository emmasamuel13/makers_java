/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ten_minute_walk;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TenMinuteWalkTest {
    @Test public void RouteOneIsATenMinuteWalk() {
        TenMinuteWalk TenMinute = new TenMinuteWalk();
        String[] route = {"w", "s", "e", "e", "n", "n", "e", "s", "w", "w"};
        assertTrue("this does take 10 minutes and returns you to the start", TenMinute.IsItTenMinutes(route));
    }

    @Test public void RouteTwoIsNotTenMinuteWalk() {
        TenMinuteWalk TenMinute = new TenMinuteWalk();
        String[] route = {"w", "s", "e", "n", "n", "e", "s", "w", "w", "w"};
        assertFalse("this doesn't return you to your start point", TenMinute.IsItTenMinutes(route));
    }

    @Test public void RouteThreeIsNotTenMinuteWalk() {
        TenMinuteWalk TenMinute = new TenMinuteWalk();
        String[] route = {"w", "s", "e", "s", "s", "e", "s", "w", "n", "n"};
        assertFalse("this doesn't return you to your start point", TenMinute.IsItTenMinutes(route));
    }

    @Test public void RouteFourIsNotTenMinuteWalk() {
        TenMinuteWalk TenMinute = new TenMinuteWalk();
        String[] route = {"w", "s"};
        assertFalse("this takes less than 10 minutes", TenMinute.IsItTenMinutes(route));
    }

    @Test public void RouteFiveIsNotTenMinuteWalk() {
        TenMinuteWalk TenMinute = new TenMinuteWalk();
        String[] route = {"n", "e", "s", "w"};
        assertFalse("this takes less than 10 minutes", TenMinute.IsItTenMinutes(route));
    }

    @Test public void RouteSixIsATenMinuteWalk() {
        TenMinuteWalk TenMinute = new TenMinuteWalk();
        String[] route = {"n", "e", "s", "w", "n", "e", "s", "w", "n", "s"};
        assertTrue("this does take 10 minutes and returns you to the start", TenMinute.IsItTenMinutes(route));
    }

    @Test public void RouteSevenIsNotATenMinuteWalk() {
        TenMinuteWalk TenMinute = new TenMinuteWalk();
        String[] route = {"n", "e", "s", "w", "n", "e", "s", "w", "n", "s", "n", "e", "s", "w", "n", "e", "s", "w", "n", "s"};
        assertFalse("this takes longer than 10 minutes", TenMinute.IsItTenMinutes(route));
    }
}

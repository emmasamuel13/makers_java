/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package leap_years;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

public class LeapYearsTest {
    @Test public void is2000LeapYear() {
        LeapYears year = new LeapYears();
        assertTrue("2000 is a leap year", year.check_leap(2000));
    }

    @Test public void is1970LeapYear() {
        LeapYears year = new LeapYears();
        assertFalse("1970 is a leap year", year.check_leap(1970));
    }

    @Test public void is1900LeapYear() {
        LeapYears year = new LeapYears();
        assertFalse("1900 is a leap year", year.check_leap(1900));
    }

    @Test public void is1988LeapYear() {
        LeapYears year = new LeapYears();
        assertTrue("1988 is a leap year", year.check_leap(1988));
    }

    @Test public void is1500LeapYear() {
        LeapYears year = new LeapYears();
        assertFalse("1500 is a leap year", year.check_leap(1500));
    }

    @Test public void arrayFrom1920To1940() {
        LeapYears years = new LeapYears();
        ArrayList<Integer> year_list = new ArrayList<Integer>();
        year_list.add(1920);
        year_list.add(1924);
        year_list.add(1928);
        year_list.add(1932);
        year_list.add(1936);
        year_list.add(1940);
        assertEquals(year_list, years.leap_list(1920, 1940));
    }
}

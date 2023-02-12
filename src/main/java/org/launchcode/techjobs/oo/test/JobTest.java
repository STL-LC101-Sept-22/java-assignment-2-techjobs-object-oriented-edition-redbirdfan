package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.Job;
import static org.junit.Assert.*;


/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)

public class JobTest {

    @Test
    public void testSettingJobId() {
        Job job1 = new Job("cashier", "McDonalds", "St. Louis", "Part-Time", "Basic Math");
        Job job2 = new Job("Waitress", "Gino's", "Affton", "30-40 hours", "Customer Service");
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job1 = new Job("Product Tester", "ACME", "Desert", "Quality Control", "Persistence");
        assertEquals(job1.getName(), "Product Tester");
        assertEquals(job1.getEmployer(), "ACME");
        assertEquals(job1.getLocation(), "Desert");
        assertEquals(job1.getPositionType(), "Quality Control");
        assertEquals(job1.getCoreCompetency(), "Persistence");
        assertTrue(job1.getId() == 1);
        assertTrue(job1.getName() == "Product Tester");
        assertTrue(job1.getEmployer() == "ACME");
        assertTrue(job1.getLocation() == "Desert");
        assertTrue(job1.getPositionType() == "Quality Control");
        assertTrue(job1.getCoreCompetency() == "Persistence");


    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("cashier", "McDonalds", "St. Louis", "Part-Time", "Basic Math");
        Job job2 = new Job("cashier", "McDonalds", "St. Louis", "Part-Time", "Basic Math");
        ;
        assertFalse(job1.getId() == job2.getId());
    }

    @Test

    public void testToStringStartsAndEndsWithNewLine() {
        Job job1 = new Job("Web Developer", "LaunchCode", "StL", "Back-end developer", "Java");
        String test = job1.toString();
        String testBuild = "\n";
        assertEquals(test.indexOf('\n'), 0);
        assertEquals(test.endsWith(testBuild), true);
    }

    @Test

    public void testToStringContainsCorrectLabelsAndData() {
        Job job1 = new Job("cashier", "McDonalds", "St. Louis", "Part-Time", "Basic Math");

        assertEquals(job1.getId(), 1);
        assertEquals(job1.getName(), "cashier");
        assertEquals(job1.getEmployer(), "McDonalds");
        assertEquals(job1.getLocation(), "St. Louis");
        assertEquals(job1.getPositionType(), "Part-Time");
        assertEquals(job1.getCoreCompetency(), "Basic Math");
    }

   @Test
    public void testToStringHandlesEmptyField() {
       Job job1 = new Job("", "", "St. Louis", "Part-Time", "");
       String test = job1.toString();
       String testString = "Data not available";
       System.out.println(job1.toString());
    //   assertTrue((job1.toString().contains("Data not available")));
    assertEquals(job1.coreCompetency, "Data not available" );
   }
}
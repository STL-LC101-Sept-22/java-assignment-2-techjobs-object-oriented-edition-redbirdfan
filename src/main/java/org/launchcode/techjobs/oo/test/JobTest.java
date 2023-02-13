package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;


/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)

public class JobTest {

   @Test
    public void testSettingJobId() {
        Job job1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Waitress", new Employer("Gino's"), new Location("Affton"), new PositionType("30-40 hours"), new CoreCompetency("Customer Service"));
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertEquals(job1.getName(), "Product Tester");
        assertEquals(job1.getEmployer().getValue(), "ACME" );
        assertEquals(job1.getCoreCompetency().getValue(), "Persistence");
        assertEquals(job1.getPositionType().getValue(), "Quality Control");
        assertEquals(job1.getLocation().getValue(), "Desert");
        assertTrue(job1.getId()== 1);
        assertTrue(job1.getName() == "Product Tester");
        assertTrue(job1.getEmployer().getValue() == "ACME");
        assertTrue(job1.getCoreCompetency().getValue() == "Persistence");
        assertTrue(job1.getLocation().getValue() == "Desert");
    }

   @Test
    public void testJobsForEquality() {
        Job job1 = new Job("cashier", new Employer("McDonalds"), new Location("St. Louis"), new PositionType("Part-Time"), new CoreCompetency("Basic Math"));
        Job job2 = new Job("cashier", new Employer("McDonalds"), new Location("St. Louis"), new PositionType("Part-Time"), new CoreCompetency("Basic Math"));
        ;
        assertFalse(job1.getId() == job2.getId());
    }

   @Test

    public void testToStringStartsAndEndsWithNewLine() {
        Job job1 = new Job("Web Developer",  new Employer("LaunchCode"), new Location("StL"), new PositionType("Back-end developer"), new CoreCompetency("Java"));
        String test = job1.toString();
        String testBuild = "\n";
        assertEquals(test.indexOf('\n'), 0);
        assertEquals(test.endsWith(testBuild), true);
    }

    @Test

    public void testToStringContainsCorrectLabelsAndData() {
        Job job1 = new Job("cashier", new Employer("McDonalds"), new Location("St. Louis"), new PositionType("Part-Time"), new CoreCompetency("Basic Math"));

        assertEquals(job1.getId(), 1);
        assertEquals(job1.getName(), "cashier");
        assertEquals(job1.getEmployer(), "McDonalds");
        assertEquals(job1.getLocation(), "St. Louis");
        assertEquals(job1.getPositionType(), "Part-Time");
        assertEquals(job1.getCoreCompetency().getValue(), "Basic Math");
    }

   @Test
    public void testToStringHandlesEmptyField() {
       Job job1 = new Job("", new Employer(""), new Location("St. Louis"), new PositionType("Part-Time"), new CoreCompetency(""));

       String testString = job1.toString();
       System.out.println(testString);
       assertTrue(job1.getName() == "Data not available");
     //  assertEquals(job1.getCoreCompetency(), "Data not available");
   }
}
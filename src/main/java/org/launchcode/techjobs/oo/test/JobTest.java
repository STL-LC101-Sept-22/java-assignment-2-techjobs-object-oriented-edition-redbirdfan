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
        Job job1 = new Job("Product Tester", "ACME", "Desert", "Quality Control", "Persistance");
        assertEquals(job1.getName(), "Product Tester");
        assertEquals(job1.getEmployer(), "ACME");
        assertEquals(job1.getLocation(), "Desert");
        assertEquals(job1.getPositionType(), "Quality Control");
        assertEquals(job1.getCoreCompetency(), "Persistance");
        assertTrue(job1.getId() == 1);
        assertTrue(job1.getName() == "Product Tester");
        assertTrue(job1.getEmployer() == "ACME");
        assertTrue(job1.getLocation() == "Desert");
        assertTrue(job1.getPositionType() == "Quality Control");
        assertTrue(job1.getCoreCompetency() == "Persistance");


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
        assertTrue(job1.toString().startsWith(testBuild));
        assertTrue(job1.toString().endsWith(testBuild));
    }

    @Test

    public void testToStringContainsCorrectLabelsAndData() {
        Job job1 = new Job("cashier", "McDonalds", "St. Louis", "Part-Time", "Basic Math");
        assertTrue(job1.toString().contains("Name: " + job1.getName()));
        assertTrue(job1.toString().contains("ID: " + job1.getId()));
        assertTrue(job1.toString().contains("Employer: " + job1.getEmployer()));
        assertTrue(job1.toString().contains("Location: " + job1.getLocation()));
        assertTrue(job1.toString().contains("Position Type: " + job1.getPositionType()));
        assertTrue(job1.toString().contains("Core Competency: " + job1.getCoreCompetency()));
        assertFalse(job1.toString().contains("Name: " + job1.getId()));
    }

   @Test
    public void testToStringHandlesEmptyField() {
       Job job1 = new Job("cashier", "McDonalds", "St. Louis", "Part-Time", "");
       String test = job1.getCoreCompetency();
       test = "Data not available";
       assertTrue((job1.toString().contains("Data not available")));

   }
}
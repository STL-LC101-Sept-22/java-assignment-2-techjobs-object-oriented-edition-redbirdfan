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
// Id is not changing, test should not pass
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job job1 = new Job("Product Tester", "ACME", "Desert", "Quality Control", "Persistance");
        assertTrue(job1.getName() =="Product Tester");
        assertTrue(job1.getEmployer() == "ACME");
        assertTrue(job1.getLocation() == "Desert");
        assertTrue(job1.getPositionType() == "Quality Control");
        assertTrue(job1.getCoreCompetency() == "Persistance");

    }

    @Test
    public void testJobsForEquality(){
        Job job1 = new Job("cashier", "McDonalds", "St. Louis", "Part-Time", "Basic Math");
        Job job2 = new Job("cashier", "McDonalds", "St. Louis", "Part-Time", "Basic Math");;
        assertFalse(job1 == job2);


    }


}

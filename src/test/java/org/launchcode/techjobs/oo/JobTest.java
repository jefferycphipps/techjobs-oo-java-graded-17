package org.launchcode.techjobs.oo;

import org.junit.Assert;
import org.junit.Test;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId(){
        Job firstJob = new Job();
        Job secondJob = new Job();
        assertNotEquals(firstJob.getId(),secondJob.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob.getName() instanceof String);
        assertTrue(testJob.getEmployer() instanceof Employer);
        assertTrue(testJob.getLocation() instanceof Location);
        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Product tester", testJob.getName());
        assertEquals("ACME", testJob.getEmployer().getValue());
        assertEquals("Desert", testJob.getLocation().getValue());
        assertEquals("Quality control", testJob.getPositionType().getValue());
        assertEquals("Persistence", testJob.getCoreCompetency().getValue());

    }
    @Test
    public void testJobsForEquality(){
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(testJob1,testJob2);
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String newlineStart = String.valueOf(testJob1.toString().charAt(0));
        String newlineEnd = String.valueOf(testJob1.toString().charAt(testJob1.toString().length()-1));
        assertEquals(newlineStart, System.lineSeparator());
        assertEquals(newlineEnd, System.lineSeparator());
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expected = System.lineSeparator() +
                "ID: " + testJob.getId() + System.lineSeparator() +
                "Name: Product tester" + System.lineSeparator() +
                "Employer: ACME" + System.lineSeparator() +
                "Location: Desert" + System.lineSeparator() +
                "Position Type: Quality control" + System.lineSeparator() +
                "Core Competency: Persistence" + System.lineSeparator();
        assertEquals(expected, testJob.toString());
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job testJob = new Job("Product tester", new Employer(), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expected = System.lineSeparator() +
                "ID: " + testJob.getId() + System.lineSeparator() +
                "Name: Product tester" + System.lineSeparator() +
                "Employer: Data not available" + System.lineSeparator() +
                "Location: Desert" + System.lineSeparator() +
                "Position Type: Quality control" + System.lineSeparator() +
                "Core Competency: Persistence" + System.lineSeparator();
        assertEquals(expected, testJob.toString());
    }

    //@Test
    /*public void testToStringHandlesEmptyField(){
        Job testJob = new Job("Product tester", new Employer(), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expected = System.lineSeparator() +
                "OOPS! This job does not seem to exist" + System.lineSeparator();
        assertEquals(expected, testJob.toString());


    }*/

}

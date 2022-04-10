package com.bytelegend.encapsulation;

import com.github.blindpirate.extensions.CaptureSystemOutput;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class UtilsTest {
    private List<Person> testPersons =
            Arrays.asList(
                    new Person("Alice", 18_000),
                    new Person("Bob", 15_000),
                    new Person("Charlie", 19_000));

    @Test
    @CaptureSystemOutput
    public void testFilterPeopleWithSalaryMoreThan(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(Matchers.containsString("Alice's salary is accessed:"));
        capture.expect(Matchers.containsString("Bob's salary is accessed:"));
        capture.expect(Matchers.containsString("Charlie's salary is accessed:"));
        Assertions.assertEquals(
                Arrays.asList("Alice", "Charlie"),
                Utils.filterPeopleWithSalaryMoreThan1(testPersons, 16_000).stream()
                        .map(Person::getName)
                        .collect(java.util.stream.Collectors.toList()));
        Assertions.assertEquals(
                Arrays.asList("Alice", "Charlie"),
                Utils.filterPeopleWithSalaryMoreThan2(testPersons, 16_000).stream()
                        .map(Person::getName)
                        .collect(java.util.stream.Collectors.toList()));
    }

    @Test
    @CaptureSystemOutput
    public void testGetNameToSalaryMap(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(Matchers.containsString("Alice's salary is accessed:"));
        capture.expect(Matchers.containsString("Bob's salary is accessed:"));
        capture.expect(Matchers.containsString("Charlie's salary is accessed:"));
        Assertions.assertEquals(
                new HashSet<>(Arrays.asList("Alice", "Bob", "Charlie")),
                Utils.getNameToSalaryMap1(testPersons).keySet());
        Assertions.assertEquals(
                new HashSet<>(Arrays.asList("Alice", "Bob", "Charlie")),
                Utils.getNameToSalaryMap2(testPersons).keySet());
    }
}

package com.bytelegend.encapsulation;

import com.bytelegend.*;

/**
 * `Person` class has a `salary` field, since salary is usually sensitive information, we want any
 * code that accesses `salary` field to be recorded in the log for audit later.
 *
 * <p>Please use `Logger.logAccessToSalaryOfPerson()` to record a log whenever you access `salary`
 * field of `Person` class, for example:
 *
 * <p>``` int salary = person.salary; Logger.logAccessToSalaryOfPerson(person.name); ```
 *
 * <p>For the code without encapsulation, we need to add logs to all the places that access `salary`
 * field. For the code with encapsulation, we only need to change the implementation of
 * `getSalary()` method - nothing else needs to be changed.
 */
public class Person {
    /** The person's name. */
    private final String name;
    /** The person's salary. */
    private final int salary;

    public Person(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        Logger.logAccessToSalaryOfPerson(name);
        return salary;
    }
}

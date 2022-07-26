package com.bytelegend.noencapsulation;

import com.bytelegend.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Utils {
    public static List<Person> filterPeopleWithSalaryMoreThan1(List<Person> people, int salary) {
        Logger.logAccessToSalaryOfPerson(Person.class.getName());
        return people.stream().filter(p -> {
            Logger.logAccessToSalaryOfPerson(p.name);
            return p.salary > salary;
        }).collect(Collectors.toList());
    }

    public static List<Person> filterPeopleWithSalaryMoreThan2(List<Person> people, int salary) {
        List<Person> list = new ArrayList<>();
        Logger.logAccessToSalaryOfPerson(Person.class.getName());
        for (Person p : people) {
            Logger.logAccessToSalaryOfPerson(p.name);
            if (p.salary > salary) {
                list.add(p);
            }
        }
        return list;
    }

    public static Map<String, Integer> getNameToSalaryMap1(List<Person> people) {
        Logger.logAccessToSalaryOfPerson(Person.class.getName());
        return people.stream().collect(Collectors.toMap(p -> p.name, p -> {
            Logger.logAccessToSalaryOfPerson(p.name);
            return p.salary;
        }));
    }

    public static Map<String, Integer> getNameToSalaryMap2(List<Person> people) {
        Map<String, Integer> map = new HashMap<>();
        Logger.logAccessToSalaryOfPerson(Person.class.getName());
        for (Person p : people) {
            Logger.logAccessToSalaryOfPerson(p.name);
            map.put(p.name, p.salary);
            Logger.logAccessToSalaryOfPerson(Person.class.getName());
        }
        return map;
    }
}

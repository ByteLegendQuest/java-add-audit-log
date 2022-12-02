package com.bytelegend.encapsulation;

import com.bytelegend.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Utils {
    public static List<Person> filterPeopleWithSalaryMoreThan1(List<Person> people, int salary) {
        return people.stream().filter(p -> {
           Logger.logAccessToSalaryOfPerson(p.getName());
           return p.getSalary() > salary;
        }).collect(Collectors.toList());
    }

    public static List<Person> filterPeopleWithSalaryMoreThan2(List<Person> people, int salary) {
        List<Person> list = new ArrayList<>();
        for (Person p : people) {
            if (p.getSalary() > salary) {
                Logger.logAccessToSalaryOfPerson(p.getName());
                list.add(p);
            }
        }
        return list;
    }

    public static Map<String, Integer> getNameToSalaryMap1(List<Person> people) {
        people.stream().forEach((p)->Logger.logAccessToSalaryOfPerson(p.getName()));
        return people.stream().collect(Collectors.toMap(Person::getName, Person::getSalary));
    }

    public static Map<String, Integer> getNameToSalaryMap2(List<Person> people) {
        Map<String, Integer> map = new HashMap<>();
        for (Person p : people) {
            Logger.logAccessToSalaryOfPerson(p.getName());
            map.put(p.getName(), p.getSalary());
        }
        return map;
    }
}

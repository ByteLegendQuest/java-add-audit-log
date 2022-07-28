package com.bytelegend.noencapsulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import com.bytelegend.Logger;

public class Utils {
    public static List<Person> filterPeopleWithSalaryMoreThan1(List<Person> people, int salary) {
        return people.stream().filter(p -> {
            int slr = p.salary;
            Logger.logAccessToSalaryOfPerson(p.name);
            return slr > salary;
        }).collect(Collectors.toList());
    }

    public static List<Person> filterPeopleWithSalaryMoreThan2(List<Person> people, int salary) {
        List<Person> list = new ArrayList<>();
        for (Person p : people) {
            int slr = p.salary;
            Logger.logAccessToSalaryOfPerson(p.name);
            if (slr > salary) {
                list.add(p);
            }
        }
        return list;
    }

    public static Map<String, Integer> getNameToSalaryMap1(List<Person> people) {
        return people.stream().collect(Collectors.toMap(p -> p.name, p -> {
            int slr = p.salary;
            Logger.logAccessToSalaryOfPerson(p.name);
            return slr;
        }));
    }

    public static Map<String, Integer> getNameToSalaryMap2(List<Person> people) {
        Map<String, Integer> map = new HashMap<>();
        for (Person p : people) {
            int slr = p.salary;
            Logger.logAccessToSalaryOfPerson(p.name);
            map.put(p.name, slr);
        }
        return map;
    }
}

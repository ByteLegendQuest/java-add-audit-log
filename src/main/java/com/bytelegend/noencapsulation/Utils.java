package com.bytelegend.noencapsulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import com.bytelegend.Logger;

public class Utils {
    public static List<Person> filterPeopleWithSalaryMoreThan1(List<Person> people, int salary) {
        List<Person> per = people.stream().filter(p -> p.salary > salary).collect(Collectors.toList());
        per.forEach(p -> Logger.logAccessToSalaryOfPerson(p.name));
        return per;
    }

    public static List<Person> filterPeopleWithSalaryMoreThan2(List<Person> people, int salary) {
        List<Person> list = new ArrayList<>();
        for (Person p : people) { 
            if (p.salary > salary) {
                list.add(p);
                Logger.logAccessToSalaryOfPerson(p.name);
            }
        }
        return list;
    }

    public static Map<String, Integer> getNameToSalaryMap1(List<Person> people) {
        Map<String,Integer> per = people.stream().collect(Collectors.toMap(p -> p.name, p -> p.salary));
        per.forEach(p -> Logger.logAccessToSalaryOfPerson(p));
        return per;
    }

    public static Map<String, Integer> getNameToSalaryMap2(List<Person> people) {
        Map<String, Integer> map = new HashMap<>();
        for (Person p : people) {
            map.put(p.name, p.salary);
            Logger.logAccessToSalaryOfPerson(p.name);
        }
        return map;
    }
}

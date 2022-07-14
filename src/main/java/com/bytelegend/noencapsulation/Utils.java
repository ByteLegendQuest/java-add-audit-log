package com.bytelegend.noencapsulation;
import com.bytelegend.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Utils {
    public static List<Person> filterPeopleWithSalaryMoreThan1(List<Person> people, int salary) {
        for(Person p : people) {
            Logger.logAccessToSalaryOfPerson(p.name);
        }
        return people.stream().filter(p -> p.salary > salary).collect(Collectors.toList());
    }

    public static List<Person> filterPeopleWithSalaryMoreThan2(List<Person> people, int salary) {
        List<Person> list = new ArrayList<>();
        for (Person p : people) {
            if (p.salary > salary) {
                Logger.logAccessToSalaryOfPerson(p.name);
                list.add(p);
            }
        }
        return list;
    }

    public static Map<String, Integer> getNameToSalaryMap1(List<Person> people) {
        for(Person p : people) {
            Logger.logAccessToSalaryOfPerson(p.name);
        }
        return people.stream().collect(Collectors.toMap(p -> p.name, p -> p.salary));
    }

    public static Map<String, Integer> getNameToSalaryMap2(List<Person> people) {
        Map<String, Integer> map = new HashMap<>();
        for (Person p : people) {
            Logger.logAccessToSalaryOfPerson(p.name);
            map.put(p.name, p.salary);
        }
        return map;
    }
}

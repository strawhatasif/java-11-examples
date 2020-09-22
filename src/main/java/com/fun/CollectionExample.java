package com.fun;

import java.util.*;

public class CollectionExample {

    public static void main(String[] args) {
        unmodifiableSetExample();
        unmodifiableMapExample();
    }

    private static void unmodifiableSetExample() {
        //Java 9
        Set<String> attendeeList = new HashSet<>();
        attendeeList.add("Rebecca Smith");
        attendeeList.add("Catherine Doe");
        attendeeList.add("Peter Serphen");
        attendeeList.add("Samuel Jones");
        attendeeList.add("Laura Hyde");

        Set<String> finalAttendees = Collections.unmodifiableSet(attendeeList);
        //finalAttendees.add("John Parker"); //java.lang.UnsupportedOperationException

        //Java 11 - all of the above can now be replaced by a factory method in the Set class.
        Set<String> namesOfSessionAttendees =
                Set.of("Rebecca Smith", "Catherine Doe", "Peter Serphen", "Samuel Jones", "Laura Hyde");
        //namesOfSessionAttendees.add("Catherine Doe"); //java.lang.UnsupportedOperationException
        namesOfSessionAttendees.forEach(attendee -> System.out.println(attendee));
    }

    private static void unmodifiableMapExample() {
        //Java 9
        Map<Integer, String> listOfTeamMembers = new HashMap<>();
        listOfTeamMembers.put(112, "Samantha Linden");
        listOfTeamMembers.put(449, "Jake Ringer");
        listOfTeamMembers.put(108, "Alice Peterson");
        listOfTeamMembers.put(331, "Robert Williams");

        Map<Integer, String> finalListOfDinnerAttendees = Collections.unmodifiableMap(listOfTeamMembers);
        //finalListOfDinnerAttendees.put(210, "Jessica Jones"); //java.lang.UnsupportedOperationException

        //Java 11 - all of the above can now be replaced by a factory method in the Map class.
        Map<Integer, String> dinnerAttendees =
                Map.of(112, "Samantha Linden", 449, "Jake Ringer",
                        108, "Alice Peterson", 331, "Robert Williams");
        //dinnerAttendees.put(210, "Jessica Jones"); //java.lang.UnsupportedOperationException
        dinnerAttendees.forEach((employeeID, name) -> System.out.println(employeeID + " " + name));
    }
}

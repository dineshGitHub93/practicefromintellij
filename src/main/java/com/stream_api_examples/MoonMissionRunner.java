package com.stream_api_examples;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MoonMissionRunner {

    public static void main(String[] args) {

        List<MoonMission> moonMissions = List.of(
                new MoonMission("United States", "NASA", true, 1969),
                new MoonMission("Soviet Union (Russia)", "Luna Program", true, 1959),
                new MoonMission("China", "CNSA", true, 2013),
                new MoonMission("India", "ISRO", true, 2023),
                new MoonMission("Japan", "JAXA", false, null),
                new MoonMission("Israel", "SpaceIL", false, null),
                new MoonMission("European Union", "ESA", false, null),
                new MoonMission("South Korea", "KARI", false, null),
                new MoonMission("United Arab Emirates", "MBRSC", false, null)
        );

        Map<String, Boolean> ListOfsuccessfulCountries = new LinkedHashMap<>();

        moonMissions.stream()
                .filter(moonMission -> moonMission.isSuccessful()==true)
                .forEach( country->ListOfsuccessfulCountries.put(country.getCountry(), country.isSuccessful()));

        for(Map.Entry<String, Boolean> entry : ListOfsuccessfulCountries.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
        System.out.println("\n");
        ListOfsuccessfulCountries.forEach((key, value)-> System.out.println(key+" -> "+value));

        Map<String, Boolean>  ListOfsuccessfulCountries1 = moonMissions.stream()
                .filter(MoonMission::isSuccessful)
                .collect(Collectors.toMap(MoonMission::getCountry, MoonMission::isSuccessful,
                        (oldValue, newValue)->newValue,
                        LinkedHashMap::new
                ));

        ListOfsuccessfulCountries1.forEach((country, status) ->
                System.out.println(country + " → " + status)
        );

    }


}

package day2;

import java.util.*;

public class MapJson {

    //Write a function that takes a List of Maps in JSON format,
    //where each Map has a key called “id” that has a value,
    //and the function returns the List of those values
    //Input: [{“id”: “45454546”}, {“id”: “46879456”}]
    //Output: [“45454546”, “46879456”]


    public static ArrayList<String> ListOfMap(List<Map<String,String>> jsonMap){

        ArrayList<String> list = new ArrayList<>();

//        list.add(jsonMap.get(0).get("id"));
//        list.add(jsonMap.get(1).get("id"));

        // develop branch updated

        for(int i=0;i<jsonMap.size();i++){
            list.add(jsonMap.get(i).get("id"));
        }

        return list;
    }


    public static void main(String[] args) {
        List<Map<String,String>> listOfMap = new ArrayList<>();

        Map<String,String> jsonMap = new LinkedHashMap<>();
        Map<String,String> jsonMap1 = new LinkedHashMap<>();
        Map<String,String> jsonMap2 = new LinkedHashMap<>();

        jsonMap.put("id","45454546");
        jsonMap1.put("id","46879456");
        jsonMap2.put("id","46879400");

        listOfMap.add(jsonMap);
        listOfMap.add(jsonMap1);
        listOfMap.add(jsonMap2);

        System.out.println(ListOfMap(listOfMap));

        // develop branch updated and worked as expected


    }

}

package datastructures.HashmapRepeatedWord;

import datastructures.hashmap.HashMap;

public class RepeatedWordHashMap {

  private String repeatedWord (String str){
    HashMap<String, Integer> hashMap = new HashMap<>();
    String current = "";
    for (int i = 0; i < str.length(); i++){
      char C = Character.toLowerCase(str.charAt(i));
      if ((C >= 'a' && C <= 'z') ||  C == '\'')
        current = current + C;
      else if (C == ' ' || i == str.length() -1){
        if (hashMap.contains(current))
          return current;
        hashMap.set(current, true);
        current = "";
      }
    }
    return repeatedWord("");
  }
}

//Code borrowed from akkanben


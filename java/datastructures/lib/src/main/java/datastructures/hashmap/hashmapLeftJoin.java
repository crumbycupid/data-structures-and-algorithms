package datastructures.hashmap;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class hashmapLeftJoin {

  public static List<String[]> leftJoin(Map<String, String> leftHash, Map<String, String>rightHash){
    List<String[]> hashResults = new ArrayList<>();
    for (String key: leftHash.keySet()){
      if (rightHash.containsKey(key)){
        hashResults.add(new String[]{key, leftHash.get(key), rightHash.get(key)});

      }else{
        hashResults.add(new String[]{key, leftHash.get(key), null});
      }
    }
    return hashResults;
  }

}

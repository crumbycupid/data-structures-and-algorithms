package datastructures.hashmap;

import datastructures.trees.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashMap<K, V> {

  ArrayList<LinkedList<HashMapPair<K, V>>> bucketArrayList; // using ArrayList instead of array so we can instantiate with a parameterized type
  int size;

  public HashMap() {
    if(size < 1){
      throw new IllegalArgumentException("Hashmap size must be greater than 1");
    }
    this.size = size;
    this.bucketArrayList = new ArrayList<>(size);

    // Next part is not required, and is a little inefficient, but it makes writing HashMap operations easier
    for(int i = 0; i < this.size; i++){
      bucketArrayList.add(i, new LinkedList<>());
    }
  }

  public void set(String key, boolean value){
    int index = hash(key);
    HashMapPair<K, V> newPar = new HashMapPair<>(key, value);
    if(bucketArrayList.get(index) !=null){
      LinkedList<HashMapPair<K, V>> list = bucketArrayList.get(index);
      Node<HashMapPair<K, V>> current;
//      current = list.head;
//      while (current !=null && !current.value.equals(value)){
//        current.value.setValue(value);
//        return;
      }
    }
//    if (size == bucketArrayList.size()){
//    }
//
//  }

  public V get(K key){
    // TODO: implement me
    return null;
  }

  public List<K> getKeys(){
    // TODO: implement me
    return null;
  }

  public boolean contains(String current){
    // TODO: implement me
    return false;
  }

  // Sometimes hashCode in Java can be negative! So we need to do absolute value
  // If you really want to hash things yourself, look at https://stackoverflow.com/a/113600/16889809
  // Don't use Character! Don't use Object! Don't use any object you have not overridden equals() and hashCode() on!
  // If you do this, things that should collide, won't, because Object.hashCode() is not good
  // ProTip: Testing collisions is easy with Integer, because Integer hashes to its own value
  public int hash(K key){
    return Math.abs(key.hashCode()) % size;
  }
}

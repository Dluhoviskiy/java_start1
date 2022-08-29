package sand.collection;

import java.util.*;


public class CollectionsDemo {

 public static void main(String[] args) {

//  var list = new ArrayList<String>();
//
//  list.addAll(Arrays.asList("", "a", "b", "c"));
//  list.add("d");
//
//  System.out.println("list = " + list);

  Collection<String> collection = new ArrayList<>();
  Collections.addAll(collection, "a");
//  var list = new ArrayList<String>();
//
//  list.addAll(Arrays.asList("", "a", "b", "c"));
//  ints.add("a");

  System.out.println("list = " + collection);
 }
}
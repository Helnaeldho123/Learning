package pgms;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
  private static String s="TEST AUTOMATION FRAMEWORK";  //Qp is to count the occurence of a each character in a given string by using hashmap
  public static void main(String[] args) {
	  char[] charArray = s.toCharArray(); // Here taking the String TEST AUTOMATION FRAMEWORK as Character array
	  Map<Character, Integer> map = new HashMap<Character, Integer>(); // Key:Chara,Value::Integer
	  for (char c : charArray){ //iterating the string which is TEST AUTOMATION FRAMEWORK
	         if (map.containsKey(c)){
	            map.put(c, map.get(c) + 1);  //Here checking whether any chara is repeated, if yes it is added as +1
	         }else{
	            map.put(c, 1);             //So if the chara is not repeated it is only adding once
	         }
	      }
	  for (Map.Entry<Character, Integer> entryMap : map.entrySet()){
	         System.out.println(entryMap.getKey()+"::"+entryMap.getValue());}}}// Finally here is getting the key n value 
	     
	  
	  

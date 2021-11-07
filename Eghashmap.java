import java.util.HashMap;
class Eghashmap{
  public static void main(String[] args){
    Eglinkedlist lnkdlst = new Eglinkedlist();
    	
    HashMap<String,String> cities = new HashMap<String,String>();
    cities.put("England","London");
    cities.put("India","Delhi");
    cities.put("Bangladesh","Dhaka");
    cities.put("Srilanka","colombo");
    cities.remove("England");
    System.out.println(cities);
    System.out.println(cities.size());
    for(String e : cities.keySet()){
      System.out.println("key:"+e +"   value:  "+cities.get(e));
}
    System.out.println("================================");
    
    System.out.println(cities.get("England"));
    System.out.println(cities.get("India"));
    System.out.println(cities.get("Bangladesh"));
    System.out.println(cities.get("Srilanka"));
    cities.clear();
    System.out.println(cities);
}
}
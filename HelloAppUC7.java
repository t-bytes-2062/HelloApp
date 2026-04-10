import java.util.*;
public class HelloAppUC7 {
static List<String> names = new ArrayList<>();
public static void addName(String name){
names.add(name);
}
public static void listNames(){
for(String n : names){
System.out.println(n);
}
}
}
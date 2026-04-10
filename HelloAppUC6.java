import java.util.*;
public class HelloAppUC6 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
List<String> names = new ArrayList<>();
while(true){
System.out.print("Enter name (or 'exit'): ");
String name = sc.nextLine();
if(name.equals("exit")) break;
names.add(name);
for(String n : names){
System.out.println("Hello " + n);
}
}
}
}
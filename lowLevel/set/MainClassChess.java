package set;


import java.util.HashSet;
import java.util.Set;

public class MainClassChess {

    public static void main(String[] args) throws Exception {
        Person person1 = new Person("1","2","3");
        Person person2 = new Person("1","5","6");
        Set<Person> set = new HashSet<>();
        set.add(person1);
        set.add(person2);
        System.out.println(person1.equals(person2));
    }
}

package homework3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PhoneBook {
    private HashMap<String, Set<String>> phoneBook = new HashMap<>();

    public void add(String name, String phone) {
        Set<String> tell = phoneBook.getOrDefault(name, new HashSet<>());
        tell.add(phone);
        phoneBook.put(name, tell);

    }

    public Set<String> get(String name) {
        return phoneBook.get(name);
    }
}

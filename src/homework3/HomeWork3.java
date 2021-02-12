package homework3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

public class HomeWork3 {
    public static void main(String[] args) {
        String[] words = {"стена", "стол", "дверь", "окно", "стул", "кресло", "тумба", "стеллаж", "Стол", "двеРь", "ОКНО", "сТул",
                "Кресло", "тумба", "тумбА", "стул", "окНо", "стеНА", "дверь", "стелЛаж", "Стул", "диван", "Стеллаж"};
        System.out.println(Arrays.toString(words));

        HashMap<String, Integer> worldsHashMap = new HashMap<>();
        for (String str : words) {
            worldsHashMap.put(str.toLowerCase(Locale.ROOT), worldsHashMap.getOrDefault(str.toLowerCase(Locale.ROOT), 0) + 1);
        }
        System.out.println(worldsHashMap);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ильминский", "+7(985)729-01-45");
        phoneBook.add("Ильминский", "+7(915)465-72-85");
        phoneBook.add("Власов", "+7(999)555-66-66");
        phoneBook.add("Власов", "+7(888)777-22-55");
        phoneBook.add("Суслов", "+7(333)444-88-99");

        System.out.println("Телефон Ильминского:" + phoneBook.get("Ильминский"));
        System.out.println("Телефон Суслова:" + phoneBook.get("Суслов"));
        System.out.println("Телефон Власова:" + phoneBook.get("Власов"));
    }
}

package src.HashMap;

import java.util.HashMap;

public class Nicknames {
    public static void main(String[] args) {
        HashMap<String, String> nickNames = new HashMap<>();

        nickNames.put("matt", "matthew");
        nickNames.put("mix", "michael");
        nickNames.put("artie", "arthur");

        System.out.println(nickNames.get("matt") + "'s nickname is Matt.");
    }
}

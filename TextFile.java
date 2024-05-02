package Q1;

import java.util.List;
import java.util.ArrayList;
public class TextFile {
    private final List<Character> characters = new ArrayList<>();

    public void addCharacter(Character character) {
        characters.add(character);
    }

    // Serialize the entire document
    public String serialize() {
        StringBuilder sb = new StringBuilder();
        for (Character character : characters) {
            sb.append(character.serialize()).append("\n");
        }
        return sb.toString();
    }

    // Deserialize the entire document
    public static TextFile deserialize(String serializedData, CharFactory characterFactory) {
        TextFile document = new TextFile();
        String[] lines = serializedData.split("\n");
        for (String line : lines) {
            Character character = Character.deserialize(line, characterFactory);
            document.addCharacter(character);
        }
        return document;
    }
}

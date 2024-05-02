package Q1;

public class Character {
    private final char character;
    private final Font font;
    private final Color color;
    private final Size size;

    public Character(char character, Font font, Color color, Size size){
        this.character = character;
        this.font = font;
        this.color = color;
        this.size = size;
    }

    public char getCharacter(){
        return this.character;
    }

    public void printInfo(){
        System.out.println("Q1.Character: " + this.character +
                "\nQ1.Font: " + this.font.getFontType() +
                "\nQ1.Color: " + this.color.getColor() +
                "\nQ1.Size: " + this.size.getSize() +
                "\n");
    }

    public String serialize() {
        return this.character + "," + this.font.getFontType() + "," + this.color.getColor() + "," + this.size.getSize();
    }

    public static Character deserialize(String serializedData, CharFactory characterFactory) {
        String[] parts = serializedData.split(",");
        char content = parts[0].charAt(0);
        Font font = characterFactory.getFont(parts[1]);
        Color color = characterFactory.getColor(parts[2]);
        Size size = characterFactory.getSize(Integer.parseInt(parts[3]));
        return new Character(content, font, color, size);
    }

}

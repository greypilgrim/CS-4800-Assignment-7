package Q1;

import java.util.Random;

public class Q1Driver {
    public static void main(String[] args) {
        CharFactory characterFactory = new CharFactory();
        TextFile document = new TextFile();
        Random randNum = new Random();

        final String phrase = "HelloWorldCS5800";
        String changedPhrase = "";

        String group1 = phrase.substring(0, 3);
        String group2 = phrase.substring(4, 7);
        String group3 = phrase.substring(8, 11);
        String group4 = phrase.substring(12);

        int randNum1 = randNum.nextInt(group1.length());
        int randNum2 = randNum.nextInt(group2.length());
        int randNum3 = randNum.nextInt(group3.length());
        int randNum4 = randNum.nextInt(group4.length());

        char randomChar1 = group1.charAt(randNum1);
        char randomChar2 = group2.charAt(randNum2);
        char randomChar3 = group3.charAt(randNum3);
        char randomChar4 = group4.charAt(randNum4);


        Character char1 = new Character(randomChar1, characterFactory.getFont("Verdana"),
                characterFactory.getColor("Red"), characterFactory.getSize(12));
        Character char2 = new Character(randomChar2, characterFactory.getFont("Verdana"),
                characterFactory.getColor("Red"), characterFactory.getSize(12));
        Character char3 = new Character(randomChar3, characterFactory.getFont("Arial"),
                characterFactory.getColor("Blue"), characterFactory.getSize(14));
        Character char4 = new Character(randomChar4, characterFactory.getFont("Verdana"),
                characterFactory.getColor("Black"), characterFactory.getSize(16));

        // Display characters
        char1.printInfo();
        char2.printInfo();
        char3.printInfo();
        char4.printInfo();

        for(int i = 0; i < phrase.length(); i++){
            if(i == randNum1){
                changedPhrase += randomChar1;
            }
            else if(i == randNum2){
                changedPhrase += randomChar2;
            }
            else if(i == randNum3){
                changedPhrase += randomChar3;
            }
            else if(i == randNum4){
                changedPhrase += randomChar4;
            }
            else{
                changedPhrase += phrase.charAt(i);
            }
        }
        System.out.println("\n" + changedPhrase);

        /*document.addCharacter(char1);
        document.addCharacter(char2);
        document.addCharacter(char3);
        document.addCharacter(char4);

        try (PrintWriter writer = new PrintWriter("mydocument.txt")) {
            writer.write(document.serialize());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("mydocument.txt"))) {
            String serializedData;
            while ((serializedData = reader.readLine()) != null) {
                Character character = Character.deserialize(serializedData, characterFactory);
                character.printInfo();
            }
        } catch (IOException e) {
        e.printStackTrace();
        }*/
    }
}
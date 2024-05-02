package Q1;

import java.util.*;
public class CharFactory {
    private final Map<String, Font> fonts = new HashMap<>();
    private final Map<String, Color> colors = new HashMap<>();
    private final Map<Integer, Size> sizes = new HashMap<>();

    public Font getFont(String fontType){
        return this.fonts.computeIfAbsent(fontType, Font::new);
    }

    public Color getColor(String color){
        return this.colors.computeIfAbsent(color, Color::new);
    }

    public Size getSize(int size){
        return this.sizes.computeIfAbsent(size, Size::new);
    }
}

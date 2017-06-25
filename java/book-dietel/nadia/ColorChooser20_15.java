import java.util.HashMap;
import java.util.Map;

public class ColorChooser20_15 {
    public static void main(String[] args) {
        Color color  = new Color("GREEN");
        Color color1 = new Color("RED");
        Color color2 = new Color("BLUE");
        Color color3 = new Color("BLACK");
        Color color4 = new Color("GRAY");

        HashMap<Integer,Color> map = new HashMap<Integer,Color>();
        map.put(1,color);
        map.put(2, color1);
        map.put(3,color2);
        map.put(4,color3);
        map.put(5, color4);
        Color value = map.get(1);
        Color value2 = map.get(5);

        System.out.println(value.getColors());
        System.out.println(value2.getColors());

    }
}

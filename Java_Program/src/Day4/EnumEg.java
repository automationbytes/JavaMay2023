package Day4;

public class EnumEg {
    public enum Color{
        Red,
        Blue,
        Green,
        Yellow,
        Black,
        White
    }

    public static void main(String[] args) {
        System.out.println(Color.Blue);

        for(Color c: Color.values())
        {
            System.out.println(c);
        }
    }
}

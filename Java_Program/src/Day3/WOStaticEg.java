package Day3;
/*

Variables
Methods
Blocks
Class

Memory efficient

 */
public class WOStaticEg {
    int count = 0;

    WOStaticEg(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        WOStaticEg s1 = new WOStaticEg();
        WOStaticEg s2 = new WOStaticEg();
        WOStaticEg s3 = new WOStaticEg();

    }
}

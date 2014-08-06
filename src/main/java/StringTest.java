/**
 * Created by guoyibin on 8/6/14.
 *
 */
public class StringTest {

    public static void main(String[] args) {
        String a = new String(new char[]{'a', 'b', 'c'});
        System.out.println(a);
        System.out.println("======================================================================================================");

        String b = new String(new char[]{'a', 'b', 'c'},1,2);
        System.out.println(b);
        System.out.println(b.length());
        System.out.println("======================================================================================================");

        String s1 = new String("hello java");
        String s2 = new String("hello java");
        String s3 = new String("hellojava");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println("======================================================================================================");
        String s4 = "hello java";
        String s5 = "hello java";
        System.out.println(s1==s2);
        System.out.println(s1==s4);
        System.out.println(s4==s5);
        System.out.println("======================================================================================================");
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println("======================================================================================================");
        String s6 = new String("java");
        String s7 = new String("java");
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s6));
        System.out.println(s6.compareTo(s7));
        System.out.println("======================================================================================================");
        System.out.println(s1.regionMatches(6,"java",0,4));
        System.out.println(s1.regionMatches(true,6,"java",0,4));
        System.out.println(s1.regionMatches(false,6,"java",0,4));
        System.out.println("======================================================================================================");
        System.out.println(s1.concat("j"));
        System.out.println(s1.contains("j"));


    }
}

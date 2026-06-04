public class StringBasic {
    public static void main(String args[])
    {

        // creating Java string using a new keyword
        String str = new String("Geeks");

        System.out.println(str);

        //str.concat()
        String name = "Sachin";
        name = name.concat(" Tendulkar");
        System.out.println(name);

        //.length()
        //.toUpperCase()
        //.toLowerCase()
        //.indexOf();
        //.charAt()

        String txt = "Hello";
        //System.out.println(txt[0]);  //Error
        System.out.println(txt.charAt(4));  // o

        //str1.equals(str2)
        //.trim()

    }
}

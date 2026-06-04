public class CharacterBasic {
    public static void main(String[] args) {
        char myChar = 'g';
        char myDigit = '5';
        char mySpace = '\n';

        // 1. Validation Examples
        System.out.println(Character.isLetter(myChar));       // Output: true
        System.out.println(Character.isDigit(myDigit));       // Output: true
        System.out.println(Character.isWhitespace(mySpace));   // Output: true
        System.out.println(Character.isUpperCase(myChar));   // Output: false

        // 2. Transformation Examples
        char upperCaseResult = Character.toUpperCase(myChar);
        System.out.println(upperCaseResult);                  // Output: 'G'
        
        String stringResult = Character.toString(myDigit);
        System.out.println(stringResult);                     // Output: "5"
    }


    //Character.isLetter(ch);
    //Character.isDigit(ch);
    //Character.isLetterOrDigit(ch);
    //Character.isWhitespace(ch);
    //Character.isUpperCase(ch);
    //Character.isLowerCase(ch);
    
    //Character.toUpperCase(ch);
    //Character.toLowerCase(ch);
    
    //Character.toString(ch);

}

// class Solution {
//     public boolean isValid(String word) {
//         int vowel=0;
//         int consonant=0;
//         boolean check=true;
//         if((word.length()>=3))
//         for(char c:word.toCharArray()){
//             if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
//                 vowel++;
//             }
//             if( c=='A' || c=='E' || c=='O' || c=='I' || c=='U'){
//                 consonant++;
//             }
//             System.out.println(c-0);
//             if(!((c-0)>=65 || (c-0)<=90 || (c-0)>=97 || (c-0)<=122 || (c-0)>=48 || (c-0)<=57)){
//                 check=false;
//             }
            
//         }
//         else return false;

//         return check;
//     }
// }
class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }
        boolean Vowel = false;
        boolean Consonant = false;
        boolean isValidChar = true;
        for (char c : word.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                isValidChar = false;
                break;
            }

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                Vowel = true;
            } else if (Character.isLetter(c)) {
                Consonant = true;
            }
        }
        return Vowel && Consonant && isValidChar;
    }
}

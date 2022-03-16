class Task9 {

    static void vowelsInString(String theStr){
        theStr = theStr.toLowerCase();
        String theVowels = "";
        for (int i = 0; theStr.length() > i; i++){
            char theChar = theStr.charAt(i);
            if(theChar == 'a' || theChar == 'e' || theChar == 'i' || theChar == 'o' || theChar == 'u'){
                if(!theVowels.contains(Character.toString(theChar))) theVowels += theChar + ", ";
            }
        }
        System.out.println("Vowels: " + theVowels.substring(0, theVowels.length() - 2));
    }
    public static void main(String[] args) {
        vowelsInString("Onke Nyathela");
    }
}

/*
    Description:

    Check if a string is a palindrome, ignoring case sensitivity.

    Input:

    String s
    Output:

    true or false
    Example:

    Input: "Radar"
    Output: true

*/

void main(){
    Scanner input = new Scanner(System.in);

    String word = input.next();
    char[] characters = word.toCharArray();
    String wordReverse = "";

    for(int i = characters.length - 1; i > -1; i--){
       wordReverse += characters[i];
    }

    if(wordReverse.equalsIgnoreCase(word)){
        IO.println(true);
    }else{
        IO.println(false);
    }

}
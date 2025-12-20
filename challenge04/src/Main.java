/*
    Description:

    Given an array of integers, return the smallest and largest value.

    Input:

    Array nums
    Output:

    \[min, max\]
    Example:

    Input: [3, 1, 9, 7]
    Output: [1, 9]

*/

void main(){
    int[] numbers = new int[] {3, 1, 9, 7};

    int max = numbers[0];
    int min = numbers[0];;

    for(int number: numbers){
        if(number > max){
            max = number;
        }else if(number < min){
            min = number;
        }
    }

    System.out.printf("[%d, %d]", min, max);

}
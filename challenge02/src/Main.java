/*
### Even Numbers Until N

**Description:**
Given a positive integer `n`, print all even numbers from `1` to `n`.

 */

void main(){
    Scanner input = new Scanner(System.in);

    int n = input.nextInt();

    for(int i = 1; i <= n; i++){
        if (i % 2 == 0) System.out.printf("%d ", i);
    }

}
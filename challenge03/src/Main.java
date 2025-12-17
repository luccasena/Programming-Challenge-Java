/*
### Day 3 — Factorial

**Description:**

Implement a function that calculates the **factorial** of a number `n`.

*/

void main(){
    Scanner input = new Scanner(System.in);

    int n = input.nextInt();

    if(n <= 12 && n > 0){
        BigDecimal product = new BigDecimal(n);

        for(int i = n-1; i > 1; i--){
            product = product.multiply(new BigDecimal(i));

        }

        IO.println(product);

    }else{
        throw new IllegalArgumentException("It´s not possible calculate this factorial! Try a number between 0 to 12...");
    }

}
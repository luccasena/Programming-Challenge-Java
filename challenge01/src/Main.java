
void main() {
    Scanner input = new Scanner(System.in);

    int n = input.nextInt();

    if(n > 0) IO.println("Positive");
    else if(n < 0) IO.println("Negative");
    else IO.println("Zero");

}

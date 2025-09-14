class root{
  public static void main(string[]args){
    Scanner scanner = new Scanner(system.in);
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();

    double squareroot = math.sqrt(num1+num2);
    system.out.println(squareroot);
    //or create a sum variable before hand
    //sum = num1+num2
    //squareroot = Math.sqrt(sum)
    //system.out.println(squareroot);

  }
}

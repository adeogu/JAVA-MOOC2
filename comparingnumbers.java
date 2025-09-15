class comparingnumbers{
  public static void main(string[]args){
    Scanner scanner = new scanner(system.in);
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();

    if(num1>num2){
      system.out.println(num1 + "is greater than" + num2);
    }else if (num1<num2){
      system.out.println(num1 + "is less than" + num2);
    }else{
      System.out.println(num1 + "is equal too"+ num2);
    }
    scanner.close();

    
  }
}

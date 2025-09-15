class carryon{
  public static void main(string[]args){
    Scanner scanner = new scanner(system.in);
    while(true){
      system.out.println("shall we carry on?");
      string input = scanner.nextLine();
      if(input.equal("no")){
        break;
      }
    }
    scanner.close();
  }
}

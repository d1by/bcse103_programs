//34 - read string and display string with vowels
class javaProg{
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter string: ");
      String str = sc.nextLine();
      
      String out = str.replaceAll("[aeiouAEIOU]","");
      
      System.out.println("Vowels removed: " + out);
  }
}

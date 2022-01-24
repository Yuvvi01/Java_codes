/**class fibonacci {
    public static void main(String[] args) {
  
      int n = 10, firstTerm = 0, secondTerm = 1;
      System.out.println("Fibonacci Series till " + n + " terms:");
  
      for (int i = 1; i <= n; ++i) {
        System.out.print(firstTerm + ", ");
  
        // compute the next term
        int nextTerm = firstTerm + secondTerm;
        firstTerm = secondTerm;
        secondTerm = nextTerm;
      }
    }
  }
  */
  //Method 2: Using While loop
  class fibonacci {
    public static void main(String[] args) {
  
      int n = 100, firstTerm = 0, secondTerm = 1;
      System.out.println("Fibonacci Series till " + n + " terms:");
  
      while (firstTerm <= n) {
        System.out.print(firstTerm + ", ");
  
        // compute the next term
        int nextTerm = firstTerm + secondTerm;
        firstTerm = secondTerm;
        secondTerm = nextTerm;
      }
    }
  }

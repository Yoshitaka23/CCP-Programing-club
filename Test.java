class main{
  public Static void main(String[] args){
    System.out.println("Test")
  }
  
  public int checkAve(int[][] x){
    int sum = 0;
    for(int[] nums: x){
      for(int num: nums){
        sum += num;
      }
    }
    return sum;
  }
  
}

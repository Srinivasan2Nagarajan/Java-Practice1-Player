 public int count7(int n) {
int count = 0;
  if(n==7){
  count++;

  return count;
  }
 else if(n>7 && n<100)

  return count7(n/10)+count7(n%10);

  else if( n>100)

  return count7(n/10)+count7(n%10);

  else return 0;

}

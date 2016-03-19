
public static String pairStar(String str) {
  String result = "";
  if (str == null) {
   return result;
  }
  result = str.substring(0, 1);
  
  if (str.trim().length() == 1)
   return result;

  if (result.equals(str.substring(1, 2))) {
   result += "*";
  }

  str = str.substring(1);
  return result + pairStar(str);

 }

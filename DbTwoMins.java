public static void main(String[] args) throws Exception {   //Read user input into the array
    long time = System.currentTimeMillis(); // current time
    DateTime time1 = new DateTime(time);
    DateTime time2 = new DateTime(time + 120_000); // add 2 minutes for example
    Minutes minutes = Minutes.minutesBetween(time1, time2);
    System.out.println(minutes.getMinutes()); // prints 2
}

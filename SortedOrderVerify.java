public static boolean verifyOrder(int[] data) {
    List<Integer> input = new ArrayList<Integer>();
    for (int index = 0; index < data.length; index++) {
        input.add(data[index]);
    }
    int j = 0;
    while (j < input.size() - 1 && input.get(j) <= input.get(j + 1)) {
        j++;
    }
    if (j == input.size() - 1) {
        // yes we can sort array with only one swap operation
        return true;
    }

    // not sure how should I proceed?
}

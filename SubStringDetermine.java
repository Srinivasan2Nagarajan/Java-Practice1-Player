public boolean subsequence(String superString, String subString) {
    StringBuilder sb = (".*");
    for (char c : subString.toCharArray()) {
        sb.append(c);
        sb.append(".*");
    }
    return superString.matches(sb.toString());
}

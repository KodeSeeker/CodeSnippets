public static String reverse(String str) {
    if ((null == str) || (str.length()  <= 1)) {
        return str;
    }
    return reverse(str.substring(1)) + str.charAt(0);
}
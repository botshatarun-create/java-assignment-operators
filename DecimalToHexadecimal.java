 class DecimalToHex {
    public static void main(String[] args) {
        int decimal = 356;
        String hex = "";

        while (decimal > 0) {
            int r = decimal % 16;
            hex = (r < 10 ? r : (char)('A' + r - 10)) + hex;
            decimal = decimal / 16;
        }

        System.out.println(hex);
    }
}

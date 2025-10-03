 class HexToDecimal {
    public static void main(String[] args) {
        String hex = "1A3";
        int decimal = 0;

        for (int i = 0; i < hex.length(); i++) {
            char ch = hex.charAt(i);
            int value = (ch >= '0' && ch <= '9') ? ch - '0' : ch - 'A' + 10;
            decimal = decimal * 16 + value;
        }

        System.out.println(decimal);
    }
}

class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "1110";
        int decimal = 0;

        for (int i = 0; i < binary.length(); i++) {
            decimal = decimal * 2 + (binary.charAt(i) - '0');
        }

        System.out.println("Decimal of " + binary + " = " + decimal);
    }
}
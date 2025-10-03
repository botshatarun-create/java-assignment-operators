class DecimalToBinary{
    public static void main(String[] args) {
        int decimal = 56;
        String binary = "";
        int num = decimal;

      for (;num > 0;) {
            int remainder = num % 2;
            binary = remainder + binary;
            num = num / 2;
        }

        System.out.println("Binary of " + decimal + " = " + binary);
    }
}

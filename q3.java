class q3 {
    public static void main(String[] args) {
        int decimal = 254;
        String hex = "";
        char[] hexDigits = {'0','1','2','3','4','5','6','7','8','9',
                            'A','B','C','D','E','F'};

        int num = decimal;
        while (num > 0) {
            int remainder = num % 16;
            hex = hexDigits[remainder] + hex;
            num = num / 16;
        }

        System.out.println("Hexadecimal of " + decimal + " = " + hex);
    }
}
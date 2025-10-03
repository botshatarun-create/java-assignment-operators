 class HexToBinaryMath {
    public static void main(String[] args) {
        String hex = "2F";
        StringBuilder bin = new StringBuilder();

        for (char c : hex.toCharArray()) {
            int val = Character.digit(c, 16);
            for (int i = 3; i >= 0; i--)
                bin.append((val >> i) & 1);
        }

        System.out.println(bin);
    }
}

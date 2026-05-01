class extract {
    public static void main(String[] args) {
        String str = "  Hello Java Programming  ";
        System.out.println("trim: '" + str.trim() + "'");
        System.out.println("strip: '" + str.strip() + "'");
        System.out.println("toUpperCase: " + str.toUpperCase());
        System.out.println("toLowerCase: " + str.toLowerCase());
        System.out.println("substring(2, 7): " + str.substring(2, 7));
        System.out.println("indexOf 'Java': " + str.indexOf("Java"));
        System.out.println("lastIndexOf 'a': " + str.lastIndexOf('a'));
        System.out.println("charAt(4): " + str.charAt(4));
    }
}
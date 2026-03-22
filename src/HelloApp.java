class HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }
        System.out.print("Hello, ");
        int count = 0;
        for (String name : args) {
            System.out.print(name);
            count++;
        if (count < args.length) {
                System.out.print(", ");
            }
        }
        System.out.println("!");
    }
}
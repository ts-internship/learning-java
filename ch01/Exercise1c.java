class Exercise1c {
    public static void main(String[] args) { // Java 프로그램은 반드시 하나의 main 함수 필요
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x < 3) {
                System.out.println("small x");
            }
        }
    }
}

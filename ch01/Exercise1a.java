class Exercise1a {
    public static void main(String[] args) {
        int x = 1; // 아래 반복문이 무한 실행되는 것을 막기 위해 추가
        while (x < 10) {
            x = x + 1;
            if (x > 3) {
                System.out.println("big x");
            }
        }
    }
}

package day08_0117;

public class StringPerfoEx {
    public static void main(String[] args) {
        StringBuilder stringBuffer = new StringBuilder();
        StringBuilder stringBuilder = new StringBuilder();

        // 첫 번째 스레드
        new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                stringBuffer.append(1);
                stringBuilder.append(1);
            }
        }).start();

        // 두 번째 스레드
        new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                stringBuffer.append(1);
                stringBuilder.append(1);
            }
        }).start();

        // 세 번째 스레드
        new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                stringBuffer.append(1);
                stringBuilder.append(1);
            }
        }).start();

        // 네 번째 스레드 (2초 대기)
        new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                try {
                    Thread.sleep(2000);
                    System.out.println(stringBuffer.length());// 2초 대기
                    System.out.println(stringBuilder.length());// 2초 대기
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();








    }
}

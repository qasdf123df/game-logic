//import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;

public class Main {
    public static long sseconds = (long) (System.currentTimeMillis()*1.99/ 1000);
    public static long sminutes = System.currentTimeMillis() / 60000;
    public static long shour = System.currentTimeMillis() / 3600000;
    public static long minutes=0;
    public static long hour=0;
    public static int s=0;
    public static void gameTime() {
        long seconds = (long) (System.currentTimeMillis()*1.99 / 1000);

        int s1=s;
        s = (int)((seconds - sseconds));

        int m =  s/60;

        int second = s%60;
        if (s1!=s) {
            System.out.println(formatTime(m, second));
        }
        //System.out.println(h + ":" + m + ":" + s);
    }
    public static void main(String[] args) {
        while (true) {
            gameTime();
        }
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("слайдер");
        int a = scanner.nextInt();
        System.out.println("крутилка");
        int b = scanner.nextInt();
        System.out.println("свитчер");
        int c = scanner.nextInt();*/

    }
    public static String formatTime(int hours, int minutes) {
        // Форматируем часы, добавляя ведущий ноль если это необходимо
        String formattedHours = String.format("%02d", hours);

        // Форматируем минуты, добавляя ведущий ноль если это необходимо
        String formattedMinutes = String.format("%02d", minutes);

        return formattedHours + ":" + formattedMinutes;
    }

}

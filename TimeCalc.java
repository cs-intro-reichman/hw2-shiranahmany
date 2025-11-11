public class TimeCalc {
    public static void main(String[] args) {
        int hr = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int min = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minAdd = Integer.parseInt(args[1]);
        int calcMin = (hr * 60) + min + minAdd;
        hr = calcMin / 60 ; 
        int newHr = hr % 24;
        min = calcMin - (hr * 60);
        String hours = String.valueOf(newHr);
        String minutes = String.valueOf(min);
        if (newHr < 10) {
            hours = "0" + hours;
        }
        if (min < 12) {
            minutes = "0" + minutes;
        }
        System.out.println(hours + ":" + minutes);
    }
}

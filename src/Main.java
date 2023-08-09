public class Main {
    public static void main(String[] args) {
        String result=Walk(34, 27);
        System.out.println(result);
        result=Walk(13, 30);
        System.out.println(result);
        result=Walk(47, 12);
        System.out.println(result);
        result=Walk(32, -34);
        System.out.println(result);
        result=Walk(50, 14);
        System.out.println(result);
    }
    public static String Walk(int age, int temperature) {
        if (age >= 20 && age <= 45) {
            if (temperature > -20 && temperature < 30) {
                return  "Можно идти гулять";
            }
        } else if (age < 20) {
            if (temperature > 0 && temperature < 28) {
                return "Можно идти гулять";
            }
        } else if (age > 45) {
            if (temperature > -10 && temperature < 25) {
                return  "Можно идти гулять";
            }
        } else {
            return "Остовайтесь дома";
        }
        return "Остовайтесь дома";
    }
}
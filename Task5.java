public class Task5 {
    public static void main(String[] args) {

        String [][] array =  {
                {"slovo" ,"mat" ,"kartopla"},
                {"sub", "mouse","string"},
                {"strava", "substring","ring"}
        };

        int count = 0;
        String looking_for = "ing";

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].contains(looking_for)) {
                    count++;
                    System.out.println("Found at array: [" + i + "][" + j + "]");
                }
            }
        }
        System.out.println("Number of occurrences: " + count);
    }
}

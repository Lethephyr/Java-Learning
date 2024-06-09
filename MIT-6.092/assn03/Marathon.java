class Marathon {

    public static void magic(String[] names, int[] times) {
        String[] winners = new String[2];
        int[] results = {0xfffffff, 0xfffffff};
        for (int i = 0; i < names.length; i++) {
            if (times[i] < results[0]) {
                results[1] = results[0];
                winners[1] = winners[0];
                results[0] = times[i];
                winners[0] = names[i];
            }
            else if (times[i] < results[1]) {
                results[1] = times[i];
                winners[1] = names[i];
            }
        }
        System.err.printf(
                "The 1st place is %s with %ds.\nThe 2nd place is %s with %ds.\n", 
                winners[0], results[0], winners[1], results[1]);
        return;
    }
    public static void main (String[] arguments) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };

        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };
        
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        }

        magic(names, times);
    }
} 
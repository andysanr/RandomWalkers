public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double totalSteps = 0;

        for (int i = 0; i < trials; i++) {
            int x = 0;
            int y = 0;
            int steps = 0;
            int rAbs = Math.abs(r);

            while (Math.abs(x) + Math.abs(y) != rAbs) {
                int randomNum = (int) (Math.random() * 4);
                switch (randomNum) {
                    case 0:
                        y++;
                        break;
                    case 1:
                        x++;
                        break;
                    case 2:
                        y--;
                        break;
                    case 3:
                        x--;
                        break;
                }
                steps++;
            }
            totalSteps += steps;
        }
        double avgSteps = totalSteps / trials;
        System.out.printf("average number of steps = %.5f", avgSteps);
    }
}

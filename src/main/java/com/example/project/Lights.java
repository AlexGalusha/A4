package A4.ChistmasLightsTests;

public class LightGrid {
    private boolean[][] grid = new boolean[1000][1000];

    public void turnOn(int x1, int y1, int x2, int y2) {
        for (int x = x1; x <= x2; x++) {
            for (int y = y1; y <= y2; y++) {
                grid[x][y] = true;
            }
        }
    }

    public void turnOff(int x1, int y1, int x2, int y2) {
        for (int x = x1; x <= x2; x++) {
            for (int y = y1; y <= y2; y++) {
                grid[x][y] = false;
            }
        }
    }

    public void toggle(int x1, int y1, int x2, int y2) {
        for (int x = x1; x <= x2; x++) {
            for (int y = y1; y <= y2; y++) {
                grid[x][y] = !grid[x][y];
            }
        }
    }

    public int countLit() {
        int count = 0;
        for (int x = 0; x < 1000; x++) {
            for (int y = 0; y < 1000; y++) {
                if (grid[x][y]) count++;
            }
        }
        return count;
    }
}

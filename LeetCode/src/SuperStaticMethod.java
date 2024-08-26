// 3238
class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        int[][] countPlayerColor = new int[n][11]; // 0 <= yi <= 10
        int player = -1, color = -1;
        for (int i = 0; i < pick.length; i++) {
            player = pick[i][0];
            color = pick[i][1];
            countPlayerColor[player][color]++;
        }
        System.out.println(Arrays.deepToString(countPlayerColor));
        // Solve
        int winnerCount = 0;
        for (int i = 0; i < countPlayerColor.length; i++) {
            for (int j = 0; j < countPlayerColor[i].length; j++) {
                if (countPlayerColor[i][j] > i) {
                    winnerCount++;
                    break;
                }
            }
        }
        return winnerCount;
    }
}

// [
//     [1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0], // player = 0
//     [2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0], // player = 1
//     [1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0], // player = 2
//     [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0] // player = 3
// ]
public class dungeon_game{
    public static void main(String[] args) {
        System.out.println("Dynamic programming solution");
    }
}
class a {
    public int calculateMinimumHP(int[][] dungeon) {
        int[][] strg = new int[dungeon.length][dungeon[0].length];
        return getMinHP(dungeon, 0, 0, strg);
    }
    private int getMinHP(int[][] dungeon, int x, int y, int[][] strg){
        if(x == dungeon.length - 1 && y == dungeon[0].length - 1) {
        	return dungeon[x][y] > 0 ? 1 : Math.abs(dungeon[x][y]) + 1;
        }
        if(x == dungeon.length - 1 || y == dungeon[0].length - 1){
            return x == dungeon.length - 1 ? Math.max(1, getMinHP(dungeon, x, y + 1, strg) - dungeon[x][y]) : Math.max(1, getMinHP(dungeon, x + 1, y, strg) - dungeon[x][y]);
        }
        if(strg[x][y] != 0){
            return strg[x][y];
        }
        int right = getMinHP(dungeon, x + 1, y, strg) - dungeon[x][y];
        int down = getMinHP(dungeon, x, y + 1, strg) - dungeon[x][y];
        strg[x][y] = Math.max(1, Math.min(right, down));
        return strg[x][y];
    }
}
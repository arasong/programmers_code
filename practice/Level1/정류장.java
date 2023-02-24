package Level1;

import java.util.*;

public class 정류장 {
    public static boolean[][] visited;

    public static void main(String[] args) {
        int[][] bus_stop = {{1, 2}, {3, 3}};
        int N = 3;
        solution(N, bus_stop);

    }

    public static int[][] solution(int N, int[][] bus_stop) {
        int[][] answer = new int[N][N];

        for (int i = 0; i < answer.length; i++){
            Arrays.fill(answer[i], -1);
        }

        for (int i = 0; i < bus_stop.length; i++) {
            answer[bus_stop[i][0] - 1][bus_stop[i][1] - 1] = 0;
        }

        for (int y = 0; y < N; y++) {
            for (int x = 0; x < N; x++) {
                if (answer[y][x] == -1) {
                    int ret = BFS(y, x, 0, N, bus_stop);
                    answer[y][x] = ret;
                }
            }
        }

        return answer;
    }

    //최단거리를 return 하는 BFS 함수
    public static int BFS(int y, int x, int cnt, int N, int[][] bus_stop) {
        // 상하좌우 배열
        int[] direct_y = {-1, 1, 0, 0};
        int[] direct_x = {0, 0, -1, 1};

        Queue<node> q = new LinkedList<>();

        visited = new boolean[N + 1][N + 1]; // 방문여부 체크
        node node = new node(y, x, 0);
        q.add(node);

        while (!q.isEmpty()) {
            node now = q.poll();

            for (int t = 0; t < 4; t++) {
                int dy = now.y + direct_y[t];
                int dx = now.x + direct_x[t];

                if (dy < 0 || dx < 0 || dy > N || dx > N) continue; // 범위 체크
                if (visited[dy][dx] == true) continue; // 재방문 여부 체크
                visited[dy][dx] = true;
                q.add(new node(dy, dx, now.cnt + 1));

                // 종료조건
                for (int i = 0; i < bus_stop.length; i++) {
                    if (dy == bus_stop[i][0] - 1 && dx == bus_stop[i][1] - 1) {
                        return now.cnt + 1;
                    }
                }

            }
        }
        return 0;
    }

    public static class node {
        int y;
        int x;
        int cnt;

        public node(int y, int x, int cnt) {
            this.y = y;
            this.x = x;
            this.cnt = cnt;
        }
    }
}

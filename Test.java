import java.util.*;

public class Test {
    static class Edge {
        int to;

        public Edge(int to) {
            this.to = to;
        }
    }

    static int N, M, maxXor = Integer.MIN_VALUE;
    static List<Edge>[] g;
    static int[] a, f;

    public static void dfs(int u, int p) {
        f[u] = a[u];
        for (Edge e : g[u]) {
            int v = e.to;
            if (v == p)
                continue;
            dfs(v, u);
            f[u] ^= f[v];
        }
        if (g[u].size() == 1 && u != 1) {
            maxXor = Math.max(maxXor, f[u]);
        }
    }

    public static void dfs2(int u, int p, int xorVal) {
        maxXor = Math.max(maxXor, f[u] ^ xorVal);
        for (Edge e : g[u]) {
            int v = e.to;
            if (v == p)
                continue;
            dfs2(v, u, (f[u] ^ xorVal) ^ f[v]);
        }
    }

    public static int Solve(int n, int m, List<Integer> a, List<Integer> u, List<Integer> v) {
        N = n;
        M = m;
        g = new List[N + 1];
        for (int i = 1; i <= N; i++) {
            g[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            int uu = u.get(i), vv = v.get(i);
            g[uu].add(new Edge(vv));
            g[vv].add(new Edge(uu));
        }
        for (int i = 0; i < N; i++) {
            g[a.get(i)].remove(new Edge(i + 1));
            g[i + 1].remove(new Edge(a.get(i)));
        }
        f = new int[N + 1];
        dfs(1, -1);
        for (int i = 1; i <= N; i++) {
            g[i].clear();
            g[i].add(new Edge(parent[i]));
            g[parent[i]].add(new Edge(i));
        }
        int[] parent = new int[N + 1];
        Arrays.fill(parent, -1);
        parent[1] = 1;
        dfs2(1, -1, 0);
        return maxXor;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine().trim());
        int M = Integer.parseInt(sc.nextLine().trim());
        int X = Integer.parseInt(sc.nextLine().trim());
        int Y = Integer.parseInt(sc.nextLine().trim());

        List<List<Integer>> P = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            P.add(Arrays.asList(sc.nextLine().trim().split(" "))
                    .stream().map(Integer::parseInt).collect(Collectors.toList()));
        }
        int result = Solve(N, M, P.stream().map(list -> list.get(0)).collect(Collectors.toList()),
                P.stream().map(list -> list.get(1)).collect(Collectors.toList()),
                P.stream().map(list -> list.get(2)).collect(Collectors.toList()));
        System.out.println(result);
    }
}

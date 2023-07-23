#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

typedef long long ll;

vector<vector<int>> adj;
vector<int> values;
vector<int> path;
vector<ll> medians;

void dfs(int node, int parent, int length)
{
    path.push_back(values[node]);

    if (length % 2 == 1)
    {
        int median = path[length / 2];
        medians.push_back(median);
    }

    for (int child : adj[node])
    {
        if (child != parent)
        {
            dfs(child, node, length + 1);
        }
    }

    path.pop_back();
}

long long solve(int n, int *C, int **edges)
{
    adj.resize(n + 1);
    values.resize(n + 1);

    // Copy node values
    for (int i = 1; i <= n; i++)
    {
        values[i] = C[i - 1];
    }

    // Build adjacency list
    for (int i = 0; i < n - 1; i++)
    {
        int u = edges[i][0];
        int v = edges[i][1];
        adj[u].push_back(v);
        adj[v].push_back(u);
    }

    dfs(1, -1, 1); // Start DFS from node 1 with initial length 1

    sort(medians.begin(), medians.end());

    ll sum = 0;
    for (ll median : medians)
    {
        sum += median;
    }

    return sum;
}

int main()
{
    int n;
    cin >> n;

    int *C = new int[n];
    for (int i = 0; i < n; i++)
    {
        cin >> C[i];
    }

    int **edges = new int *[n - 1];
    for (int i = 0; i < n - 1; i++)
    {
        edges[i] = new int[2];
        cin >> edges[i][0] >> edges[i][1];
    }

    long long result = solve(n, C, edges);
    cout << result << endl;

    // Clean up dynamically allocated memory
    delete[] C;
    for (int i = 0; i < n - 1; i++)
    {
        delete[] edges[i];
    }
    delete[] edges;

    return 0;
}
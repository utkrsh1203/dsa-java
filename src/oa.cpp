#include <bits/stdc++.h>
using namespace std;

const int mod = 998244353;
int solution(vector<int> v)
{
    int count = 0;
    int n = v.size();
    for (int mask = 1; mask < (1 << n); mask++)
    {
        int sum = 0, cnt = 0;
        for (int i = 0; i < n; i++)
        {
            if (mask & (1 << i))
            {
                sum += v[i];
                cnt++;
            }
        }
        if (sum % cnt == 0)
        {
            count = (count + 1) % mod;
        }
    }
    return count;
}

int main()
{
    vector<int> V = {75, 12, 49, 88, 53};
    cout << solution(V) << endl; // Output: 15
    return 0;
}

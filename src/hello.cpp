#include <bits/stdc++.h>
using namespace std;

bool isPrime(int n)
{
    if (n <= 1)
        return false;
    for (int i = 2; i <= sqrt(n); i++)
    {
        if (n % i == 0)
            return false;
    }
    return true;
}

string solution(int n, vector<int> arr)
{
    int temp = arr[0] - 1;
    while (temp--)
    {
        if (isPrime(temp))
        {
            arr[0] -= temp;
            break;
        }
        arr[0] -= temp;
    }
    for (int i = 1; i < n; i++)
    {
        for (int j = n - 1; j >= 2; j--)
        {
            if (isPrime(j) && arr[i] - j > arr[i - 1])
            {
                arr[i] -= j;
                break;
            }
        }

        if (i > 0 && arr[i] <= arr[i - 1])
            return "NO";
    }

    return "YES";
}

int main()
{
    vector<int> V = {10, 9, 13, 6};
    cout << solution(4, V) << endl; // Output: 15
    return 0;
}
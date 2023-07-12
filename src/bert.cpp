#include <iostream>
#include <vector>

using namespace std;

bool isPrime(int n)
{
    if (n <= 1)
        return false;
    for (int i = 2; i * i <= n; i++)
    {
        if (n % i == 0)
            return false;
    }
    return true;
}

int modInverse(int a, int m)
{
    int m0 = m, t, q;
    int x0 = 0, x1 = 1;

    if (m == 1)
        return 0;

    while (a > 1)
    {

        q = a / m;
        t = m;
        m = a % m, a = t;
        t = x0;
        x0 = x1 - q * x0;
        x1 = t;
    }

    if (x1 < 0)
        x1 += m0;

    return x1;
}

vector<int> findSmallestSequence(int n)
{
    vector<int> sequence;

    if (isPrime(n))
    {
        for (int i = 1; i < n - 1; i++)
        {
            sequence.push_back(i);
        }
        return sequence;
    }

    int inverse = modInverse(n - 1, n);

    for (int i = 2; i < n - 1; i++)
    {
        if ((i * inverse) % n != 1)
        {
            sequence.push_back(i);
        }
    }

    return sequence;
}

void printSequence(const vector<int> &sequence)
{
    for (int i : sequence)
    {
        cout << i << " ";
    }
    cout << endl;
}

int main()
{
    int n;
    cin >> n;

    vector<int> sequence = findSmallestSequence(n);

    printSequence(sequence);

    return 0;
}
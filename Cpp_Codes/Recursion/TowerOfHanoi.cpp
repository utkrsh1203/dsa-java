#include <iostream>
using namespace std;

void func(int n, int a, int b, int c)
{
    if (n == 0)
    {
        // cout << "Move a disk from " << a << " to " << c << endl;
        return;
    }

    func(n - 1, a, c, b);
    cout << "Move a disk from " << a << " to " << c << endl;
    func(n - 1, b, a, c);
}

int main()
{
    func(2, 1, 2, 3);
}
#include <iostream>
using namespace std;

int main()
{
    int S;
    cin >> S;
    int E;
    cin >> E;
    int W;
    cin >> W;
    int table;
    while (S <= E)
    {
        table = ((S - 32) * 5) / 9;
        cout << S << " " << table << endl;
        S = S + W;
    }
    return 0;
}
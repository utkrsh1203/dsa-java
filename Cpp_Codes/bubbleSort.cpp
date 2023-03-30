#include <bits/stdc++.h>
using namespace std;

void swap(int &a, int &b)
{
    int temp = a;
    a = b;
    b = temp;
}

int bubbleSort(int arr[], int size)
{
    int cnt = 1;
    int n = 0;
    while (cnt < size)
    {
        for (int i = 0; i < size - cnt; i++)
        {

            if (arr[i + 1] < arr[i])
            {
                swap(arr[i + 1], arr[i]);
                n++;
            }
        }
        if (n == 0)
        {
            break;
        }
        cnt++;
    }

    return n;
}

int main()
{
    // Best Case
    int arr1[10] = {1, 2, 3, 4, 5, 6, 7, 8};

    cout << "Sorting the BEST CASE array " << endl;
    cout << "INPUT :";
    for (int i = 0; i < 10; i++)
    {
        cout << arr1[i] << " ";
    }
    cout << endl;

    int swaps_best = bubbleSort(arr1, 8);

    cout << "OUTPUT :";
    for (int i = 0; i < 10; i++)
    {
        cout << arr1[i] << " ";
    }
    cout << endl;
    cout << "NUMBER OF SWAPS IN BEST CASE IS  " << swaps_best << endl
         << endl;

    // Average Case
    int arr2[10] = {3, 8, 4, 1, 6, 2, 5, 7};
    cout << "Sorting the AVERAGE CASE array " << endl;
    cout << "INPUT :";
    for (int i = 0; i < 10; i++)
    {
        cout << arr2[i] << " ";
    }
    cout << endl;

    int swaps_avg = bubbleSort(arr2, 8);

    cout << "OUTPUT :";
    for (int i = 0; i < 10; i++)
    {
        cout << arr2[i] << " ";
    }
    cout << endl;
    cout << "NUMBER OF SWAPS IN AVERAGE CASE IS " << swaps_avg << endl
         << endl;

    // Worst Case
    int arr3[10] = {8, 7, 6, 5, 4, 3, 2, 1};
    cout << "Sorting the WORST CASE array" << endl;
    cout << "INPUT :";
    for (int i = 0; i < 10; i++)
    {
        cout << arr3[i] << " ";
    }
    cout << endl;

    int swaps_worst = bubbleSort(arr3, 8);

    cout << "OUTPUT :";
    for (int i = 0; i < 10; i++)
    {
        cout << arr3[i] << " ";
    }
    cout << endl;
    cout << "NUMBER OF SWAPS OCCURED   " << swaps_worst << endl;

    return 0;
}
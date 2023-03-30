// C++ program for implementation of
// selection sort
#include <bits/stdc++.h>
using namespace std;

void swap(int *xp, int *yp)
{
    int temp = *xp;
    *xp = *yp;
    *yp = temp;
}

int selectionSort(int arr[], int n)
{
    int i, j, min_idx;
    int cnt = 0;
    for (i = 0; i < n - 1; i++)
    {

        // Find the minimum element in
        // unsorted array
        min_idx = i;
        for (j = i + 1; j < n; j++)
            if (arr[j] < arr[min_idx])
                min_idx = j;

        // Swap the found minimum element
        // with the first element
        if (min_idx != i)
        {

            cnt++;
            swap(&arr[min_idx], &arr[i]);
        }
        return cnt;
    }
}

// Function to print an array
void printArray(int arr[], int size)
{
    int i;
    for (i = 0; i < size; i++)
        cout << arr[i] << " ";
    cout << endl;
}

// Driver program to test above functions
int main()
{
    // Best Case
    // int arr[] = {2, 3, 4, 5, 6, 7, 8};
    int arr[] = {4, 5, 3, 6, 7, 8, 2};

    int n = sizeof(arr) / sizeof(arr[0]);
    cout << "Given Array : ";
    printArray(arr, n);
    int i = selectionSort(arr, n);
    cout << "Best Case : ";
    printArray(arr, n);
    cout << "No of comparisons : " << i << endl;

    // Average Case
    // n = sizeof(arr1) / sizeof(arr1[0]);
    // cout << "Given Array : ";
    // printArray(arr1, n);
    // selectionSort(arr1, n);
    // cout << "Average Case : \n";
    // printArray(arr1, n);
    // cout << endl;

    // // Worst Case
    // int arr2[] = {8, 7, 6, 5, 4, 3, 2};
    // n = sizeof(arr2) / sizeof(arr2[0]);
    // cout << "Given Array : ";
    // printArray(arr2, n);
    // selectionSort(arr2, n);
    // cout << "Worst Case : \n";
    // printArray(arr2, n);

    return 0;
}
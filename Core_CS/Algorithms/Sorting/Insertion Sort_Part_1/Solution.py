import math
import os
import random
import re
import sys

# Complete the insertionSort1 function below.
def insertionSort1(n, arr):
    for j in range(1, len(arr)):
        key = arr[j]
        i = j-1
        while (i>-1 and arr[i] > key):
            arr[i+1] = arr[i]
            for z in arr:
                print(z, end=" ")
            print()
            i = i-1
        arr[i+1] = key
    for z in arr:
        print(z, end=" ")


if __name__ == '__main__':
    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    insertionSort1(n, arr)
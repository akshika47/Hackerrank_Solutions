import math
import os
import random
import re
import sys

# Complete the countingSort function below.
def countingSort(arr):
    a = [0] * 100
    for x in range(0, len(arr)):
        a[arr[x]] = a[arr[x]] + 1
    
    return a

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    result = countingSort(arr)

    fptr.write(' '.join(map(str, result)))
    fptr.write('\n')

    fptr.close()

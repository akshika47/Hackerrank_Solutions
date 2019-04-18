import math
import os
import random
import re
import sys

# Complete the quickSort function below.
def quickSort(arr):
    p = arr[0]
    i = 0
    for j in range(1,len(arr)):
        if(arr[j]<p):
            i = i + 1
            temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
    
    temp = arr[i]
    arr[i] = arr[0]
    arr[0] = temp

    return arr

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    result = quickSort(arr)

    fptr.write(' '.join(map(str, result)))
    fptr.write('\n')

    fptr.close()

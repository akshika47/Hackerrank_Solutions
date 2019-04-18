import math
import os
import random
import re
import sys

A = []
def Partition(A,p,r):
    x = A[r]
    i = p - 1
    for j in range(p,r):
        if(A[j]<=x):
            i = i + 1
            temp1 = A[i]
            A[i] = A[j]
            A[j] = temp1
    
    temp2 = A[i+1]
    A[i+1] = A[r]
    A[r] = temp2
    return i+1


def QuickSort(A,p,r):
    if(p<r):
        q = Partition(A,p,r)
        QuickSort(A,p,q-1)
        QuickSort(A,q+1,r)

# Complete the findMedian function below.
def findMedian(arr):
    A = arr
    QuickSort(A,0,len(arr)-1)
    return A[len(arr)/2]

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(raw_input())

    arr = map(int, raw_input().rstrip().split())

    result = findMedian(arr)

    fptr.write(str(result) + '\n')

    fptr.close()

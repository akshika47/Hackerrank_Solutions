if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    setArr = set(arr)
    setArr.remove(max(setArr))
    print(max(setArr))


if __name__ == '__main__':
    N = int(input())
    listX = list()
    for i in range(0,N):
        first = input()
        instruction = first.split()
        if(instruction[0]=="insert"):
            listX.insert(int(instruction[1]),int(instruction[2]))
        if(instruction[0]=="print"):
            print(listX)
        if(instruction[0]=="remove"):
            listX.remove(int(instruction[1]))
        if(instruction[0]=="append"): 
            listX.append(int(instruction[1]))
        if(instruction[0]=="sort"):  
            listX.sort()
        if(instruction[0]=="pop"):
            listX.pop()
        if(instruction[0]=="reverse"):
            listX.reverse()

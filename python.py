def equilibriumpoint(arr):
    n = len(arr)
    left = 0
    pivot = 0
    right = sum(arr[1:])
    
    while(pivot<n-1 and left!=right):
        pivot+=1
        right-=arr[pivot]
        left+=arr[pivot-1]
        
    return pivot+1 if left==right else -1
    
if __name__ == "__main__":
    arr = [-7, 1, 5, 2, -4, 3, 0]
    print(equilibriumpoint(arr))
def move_zeros(arr):
    pos = 0
    for i in range(len(arr)):
        if arr[i] != 0:
            arr[i],arr[pos]=arr[pos],arr[i]
            pos+=1
            # return arr
arr = [1,2,0,5,3,0,4,0]
move_zeros(arr)
print(arr)

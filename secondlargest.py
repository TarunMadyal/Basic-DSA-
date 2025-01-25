def second_Largest(arr):
        if arr[0]>arr[1]:
            L = arr[0]
            SL = arr[1]
        else:
            L = arr[1]
            SL = arr[0]
        for i in range(2, len(arr)):
            if arr[i] > L:
                SL = L
                L = arr[i]
            elif arr[i] > SL:
                SL = arr[i]
        return SL
arr = [5,4,3,2,1]
print(second_Largest(arr))

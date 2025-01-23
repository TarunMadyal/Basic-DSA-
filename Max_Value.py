def maxValue(a):
    max  = a[0]
    for i in a:
        if i > max:
            max = i
    return max

a = [1,2,3,5,6,7]
print("Largest Value = ",maxValue(a))



def reverse_array(arr):
    start, end = 0, len(arr) - 1
    while start < end:
        arr[start], arr[end] = arr[end], arr[start]  # Swap elements
        start += 1
        end -= 1

# Example usage
arr = [1, 2, 3, 4, 5]
reverse_array(arr)
print("Reversed Array:", arr)

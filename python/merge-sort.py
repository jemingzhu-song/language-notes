def mergeSort(arr):
    if len(arr) > 1:
        left_arr = arr[:len(arr)//2] # Lower half of array
        right_arr = arr[len(arr)//2:] # Upper half of array

        # Recursive Call - Sort the Lower and Upper Half of Arrays
        mergeSort(left_arr)
        mergeSort(right_arr)

        # Merge the Arays
        i = 0 # Keep track of lower half of array
        j = 0 # Keep track of upper half of array
        k = 0 # Keeps track of index in the "merged" array index

        while i < len(left_arr) and j < len(right_arr):
            # Lower half of array is less than upper half of array, insert it into "Merged"
            if left_arr[i] < right_arr[j]:
                arr[k] = left_arr[i]
                i += 1
            # Upper half of the array is less than or equal to upper half of array, insert it into "Merged"
            else:
                arr[k] = right_arr[j]
                j += 1
            k += 1
        
        # If reached the end of the upper half of array - transfer all elements from lower half
        # to "Merged"
        while i < len(left_arr):
            arr[k] = left_arr[i]
            i += 1
            k += 1
        
        # If reached the end of the lower half of array - transfer all elements from upper half
        # to "Merged"
        while i < len(right_arr):
            arr[k] = right_arr[j]
            j += 1
            k += 1

test = [5, -1, 9, 2, -10, 59, 3, 2]
mergeSort(test)
print(test)

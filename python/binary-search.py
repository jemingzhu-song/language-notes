def binarySearch(nums, low, high, target):
    # Base Case
    if low <= high:
        # Calculate middle index
        mid = int((low + high)/2)

        if target == nums[mid]:
            return mid
        elif target < nums[mid]:
            return binarySearch(nums, low, mid - 1, target)
        else: # target > nums[mid]:
            return binarySearch(nums, mid + 1, high, target)
    else:
        return -1

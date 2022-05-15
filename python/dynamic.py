# Max Sum Subarray

s = "abdabbbcde"
def lengthOfLongestSubstring(self, s: str) -> int:
    maxLength = 0
    seen = []
    
    for char in s:
        if char in seen:
            ind = seen.index(char)
            seen = seen[ind + 1:]
            seen.append(char)
        else:
            seen.append(char)
        
        if len(seen) > maxLength:
            maxLength = len(seen)
    
    return maxLength
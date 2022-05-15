def sort(l):
    i = 0
    while i < len(l):
        j = i + 1
        while j < len(l):
            if l[j] < l[i]: 
                # Swap positions
                temp = l[j]
                l[j] = l[i]
                l[i] = temp
            j += 1
        i += 1
    
def sortInsert(l):
    sorted = []
    i = 0
    while len(l) > 0:
        min = l[i]
        for n in l:
            if n < min:
                min = n
        sorted.append(min)
        l.remove(min)
        
    print(sorted)


l = [5,2,3,10,9,13,6]

print(l)
sortInsert(l)
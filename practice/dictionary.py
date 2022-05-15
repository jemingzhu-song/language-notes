votes = {}
votes['B'] = [5,4,7]
votes['A'] = [2,1,1]
votes['C'] = [2,2,3]


print(votes)
l = sorted(votes.keys())
sorted = sorted(l, key = lambda x: votes[x], reverse = True)
print(sorted)
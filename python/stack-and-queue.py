# Stack - use .append() and .pop()
stack = []

# Use .append() to push to the stack
stack.append(5)
stack.append(3)
stack.append(2)

# Use .pop() to pop from the stack
print(stack.pop())
stack.pop()
stack.pop()

# Queue - use .insert(0, value) and .pop() OR .append() and .pop(0)

# 1. Using .insert(0, value) and .pop()
queue = []

# Use .insert(0, value) to add to queue
queue.insert(0,"Monday")
queue.insert(0, "Tuesday")
queue.insert(0, "Wednesday")
queue.insert(0, "Thursday")

# Use .pop(0) to remove from the queue
print(queue.pop()) # Monday
print(queue.pop()) # Tuesday
print(queue.pop()) # Wednesday
print(queue.pop()) # Thursday

# 2. Using .append() and .pop(0)
queue = []

# Use .append() to add to the queue
queue.append("Mon")
queue.append("Tues")
queue.append("Wed")

# Use .pop(0) to remove from the queue
print(queue.pop(0)) # Mon
print(queue.pop(0)) # Tues
print(queue.pop(0)) # Wed

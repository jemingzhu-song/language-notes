class Person:
    def __init__(self, firstName, lastName, age):
        self.firstName = firstName
        self.lastName = lastName
        self.age = age
    
    def details(self):
        return self.firstName + " " + self.lastName + " " + str(self.age)


p1 = Person("Michael", "Jones", 15)
p2 = Person("Thomas", "Shelby", 23)
p3 = Person("Andrew", "Zhu", 25)
p4 = Person("Veronica", "Phan", 20)

people = [p1, p2, p3, p4]

# Sort by First Name - Alphabetical Order
sorted1 = sorted(people, key=lambda p: p.firstName)
result = []
for person in sorted1:
    result.append(person.details())
print(result)

# Sort by Age - Ascending Order
def func(person):
    return person.age

sorted2 = sorted(people, key=func)
result = []
for person in sorted2:
    result.append(person.details())
print(result)

# Nested list of student's info in a Science Olympiad
# List elements: (Student's Name, Marks out of 100 , Age)
participant_list = [
    ('Alison', 50, 18),
    ('Terence', 75, 12),
    ('David', 75, 20),
    ('Jimmy', 90, 22),
    ('John', 45, 12)
]

def sorter(item):
    # Since highest marks first, least error = most marks
    error = 100 - item[1]
    age = item[2]
    return (error, age)

# Sort by highest mark
sorted_list = sorted(participant_list, key=sorter)
print(sorted_list)
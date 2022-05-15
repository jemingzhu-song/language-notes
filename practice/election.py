from tokenize import group
from typing import List
# 5 working days
# heavily on the values

# election class to determine winner of election
class election:

    def __init__(self) -> None:
        # hash table of nominees and their votes {(name:str) : (count:int)}
        self.nominees = {}

    # Function that determines winner based off of input votes 
    def find_winner(self,votes : List[str]) -> str:
        max_votes = 0
        most_voted = ""
        for vote in votes:
            if vote in self.nominees:
                self.nominees[vote] +=1 
            else:
                self.nominees[vote] = 1

            if self.nominees[vote] > max_votes:
                # print(vote)
                max_votes = self.nominees[vote]
                most_voted = vote

        return most_voted


    def find_winner2(self, votes):
        max_votes = 0
        most_voted = ""
        for group_vote in votes:
            for i in range(3):
                vote = group_vote[i]
                if vote in self.nominees:
                    self.nominees[vote] += 3 - i 
                else:
                    self.nominees[vote] = 3 - i

                if self.nominees[vote] > max_votes:
                    max_votes = self.nominees[vote]
                    most_voted = vote

        return most_voted


solution = election()
print(solution.find_winner(["ABC", "ACB", "ACC", "BCA"]))
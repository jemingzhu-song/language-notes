# Given a list of votes (strings), we want to find the winner

# e.g. ["ABC", "ACB", "ACC", "BCA"]
# "A" received the highest score (and most votes)

from typing import List


class Solution:
    def __init__(self):
        self.tracker = {} # e.g. {'A': 5, 'B': 2, 'C': 2}

    def winner(self, votes: List[str]) -> str:
        if votes == []:
            return ''
        
        # ["ABC", "ACB", "BCA"]

        # i = 0, vote = "ABC"
            # points = 3
                # team = "A", {'A': 3} 
            # points = 2
                # team = "B", {'A': 3, 'B': 2}
            # points = 1
                # team =  "C", {'A': 3, 'B': 2, 'C': 1}
        # i = 1, vote = "ACB"
            # points = 3
                # team = "A", {"A": 6, "B": 2, "C": 1}
            # points = 2
                # team = "C", {"A": 6, "B": 2, "C": 3}
            # points = 1
                # team = "B", {"A": 6, "B": 3, "C": 3}
        # i = 2, vote = "BCA"
            # points = 3
                # team = "B", {"A": 6, "B": 5, "C": 3}
            # points = 2
                # team = "C", {"A": 6, "B": 5, "C": 5}
            # points = 1
                # team = "A", {"A": 7, "B": 5, "C": 5}

        for vote in votes:
            points = len(vote)
            for team in vote:
                if team in self.tracker: 
                    self.tracker[team] += points
                else: # team not in self.tracker
                    self.tracker[team] = points
                points -= 1 # each subsequent position will receive 1 less point
        
        # Find the winning team
        winner = ''
        maxPoints = 0
        for key, value in self.tracker.items():
            if value > maxPoints:
                maxPoints = value
                winner = key
        
        return winner
                    




solution = Solution()

result = solution.winner(["ABC", "ACB", "ACC", "BCA"])
print(result) # A
solution.tracker = {}

result = solution.winner(["ABC", "ACB", "CAB", "CAB"])
print(result) # A
solution.tracker = {}

result = solution.winner(["CBA", "ACB", "CAB", "CAB"])
print(result) # A
solution.tracker = {}
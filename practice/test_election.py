import unittest
from election import election

class test_election(unittest.TestCase):
    # function executes before every test 
    def setUp(self) -> None:
        self.elect = election()
    # Test basic vote case where most number of votes wins
    def test_popular_vote(self):
        input = ["A", "B", "C", "A"]
        self.assertEqual(self.elect.find_winner(input), "A")

    # Test scenario when votes are tied and first occuring name succeeds
    def test_tie(self):
        input = ["A","B","C"]
        self.assertEqual(self.elect.find_winner(input),"A")

    # Test if no votes are provided then return empty string
    def test_no_votes(self):
        input = []
        self.assertEqual(self.elect.find_winner(input),"")

    # Test in the event of a tie return first candidate that has most votes
    def test_tie_break(self):
        input = ["B","C","A","A","B"]
        self.assertEqual(self.elect.find_winner(input),"A")

if __name__ == '__main__':
    unittest.main()
    # input = ["B","C","A","A","B"]
    # elect = election()
    # print(elect.find_winner(input))
import unittest

from election import election

class Test_Election(unittest.TestCase):
    # Function runs before every test
    def setUp(self) -> None:
        self.election = election()

    def test_popular_vote(self):
        input = ["A", "B", "A"]
        self.assertEqual(self.election.find_winner(input), "A")
    
    def test_none_votes(self):
        input = ["A", "B", "B", "A", "B"]
        self.assertEqual(self.election.find_winner(input), "B")
    
if __name__ == "__main__":
    unittest.main()
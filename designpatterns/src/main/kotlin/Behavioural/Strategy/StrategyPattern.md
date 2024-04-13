The Strategy Pattern implementation in real-world applications is almost identical to how the Observer Pattern
is implemented, except that the logic performed by each "Strategy" is focused more on "algorithm" logic (e.g.
calculating, building a response, storing data, etc.) rather than "reactive" logic (e.g. processing events
from an SQS queue). However in most cases, it'll be identical.
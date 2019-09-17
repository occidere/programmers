from collections import Counter


def solution(participant, completion):
    return (Counter(participant) - Counter(completion)).popitem()[0]

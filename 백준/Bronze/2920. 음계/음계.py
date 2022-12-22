import sys

major = list(map(int, sys.stdin.readline().split()))

if major == sorted(major):
    print("ascending")
elif major == sorted(major, reverse = True):
    print("descending")
else:
    print("mixed")
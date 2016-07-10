# Enter your code here. Read input from STDIN. Print output to STDOUT
import sys

test_case = int(raw_input().strip())

for i in range(test_case):
    prisoners, sweets, start = map(int,sys.stdin.readline().split())
    res = 0
    if (sweets + start - 1) % prisoners == 0:
        res = prisoners
    else:
        res = (sweets + start - 1) % prisoners
    print(res)

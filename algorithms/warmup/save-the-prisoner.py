# Enter your code here. Read input from STDIN. Print output to STDOUT
import sys

test_case = int(raw_input().strip())

for i in range(test_case):
    prisoners, sweets, start = map(int,sys.stdin.readline().split())
    cur_idx = start

    for i in range(start, start + sweets):
        if i != cur_idx:
            if cur_idx % prisoners == 0:
                cur_idx = 1
            else:
                cur_idx += 1
        sweets -= 1
        if sweets == 0:
            print(cur_idx)
            break

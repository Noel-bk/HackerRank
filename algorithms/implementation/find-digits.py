#!/bin/python
import sys

t = int(raw_input().strip())
for a0 in xrange(t):
    n = int(raw_input().strip())
    arr = map(int, str(n))
    cnt = 0

    for i in range(len(arr)):
        if arr[i] != 0 and n % arr[i] == 0:
            cnt += 1
    print(cnt)

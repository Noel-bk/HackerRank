#!/bin/python

import sys

n,k = raw_input().strip().split(' ')
n,k = [int(n),int(k)]
a = map(int,raw_input().strip().split(' '))

pairs = 0

for i in range(len(a)):
    for j in range(len(a)):
        if i < j and (a[i]+a[j]) % k == 0:
            pairs += 1
print(pairs)

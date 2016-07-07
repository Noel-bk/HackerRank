#!/bin/python
import sys

n = int(raw_input().strip())

for i in range(n):
    print('%0*s' % (n, '#'*(i+1)))

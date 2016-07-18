#!/bin/python
import sys

def dec_to_bin(n):
    b = "{0:b}".format(n)
    return b

def max_number_of_consecutive_one(na):
    con = False
    res = 0
    temp = [0]

    for i in range(len(na)):
        if na[i] == '1':
            con = True
        else:
            temp.append(res)
            res = 0
            con = False

        if con == True:
            res += 1
#        print("i=[%d] val=[%s] res=[%d] con=[%s]" % (i, na[i], res, con))
    return max(res, max(temp))

n = int(raw_input().strip())

# print(dec_to_bin(n))
f = dec_to_bin(n)

print(max_number_of_consecutive_one(f))

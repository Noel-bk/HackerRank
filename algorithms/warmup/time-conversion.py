#!/bin/python
import sys

time = raw_input().strip()

if time.find('AM') > 0:
    time = time.replace('AM', '')
    arr = time.split(':')
    if arr[0] == '12':
        print('00' + ':' + arr[1] + ':' + arr[2])
    else:
        print(arr[0] + ':' + arr[1] + ':' + arr[2])
elif time.find('PM') > 0:
    time = time.replace('PM', '')
    arr = time.split(':')
    if arr[0] == '12':
        print(arr[0] + ':' + arr[1] + ':' + arr[2])
    else:
        print(str(int(arr[0]) + 12) + ':' + arr[1] + ':' + arr[2])

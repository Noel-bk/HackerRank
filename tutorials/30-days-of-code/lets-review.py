# Enter your code here. Read input from STDIN. Print output to STDOUT
test_case = int(raw_input().strip())

for i in range(test_case):
    string = raw_input()
    print(string[::2] + ' ' + string[1::2])

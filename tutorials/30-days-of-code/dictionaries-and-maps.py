# Enter your code here. Read input from STDIN. Print output to STDOUT
N = int(raw_input().strip())
phone_book = {}
queries = []

def lookup(list):
    for i in range(len(list)):
        if phone_book.get(list[i]):
            print("%s=%s" % (list[i], phone_book.get(list[i])))
        else:
            print('Not found')


for i in range(N):
    # insert
    k,v = raw_input().strip().split(' ')
    phone_book[k] = v

while True:
    try:
        query = raw_input()
    except(EOFError):
        break
    if query == '':
        break
    else:
        queries.append(query)

lookup(queries)

"""
print(phone_book)
print(queries)
"""

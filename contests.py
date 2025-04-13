from sympy import isprime
for tc in range(int(input())):
    x,k=map(int,input().split())
    print("YES" if isprime(int(str(x)*k)) else "NO")
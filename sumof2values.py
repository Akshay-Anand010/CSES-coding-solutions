n,x=map(int,input().split())
a=list(map(int,input().split()))
s=0
for i in range(n):
    p=x-a[i]
    if p in a[:i-1] or p in a[i+1:]:
        s=a.index(p)
        break
if(s==0):
    print("IMPOSSIBLE")
else:
    print(i+1,s+1)
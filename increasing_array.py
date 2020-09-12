n=int(input())
a=list(map(int,input().split()))
c=0
for i in range(1,n):
    if(a[i]<a[i-1]):
        c+=abs(a[i]-a[i-1])+1
print(c-(c%n))

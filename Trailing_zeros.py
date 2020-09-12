import math 
n=int(input())
fac=math.factorial(n)
l=[int(x) for x in str(fac)]
c=0
i=len(l)-1
while(i>=0):
    if(l[i]==0):
        c+=1
    else:
        break
    i-=1
print(c)
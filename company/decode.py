#codes='865124883'
def check(s):
    if s[0]=='0':
        return(0)	
    n=len(s)
    for i in range(1,n):
    	if s[i]=='0':
    		flag=1
    		if s[i-1]!='1' and s[i-1]!='2':
    			return(0)
    
   
    dp=[0]*(n+1)
    dp[0]=1
    dp[1]=1
    for i in range(2,n+1):
    	dp[i]=dp[i-1]
    	if s[i-2]!='0' and int(s[i-2]+s[i-1])<=26:
    		dp[i]+=dp[i-2]
    	if s[i-1]=='0':
    	    dp[i]=dp[i-2]
    # if flag==1:
    # 	return(dp[n]-1)
    return(dp[n])	
t=int(input())
for t in range(t):
    n=input()
    s=input()
    print(check(s))

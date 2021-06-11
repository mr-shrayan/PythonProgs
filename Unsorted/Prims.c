#include<stdio.h>
int main()
{
    int a,b,u,v,n,i,j,edge=1;
    int visit[10]={0},min,minimumcost=0,cost[10][10];
	printf("ENTER NODES : ");
	scanf("%d",&n);
	printf("\nENTER MATRIX: \n");
	for(i=1;i<=n;i++)
	for(j=1;j<=n;j++){
        scanf("%d",&cost[i][j]);
		if(cost[i][j]==0)
			cost[i][j]=32767;
	}


	visit[1]=1;
	printf("\n");
		while(edge < n){
			for(i=1,min=999;i<=n;i++)
			for(j=1;j<=n;j++)
			if(cost[i][j]< min)
			//finding the minimum
			if(visit[i]!=0){
				min=cost[i][j];
				a=u=i;
				b=v=j;
			}
		if(visit[u]==0 || visit[v]==0)
		{
			printf("\n Edge %d:(%d %d) cost:%d",edge++,a,b,min);
			minimumcost+=min;
			visit[b]=1;
		}
		cost[a][b]=cost[b][a]=999;
	}
	printf("\n Minimun cost is=%d\n",minimumcost);
}

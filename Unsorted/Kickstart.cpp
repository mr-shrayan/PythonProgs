#include <iostream>
#include <cmath>
using namespace std;

int main(){
    int t, sl, i, c;
    int A[3], B[3], C[3]; 
    cin >> t;
    B[1]= -1;
    c = 0;
    for(sl = 1; sl <= t; sl++)
    {
        c = 0;
        
        for(i=0; i<3; i++){
            cin >> A[i];
        }
        for(i=0; i<3; i= i+2){
            cin >> B[i];
        }
        for(i=0; i<3; i++){
            cin >> C[i];
        }

        if((B[0]%2==0 && B[2]%2==0) || (B[0]%2!=0 && B[2]%2!=0))
            B[1]= (B[0]+B[2])/2;

        else if((A[0]%2==0 && C[2]%2==0) || (A[0]%2!=0 && C[2]%2!=0))
            B[1]= (A[0]+C[2])/2; 

        else if((A[2]%2==0 && C[0]%2==0) || (A[2]%2!=0 && C[0]%2!=0))
            B[1]= (A[2]+C[0])/2; 

        else if((A[1]%2==0 && C[1]%2==0) || (A[1]%2!=0 && C[1]%2!=0))
            B[1]= (A[1]+C[1])/2; 

        if(B[0]-B[1] == B[1]-B[2])
            c++;

        if(A[0]-B[1] == B[1]-C[2])
            c++;

        if(A[2]-B[1] == B[1]-C[0])
            c++;

        if(A[1]-B[1] == B[1]-C[1])
            c++;

        if(A[0]-A[1] == A[1]-A[2])
            c++;

        if(C[0]-C[1] == C[1]-C[2])
            c++;

        if(A[0]-B[0] == B[0]-C[0])
            c++;

        if(A[2]-B[2] == B[2]-C[2])
            c++;  

        cout <<"Case #"<<sl<<": "<<c<<"\n";
    }
    
    return 0;
}
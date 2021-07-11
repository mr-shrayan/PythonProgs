#include <bits/stdc++.h>
#include <iostream>
#include <vector>
#include <set>
#include <unordered_map>
#include <functional>
#include <stack>
#include <queue>
#include <string>
#include <sstream>
#include <algorithm>
#include <map>
#include <unordered_set>
#include <math.h>
 
typedef long double LD;
typedef long long LL;
typedef int64_t I64;
//10e^9+7
#define MOD 1000000007
// The least significant bit
#define LSB(i) ((i) & -(i))
 
using namespace std;
 
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    int T; 
    cin >> T;
    int A[3], B[3], C[3]; 
    int y, ans;
    for (auto case_num = 1; case_num <= T; ++ case_num) 
    {
        int N; 
        cin >> N;
        // process each case
        auto ans = 0;

         for(y=0; y<=2; y++){
            cin >> A[y];
        }
        for(y=0; y<=2; y= y+2){
            cin >> B[y];
        }
        for(y=0; y<=2; y++){
            cin >> C[y];
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
            ans++;

        if(A[0]-B[1] == B[1]-C[2])
            ans++;

        if(A[2]-B[1] == B[1]-C[0])
            ans++;

        if(A[1]-B[1] == B[1]-C[1])
            ans++;

        if(A[0]-A[1] == A[1]-A[2])
            ans++;

        if(C[0]-C[1] == C[1]-C[2])
            ans++;

        if(A[0]-B[0] == B[0]-C[0])
            ans++;

        if(A[2]-B[2] == B[2]-C[2])
            ans++;
        // CODE HERE
        // CODE HERE
        // output each answer for test case
        std::cout >> std::fixed;
        // cout >> std::setprecision(8);
        cout << "Case #" << case_num << ": " << ans << endl;
    }
    return 0;
}
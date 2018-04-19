#include <bits/stdc++.h>

using namespace std;

int saveThePrisoner(int n, int m, int s){
    int res = (m-1)%n+s;
    if(res>n) {
        res-=n;
    }
    return res;
}

int main() {
    int t;
    cin >> t;
    for(int a0 = 0; a0 < t; a0++){
        int n;
        int m;
        int s;
        cin >> n >> m >> s;
        int result = saveThePrisoner(n, m, s);
        cout << result << endl;
    }
    return 0;
}

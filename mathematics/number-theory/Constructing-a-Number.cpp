#include <bits/stdc++.h>

using namespace std;

string canConstruct(vector <int> a) {
    int r = 0;
    for(int num : a) {
        r+=num;
        r%=3;
    }
    return r==0 ? "Yes" : "No";
}

int main() {
    int t;
    cin >> t;
    for(int a0 = 0; a0 < t; a0++){
        int n;
        cin >> n;
        vector<int> a(n);
        for(int a_i = 0; a_i < n; a_i++){
           cin >> a[a_i];
        }
        string result = canConstruct(a);
        cout << result << endl;
    }
    return 0;
}
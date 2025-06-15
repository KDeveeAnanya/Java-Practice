#include<iostream>
#include<vector>
using namespace std;

class SingleNumber_02
{
    public:
            int singlenumber(vector<int> &arr)
            {
                int ans=0;
                for(int i:arr)
                {
                    ans=ans^i;
                }
                return ans;
            }
};

int main()
{
     vector<int> arr={1,2,4,2,1};
    SingleNumber_02 obj;
    int ans=obj.singlenumber(arr);
    cout<<"The number that repeated only once is: "<<ans<<endl;
    return 0;
}
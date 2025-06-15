// Problem: Largest number in the array
// Link: https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1
// Date: 2025-06-15

#include<iostream>
#include<vector>
using namespace std;

class largest_number_01
{
    public :
            int largest(vector<int> &arr)
            {
                int max=arr[0];
                for(int i=0;i<arr.size();i++)
                {
                    if(arr[i]>max)
                    {
                        max=arr[i];
                    }
                }
                return max;
            }
};
        int main()
        {
            vector<int> arr={45,3,78,90};
            largest_number_01 obj;
            int ans=obj.largest(arr);
            cout<<"Largest number in the array: "<<ans<<endl;
            return 0;
        }

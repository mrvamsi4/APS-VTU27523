class Solution {
    int[] nums,idx,tmp,ans;
    public List<Integer> countSmaller(int[] nums){
        this.nums=nums;int n=nums.length;idx=new int[n];tmp=new int[n];ans=new int[n];for(int i=0;i<n;i++)idx[i]=i;sort(0,n);
        List<Integer>out=new java.util.ArrayList<>();for(int x:ans)out.add(x);return out;
    }
    private void sort(int l,int r){if(r-l<=1)return;int m=(l+r)/2;sort(l,m);sort(m,r);int i=l,j=m,k=l;
        while(i<m&&j<r){if(nums[idx[i]]<=nums[idx[j]]){ans[idx[i]]+=j-m;tmp[k++]=idx[i++];}else tmp[k++]=idx[j++];}
        while(i<m){ans[idx[i]]+=j-m;tmp[k++]=idx[i++];}while(j<r)tmp[k++]=idx[j++];for(k=l;k<r;k++)idx[k]=tmp[k];
    }
}

class GfG
{
      public static void printDuplicates(int arr[], int n)
       {
           for(int i=0;i<n;i++)
           {
               if(arr[Math.abs(arr[i])]>0)
               {
                   arr[Math.abs(arr[i])]=-1*arr[Math.abs(arr[i])];
               }
               else
               {
                   System.out.print(Math.abs(arr[i]) +" ");
               }
           }
       }
}
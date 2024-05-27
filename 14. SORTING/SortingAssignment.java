import java.util.*;
//Sort the elements in reverse order
public class SortingAssignment 
{
    public static void main(String[] args) 
    {
        int[] BubbleArr={1,8,3,1,3,6,2,7,4,5};
        int[] SelectionArr={2,7,4,5,1,8,3,1,3,6};
        int[] InsertionArr={3,6,2,1,8,7,4,5,3,1};
        int[] CountingArr={7,4,5,3,1,3,6,2,1,8};
        System.out.println("Array before Bubble Sort: "+Arrays.toString(BubbleArr));
        System.out.println("Array after Bubble Sort: "+Arrays.toString(bubbleSort(BubbleArr)));
        System.out.println("Array before Selection Sort: "+Arrays.toString(SelectionArr));
        System.out.println("Array after Selection Sort: "+Arrays.toString(selectionSort(SelectionArr)));
        System.out.println("Array before Insertion Sort: "+Arrays.toString(InsertionArr));
        System.out.println("Array after Insertion Sort: "+Arrays.toString(insertionSort(InsertionArr)));
        System.out.println("Array before Counting Sort: "+Arrays.toString(CountingArr));
        System.out.println("Array after Counting Sort: "+Arrays.toString(countingSort(CountingArr)));
    }
    public static int[] bubbleSort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]>arr[j])//replaced condition to keep larger elemnets first
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }   
    public static int[] selectionSort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int maxPos=i;
            for(int j=i+1;j<arr.length;j++)
            {
                maxPos=(arr[maxPos]<arr[j])?j:maxPos;
            }
            int temp=arr[maxPos];
            arr[maxPos]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }    
    public static int[] insertionSort(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]<curr)
            {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
        return arr;
    }     
    public static int[] countingSort(int[] arr)
    {
        int largest=0;
        for(int i=0;i<arr.length;i++)
        {
            largest=(arr[i]>largest)?arr[i]:largest;
        }
        int[] count=new int[largest+1];
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;
        }
        int j=arr.length -1;
        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0)
            {
                arr[j]=i;
                j--;
                count[i]--;
            }
        }
        return arr;
    }    
}

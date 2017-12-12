import java.util.Arrays;

public class RangeExtraction_51ba717bb08c1cd60f00002f {

    public static void main(String[] args) {

        int[] arr = {22, 23, 24, 26, 27};
        StringBuilder sb = new StringBuilder();
        boolean delLast = true;

        for (int i = 0; i<arr.length; i++)
        {
            if (arr[i]+1 == arr[i+1] && i<arr.length-2 && arr[i+1]+1 == arr[i+2])
            {
                int j = i+2;
                while (j+1 != arr.length && arr[j]+1 == arr[j+1])
                {
                    j++;
                }
                sb.append(arr[i]);
                sb.append("-");
                sb.append(arr[j]);
                sb.append(",");
                i = j;
                if (i+1 == arr.length-1)
                {
                    sb.append(arr[arr.length-1]);
                    i = arr.length + 5;
                    delLast = false;
                }
            }
            else
            {
                sb.append(arr[i]);
                sb.append(",");
                if (i+1 == arr.length-1)
                {
                    sb.append(arr[arr.length-1]);
                    i = arr.length + 5;
                    delLast = false;
                }
                if (i+2 == arr.length-1)
                {
                    sb.append(arr[arr.length-2]);
                    sb.append(",");
                    sb.append(arr[arr.length-1]);
                    delLast = false;
                    i = arr.length +5;
                }
            }
        }

        if (delLast == true) {
            sb.deleteCharAt(sb.length() - 1);
        }

        System.out.println(sb.toString());
    }
}


public class FindIndexOfArray {

	public static int findIndex(int[] array,int pos) {
		if(array==null) {
			return -1;
		}
		int len=array.length;
		int i=0;
		while(i<len) {
			if(array[i]==pos) {
				return i;
			}else {
				i=i+1;
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {
		int[] array	= {1,2,3,4,5,6,7,8};
		int[] newArray= {};
		System.out.println("Index positon of 4 is "+findIndex(array,4));
		System.out.println(findIndex(newArray,3));
	}

}

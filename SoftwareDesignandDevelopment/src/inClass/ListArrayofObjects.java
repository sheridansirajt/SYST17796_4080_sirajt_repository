package inClass;


public class ListArrayofObjects {
	String _arr;

	ListArrayofObjects(String arr) {
		_arr = arr;
	}

	public String get_arr() {
		return _arr;
	}

	public void set_arr(String _arr) {
		this._arr = _arr;
	}

	public static void main(String[] args) {
		ListArrayofObjects arr[] = new ListArrayofObjects[2];
		arr[0] = new ListArrayofObjects("Movie1");
		arr[1] = new ListArrayofObjects("Movie2");
		for(int x = 0;0 < arr.length;x++) {
			System.out.println(arr[x].get_arr());
		}
	}
}

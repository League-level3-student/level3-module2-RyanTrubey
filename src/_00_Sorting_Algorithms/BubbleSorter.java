package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		display.updateDisplay();
		for(int i = 0; i < array.length-1; i++) {
			if(array[i+1] < array[i]) {
				int a;
				a = array[i];
				array[i] = array[i+1];
				array[i+1] = a;
				display.updateDisplay();
				for(int e = i; e > 0; e--) {
					if(array[e] < array[e-1]) {
						int f;
						f = array[e];
						array[e] = array[e-1];
						array[e-1] = f;
						display.updateDisplay();
					}
				}
			}
		}
	}
	
}

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
		for(int i = 0; i < array.length; i++) {
			display.updateDisplay();
			for(int e = 0; e < array.length-1; e++) {
				if(array[e+1] < array[e]) {					
					int a;
					a = array[e+1];
					array[e+1] = array[e];
					array[e] = a;
				}
			}
		}
	}
	
}

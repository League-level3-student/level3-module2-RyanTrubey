package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equalsIgnoreCase("Cracked")) {
				return i;
			}
		}
		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {
		int count = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i)) {
				count++;
			}
		}
		return count;
	}

	public static double findTallest(List<Double> people) {
		double max = 0;
		for (int i = 0; i < people.size(); i++) {
			if (people.get(i) > max) {
				max = people.get(i);
			}
		}
		return max;
	}

	public static String findLongestWord(List<String> words) {
		String max = "";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > max.length()) {
				max = words.get(i);
			}
		}
		return max;
	}

	public static boolean containsSOS(List<String> message) {
		for (int i = 0; i < message.size(); i++) {
			if (message.get(i).contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> scores) {
		for (int i = 0; i < scores.size(); i++) {
			for (int j = 0; j < scores.size() - 1; j++) {
				if (scores.get(j + 1) < scores.get(j)) {
					double s = scores.get(j);
					scores.set(j, scores.get(j + 1));
					scores.set(j + 1, s);
				}
			}
		}
		return scores;
	}

	public static List<String> sortDNA (List<String> dna){
		for(int i = 0; i < dna.size(); i++) {
			for(int j = 0; j < dna.size()-1; j++) {
				if(dna.get(j+1).length() < dna.get(j).length()) {
					String s = dna.get(j);
					dna.set(j, dna.get(j+1));
					dna.set(j+1, s);
				}
			}
		}
		return dna;
	}
	public static List<String> sortWords (List<String> words){
		for(int i = 0; i < words.size(); i++) {
			for(int j = 0; j < words.size()-1; j++) {
				if(words.get(j+1).compareTo(words.get(j)) < 0) {
					String s = words.get(j);
					words.set(j, words.get(j+1));
					words.set(j+1, s);
				}
			}
		}
		return words;
	}
}

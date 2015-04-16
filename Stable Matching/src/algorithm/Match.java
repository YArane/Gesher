package algorithm;

public class Match {

	private String person;
	private String option;
	private String match;
	private boolean matched; 
	private String[] options;
	
	/**
	 * The Match class represents an assignment between a person and an option.
	 * @param tzevetMember
	 * @param assignment
	 */
	public Match(String person, String option) {
		this.person = person;
		this.option = option;
	}	
	
	/**
	 * The Match class represents an assignment between a person and their order of options.
	 * @param tzevetMember
	 * @param assignment
	 */
	public Match(String tzevetMember, String[] options) {
		this.person = tzevetMember;
		this.options = options;
	}
	
	/**
	 * @param tzevetMembers
	 * @param assignments
	 * @return a list of permutations given input lists.
	 */
	public static Match[] getAllPermutations(String[] tzevetMembers, String[] choices){
		Match[] matchPermutation = new Match[tzevetMembers.length * choices.length];
		
		int i = 0;
		for(String tzevetMember : tzevetMembers){
			for(String choice : choices){
				matchPermutation[i] = new Match(tzevetMember, choice);
				i++;
			}
		}
		
		return matchPermutation;
	}
	
	/**
	 * @return the person
	 */
	public String getPerson() {
		return person;
	}

	/**
	 * @param person the person to set
	 */
	public void setPerson(String person) {
		this.person = person;
	}

	/**
	 * @return the options
	 */
	public String[] getOptions() {
		return options;
	}

	/**
	 * @param options the options to set
	 */
	public void setOptions(String[] options) {
		this.options = options;
	}

	/**
	 * prints match to console.
	 */
	public void printMatch(){
		System.out.println("\t" + person + " : " + option);
	}
	
	/**
	 * @return the option
	 */
	public String getOption() {
		return option;
	}

	/**
	 * @param option the option to set
	 */
	public void setOption(String option) {
		this.option = option;
	}

	/**
	 * @return the match
	 */
	public String getMatch() {
		return match;
	}

	/**
	 * @param match the match to set
	 */
	public void setMatch(String match) {
		this.match = match;
	}

	/**
	 * @return the matched
	 */
	public boolean isMatched() {
		return matched;
	}

	/**
	 * @param matched the matched to set
	 */
	public void setMatched(boolean matched) {
		this.matched = matched;
	}

}

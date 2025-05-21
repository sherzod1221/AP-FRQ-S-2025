public ArrayList<Match> buildMatches() {
    ArrayList<Match> = new ArrayList<Match>();
    int start = 0;
    int end = competitorList.size() - 1;

    if (competitorList.size() %2 != 0) {
        start = 1;
    }

    while (start < end) {
        Competitor c1 = competitorList.get(start);
        Competitor c2 = competitorList.get(end);
        matches.add(new Match(c1,c2));
        start++;
        end--;
    }

    return matches;
}


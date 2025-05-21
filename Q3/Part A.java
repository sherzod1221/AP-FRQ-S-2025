public Round(String[] names) {
    competitorList = new ArrayList<Competitor>();

    for (int i = 0; i<names.length; i++){
        Competitor c = new Competitor(names[i],i+1);
        competitorList.add(c);
    }
}

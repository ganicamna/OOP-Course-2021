
public class Week5 {
	public static void main(String[] args) {
        // TODO code application logic here
        Team barcelona = new Team("FC Barcelona");
        /*System.out.println("Team: " + barcelona.getName());
        
        barcelona.setName("Real Madrid");
        System.out.println("Team: " + barcelona.getName());*/
        
        Player brian = new Player("Brian");
        System.out.println(brian);
        Player pekka = new Player("Pekka", 39);
        System.out.println(pekka);
        
        /*barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1));
        
        barcelona.printPlayers();*/
        
        barcelona.setMaxSize(3);
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1));
        barcelona.printPlayers();
        //System.out.println("Number of players: " + barcelona.size());
        
       
       System.out.println("Number of goals: " + barcelona.goals());
    }
}

package collectionlist.sportmanagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RunnerMap {
	private static Map<String, List<PlayerBo>> playerMap = new HashMap<String, List<PlayerBo>>();

	public static void main(String[] args) {
		PlayerBo sachin = new PlayerBo();
		sachin.setName("sachin");
		sachin.setAge(47);
		sachin.setCountry("India");
		sachin.setSport("Cricket");

		addPlayersAsPerSport(sachin);

		PlayerBo williamson = new PlayerBo();
		williamson.setName("williamson");
		williamson.setAge(30);
		williamson.setCountry("New Zealand");
		williamson.setSport("Cricket");
		addPlayersAsPerSport(williamson);

		PlayerBo messi = new PlayerBo();
		messi.setName("messi");
		messi.setAge(30);
		messi.setCountry("Argentina");
		messi.setSport("Football");
		addPlayersAsPerSport(messi);

		PlayerBo ronaldo = new PlayerBo();
		ronaldo.setName("ronaldo");
		ronaldo.setAge(35);
		ronaldo.setCountry("Portugal");
		ronaldo.setSport("Football");
		addPlayersAsPerSport(ronaldo);
	}

	public static void addPlayersAsPerSport(PlayerBo p) {
		if (playerMap.containsKey(p.getSport())) {
			System.out.println("Contains Sport: " + p.getSport());

			System.out.println(" Player List::" + playerMap.get(p.getSport()));

			List<PlayerBo> pList = playerMap.get(p.getNumber());
			pList.add(p);
			playerMap.put(p.getSport(), pList);

		} else {
			System.out.println("New Sport Found" + p.getSport());
			List<PlayerBo> pList = new ArrayList<PlayerBo>();
			pList.add(p);
			playerMap.put(p.getSport(), pList);

		}
		System.out.println(playerMap);
	}

	public Map<String, List<PlayerBo>> getPlayerData() {
		return playerMap;
	}

}

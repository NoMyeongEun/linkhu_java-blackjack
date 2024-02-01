package blackjack;

import java.util.Arrays;
import java.util.List;

public class PlayerNameList {

    private final List<String> playerNameList;

    public PlayerNameList(String str) {
        try {
            if (str.isBlank()) {
                throw new IllegalArgumentException();
            }
        }
        catch (IllegalArgumentException ex) {
            System.exit(1);
        }
        this.playerNameList = Arrays.asList(str.split(","));
    }

    public List<String> getPlayerNameList() {
        return playerNameList;
    }
}
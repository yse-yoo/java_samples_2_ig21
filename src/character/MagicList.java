package character;

import java.util.HashMap;
import java.util.Map;

public class MagicList {

    public Map<String, Magic> map = new HashMap<>();

    public MagicList() {
        map.put("fire", new Magic(MagicType.ATTACK, "ファイヤー", 4));
        map.put("brizard", new Magic(MagicType.ATTACK, "ブリザード", 5));
        map.put("protect", new Magic(MagicType.DEFENCE, "プロテス", 3));
        map.put("heal", new Magic(MagicType.HEAL, "ヒール", 5));
    }
}

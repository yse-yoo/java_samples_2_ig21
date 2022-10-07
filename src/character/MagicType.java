package character;

public enum MagicType {
    ATTACK("攻撃"), DEFENCE("防御"), HEAL("回復");

    private String value;
    
    private MagicType(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return this.value;
    }
}

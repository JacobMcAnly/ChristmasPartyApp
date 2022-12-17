package Data;

public class Food {
    private String code;
    private String description;
    private String amount;

    public Food() {
        code = "";
        description = "";
        amount = "";
    }

    public Food(String code, String description, String amount) {
        this.code = code;
        this.description = description;
        this.amount = amount;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }
}

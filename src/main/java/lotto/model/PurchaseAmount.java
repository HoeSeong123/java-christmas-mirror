package lotto.model;

public class PurchaseAmount {
    private int purchaseAmount;

    public PurchaseAmount(String input) {
        int purchaseAmount = Integer.parseInt(input);
        validate(purchaseAmount);
        this.purchaseAmount = purchaseAmount;
    }

    private void validate(int input) {
        validateIsAboveMinimumAmount(input);
        validateIsDivisible(input);
    }


    private void validateIsAboveMinimumAmount(int input) {
        if (input < 1000) {
            throw new IllegalArgumentException("[ERROR] 최소 금액은 1,000원입니다.");
        }
    }

    private void validateIsDivisible(int input) {
        if (input % 1000 != 0) {
            throw new IllegalArgumentException("[ERROR] 1,000원 단위로 입력해야 합니다.");
        }
    }
}

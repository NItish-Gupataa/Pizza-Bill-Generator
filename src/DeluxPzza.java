public class DeluxPzza extends Pizza{

    @Override
    public void addExtracheese() {}

    @Override
    public void addExtraToppings() {}

    public DeluxPzza(boolean veg) {
        super(veg);
        super.addExtracheese();
        super.addExtraToppings();
    }
}

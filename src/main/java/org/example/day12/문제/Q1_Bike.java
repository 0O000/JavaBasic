package org.example.day12.문제;

public class Q1_Bike extends Q1_Vehicle{
    private boolean hasCarrier;

    public Q1_Bike(String brand, String model, boolean hasCarrier) {
        super(brand, model);
        this.hasCarrier = hasCarrier;
    }

    public boolean isHasCarrier() {
        return hasCarrier;
    }

    @Override
    public String display(){
        return "차량 정보[" +
                "브랜드: " + getBrand() +
                ", 모델: " + getModel() +
                ", 캐리어 유무: " + isHasCarrier() +
                ']';
    };
}

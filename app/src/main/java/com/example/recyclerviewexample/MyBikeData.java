package com.example.recyclerviewexample;

public class MyBikeData {
    private String bikeName;
    private String bikePrice;
    private Integer bikeImage;

    public MyBikeData(String bikeName, String bikePrice, Integer bikeImage) {
        this.bikeName = bikeName;
        this.bikePrice = bikePrice;
        this.bikeImage = bikeImage;
    }

    public String getBikeName() {
        return bikeName;
    }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    public String getBikePrice() {
        return bikePrice;
    }

    public void setBikePrice(String bikePrice) {
        this.bikePrice = bikePrice;
    }

    public Integer getBikeImage() {
        return bikeImage;
    }

    public void setBikeImage(Integer bikeImage) {
        this.bikeImage = bikeImage;
    }
}

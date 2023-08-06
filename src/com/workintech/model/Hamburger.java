package com.workintech.model;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;


    public Hamburger(String name,  double price ,String breadRollType){
        this.breadRollType=breadRollType;
        this.meat="Normal";
        this.name=name;
        this.price=price;

    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getBreadRollType() {
        return breadRollType;
    }
    public void addHamburgerAddition1(String addition, double price){
        this.addition1Name=addition;
        this.addition1Price=price;
    }
    public void addHamburgerAddition2(String addition, double price){
        this.addition2Name=addition;
        this.addition2Price=price;
    }
    public void addHamburgerAddition3(String addition, double price){
        this.addition3Name=addition;
        this.addition3Price=price;
    }
    public void addHamburgerAddition4(String addition, double price){
        this.addition4Name=addition;
        this.addition4Price=price;
    }
    public String itemize(){
        StringBuilder builder=new StringBuilder();
        builder.append("Name: " + name +"\n");
        builder.append("Meat: " + meat +"\n");
        builder.append("BreadRollType: " + breadRollType +"\n");

        if(addition1Name != null){
            builder.append("Addition1: "+ addition1Name +"\n");
            price=price +addition1Price;
        }
        if(addition2Name != null){
            builder.append("Addition2: "+ addition2Name +"\n");
            price=price +addition2Price;
        }
        if(addition3Name != null){
            builder.append("Addition3: "+ addition3Name +"\n");
            price=price +addition3Price;
        }
        if(addition4Name != null){
            builder.append("Addition4: "+ addition4Name +"\n");
            price=price +addition4Price;
        }
          return builder.toString();
    }
    public double itemizeHamburger(){
        String explanation = itemize();
        System.out.println(explanation);
        System.out.println("Price: " + getPrice());
    return getPrice();
    }
}

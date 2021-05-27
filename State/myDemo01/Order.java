package com.zjp.DesignPattern.State.myDemo01;

public class Order {

    public static OrderState createState = new CreateState();
    public static OrderState publishState = new PublishState();
    public static OrderState acceptState = new AcceptState();
    public static OrderState dealState = new DealState();
    public static OrderState submitState = new SubmitState();
    public static OrderState checkState = new CheckState();
    public static OrderState closeState = new CloseState();

    private OrderState currentState;

    public OrderState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(OrderState currentState) {
        this.currentState = currentState;
        this.currentState.setOrder(this);
    }

    public void create(){
        this.currentState.create();
    }
    public void publish(){
        this.currentState.publish();
    }
    public void accept(){
        this.currentState.accept();
    }
    public void deal(){
        this.currentState.deal();
    }
    public void submit(){
        this.currentState.submit();
    }
    public void check(){
        this.currentState.check();
    }
    public void close(){
        this.currentState.close();
    }
    public void reback(){
        this.currentState.reback();
    }
}

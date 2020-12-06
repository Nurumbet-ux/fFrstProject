package com.company;

public class Runner extends Thread {
    private Runner after;
    private Runner before;

    public Runner(String name) {
        super(name);
    }

    public void setRunners(Runner after,Runner before){
        this.after = after;
        this.before = before;
    }

    @Override
    public  void run() {
       try {
           System.out.println(getName()+" beret palochku");

           if (getName().equals("Runner5")){
               //
               System.out.println(getName()+" bejit k finishu");
           }else {
               System.out.println(getName()+" bejit k "+after.getName());
               after.start();
               after.join();
           }
           if (!getName().equals("Runner1")){
           System.out.println(getName()+" bejit k "+ before.getName());
           System.out.println(before.getName()+" beret palochku ");}
       }catch (Exception ignore){

       }
    }
}

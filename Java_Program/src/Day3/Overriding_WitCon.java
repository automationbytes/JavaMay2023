package Day3;

class Google{
    String username;
    String locationlogged;

    Google(String username, String locationlogged){
        this.username = username;
        this.locationlogged = locationlogged;
    }

    public void toDisplay(){
        System.out.println(this.username);
        System.out.println(this.locationlogged);

    }

}

class Youtube extends Google{
    String channelName;

    Youtube(String username, String locationlogged, String channelName){
        super(username,locationlogged);
        this.channelName = channelName;
    }


    public void toDisplay(){
       super.toDisplay();
        System.out.println(this.channelName);

    }

}


public class Overriding_WitCon {
    public static void main(String[] args) {
        Youtube y = new Youtube("devlabsuser","India","Devops Univ");
        y.toDisplay();

        Google g = new Google("devlabsuser","India");
        g.toDisplay();
    }

}

package Day4;

interface mobile{
    void sms();
    void call();
}

interface camera{
    void photo();
}


class apple implements mobile,camera{

    @Override
    public void sms() {
        System.out.println("Apple sms");
    }

    @Override
    public void call() {
        System.out.println("Apple call");
    }

    @Override
    public void photo() {
        System.out.println("Apple camera ap");
    }
}

class samsung implements mobile,camera{

    @Override
    public void sms() {
        System.out.println("Samsung sms");
    }

    @Override
    public void call() {
        System.out.println("Samsung call");
    }

    @Override
    public void photo() {
        System.out.println("Samsung camera");
    }
}


public class interface_eg {
    public static void main(String[] args) {
        samsung s = new samsung();
        s.call();
        s.photo();

        apple a = new apple();
        a.call();
        a.photo();
    }
}

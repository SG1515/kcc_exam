package thread2;


public class Baker extends Thread {
    private String threadName;
    private Manager m;

    public Baker() {
    }

    public Baker(String threadName, Manager m) {
        super();
        this.threadName = threadName;
        this.m = m;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            m.push(threadName, getBread());
            try {
                Thread.sleep(50);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public String getBread() {
        String bread = "";
        int num = (int) (Math.random() * 3);

        switch (num) {
            case 0:
                bread = "积农覆户";
                break;
            case 1:
                bread = "乔磊户";
                break;
            case 2:
                bread = "绊肺纳户";
                break;
        }

        return bread;
    }


    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public Manager getM() {
        return m;
    }

    public void setM(Manager m) {
        this.m = m;
    }


}

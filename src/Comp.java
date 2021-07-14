import java.util.Random;
import java.util.Scanner;

public class Comp {
    private String proc;
    private int ram;
    private int hdd;
    private int limit;
    private MyEnum myEnum = MyEnum.OFF;


    public Comp() {}

    public Comp(String proc, int ram, int hdd, int limit) {
        this.proc = proc;
        this.ram = ram;
        this.hdd = hdd;
        this.limit = limit;

    }

    public String getProc() {
        return proc;
    }

    public void setProc(String proc) {
        this.proc = proc;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void start() {
        if(myEnum == MyEnum.BURNED) {
            System.out.println("Компьютер сгорел.");
            return;
        }
        if(myEnum == MyEnum.ON) {
            System.out.println("Компьютер уже включен.");
            return;
        }
        if (!isError()) {
            System.out.println("Компьютер включен.");
            myEnum = MyEnum.ON;
        }
    }

    public void stop() {
        if(myEnum == MyEnum.BURNED){
            System.out.println("Компьютер сгорел.");
            return;
        }
        if (myEnum == MyEnum.OFF) {
            System.out.println("Компьютер уже выключен.");
            return;
        }
        if (!isError()) {
            System.out.println("Компьютер выключен.");
            myEnum = MyEnum.OFF;
            limit--;
            if (limit <= 0){
                myEnum = MyEnum.BURNED;
            }
        }
    }

    private void chek() {

    }


    private boolean isError(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int x = random.nextInt(2);
        System.out.println("Введите число");
        int y = scanner.nextInt();
        if (x != y){
            status = Status.BURN;
            return true;
        }
        return false;
    }
}
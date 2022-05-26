package Interfases_units.case2;

interface CanTransferViaInternet {

}

class TcpPacket implements CanTransferViaInternet {

}

class Tester {
    public static void main(String[] args) {
        Object item = new TcpPacket();

        System.out.println(item instanceof CanTransferViaInternet); //true
    }
}
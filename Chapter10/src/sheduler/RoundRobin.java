package sheduler;

public class RoundRobin implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("상단 전화를 순서대로 대기열에서 가져옵니다");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("순서대로 다음 상당원에게 배분합니다.");
    }
}

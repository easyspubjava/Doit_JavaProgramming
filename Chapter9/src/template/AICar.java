package template;

public class AICar extends Car {

    @Override
    public void drive() {
        System.out.println("자율 주행을 합니다.");
        System.out.printf("자율 주행으로 방향전환을 합니다.");
    }

    @Override
    public void stop() {
        System.out.println("차가 스스로 멈춥니다.");
    }

    @Override
    public void washCar() {
        System.out.println("스스로 세차장에 갑니다.");
    }
}

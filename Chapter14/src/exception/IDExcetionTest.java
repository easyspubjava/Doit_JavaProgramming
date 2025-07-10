package exception;

public class IDExcetionTest {

    private String id;

    public void setId(String id) throws IDFormatException {

        if (id == null || id.equals("")) {
            throw new IDFormatException("id 가 null 입니다.");
        }

        else if(id.length() < 8 || id.length() > 20) {
            throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요");
        }

        this.id = id;
    }

    public static void main(String[] args) {
        IDExcetionTest test = new IDExcetionTest();

        try {
            test.setId("abc");
        } catch (IDFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}

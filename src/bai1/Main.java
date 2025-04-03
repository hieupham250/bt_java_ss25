package bai1;

public class Main {
    public static void main(String[] args) {
        Account account1 = Account.getInstance();
        Account account2 = Account.getInstance();
        account1.setId(1);
        account1.setName("Hiếu Phạm");
        account1.setAge(21);

        System.out.println("Mã TK: " + account2.getId());
        System.out.println("Tên: " + account2.getName());
        System.out.println("Tuổi: " + account2.getAge());
    }
}

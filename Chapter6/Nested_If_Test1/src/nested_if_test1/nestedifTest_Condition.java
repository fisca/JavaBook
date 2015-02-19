package nested_if_test1;

public class nestedifTest_Condition {

    public void checkPass(int x, int y) {
        if (x >= 20 && y >= 30) {
            System.out.println("ครบตามหลักสูตร");
        } else if (x < 20 && y < 30) {
            System.out.println("ขาดวิชาเอกบังคับ " + (20 - x) + " หน่วยกิจ\n" + "ขาดวิชาเอกเลือก " + (30 - y) + " หน่วยกิจ");
        } else if (x < 20) {
            System.out.println("ขาดวิชาเอกบังคับ " + (20 - x) + " หน่วยกิจ");
        } else if (y < 30) {
            System.out.println("ขาดวิชาเอกเลือก " + (30 - y) + " หน่วยกิจ");
        }
    }
}

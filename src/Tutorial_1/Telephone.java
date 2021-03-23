package Tutorial_1;

/**
 * Note from Dr
 * Always follow the naming convention from the question and also the return type of the question
 */
public class Telephone {
    private String areaCode, number;
    private static int numberOfTelephoneObjects;

    public Telephone(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
        numberOfTelephoneObjects++;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String makeFullNumber(){
        return areaCode + "-" + number;
    }

    public static void main(String[] args) {
        Telephone[] telObj = new Telephone[5];
        for (int i = 0; i < telObj.length; i++) {
            telObj[i] = new Telephone("03", "7967630" + i);
        }
        for (int i = 0; i < telObj.length; i++) {
            System.out.println(telObj[i].makeFullNumber());
        }
    }
}

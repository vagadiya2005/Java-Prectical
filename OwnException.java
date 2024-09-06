class SmallException extends Exception {
    public SmallException(String message) {
        super(message);
    }
}

class BigException extends Exception {
    public BigException(String message) {
        super(message);
    }
}

public class OwnException {
    public static void main(String[] args) {
        OwnException oe = new OwnException();
        
        try {
            oe.testValue(3);
        } catch (Exception e) {
            oe.printErrorReport(e);
        }

        try {
            oe.testValue(12);
        } catch (Exception e) {
            oe.printErrorReport(e);
        }
        
        try {
            oe.testValue(7); 
        } catch (Exception e) {
            oe.printErrorReport(e);
        }
    }

    public void printErrorReport(Exception e) {
        System.out.println("Error Report: " + e.getMessage());
    }

    public void testValue(int value) throws SmallException, BigException {
        if (value < 5) {
            throw new SmallException("Value is lower than 5");
        } else if (value > 10) {
            throw new BigException("Value is higher than 10");
        } else {
            System.out.println("Value is within the acceptable range: " + value);
        }
    }
}

package UserAuthentication;

public class OTP {
    private int otp;


    public OTP(){

        otp = (int) (Math.random()*8999)+1000;

    }

    /**
     * send otp to the mobile number (fake)
     *
     *
     * @return true if the otp is sent successfully else false
     */
    public boolean sendOTP(){

        System.out.println(otp);
        return true;
    }

    /**
     *
     * @param num is the otp that the user entered it
     * @return true if the num equals the otp else false
     */
    public boolean verifyOTP(int num){
        if(num == otp){
            return true;
        }
        return false;
    }
}

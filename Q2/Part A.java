public class SignedText {
    private String firstName;
    private String lastName;

    public SignedText(String first, String last) {
        firstName = first;
        lastName = last;
    }

    public String getSignature() {
        if (firstName.isEmpty()) {
            return lastName;
        }
        else {
            return firstName.charAt(0) + "-" + lastName;
        }
    }

    public String addSignature(String text) {
        String signature = getSignature();

        if (text.endsWith(signature)) {
            return text;
        }
        else if (text.startsWith(Signature)) {
            return text.substring(signature.length()) +signature;
        }
        else {
            return text + signature;
        }
    }
}

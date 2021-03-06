package store_app_list.response;

/**
 * Created by Thomas on 05/12/2015.
 * <p>
 * This class is the basic response for the send feedback request on the API.
 */
public class SendFeedbackResponse {

    // True if there is an error, False otherwise
    public boolean Error;
    // Code returned
    public int Code;

    public boolean getError() {
        return Error;
    }

    public void setError(boolean error) {
        Error = error;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

}

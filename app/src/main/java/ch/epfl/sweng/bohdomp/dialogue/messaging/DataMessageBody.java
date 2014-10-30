package ch.epfl.sweng.bohdomp.dialogue.messaging;

import android.net.Uri;

/**
 * Class representing the body of a data message
 */
public class DataMessageBody implements MessageBody {

    //FIXME: Find exactly how uri works

    private final Uri body;

    public DataMessageBody(String bodyParameter) {
        if (bodyParameter != null) {
            this.body = Uri.parse(bodyParameter);
        } else {
            throw new IllegalArgumentException("Null argument in DataMessageBody constructor");
        }
    }

    @Override
    public String getMessageBody() {
        return body.getFragment();
    }

    @Override
    public int getPayloadSize() {
        return 0;
    }
}

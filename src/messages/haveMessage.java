package messages;

import java.nio.ByteBuffer;

public class haveMessage {
    byte[] messageLength;
    byte messageType = (byte) 4;
    public byte[] message;

    public haveMessage(byte[] pieceIndex) {
        messageLength = ByteBuffer.allocate(4).putInt(5).array();
        message = ByteBuffer.allocate(9).array();

        int i = 0;

        for(int c=0;c<4;c++) {
            message[i] = messageLength[c];
            i++;
        }

        message[i] = messageType;
        i++;

        for(int c=0;c<4;c++) {
            message[i] = pieceIndex[c];
            i++;
        }
    }
}

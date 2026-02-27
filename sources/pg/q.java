package pg;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public interface q {
    Object decodeMessage(ByteBuffer byteBuffer);

    ByteBuffer encodeMessage(Object obj);
}

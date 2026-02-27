package pg;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public interface j {
    h makeBackgroundTaskQueue();

    h makeBackgroundTaskQueue(i iVar);

    void send(String str, ByteBuffer byteBuffer);

    void send(String str, ByteBuffer byteBuffer, g gVar);

    void setMessageHandler(String str, InterfaceC2043f interfaceC2043f);

    void setMessageHandler(String str, InterfaceC2043f interfaceC2043f, h hVar);
}

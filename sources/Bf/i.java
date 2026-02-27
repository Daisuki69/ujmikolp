package Bf;

import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public interface i extends Closeable {
    void d(int i, byte[] bArr);

    long getPosition();

    int peek();

    int read();

    int read(byte[] bArr);

    byte[] u(int i);

    void unread(int i);

    void unread(byte[] bArr);

    boolean v();
}

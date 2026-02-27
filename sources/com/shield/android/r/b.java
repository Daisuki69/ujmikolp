package com.shield.android.r;

import We.s;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements com.shield.android.u.a {
    private final ByteBuffer rv;

    public b(ByteBuffer byteBuffer) {
        this.rv = byteBuffer;
    }

    @Override // com.shield.android.u.a
    public final void a(byte[] bArr, int i, int i4) throws IOException {
        try {
            this.rv.put(bArr, i, i4);
        } catch (BufferOverflowException e) {
            throw new IOException(s.g(i4, "Insufficient space in output buffer for ", " bytes"), e);
        }
    }

    @Override // com.shield.android.u.a
    public final void v(ByteBuffer byteBuffer) throws IOException {
        int iRemaining = byteBuffer.remaining();
        try {
            this.rv.put(byteBuffer);
        } catch (BufferOverflowException e) {
            throw new IOException(s.g(iRemaining, "Insufficient space in output buffer for ", " bytes"), e);
        }
    }
}

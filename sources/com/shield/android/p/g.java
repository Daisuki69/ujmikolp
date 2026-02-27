package com.shield.android.p;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class g {
    private final ByteBuffer qN;

    public g(ByteBuffer byteBuffer) {
        this.qN = byteBuffer.slice();
    }

    public final ByteBuffer eg() {
        return this.qN.slice();
    }

    public g(byte[] bArr) {
        this.qN = ByteBuffer.wrap(bArr);
    }
}

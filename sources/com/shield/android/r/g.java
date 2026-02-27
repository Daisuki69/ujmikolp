package com.shield.android.r;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements com.shield.android.u.a {
    private final MessageDigest[] rE;

    public g(MessageDigest[] messageDigestArr) {
        this.rE = messageDigestArr;
    }

    @Override // com.shield.android.u.a
    public final void a(byte[] bArr, int i, int i4) {
        for (MessageDigest messageDigest : this.rE) {
            messageDigest.update(bArr, i, i4);
        }
    }

    @Override // com.shield.android.u.a
    public final void v(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        for (MessageDigest messageDigest : this.rE) {
            byteBuffer.position(iPosition);
            messageDigest.update(byteBuffer);
        }
    }
}

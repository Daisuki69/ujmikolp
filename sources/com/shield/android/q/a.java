package com.shield.android.q;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private final ByteBuffer rm;
    private final ByteBuffer rn;
    private final int ro;
    private final int rp;

    public a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, boolean z4, int i4) {
        this.rm = byteBuffer;
        this.rn = byteBuffer2;
        this.ro = i;
        this.rp = i4;
    }

    public final int ek() {
        return this.ro;
    }

    public final int el() {
        return this.rp;
    }

    public final ByteBuffer em() {
        return this.rm.slice();
    }

    public final ByteBuffer en() {
        return this.rn.slice();
    }

    public final c eo() {
        return new e(this.rn.slice());
    }
}

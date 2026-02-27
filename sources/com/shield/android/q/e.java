package com.shield.android.q;

import We.s;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements c {
    private final ByteBuffer rs;

    public e(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new NullPointerException("buf == null");
        }
        this.rs = byteBuffer;
    }

    private int eq() throws b {
        int i = 0;
        boolean z4 = false;
        while (this.rs.hasRemaining()) {
            byte b8 = this.rs.get();
            int i4 = i + 1;
            if (i4 < 0) {
                throw new b("Indefinite-length contents too long");
            }
            if (b8 != 0) {
                z4 = false;
            } else {
                if (z4) {
                    return i - 1;
                }
                z4 = true;
            }
            i = i4;
        }
        throw new b(s.g(i, "Truncated indefinite-length contents: ", " bytes read"));
    }

    private int er() throws b {
        int iPosition = this.rs.position();
        while (this.rs.hasRemaining()) {
            if (this.rs.remaining() > 1) {
                ByteBuffer byteBuffer = this.rs;
                if (byteBuffer.getShort(byteBuffer.position()) == 0) {
                    int iPosition2 = this.rs.position() - iPosition;
                    ByteBuffer byteBuffer2 = this.rs;
                    byteBuffer2.position(byteBuffer2.position() + 2);
                    return iPosition2;
                }
            }
            ep();
        }
        throw new b("Truncated indefinite-length contents: " + (this.rs.position() - iPosition) + " bytes read");
    }

    private void t(int i) throws b {
        if (this.rs.remaining() >= i) {
            ByteBuffer byteBuffer = this.rs;
            byteBuffer.position(byteBuffer.position() + i);
        } else {
            StringBuilder sbT = s.t(i, "Truncated contents. Need: ", " bytes, available: ");
            sbT.append(this.rs.remaining());
            throw new b(sbT.toString());
        }
    }

    @Override // com.shield.android.q.c
    public final a ep() throws b {
        int iPosition;
        int iEr;
        int iPosition2 = this.rs.position();
        if (!this.rs.hasRemaining()) {
            return null;
        }
        byte b8 = this.rs.get();
        int i = b8 & 31;
        if (i == 31) {
            i = 0;
            while (this.rs.hasRemaining()) {
                byte b10 = this.rs.get();
                if (i > 16777215) {
                    throw new b("Tag number too large");
                }
                i = (i << 7) | (b10 & 127);
                if ((b10 & 128) == 0) {
                }
            }
            throw new b("Truncated tag number");
        }
        int i4 = i;
        boolean z4 = (b8 & 32) != 0;
        if (!this.rs.hasRemaining()) {
            throw new b("Missing length");
        }
        byte b11 = this.rs.get();
        int i6 = b11 & 255;
        if ((b11 & 128) == 0) {
            iEr = b11 & 127;
            iPosition = this.rs.position() - iPosition2;
            t(iEr);
        } else if (i6 != 128) {
            int i10 = b11 & 127;
            if (i10 > 4) {
                throw new b(s.g(i10, "Length too large: ", " bytes"));
            }
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                if (!this.rs.hasRemaining()) {
                    throw new b("Truncated length");
                }
                byte b12 = this.rs.get();
                if (i11 > 8388607) {
                    throw new b("Length too large");
                }
                i11 = (i11 << 8) | (b12 & 255);
            }
            int iPosition3 = this.rs.position() - iPosition2;
            t(i11);
            int i13 = i11;
            iPosition = iPosition3;
            iEr = i13;
        } else {
            iPosition = this.rs.position() - iPosition2;
            iEr = z4 ? er() : eq();
        }
        int iPosition4 = this.rs.position();
        this.rs.position(iPosition2);
        int iLimit = this.rs.limit();
        this.rs.limit(iPosition4);
        ByteBuffer byteBufferSlice = this.rs.slice();
        ByteBuffer byteBuffer = this.rs;
        byteBuffer.position(byteBuffer.limit());
        this.rs.limit(iLimit);
        byteBufferSlice.position(iPosition);
        byteBufferSlice.limit(iPosition + iEr);
        ByteBuffer byteBufferSlice2 = byteBufferSlice.slice();
        byteBufferSlice.clear();
        return new a(byteBufferSlice, byteBufferSlice2, (b8 & 255) >> 6, z4, i4);
    }
}

package com.shield.android.r;

import We.s;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements com.shield.android.u.b {
    private final long rA;
    private final long rB;
    private final FileChannel rz;

    public e(FileChannel fileChannel, long j, long j6) {
        if (j < 0) {
            throw new IndexOutOfBoundsException(androidx.camera.core.impl.a.f(j6, "offset: "));
        }
        if (j6 < 0) {
            throw new IndexOutOfBoundsException(androidx.camera.core.impl.a.f(j6, "size: "));
        }
        this.rz = fileChannel;
        this.rA = j;
        this.rB = j6;
    }

    @Override // com.shield.android.u.b
    public final void a(long j, long j6, com.shield.android.u.a aVar) throws IOException {
        a(j, j6, es());
        if (j6 == 0) {
            return;
        }
        long j7 = this.rA + j;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((int) Math.min(j6, 1048576L));
        long j9 = j7;
        long j10 = j6;
        while (j10 > 0) {
            int iMin = (int) Math.min(j10, byteBufferAllocateDirect.capacity());
            byteBufferAllocateDirect.limit(iMin);
            synchronized (this.rz) {
                try {
                    this.rz.position(j9);
                    int i = iMin;
                    while (i > 0) {
                        int i4 = this.rz.read(byteBufferAllocateDirect);
                        if (i4 < 0) {
                            throw new IOException("Unexpected EOF encountered");
                        }
                        i -= i4;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            byteBufferAllocateDirect.flip();
            aVar.v(byteBufferAllocateDirect);
            byteBufferAllocateDirect.clear();
            long j11 = iMin;
            j9 += j11;
            j10 -= j11;
        }
    }

    @Override // com.shield.android.u.b
    public final /* synthetic */ com.shield.android.u.b b(long j, long j6) {
        long jEs = es();
        a(j, j6, jEs);
        return (j == 0 && j6 == jEs) ? this : new e(this.rz, this.rA + j, j6);
    }

    @Override // com.shield.android.u.b
    public final long es() {
        long j = this.rB;
        if (j != -1) {
            return j;
        }
        try {
            return this.rz.size();
        } catch (IOException unused) {
            return 0L;
        }
    }

    @Override // com.shield.android.u.b
    public final void a(long j, int i, ByteBuffer byteBuffer) throws IOException {
        int i4;
        a(j, i, es());
        if (i == 0) {
            return;
        }
        if (i <= byteBuffer.remaining()) {
            long j6 = this.rA + j;
            int iLimit = byteBuffer.limit();
            try {
                byteBuffer.limit(byteBuffer.position() + i);
                while (i > 0) {
                    synchronized (this.rz) {
                        this.rz.position(j6);
                        i4 = this.rz.read(byteBuffer);
                    }
                    j6 += (long) i4;
                    i -= i4;
                }
                return;
            } finally {
                byteBuffer.limit(iLimit);
            }
        }
        throw new BufferOverflowException();
    }

    @Override // com.shield.android.u.b
    public final ByteBuffer a(long j, int i) throws IOException {
        if (i >= 0) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
            a(j, i, byteBufferAllocate);
            byteBufferAllocate.flip();
            return byteBufferAllocate;
        }
        throw new IndexOutOfBoundsException(s.f(i, "size: "));
    }

    private static void a(long j, long j6, long j7) {
        if (j < 0) {
            throw new IndexOutOfBoundsException(androidx.camera.core.impl.a.f(j, "offset: "));
        }
        if (j6 < 0) {
            throw new IndexOutOfBoundsException(androidx.camera.core.impl.a.f(j6, "size: "));
        }
        if (j > j7) {
            throw new IndexOutOfBoundsException(s.h(j7, ")", androidx.camera.core.impl.a.s(j, "offset (", ") > source size (")));
        }
        long j9 = j + j6;
        if (j9 < j) {
            throw new IndexOutOfBoundsException(s.h(j6, ") overflow", androidx.camera.core.impl.a.s(j, "offset (", ") + size (")));
        }
        if (j9 <= j7) {
            return;
        }
        StringBuilder sbS = androidx.camera.core.impl.a.s(j, "offset (", ") + size (");
        sbS.append(j6);
        sbS.append(") > source size (");
        sbS.append(j7);
        sbS.append(")");
        throw new IndexOutOfBoundsException(sbS.toString());
    }
}

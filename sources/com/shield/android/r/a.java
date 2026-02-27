package com.shield.android.r;

import We.s;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements com.shield.android.u.b {
    private final ByteBuffer rt;
    private final int ru;

    public a(ByteBuffer byteBuffer) {
        this(byteBuffer, true);
    }

    @Override // com.shield.android.u.b
    public final void a(long j, int i, ByteBuffer byteBuffer) {
        byteBuffer.put(a(j, i));
    }

    @Override // com.shield.android.u.b
    public final /* synthetic */ com.shield.android.u.b b(long j, long j6) {
        if (j == 0 && j6 == this.ru) {
            return this;
        }
        if (j6 >= 0 && j6 <= this.ru) {
            return new a(a(j, (int) j6), false);
        }
        StringBuilder sbS = androidx.camera.core.impl.a.s(j6, "size: ", ", source size: ");
        sbS.append(this.ru);
        throw new IndexOutOfBoundsException(sbS.toString());
    }

    @Override // com.shield.android.u.b
    public final long es() {
        return this.ru;
    }

    private a(ByteBuffer byteBuffer, boolean z4) {
        this.rt = z4 ? byteBuffer.slice() : byteBuffer;
        this.ru = byteBuffer.remaining();
    }

    @Override // com.shield.android.u.b
    public final void a(long j, long j6, com.shield.android.u.a aVar) throws IOException {
        if (j6 >= 0 && j6 <= this.ru) {
            aVar.v(a(j, (int) j6));
        } else {
            StringBuilder sbS = androidx.camera.core.impl.a.s(j6, "size: ", ", source size: ");
            sbS.append(this.ru);
            throw new IndexOutOfBoundsException(sbS.toString());
        }
    }

    @Override // com.shield.android.u.b
    public final ByteBuffer a(long j, int i) {
        ByteBuffer byteBufferSlice;
        long j6 = i;
        if (j < 0) {
            throw new IndexOutOfBoundsException(androidx.camera.core.impl.a.f(j, "offset: "));
        }
        if (j6 >= 0) {
            int i4 = this.ru;
            if (j > i4) {
                throw new IndexOutOfBoundsException(s.o(androidx.camera.core.impl.a.s(j, "offset (", ") > source size ("), ")", this.ru));
            }
            long j7 = j + j6;
            if (j7 < j) {
                throw new IndexOutOfBoundsException(s.h(j6, ") overflow", androidx.camera.core.impl.a.s(j, "offset (", ") + size (")));
            }
            if (j7 <= i4) {
                int i6 = (int) j;
                int i10 = i + i6;
                synchronized (this.rt) {
                    this.rt.position(0);
                    this.rt.limit(i10);
                    this.rt.position(i6);
                    byteBufferSlice = this.rt.slice();
                }
                return byteBufferSlice;
            }
            StringBuilder sbS = androidx.camera.core.impl.a.s(j, "offset (", ") + size (");
            sbS.append(j6);
            sbS.append(") > source size (");
            throw new IndexOutOfBoundsException(s.o(sbS, ")", this.ru));
        }
        throw new IndexOutOfBoundsException(androidx.camera.core.impl.a.f(j6, "size: "));
    }
}

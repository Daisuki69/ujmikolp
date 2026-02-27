package com.shield.android.r;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements com.shield.android.u.b {
    private final com.shield.android.u.b[] rw;
    private final long rx;

    public c(com.shield.android.u.b... bVarArr) {
        this.rw = bVarArr;
        this.rx = Arrays.stream(bVarArr).mapToLong(new Ue.a()).sum();
    }

    private h<Integer, Long> e(long j) {
        int i = 0;
        long jEs = j;
        while (true) {
            com.shield.android.u.b[] bVarArr = this.rw;
            if (i >= bVarArr.length) {
                StringBuilder sbS = androidx.camera.core.impl.a.s(j, "Access is out of bound, offset: ", ", totalSize: ");
                sbS.append(this.rx);
                throw new IndexOutOfBoundsException(sbS.toString());
            }
            if (jEs < bVarArr[i].es()) {
                return h.a(Integer.valueOf(i), Long.valueOf(jEs));
            }
            jEs -= this.rw[i].es();
            i++;
        }
    }

    @Override // com.shield.android.u.b
    public final com.shield.android.u.b b(long j, long j6) {
        h<Integer, Long> hVarE = e(j);
        int iIntValue = hVarE.et().intValue();
        long jLongValue = hVarE.eu().longValue();
        com.shield.android.u.b bVar = this.rw[iIntValue];
        if (jLongValue + j6 <= bVar.es()) {
            return bVar.b(jLongValue, j6);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar.b(jLongValue, bVar.es() - jLongValue));
        h<Integer, Long> hVarE2 = e((j + j6) - 1);
        int iIntValue2 = hVarE2.et().intValue();
        long jLongValue2 = hVarE2.eu().longValue();
        while (true) {
            iIntValue++;
            if (iIntValue >= iIntValue2) {
                arrayList.add(this.rw[iIntValue2].b(0L, jLongValue2 + 1));
                return new c((com.shield.android.u.b[]) arrayList.toArray(new com.shield.android.u.b[0]));
            }
            arrayList.add(this.rw[iIntValue]);
        }
    }

    @Override // com.shield.android.u.b
    public final long es() {
        return this.rx;
    }

    @Override // com.shield.android.u.b
    public final void a(long j, long j6, com.shield.android.u.a aVar) throws IOException {
        com.shield.android.u.a aVar2;
        if (j + j6 > this.rx) {
            throw new IndexOutOfBoundsException("Requested more than available");
        }
        com.shield.android.u.b[] bVarArr = this.rw;
        int length = bVarArr.length;
        int i = 0;
        long jEs = j;
        long j7 = j6;
        while (i < length) {
            com.shield.android.u.b bVar = bVarArr[i];
            if (jEs >= bVar.es()) {
                jEs -= bVar.es();
                aVar2 = aVar;
            } else {
                long jEs2 = bVar.es() - jEs;
                if (jEs2 >= j7) {
                    bVar.a(jEs, j7, aVar);
                    return;
                }
                aVar2 = aVar;
                bVar.a(jEs, jEs2, aVar2);
                j7 -= jEs2;
                jEs = 0;
            }
            i++;
            aVar = aVar2;
        }
    }

    @Override // com.shield.android.u.b
    public final ByteBuffer a(long j, int i) throws IOException {
        long j6 = i;
        if (j + j6 <= this.rx) {
            h<Integer, Long> hVarE = e(j);
            int iIntValue = hVarE.et().intValue();
            long jLongValue = hVarE.eu().longValue();
            if (j6 + jLongValue <= this.rw[iIntValue].es()) {
                return this.rw[iIntValue].a(jLongValue, i);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
            while (iIntValue < this.rw.length && byteBufferAllocate.hasRemaining()) {
                long jMin = Math.min(this.rw[iIntValue].es() - jLongValue, byteBufferAllocate.remaining());
                com.shield.android.u.b bVar = this.rw[iIntValue];
                int i4 = (int) jMin;
                if (jMin != i4) {
                    throw new ArithmeticException();
                }
                bVar.a(jLongValue, i4, byteBufferAllocate);
                iIntValue++;
                jLongValue = 0;
            }
            byteBufferAllocate.rewind();
            return byteBufferAllocate;
        }
        throw new IndexOutOfBoundsException("Requested more than available");
    }

    @Override // com.shield.android.u.b
    public final void a(long j, int i, ByteBuffer byteBuffer) throws IOException {
        a(j, i, new b(byteBuffer));
    }
}

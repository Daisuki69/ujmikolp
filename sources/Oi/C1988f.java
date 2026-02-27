package oi;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: oi.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1988f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f18900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Serializable f18901b;

    public int a(InputStream inputStream, int i) throws IOException {
        if (i <= 0) {
            return 0;
        }
        long j = this.f18900a;
        long j6 = ((long) i) + j;
        ArrayList arrayList = (ArrayList) this.f18901b;
        int size = (((int) ((j6 - 1) >> 9)) - arrayList.size()) + 1;
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(new byte[512]);
        }
        this.f18900a = j6;
        int i6 = (int) (j >> 9);
        int i10 = (int) (j & 511);
        int i11 = 0;
        while (i > 0) {
            byte[] bArr = (byte[]) arrayList.get(i6);
            int iMin = Math.min(512 - i10, i);
            i -= iMin;
            i11 += iMin;
            while (iMin > 0) {
                int i12 = inputStream.read(bArr, i10, iMin);
                if (i12 < 0) {
                    this.f18900a -= (long) (i - i11);
                    return i11;
                }
                iMin -= i12;
                i10 += i12;
            }
            i6++;
            i10 = 0;
        }
        return i11;
    }

    public void b(long j, String str) {
        C1987e c1987e = new C1987e(str, j - (j % this.f18900a));
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f18901b;
        AtomicInteger atomicInteger = (AtomicInteger) concurrentHashMap.get(c1987e);
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger();
            AtomicInteger atomicInteger2 = (AtomicInteger) concurrentHashMap.putIfAbsent(c1987e, atomicInteger);
            if (atomicInteger2 != null) {
                atomicInteger = atomicInteger2;
            }
        }
        atomicInteger.addAndGet(1);
    }

    public ArrayList c() {
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f18901b;
        for (C1987e c1987e : new ArrayList(concurrentHashMap.keySet())) {
            AtomicInteger atomicInteger = (AtomicInteger) concurrentHashMap.remove(c1987e);
            if (atomicInteger != null) {
                arrayList.add(new C1985c(c1987e.f18898a, c1987e.f18899b, atomicInteger.get()));
            }
        }
        return arrayList;
    }
}

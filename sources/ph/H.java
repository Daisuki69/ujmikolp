package ph;

import fh.InterfaceC1486b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class H extends AtomicInteger implements InterfaceC1486b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch.r f19202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f19203b;
    public S1.x c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19204d;
    public long e;
    public volatile boolean f;

    public H(ch.r rVar, I i) {
        this.f19202a = rVar;
        this.f19203b = i;
        this.c = i.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fh.InterfaceC1486b
    public final void dispose() {
        H[] hArr;
        if (this.f) {
            return;
        }
        this.f = true;
        I i = this.f19203b;
        while (true) {
            AtomicReference atomicReference = i.f19215d;
            H[] hArr2 = (H[]) atomicReference.get();
            int length = hArr2.length;
            if (length == 0) {
                return;
            }
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    i4 = -1;
                    break;
                } else if (hArr2[i4] == this) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 < 0) {
                return;
            }
            if (length == 1) {
                hArr = I.f19212k;
            } else {
                H[] hArr3 = new H[length - 1];
                System.arraycopy(hArr2, 0, hArr3, 0, i4);
                System.arraycopy(hArr2, i4 + 1, hArr3, i4, (length - i4) - 1);
                hArr = hArr3;
            }
            while (!atomicReference.compareAndSet(hArr2, hArr)) {
                if (atomicReference.get() != hArr2) {
                    break;
                }
            }
            return;
        }
    }
}

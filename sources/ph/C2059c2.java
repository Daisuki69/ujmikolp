package ph;

import java.util.ArrayList;
import vh.C2356g;

/* JADX INFO: renamed from: ph.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2059c2 extends ArrayList implements W1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile int f19427a;

    @Override // ph.W1
    public final void a(T1 t12) {
        if (t12.getAndIncrement() != 0) {
            return;
        }
        ch.r rVar = t12.f19345b;
        int iAddAndGet = 1;
        while (!t12.f19346d) {
            int i = this.f19427a;
            Integer num = (Integer) t12.c;
            int iIntValue = num != null ? num.intValue() : 0;
            while (iIntValue < i) {
                Object obj = get(iIntValue);
                if (obj == vh.h.f20506a) {
                    rVar.onComplete();
                    return;
                } else {
                    if (obj instanceof C2356g) {
                        rVar.onError(((C2356g) obj).f20505a);
                        return;
                    }
                    rVar.onNext(obj);
                    if (t12.f19346d) {
                        return;
                    } else {
                        iIntValue++;
                    }
                }
            }
            t12.c = Integer.valueOf(iIntValue);
            iAddAndGet = t12.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // ph.W1
    public final void c(Object obj) {
        add(obj);
        this.f19427a++;
    }

    @Override // ph.W1
    public final void complete() {
        add(vh.h.f20506a);
        this.f19427a++;
    }

    @Override // ph.W1
    public final void error(Throwable th2) {
        add(new C2356g(th2));
        this.f19427a++;
    }
}

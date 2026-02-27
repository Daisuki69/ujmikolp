package Lh;

import Ah.q;
import Kh.C0297b;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends AtomicInteger implements io.reactivex.rxjava3.disposables.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f3004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ch.f f3005b;
    public final C0297b[] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object[] f3006d;

    public k(int i, q qVar, Ch.f fVar) {
        super(i);
        this.f3004a = qVar;
        this.f3005b = fVar;
        C0297b[] c0297bArr = new C0297b[i];
        for (int i4 = 0; i4 < i; i4++) {
            c0297bArr[i4] = new C0297b(this, i4, 1);
        }
        this.c = c0297bArr;
        this.f3006d = new Object[i];
    }

    public final void a(Throwable th2, int i) {
        if (getAndSet(0) <= 0) {
            E1.c.k(th2);
            return;
        }
        C0297b[] c0297bArr = this.c;
        int length = c0297bArr.length;
        for (int i4 = 0; i4 < i; i4++) {
            C0297b c0297b = c0297bArr[i4];
            c0297b.getClass();
            Dh.a.a(c0297b);
        }
        while (true) {
            i++;
            if (i >= length) {
                this.f3004a.onError(th2);
                return;
            } else {
                C0297b c0297b2 = c0297bArr[i];
                c0297b2.getClass();
                Dh.a.a(c0297b2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.b
    public final void dispose() {
        if (getAndSet(0) > 0) {
            for (C0297b c0297b : this.c) {
                c0297b.getClass();
                Dh.a.a(c0297b);
            }
        }
    }
}

package Gh;

import Ah.q;
import ch.InterfaceC1104c;
import ch.i;
import ch.x;
import fh.InterfaceC1486b;
import java.util.concurrent.CountDownLatch;
import vh.AbstractC2353d;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends CountDownLatch implements q, Ah.b, Ah.f, x, InterfaceC1104c, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1986b;
    public Throwable c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f1987d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, int i4) {
        super(i);
        this.f1985a = i4;
    }

    @Override // Ah.q, Ah.b
    public void a(io.reactivex.rxjava3.disposables.b bVar) {
        this.e = bVar;
        if (this.f1987d) {
            bVar.dispose();
        }
    }

    public final Object b() {
        switch (this.f1985a) {
            case 0:
                if (getCount() != 0) {
                    try {
                        await();
                    } catch (InterruptedException e) {
                        this.f1987d = true;
                        io.reactivex.rxjava3.disposables.b bVar = (io.reactivex.rxjava3.disposables.b) this.e;
                        if (bVar != null) {
                            bVar.dispose();
                        }
                        throw Qh.e.e(e);
                    }
                    break;
                }
                Throwable th2 = this.c;
                if (th2 == null) {
                    return this.f1986b;
                }
                throw Qh.e.e(th2);
            default:
                if (getCount() != 0) {
                    try {
                        await();
                    } catch (InterruptedException e7) {
                        this.f1987d = true;
                        InterfaceC1486b interfaceC1486b = (InterfaceC1486b) this.e;
                        if (interfaceC1486b != null) {
                            interfaceC1486b.dispose();
                        }
                        throw AbstractC2353d.d(e7);
                    }
                    break;
                }
                Throwable th3 = this.c;
                if (th3 == null) {
                    return this.f1986b;
                }
                throw AbstractC2353d.d(th3);
        }
    }

    @Override // Ah.b
    public final void onComplete() {
        switch (this.f1985a) {
            case 0:
                countDown();
                break;
            default:
                countDown();
                break;
        }
    }

    @Override // Ah.q, Ah.b
    public final void onError(Throwable th2) {
        switch (this.f1985a) {
            case 0:
                this.c = th2;
                countDown();
                break;
            default:
                this.c = th2;
                countDown();
                break;
        }
    }

    @Override // ch.x, ch.InterfaceC1104c, ch.i
    public void onSubscribe(InterfaceC1486b interfaceC1486b) {
        this.e = interfaceC1486b;
        if (this.f1987d) {
            interfaceC1486b.dispose();
        }
    }

    @Override // Ah.q
    public final void onSuccess(Object obj) {
        switch (this.f1985a) {
            case 0:
                this.f1986b = obj;
                countDown();
                break;
            default:
                this.f1986b = obj;
                countDown();
                break;
        }
    }
}

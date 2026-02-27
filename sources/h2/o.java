package h2;

import j2.C1666e;
import java.util.concurrent.atomic.AtomicMarkableReference;
import n2.C1915b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f16895b;
    public final /* synthetic */ String c;

    public /* synthetic */ o(q qVar, String str, int i) {
        this.f16894a = i;
        this.f16895b = qVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16894a) {
            case 0:
                q qVar = this.f16895b;
                String str = this.c;
                C1915b c1915b = qVar.h.f16879d;
                c1915b.getClass();
                String strB = C1666e.b(1024, str);
                synchronized (((AtomicMarkableReference) c1915b.h)) {
                    try {
                        String str2 = (String) ((AtomicMarkableReference) c1915b.h).getReference();
                        if (strB == null ? str2 == null : strB.equals(str2)) {
                            return;
                        }
                        ((AtomicMarkableReference) c1915b.h).set(strB, true);
                        ((i2.e) c1915b.f18588d).f17093b.a(new androidx.window.layout.adapter.extensions.a(c1915b, 19));
                        return;
                    } finally {
                    }
                }
            default:
                this.f16895b.h.i("com.crashlytics.flutter.build-id.0", this.c);
                return;
        }
    }
}

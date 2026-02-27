package p4;

import e2.C1421c;
import java.util.Hashtable;
import java.util.concurrent.Semaphore;

/* JADX INFO: renamed from: p4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2012a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Hashtable f19056a = new Hashtable();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Hashtable f19057b = new Hashtable();
    public C1421c c = null;

    public final void a(String str, String str2) {
        if (str2 != null) {
            this.f19056a.put(str, str2);
        }
    }

    public final void b(String str) {
        this.f19057b.put(e(), str);
    }

    public final void c(Boolean bool) {
        "Completed with ".concat(bool.booleanValue() ? "Success" : "Failure");
        C1421c c1421c = this.c;
        Hashtable hashtable = this.f19056a;
        Hashtable hashtable2 = this.f19057b;
        c1421c.getClass();
        synchronized (c.i) {
            try {
                for (String str : hashtable.keySet()) {
                    ((Hashtable) ((V4.e) c1421c.c).c).put(str, hashtable.get(str));
                }
                for (String str2 : hashtable2.keySet()) {
                    ((Hashtable) ((V4.e) c1421c.c).f6066d).put(str2, hashtable2.get(str2));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ((Semaphore) c1421c.f16555b).release();
    }

    public abstract void d();

    public abstract String e();
}

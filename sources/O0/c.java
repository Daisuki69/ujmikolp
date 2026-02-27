package o0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f18753b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f18754a;

    public final C1954a a() {
        C1954a c1954a;
        synchronized (f18753b) {
            c1954a = null;
            try {
                if (!this.f18754a.isEmpty()) {
                    c1954a = (C1954a) this.f18754a.remove(0);
                }
            } catch (Exception unused) {
            }
        }
        return c1954a;
    }

    public final void b(C1954a c1954a) {
        synchronized (f18753b) {
            try {
                try {
                    int size = this.f18754a.size();
                    if (size > 50) {
                        ArrayList arrayList = new ArrayList();
                        for (int i = 10; i < size; i++) {
                            arrayList.add((C1954a) this.f18754a.get(i));
                        }
                        arrayList.add(c1954a);
                        this.f18754a = arrayList;
                    } else {
                        this.f18754a.add(c1954a);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (Exception unused) {
            }
        }
    }
}

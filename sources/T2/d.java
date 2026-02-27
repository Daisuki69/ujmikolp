package T2;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5752a;

    public d() {
        this.f5752a = null;
    }

    public final Object a() {
        Object obj = this.f5752a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean b() {
        return this.f5752a != null;
    }

    public d(Object obj) {
        if (obj != null) {
            this.f5752a = obj;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
}

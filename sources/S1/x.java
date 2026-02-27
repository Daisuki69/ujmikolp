package S1;

import java.io.Serializable;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Serializable f5631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f5632b;

    public x() {
        this.f5631a = p.class.getName();
    }

    public Logger a() {
        Logger logger = (Logger) this.f5632b;
        if (logger != null) {
            return logger;
        }
        synchronized (this) {
            try {
                Logger logger2 = (Logger) this.f5632b;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger((String) this.f5631a);
                this.f5632b = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Serializable, java.lang.Object[]] */
    public x(int i) {
        this.f5631a = new Object[i];
    }
}

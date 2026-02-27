package sh;

import ch.v;
import fh.InterfaceC1486b;
import ih.EnumC1605c;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public final class u extends v {
    public static final u c = new u();

    @Override // ch.v
    public final ch.u b() {
        return new t();
    }

    @Override // ch.v
    public final InterfaceC1486b d(Runnable runnable) {
        runnable.run();
        return EnumC1605c.f17149a;
    }

    @Override // ch.v
    public final InterfaceC1486b e(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            runnable.run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            S1.s.r(e);
        }
        return EnumC1605c.f17149a;
    }
}

package ki;

import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: ki.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1781b extends AbstractC1780a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18137d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1781b(int i) {
        super(0);
        this.f18137d = i;
    }

    @Override // ki.AbstractC1780a
    public final Yi.b a() {
        switch (this.f18137d) {
            case 0:
                Boolean bool = Boolean.TRUE;
                Locale locale = Locale.ROOT;
                return new Yi.b(4, new j(Executors.defaultThreadFactory(), "split-clientEventTaskExecutor-%d", new AtomicLong(0L), bool, null));
            case 1:
                Boolean bool2 = Boolean.TRUE;
                Locale locale2 = Locale.ROOT;
                return new Yi.b(1, new j(Executors.defaultThreadFactory(), "split-singleThreadTaskExecutor-%d", new AtomicLong(0L), bool2, null));
            default:
                Boolean bool3 = Boolean.TRUE;
                Locale locale3 = Locale.ROOT;
                return new Yi.b(6, new j(Executors.defaultThreadFactory(), "split-taskExecutor-%d", new AtomicLong(0L), bool3, null));
        }
    }
}

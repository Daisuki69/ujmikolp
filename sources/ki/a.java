package Ki;

import io.split.android.client.dtos.KeyImpression;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Hi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f2774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f2775b = new ConcurrentLinkedQueue();
    public final AtomicBoolean c;

    public a(c cVar, boolean z4) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.c = atomicBoolean;
        Objects.requireNonNull(cVar);
        this.f2774a = cVar;
        atomicBoolean.set(z4);
    }

    @Override // Hi.b
    public final void push(Object obj) {
        KeyImpression keyImpression = (KeyImpression) obj;
        if (keyImpression == null) {
            return;
        }
        if (!this.c.get()) {
            Ri.a.p("Pushing impressions to in memory storage");
            this.f2775b.add(keyImpression);
        } else {
            Ri.a.p("Pushing impressions to persistent storage");
            Ii.d dVar = (Ii.d) this.f2774a;
            dVar.getClass();
            dVar.push(keyImpression);
        }
    }
}

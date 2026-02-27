package Ii;

import io.split.android.client.dtos.Event;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Hi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f2342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f2343b = new ConcurrentLinkedQueue();
    public final AtomicBoolean c;

    public a(b bVar, boolean z4) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.c = atomicBoolean;
        Objects.requireNonNull(bVar);
        this.f2342a = bVar;
        atomicBoolean.set(z4);
    }

    @Override // Hi.b
    public final void push(Object obj) {
        Event event = (Event) obj;
        if (event == null) {
            return;
        }
        if (!this.c.get()) {
            Ri.a.p("Pushing events to in memory storage");
            this.f2343b.add(event);
        } else {
            Ri.a.p("Pushing events to persistent storage");
            d dVar = (d) this.f2342a;
            dVar.getClass();
            dVar.push(event);
        }
    }
}

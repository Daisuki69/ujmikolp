package w4;

import com.shield.android.sheildsignature.a.a;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import oi.C1989g;
import pg.C2038a;
import ph.U2;

/* JADX INFO: renamed from: w4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2382f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f20694a = new AtomicReference(EnumC2380d.f20690a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f20695b = new AtomicLong(0);
    public final ExecutorService c = Executors.newSingleThreadExecutor(ThreadFactoryC2381e.f20693a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qc.c f20696d;
    public final C2038a e;
    public final a.C0079a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f20697g;
    public final long h;
    public final long i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f20698k;

    public C2382f(qc.c cVar, C1989g c1989g, C2038a c2038a, a.C0079a c0079a, List list, long j, long j6, long j7, long j9) {
        this.f20696d = cVar;
        this.e = c2038a;
        this.f = c0079a;
        this.f20697g = list;
        this.h = j;
        this.i = j6;
        this.j = j7;
        this.f20698k = j9;
    }

    public final void a() {
        if (((EnumC2380d) this.f20694a.get()) == EnumC2380d.c) {
            throw new IllegalStateException("Service already shutdown");
        }
    }

    public final void b() {
        a();
        if (((EnumC2380d) this.f20694a.get()) != EnumC2380d.f20691b) {
            this.c.submit(new U2(this, 3));
        }
    }
}

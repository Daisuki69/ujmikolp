package ui;

import dOYHB6.tiZVw8.numX49;
import io.split.android.client.storage.db.GeneralInfoDao;
import io.split.android.client.storage.db.GeneralInfoEntity;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ui.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2316c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20325a;
    public final boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f20327d;
    public final Ji.a f;
    public final AtomicLong e = new AtomicLong(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f20328g = new AtomicReference(EnumC2315b.f20322a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20326b = numX49.tnTj78("bHPB");

    public C2316c(String str, boolean z4, Ji.a aVar, long j) {
        this.f20325a = str;
        this.c = z4;
        this.f20327d = j;
        Objects.requireNonNull(aVar);
        this.f = aVar;
    }

    public final void a() {
        EnumC2315b enumC2315b = EnumC2315b.f20322a;
        if (this.c) {
            b(enumC2315b);
        }
        AtomicLong atomicLong = this.e;
        GeneralInfoEntity byName = ((GeneralInfoDao) ((A7.f) this.f).f210b).getByName(numX49.tnTj78("bHPu"));
        atomicLong.compareAndSet(0L, byName != null ? byName.getLongValue() : 0L);
        long j = atomicLong.get();
        if (j == 0) {
            b(enumC2315b);
            return;
        }
        if (System.currentTimeMillis() - j <= this.f20327d) {
            Ri.a.p(numX49.tnTj78("bHPS"));
            b(EnumC2315b.f20323b);
        } else {
            Ri.a.k(numX49.tnTj78("bHPV") + this.f20325a);
            b(EnumC2315b.c);
        }
    }

    public final void b(EnumC2315b enumC2315b) {
        this.f20328g.set(enumC2315b);
    }
}

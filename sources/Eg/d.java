package Eg;

import Bj.C0144h0;
import Bj.U;
import e2.C1421c;
import io.ktor.utils.io.k;
import io.ktor.utils.io.n;
import io.ktor.utils.io.z;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.y;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1360b = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "content");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f1361a;
    private volatile /* synthetic */ Object content;

    public d(n origin) {
        j.g(origin, "origin");
        this.f1361a = origin;
        this.content = null;
    }

    public final n a() throws Throwable {
        if (this.f1361a.b() != null) {
            Throwable thB = this.f1361a.b();
            j.d(thB);
            throw thB;
        }
        y yVar = new y();
        Object obj = this.content;
        yVar.f18195a = obj;
        C0144h0 c0144h0 = C0144h0.f623a;
        if (obj == null) {
            b bVar = new b(this);
            yVar.f18195a = bVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1360b;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, bVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    yVar.f18195a = this.content;
                }
            }
            b bVar2 = (b) yVar.f18195a;
            bVar2.getClass();
            C1421c c1421cE = z.e(c0144h0, U.f604b, new a(bVar2.c, bVar2, null), 2);
            bVar2.f1357b = c1421cE;
            return (k) c1421cE.f16555b;
        }
        return (k) z.e(c0144h0, null, new c(yVar, null), 3).f16555b;
    }
}

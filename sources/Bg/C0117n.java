package Bg;

import Ng.AbstractC0494b;
import Ng.C0496d;
import ah.AbstractC0710b;
import ah.C0709a;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: renamed from: Bg.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0117n extends Og.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f544a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f545b;
    public final C0496d c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f546d;

    public C0117n(Jg.c cVar, C0496d c0496d, Object obj) {
        this.f546d = obj;
        Ng.n nVar = cVar.c;
        List list = Ng.q.f4436a;
        String strN = nVar.n(RtspHeaders.CONTENT_LENGTH);
        this.f545b = strN != null ? Long.valueOf(Long.parseLong(strN)) : null;
        if (c0496d == null) {
            C0496d c0496d2 = AbstractC0494b.f4422a;
            c0496d = AbstractC0494b.f4423b;
        }
        this.c = c0496d;
    }

    @Override // Og.f
    public final Long a() {
        switch (this.f544a) {
        }
        return this.f545b;
    }

    @Override // Og.f
    public final C0496d b() {
        switch (this.f544a) {
        }
        return this.c;
    }

    @Override // Og.e
    public final io.ktor.utils.io.n e() {
        Object obj = this.f546d;
        switch (this.f544a) {
            case 0:
                return (io.ktor.utils.io.n) obj;
            default:
                InputStream inputStream = (InputStream) obj;
                Ij.e eVar = Bj.U.f603a;
                Ij.d context = Ij.d.f2362a;
                C0709a pool = AbstractC0710b.f7231a;
                kotlin.jvm.internal.j.g(inputStream, "<this>");
                kotlin.jvm.internal.j.g(context, "context");
                kotlin.jvm.internal.j.g(pool, "pool");
                return new Zg.i(new Mj.b(inputStream), context);
        }
    }

    public C0117n(Vg.e eVar, C0496d c0496d, Object obj) {
        this.f546d = obj;
        Ng.n nVar = ((Jg.c) eVar.f6113a).c;
        List list = Ng.q.f4436a;
        String strN = nVar.n(RtspHeaders.CONTENT_LENGTH);
        this.f545b = strN != null ? Long.valueOf(Long.parseLong(strN)) : null;
        if (c0496d == null) {
            C0496d c0496d2 = AbstractC0494b.f4422a;
            c0496d = AbstractC0494b.f4423b;
        }
        this.c = c0496d;
    }
}

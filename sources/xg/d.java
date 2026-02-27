package xg;

import Ng.m;
import Ng.q;
import Ng.t;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends b {
    public final byte[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f20994g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(wg.c client, Jg.b bVar, Kg.c cVar, byte[] bArr) {
        super(client);
        j.g(client, "client");
        this.f = bArr;
        this.f20991b = new Gg.d(this, bVar);
        this.c = new Kg.a(this, bArr, cVar);
        m mVarA = cVar.a();
        List list = q.f4436a;
        String str = mVarA.get(RtspHeaders.CONTENT_LENGTH);
        Long lValueOf = str != null ? Long.valueOf(Long.parseLong(str)) : null;
        long length = bArr.length;
        t method = bVar.r();
        j.g(method, "method");
        if (lValueOf == null || lValueOf.longValue() < 0 || method.equals(t.f4438d) || lValueOf.longValue() == length) {
            this.f20994g = true;
            return;
        }
        throw new IllegalStateException("Content-Length mismatch: expected " + lValueOf + " bytes, but received " + length + " bytes");
    }

    @Override // xg.b
    public final boolean b() {
        return this.f20994g;
    }

    @Override // xg.b
    public final Object e() {
        return E1.c.a(this.f);
    }
}

package n;

import android.graphics.ColorFilter;
import s.C2221f;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2221f f18482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ColorFilter f18483b;
    public final /* synthetic */ A.c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f18484d;

    public o(s sVar, C2221f c2221f, ColorFilter colorFilter, A.c cVar) {
        this.f18484d = sVar;
        this.f18482a = c2221f;
        this.f18483b = colorFilter;
        this.c = cVar;
    }

    @Override // n.r
    public final void run() {
        A.c cVar = this.c;
        this.f18484d.a(this.f18482a, this.f18483b, cVar);
    }
}

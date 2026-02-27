package Bh;

import a.AbstractC0617a;
import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends AbstractC0617a {
    public final /* synthetic */ int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f569d;

    public /* synthetic */ b(Object obj, int i) {
        this.c = i;
        this.f569d = obj;
    }

    @Override // a.AbstractC0617a
    public final void K(String str) {
        switch (this.c) {
            case 0:
                ((PrintStream) this.f569d).println((Object) str);
                break;
            default:
                ((PrintWriter) this.f569d).println((Object) str);
                break;
        }
    }
}

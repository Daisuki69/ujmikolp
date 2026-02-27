package gh;

import java.io.PrintStream;
import java.io.PrintWriter;
import o1.AbstractC1955a;

/* JADX INFO: renamed from: gh.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1522a extends AbstractC1955a {
    public final /* synthetic */ int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f16844d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1522a(Object obj, int i) {
        super(13);
        this.c = i;
        this.f16844d = obj;
    }

    @Override // o1.AbstractC1955a
    public final void y(String str) {
        switch (this.c) {
            case 0:
                ((PrintStream) this.f16844d).println((Object) str);
                break;
            default:
                ((PrintWriter) this.f16844d).println((Object) str);
                break;
        }
    }
}

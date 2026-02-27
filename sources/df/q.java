package df;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16467b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16468d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f16469g;
    public final int h;
    public final int i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f16470k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f16471l;
    public String m;

    static {
        p pVar = new p();
        pVar.f16464a = true;
        new q(pVar);
        p pVar2 = new p();
        pVar2.c = true;
        long seconds = TimeUnit.SECONDS.toSeconds(Integer.MAX_VALUE);
        pVar2.f16465b = seconds <= 2147483647L ? (int) seconds : Integer.MAX_VALUE;
        new q(pVar2);
    }

    public q(boolean z4, boolean z5, int i, int i4, boolean z8, boolean z9, boolean z10, int i6, int i10, boolean z11, boolean z12, boolean z13, String str) {
        this.f16466a = z4;
        this.f16467b = z5;
        this.c = i;
        this.f16468d = i4;
        this.e = z8;
        this.f = z9;
        this.f16469g = z10;
        this.h = i6;
        this.i = i10;
        this.j = z11;
        this.f16470k = z12;
        this.f16471l = z13;
        this.m = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static df.q a(df.x r25) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df.q.a(df.x):df.q");
    }

    public final String toString() {
        String string;
        String str = this.m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f16466a) {
            sb2.append("no-cache, ");
        }
        if (this.f16467b) {
            sb2.append("no-store, ");
        }
        int i = this.c;
        if (i != -1) {
            sb2.append("max-age=");
            sb2.append(i);
            sb2.append(", ");
        }
        int i4 = this.f16468d;
        if (i4 != -1) {
            sb2.append("s-maxage=");
            sb2.append(i4);
            sb2.append(", ");
        }
        if (this.e) {
            sb2.append("private, ");
        }
        if (this.f) {
            sb2.append("public, ");
        }
        if (this.f16469g) {
            sb2.append("must-revalidate, ");
        }
        int i6 = this.h;
        if (i6 != -1) {
            sb2.append("max-stale=");
            sb2.append(i6);
            sb2.append(", ");
        }
        int i10 = this.i;
        if (i10 != -1) {
            sb2.append("min-fresh=");
            sb2.append(i10);
            sb2.append(", ");
        }
        if (this.j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f16470k) {
            sb2.append("no-transform, ");
        }
        if (this.f16471l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            string = "";
        } else {
            sb2.delete(sb2.length() - 2, sb2.length());
            string = sb2.toString();
        }
        this.m = string;
        return string;
    }

    public q(p pVar) {
        this.f16466a = pVar.f16464a;
        this.f16467b = false;
        this.c = -1;
        this.f16468d = -1;
        this.e = false;
        this.f = false;
        this.f16469g = false;
        this.h = pVar.f16465b;
        this.i = -1;
        this.j = pVar.c;
        this.f16470k = false;
        this.f16471l = false;
    }
}

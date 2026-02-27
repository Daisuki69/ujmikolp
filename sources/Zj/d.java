package zj;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.ranges.IntRange;
import rj.InterfaceC2210a;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements Iterator, InterfaceC2210a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21470a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21471b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IntRange f21472d;
    public int e;
    public final /* synthetic */ e f;

    public d(e eVar) {
        this.f = eVar;
        eVar.getClass();
        int iB = kotlin.ranges.d.b(0, 0, eVar.f21473a.length());
        this.f21471b = iB;
        this.c = iB;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r7 = this;
            int r0 = r7.c
            r1 = 0
            if (r0 >= 0) goto Lb
            r7.f21470a = r1
            r0 = 0
            r7.f21472d = r0
            return
        Lb:
            zj.e r2 = r7.f
            int r3 = r2.f21474b
            r4 = -1
            r5 = 1
            if (r3 <= 0) goto L1a
            int r6 = r7.e
            int r6 = r6 + r5
            r7.e = r6
            if (r6 >= r3) goto L22
        L1a:
            java.lang.CharSequence r3 = r2.f21473a
            int r3 = r3.length()
            if (r0 <= r3) goto L34
        L22:
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r1 = r7.f21471b
            java.lang.CharSequence r2 = r2.f21473a
            int r2 = zj.C2576A.B(r2)
            r0.<init>(r1, r2, r5)
            r7.f21472d = r0
            r7.c = r4
            goto L79
        L34:
            kotlin.jvm.functions.Function2 r0 = r2.c
            java.lang.CharSequence r3 = r2.f21473a
            int r6 = r7.c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.invoke(r3, r6)
            kotlin.Pair r0 = (kotlin.Pair) r0
            if (r0 != 0) goto L58
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r1 = r7.f21471b
            java.lang.CharSequence r2 = r2.f21473a
            int r2 = zj.C2576A.B(r2)
            r0.<init>(r1, r2, r5)
            r7.f21472d = r0
            r7.c = r4
            goto L79
        L58:
            java.lang.Object r2 = r0.f18160a
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.f18161b
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r7.f21471b
            kotlin.ranges.IntRange r3 = kotlin.ranges.d.f(r3, r2)
            r7.f21472d = r3
            int r2 = r2 + r0
            r7.f21471b = r2
            if (r0 != 0) goto L76
            r1 = r5
        L76:
            int r2 = r2 + r1
            r7.c = r2
        L79:
            r7.f21470a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zj.d.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f21470a == -1) {
            a();
        }
        return this.f21470a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f21470a == -1) {
            a();
        }
        if (this.f21470a == 0) {
            throw new NoSuchElementException();
        }
        IntRange intRange = this.f21472d;
        kotlin.jvm.internal.j.e(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f21472d = null;
        this.f21470a = -1;
        return intRange;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

package com.shield.android.context;

import Bj.U;
import gj.InterfaceC1526a;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15167d = {1411678400, 1581062139, 1210445392, 226114847, 2048697449, 901961724};

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private final List<String> f15168ed;

    /* JADX INFO: renamed from: ee, reason: collision with root package name */
    private final Bj.A f15169ee;

    /* JADX INFO: renamed from: ef, reason: collision with root package name */
    private final long f15170ef;

    /* JADX INFO: renamed from: eg, reason: collision with root package name */
    private final Function1<InterfaceC1526a<? super List<? extends Object>>, Object> f15171eg;

    /* JADX WARN: Multi-variable type inference failed */
    private p(List<String> list, Bj.A a8, long j, Function1<? super InterfaceC1526a<? super List<? extends Object>>, ? extends Object> function1) {
        kotlin.jvm.internal.j.g(list, "");
        kotlin.jvm.internal.j.g(a8, "");
        kotlin.jvm.internal.j.g(function1, "");
        this.f15168ed = list;
        this.f15169ee = a8;
        this.f15170ef = j;
        this.f15171eg = function1;
    }

    public final List<String> aV() {
        return this.f15168ed;
    }

    public final List<String> aW() {
        return this.f15168ed;
    }

    public final Bj.A aX() {
        return this.f15169ee;
    }

    public final long aY() {
        return this.f15170ef;
    }

    public final Function1<InterfaceC1526a<? super List<? extends Object>>, Object> aZ() {
        return this.f15171eg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return ((int) f15167d[1]) ^ 1581062138;
        }
        if (!(obj instanceof p)) {
            return ((int) f15167d[5]) ^ 901961724;
        }
        p pVar = (p) obj;
        if (kotlin.jvm.internal.j.b(this.f15168ed, pVar.f15168ed) && kotlin.jvm.internal.j.b(this.f15169ee, pVar.f15169ee) && this.f15170ef == pVar.f15170ef && kotlin.jvm.internal.j.b(this.f15171eg, pVar.f15171eg)) {
            return ((int) f15167d[1]) ^ 1581062138;
        }
        return ((int) f15167d[5]) ^ 901961724;
    }

    public final int hashCode() {
        int iHashCode = this.f15169ee.hashCode() + (this.f15168ed.hashCode() * (((int) f15167d[4]) ^ 2048697462));
        long j = f15167d[4];
        long j6 = this.f15170ef;
        return this.f15171eg.hashCode() + (((iHashCode * (((int) j) ^ 2048697462)) + ((int) (j6 ^ (j6 >>> 32)))) * (((int) j) ^ 2048697462));
    }

    public final String toString() {
        return "InfoItem(keys=" + this.f15168ed + ", dispatcher=" + this.f15169ee + ", timeout=" + this.f15170ef + ", block=" + this.f15171eg + ((((int) f15167d[3]) ^ 226114870) == true ? (char) 1 : (char) 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public p(List list, Bj.A a8, long j, Function1 function1, int i) {
        Bj.A a10;
        long[] jArr = f15167d;
        long j6 = jArr[0];
        int i4 = (((int) j6) ^ 1411678402) + i + (((int) jArr[1]) ^ 1581062138);
        int i6 = ~i;
        if (((((int) j6) ^ 1411678402) + i) - (i4 + ((~(((int) j6) ^ 1411678402)) | i6)) != 0) {
            Ij.e eVar = U.f603a;
            a10 = Ij.d.f2362a;
        } else {
            a10 = a8;
        }
        int i10 = i + 4;
        long[] jArr2 = f15167d;
        this(list, a10, i10 - (((((int) jArr2[1]) ^ 1581062138) + i10) + (i6 | (-5))) != 0 ? jArr2[2] ^ 1210446096 : j, function1);
    }
}

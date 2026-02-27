package com.shield.android.context;

import Bj.U;
import com.paymaya.common.utility.AbstractC1213b;
import gj.InterfaceC1526a;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15116d = {542977711, 1923705762, 954471672, 2125735063, 1881326830, 202301431};

    /* JADX INFO: renamed from: da, reason: collision with root package name */
    private final String f15117da;

    /* JADX INFO: renamed from: db, reason: collision with root package name */
    private final long f15118db;

    /* JADX INFO: renamed from: dc, reason: collision with root package name */
    private final Bj.A f15119dc;
    private final Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> dd;

    /* JADX WARN: Multi-variable type inference failed */
    private g(String str, long j, Bj.A a8, Function1<? super InterfaceC1526a<? super ConcurrentMap<String, Object>>, ? extends Object> function1) {
        kotlin.jvm.internal.j.g(str, g("ͬͩͤ͏͂"));
        kotlin.jvm.internal.j.g(a8, g("ͯ͢͵ͶͧͲͥͮͣʹ"));
        kotlin.jvm.internal.j.g(function1, g("͠ͳͨͥ"));
        this.f15117da = str;
        this.f15118db = j;
        this.f15119dc = a8;
        this.dd = function1;
    }

    public static String g(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15116d[4]) ^ 1881326830;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15116d;
            long j = jArr[5];
            long j6 = jArr[3];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 202300657) + cCharAt;
            sb2.append((char) AbstractC1213b.G(cCharAt + (((int) j) ^ 202300657) + (((int) j6) ^ 2125735062), i4 | (~(((int) j) ^ 202300657)), i6, (((int) j) ^ 202300657) + cCharAt + (((int) j6) ^ 2125735062) + ((~(((int) j) ^ 202300657)) | i4)));
            long j7 = f15116d[3];
            int i10 = ~i;
            i = i + (((int) j7) ^ 2125735062) + (((int) j7) ^ 2125735062) + ((~(((int) j7) ^ 2125735062)) | i10) + (((((int) j7) ^ 2125735062) + i) - ((((((int) j7) ^ 2125735062) + i) + (((int) j7) ^ 2125735062)) + ((~(((int) j7) ^ 2125735062)) | i10)));
        }
        return sb2.toString();
    }

    public final String av() {
        return this.f15117da;
    }

    public final long aw() {
        return this.f15118db;
    }

    public final Bj.A ax() {
        return this.f15119dc;
    }

    public final Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> ay() {
        return this.dd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return ((int) f15116d[3]) ^ 2125735062;
        }
        if (!(obj instanceof g)) {
            return ((int) f15116d[4]) ^ 1881326830;
        }
        g gVar = (g) obj;
        if (kotlin.jvm.internal.j.b(this.f15117da, gVar.f15117da) && this.f15118db == gVar.f15118db && kotlin.jvm.internal.j.b(this.f15119dc, gVar.f15119dc) && kotlin.jvm.internal.j.b(this.dd, gVar.dd)) {
            return ((int) f15116d[3]) ^ 2125735062;
        }
        return ((int) f15116d[4]) ^ 1881326830;
    }

    public final int hashCode() {
        int iHashCode = this.f15117da.hashCode();
        long j = f15116d[2];
        long j6 = this.f15118db;
        return this.dd.hashCode() + ((this.f15119dc.hashCode() + (((iHashCode * (((int) j) ^ 954471655)) + ((int) (j6 ^ (j6 >>> 32)))) * (((int) j) ^ 954471655))) * (((int) f15116d[2]) ^ 954471655));
    }

    public final String toString() {
        return g("ͩͨͅͲͣ;Ͳ̮͌ͩͤͬͩͤ͏̻͂") + this.f15117da + g("̪̦ͲͯͫͣͩͳͲ̻") + this.f15118db + g("̪̦ͯ͢͵ͶͧͲͥͮͣʹ̻") + this.f15119dc + g("̪̦͠ͳ̻ͨͥ") + this.dd + ((((int) f15116d[1]) ^ 1923705739) == true ? (char) 1 : (char) 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(String str, long j, Bj.A a8, Function1 function1, int i) {
        this(str, f15116d[0] ^ 542965839, Ij.d.f2362a, function1);
        Ij.e eVar = U.f603a;
    }
}

package com.shield.android.context;

import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.internal.NativeUtils;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15186d = {907981870, 1340233560, 1515338824, 489034636, 611025747};
    private static final String eL;
    private final NativeUtils eH;
    private final String eI;
    private final String eJ;
    private final String eK;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b8) {
            this();
        }
    }

    public static final class b extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15187d = {1253340268};

        public b(InterfaceC1526a<? super b> interfaceC1526a) {
            super(((int) f15187d[0]) ^ 1253340269, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return x.this.new b(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((b) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            ConcurrentHashMap concurrentHashMapR = AbstractC1213b.R(obj);
            concurrentHashMapR.put(x.this.bj().getKeyValue("cy"), x.this.eI);
            concurrentHashMapR.put(x.this.bj().getKeyValue("cz"), x.this.eJ);
            concurrentHashMapR.put(x.this.bj().getKeyValue("da"), x.this.eK);
            concurrentHashMapR.put(x.this.bj().getKeyValue("cu"), "1.6.38");
            concurrentHashMapR.put(x.this.bj().getKeyValue("cv"), "1063800");
            concurrentHashMapR.put(x.this.bj().getKeyValue("cx"), x.d(x.this));
            return concurrentHashMapR;
        }
    }

    static {
        new a((((int) 489034636) ^ 489034636) == true ? (byte) 1 : (byte) 0);
        eL = "x";
    }

    public x(NativeUtils nativeUtils, String str, String str2, String str3, String str4) {
        kotlin.jvm.internal.j.g(nativeUtils, g("蟇蟈蟝蟀蟟蟌蟼蟝蟀蟅蟚"));
        kotlin.jvm.internal.j.g(str, g("蟚蟀蟝蟌蟠蟍"));
        kotlin.jvm.internal.j.g(str2, g("蟚蟌蟚蟚蟀蟆蟇蟠蟍"));
        kotlin.jvm.internal.j.g(str3, g("蟚蟌蟚蟚蟀蟆蟇蟪蟛蟌蟈蟝蟌蟍"));
        kotlin.jvm.internal.j.g(str4, g("蟜蟚蟌蟛蟠蟍"));
        this.eH = nativeUtils;
        this.eI = str;
        this.eJ = str2;
        this.eK = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static String bl() {
        try {
            return zj.z.o(g("蟏蟜蟅蟅"), g("蟏蟜蟅蟅"), ((int) f15186d[2]) ^ 1515338825) ? g("蟏蟛蟈蟜蟍") : zj.z.o(g("蟏蟜蟅蟅"), g("蟊蟛蟌蟍蟀蟝"), ((int) f15186d[2]) ^ 1515338825) ? g("蟊蟛蟌蟍蟀蟝") : zj.z.o(g("蟏蟜蟅蟅"), g("蟊蟛蟌蟍蟀蟝蟪蟁蟆蟀蟊蟌"), ((int) f15186d[2]) ^ 1515338825) ? g("蟊蟛蟌蟍蟀蟝蟪蟁蟆蟀蟊蟌") : g("蟅蟀蟝蟌");
        } catch (Exception unused) {
            return g("蟌蟛蟛蟆蟛");
        }
    }

    public static final /* synthetic */ String d(x xVar) {
        return bl();
    }

    public static String g(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15186d[3]) ^ 489034636;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15186d;
            long j = jArr[4];
            long j6 = jArr[2];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 610993402) + cCharAt;
            sb2.append((char) AbstractC1213b.G(cCharAt + (((int) j) ^ 610993402) + (((int) j6) ^ 1515338825), i4 | (~(((int) j) ^ 610993402)), i6, (((int) j) ^ 610993402) + cCharAt + (((int) j6) ^ 1515338825) + ((~(((int) j) ^ 610993402)) | i4)));
            long j7 = f15186d[2];
            int i10 = ~i;
            i = i + (((int) j7) ^ 1515338825) + (((int) j7) ^ 1515338825) + ((~(((int) j7) ^ 1515338825)) | i10) + (((((int) j7) ^ 1515338825) + i) - ((((((int) j7) ^ 1515338825) + i) + (((int) j7) ^ 1515338825)) + ((~(((int) j7) ^ 1515338825)) | i10)));
        }
        return sb2.toString();
    }

    public final NativeUtils bj() {
        return this.eH;
    }

    public final List<g> bk() {
        return cj.r.c(new g(eL + ((((int) f15186d[0]) ^ 907981855) == true ? (char) 1 : (char) 0), 0L, null, new b(null), ((int) f15186d[1]) ^ 1340233566));
    }
}

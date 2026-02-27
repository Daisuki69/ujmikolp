package com.shield.android.context;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import cj.C1112C;
import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.internal.NativeUtils;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15147d = {365493838, 2728244, 487264867, 2066949189, 1450597815, 840643759, 1792344519};
    private static final String dA;
    private final Context dy;
    private final NativeUtils dz;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b8) {
            this();
        }
    }

    public static final class b extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15148d = {308605614};

        public b(InterfaceC1526a<? super b> interfaceC1526a) {
            super(((int) f15148d[0]) ^ 308605615, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return l.this.new b(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((b) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            ConcurrentHashMap concurrentHashMapR = AbstractC1213b.R(obj);
            Pair pairA = l.a(l.this);
            concurrentHashMapR.put(l.this.dz.getKeyValue("cg"), pairA.f18160a);
            concurrentHashMapR.put(l.this.dz.getKeyValue("es"), pairA.f18161b);
            return concurrentHashMapR;
        }
    }

    static {
        new a((((int) 2066949189) ^ 2066949189) == true ? (byte) 1 : (byte) 0);
        dA = CmcdData.Factory.STREAM_TYPE_LIVE;
    }

    public l(Context context, NativeUtils nativeUtils) {
        kotlin.jvm.internal.j.g(context, g("툆툊툋툑툀툝툑"));
        kotlin.jvm.internal.j.g(nativeUtils, g("툋툄툑툌툓툀툰툑툌툉툖"));
        this.dy = context;
        this.dz = nativeUtils;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ kotlin.Pair a(com.shield.android.context.l r20) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.shield.android.context.l.a(com.shield.android.context.l):kotlin.Pair");
    }

    public static String g(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15147d[3]) ^ 2066949189;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15147d;
            long j = jArr[6];
            long j6 = jArr[5];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 1792398242) + cCharAt;
            sb2.append((char) AbstractC1213b.G(cCharAt + (((int) j) ^ 1792398242) + (((int) j6) ^ 840643758), i4 | (~(((int) j) ^ 1792398242)), i6, (((int) j) ^ 1792398242) + cCharAt + (((int) j6) ^ 840643758) + ((~(((int) j) ^ 1792398242)) | i4)));
            long j7 = f15147d[5];
            int i10 = ~i;
            i = i + (((int) j7) ^ 840643758) + (((int) j7) ^ 840643758) + ((~(((int) j7) ^ 840643758)) | i10) + (((((int) j7) ^ 840643758) + i) - ((((((int) j7) ^ 840643758) + i) + (((int) j7) ^ 840643758)) + ((~(((int) j7) ^ 840643758)) | i10)));
        }
        return sb2.toString();
    }

    public final List<g> aL() {
        if (!com.shield.android.internal.f.bI()) {
            return C1112C.f9377a;
        }
        return cj.r.c(new g(dA + ((((int) f15147d[0]) ^ 365493887) == true ? (char) 1 : (char) 0), 0L, null, new b(null), ((int) f15147d[1]) ^ 2728242));
    }
}

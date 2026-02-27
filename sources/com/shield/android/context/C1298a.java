package com.shield.android.context;

import androidx.media3.exoplayer.upstream.CmcdData;
import bj.AbstractC1039j;
import com.paymaya.common.utility.AbstractC1213b;
import com.shield.android.internal.NativeUtils;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.shield.android.context.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1298a {

    /* JADX INFO: renamed from: ck, reason: collision with root package name */
    private static final String f15080ck;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15081d = {294843547, 1450372851, 1618805697, 446844740, 1944189567, 935201581, 219735559, 1454897737};
    private final com.shield.android.a.a ci;

    /* JADX INFO: renamed from: cj, reason: collision with root package name */
    private final NativeUtils f15082cj;

    /* JADX INFO: renamed from: com.shield.android.context.a$a, reason: collision with other inner class name */
    public static final class C0052a {
        private C0052a() {
        }

        public /* synthetic */ C0052a(byte b8) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.shield.android.context.a$b */
    public static final class b extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15083d = {300110248};
        private int bE;
        private Object bO;
        private Object bP;
        private Object bQ;

        public b(InterfaceC1526a<? super b> interfaceC1526a) {
            super(((int) f15083d[0]) ^ 300110249, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return C1298a.this.new b(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((b) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            Map concurrentHashMap;
            String str;
            Map map;
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.bE;
            if (i == 0) {
                AbstractC1039j.b(obj);
                String keyValue = C1298a.this.f15082cj.getKeyValue("db");
                concurrentHashMap = new ConcurrentHashMap();
                com.shield.android.a.a aVar = C1298a.this.ci;
                this.bO = concurrentHashMap;
                this.bP = concurrentHashMap;
                this.bQ = keyValue;
                this.bE = ((int) f15083d[0]) ^ 300110249;
                Object objA = aVar.a(this);
                if (objA == enumC1578a) {
                    return enumC1578a;
                }
                str = keyValue;
                obj = objA;
                map = concurrentHashMap;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.bQ;
                concurrentHashMap = (Map) this.bP;
                map = (ConcurrentHashMap) this.bO;
                AbstractC1039j.b(obj);
            }
            concurrentHashMap.put(str, obj);
            return map;
        }
    }

    static {
        new C0052a((((int) 1618805697) ^ 1618805697) == true ? (byte) 1 : (byte) 0);
        f15080ck = CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY;
    }

    public C1298a(com.shield.android.a.a aVar, NativeUtils nativeUtils) {
        kotlin.jvm.internal.j.g(aVar, d("ጄ觖쒯戉년壯Ⱔ陕䭺ꗧ劣꤫퓕樛땃\udafa\ued27盀묱川꺻휘"));
        kotlin.jvm.internal.j.g(nativeUtils, d("ጋ觓쒭戅녀壾Ⱈ陒䭺ꗥ劷"));
        this.ci = aVar;
        this.f15082cj = nativeUtils;
    }

    public static String d(String str) {
        int i = ((int) f15081d[3]) ^ 446851471;
        StringBuilder sb2 = new StringBuilder();
        int i4 = ((int) f15081d[2]) ^ 1618805697;
        while (i4 < str.length()) {
            long[] jArr = f15081d;
            int i6 = (((i >> (((int) jArr[2]) ^ 1618805697)) ^ (i >> (((int) jArr[4]) ^ 1944189565))) ^ (i >> (((int) jArr[5]) ^ 935201582))) ^ (i >> 5);
            long j = jArr[6];
            i = (char) ((i >> (((int) j) ^ 219735558)) | (((char) (i6 & (((int) j) ^ 219735558))) << (((int) jArr[7]) ^ 1454897734)));
            char cCharAt = str.charAt(i4);
            int i10 = cCharAt + i;
            long j6 = f15081d[6];
            int i11 = (~cCharAt) | (~i);
            sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 219735558, i11, i10, (((int) j6) ^ 219735558) + i10 + i11));
            long j7 = f15081d[6];
            int i12 = ~i4;
            i4 = i4 + (((int) j7) ^ 219735558) + (((int) j7) ^ 219735558) + ((~(((int) j7) ^ 219735558)) | i12) + (((((int) j7) ^ 219735558) + i4) - ((((((int) j7) ^ 219735558) + i4) + (((int) j7) ^ 219735558)) + ((~(((int) j7) ^ 219735558)) | i12)));
        }
        return sb2.toString();
    }

    public final List<g> scheduleJobs() {
        if (!com.shield.android.internal.f.bI()) {
            return new ArrayList();
        }
        return cj.r.c(new g(f15080ck + ((((int) f15081d[0]) ^ 294843562) == true ? (char) 1 : (char) 0), 0L, null, new b(null), ((int) f15081d[1]) ^ 1450372853));
    }
}

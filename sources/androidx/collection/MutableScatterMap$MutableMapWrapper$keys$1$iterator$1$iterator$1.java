package androidx.collection;

import gj.InterfaceC1526a;
import ij.AbstractC1615i;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import yj.k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1611e(c = "androidx.collection.MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1", f = "ScatterMap.kt", l = {1431}, m = "invokeSuspend")
public final class MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 extends AbstractC1615i implements Function2<k, InterfaceC1526a<? super Unit>, Object> {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MutableScatterMap<K, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1(MutableScatterMap<K, V> mutableScatterMap, InterfaceC1526a<? super MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1> interfaceC1526a) {
        super(2, interfaceC1526a);
        this.this$0 = mutableScatterMap;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
        MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 = new MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1(this.this$0, interfaceC1526a);
        mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1.L$0 = obj;
        return mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004b -> B:22:0x0091). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004d -> B:14:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0068 -> B:19:0x0088). Please report as a decompilation issue!!! */
    @Override // ij.AbstractC1607a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = 1
            hj.a r2 = hj.EnumC1578a.f17050a
            int r3 = r0.label
            r4 = 0
            r5 = 8
            if (r3 == 0) goto L2c
            if (r3 != r1) goto L24
            int r3 = r0.I$3
            int r6 = r0.I$2
            long r7 = r0.J$0
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r11 = r0.L$1
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.L$0
            yj.k r12 = (yj.k) r12
            bj.AbstractC1039j.b(r20)
            goto L88
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2c:
            bj.AbstractC1039j.b(r20)
            java.lang.Object r3 = r0.L$0
            yj.k r3 = (yj.k) r3
            androidx.collection.MutableScatterMap<K, V> r6 = r0.this$0
            long[] r6 = r6.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L95
            r8 = r4
        L3d:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L91
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = r11
            r11 = r6
            r6 = r12
            r12 = r3
            r3 = r4
            r17 = r9
            r10 = r7
            r9 = r8
            r7 = r17
        L5f:
            if (r3 >= r6) goto L8b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L88
            int r4 = r9 << 3
            int r4 = r4 + r3
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            r0.L$0 = r12
            r0.L$1 = r11
            r0.I$0 = r10
            r0.I$1 = r9
            r0.J$0 = r7
            r0.I$2 = r6
            r0.I$3 = r3
            r0.label = r1
            r12.b(r0, r5)
            hj.a r1 = hj.EnumC1578a.f17050a
            return r2
        L88:
            long r7 = r7 >> r5
            int r3 = r3 + r1
            goto L5f
        L8b:
            if (r6 != r5) goto L95
            r8 = r9
            r7 = r10
            r6 = r11
            r3 = r12
        L91:
            if (r8 == r7) goto L95
            int r8 = r8 + r1
            goto L3d
        L95:
            kotlin.Unit r1 = kotlin.Unit.f18162a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(k kVar, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return ((MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1) create(kVar, interfaceC1526a)).invokeSuspend(Unit.f18162a);
    }
}

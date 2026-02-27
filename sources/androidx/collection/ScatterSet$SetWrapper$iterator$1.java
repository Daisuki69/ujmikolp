package androidx.collection;

import gj.InterfaceC1526a;
import ij.AbstractC1615i;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import yj.k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1611e(c = "androidx.collection.ScatterSet$SetWrapper$iterator$1", f = "ScatterSet.kt", l = {495}, m = "invokeSuspend")
public final class ScatterSet$SetWrapper$iterator$1 extends AbstractC1615i implements Function2<k, InterfaceC1526a<? super Unit>, Object> {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ScatterSet<E> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScatterSet$SetWrapper$iterator$1(ScatterSet<E> scatterSet, InterfaceC1526a<? super ScatterSet$SetWrapper$iterator$1> interfaceC1526a) {
        super(2, interfaceC1526a);
        this.this$0 = scatterSet;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
        ScatterSet$SetWrapper$iterator$1 scatterSet$SetWrapper$iterator$1 = new ScatterSet$SetWrapper$iterator$1(this.this$0, interfaceC1526a);
        scatterSet$SetWrapper$iterator$1.L$0 = obj;
        return scatterSet$SetWrapper$iterator$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0051 -> B:22:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0053 -> B:14:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006d -> B:19:0x008c). Please report as a decompilation issue!!! */
    @Override // ij.AbstractC1607a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = 1
            hj.a r2 = hj.EnumC1578a.f17050a
            int r3 = r0.label
            r4 = 0
            r5 = 8
            if (r3 == 0) goto L30
            if (r3 != r1) goto L28
            int r3 = r0.I$3
            int r6 = r0.I$2
            long r7 = r0.J$0
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r11 = r0.L$2
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.L$1
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            java.lang.Object r13 = r0.L$0
            yj.k r13 = (yj.k) r13
            bj.AbstractC1039j.b(r21)
            goto L8c
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L30:
            bj.AbstractC1039j.b(r21)
            java.lang.Object r3 = r0.L$0
            yj.k r3 = (yj.k) r3
            androidx.collection.ScatterSet<E> r6 = r0.this$0
            java.lang.Object[] r7 = r6.elements
            long[] r6 = r6.metadata
            int r8 = r6.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L99
            r9 = r4
        L43:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L95
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r3
            r3 = r4
            r18 = r10
            r11 = r6
            r10 = r8
            r6 = r12
            r12 = r7
            r7 = r18
        L64:
            if (r3 >= r6) goto L8f
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L8c
            int r4 = r9 << 3
            int r4 = r4 + r3
            r4 = r12[r4]
            r0.L$0 = r13
            r0.L$1 = r12
            r0.L$2 = r11
            r0.I$0 = r10
            r0.I$1 = r9
            r0.J$0 = r7
            r0.I$2 = r6
            r0.I$3 = r3
            r0.label = r1
            r13.b(r0, r4)
            hj.a r1 = hj.EnumC1578a.f17050a
            return r2
        L8c:
            long r7 = r7 >> r5
            int r3 = r3 + r1
            goto L64
        L8f:
            if (r6 != r5) goto L99
            r8 = r10
            r6 = r11
            r7 = r12
            r3 = r13
        L95:
            if (r9 == r8) goto L99
            int r9 = r9 + r1
            goto L43
        L99:
            kotlin.Unit r1 = kotlin.Unit.f18162a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterSet$SetWrapper$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(k kVar, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return ((ScatterSet$SetWrapper$iterator$1) create(kVar, interfaceC1526a)).invokeSuspend(Unit.f18162a);
    }
}

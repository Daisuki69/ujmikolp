package androidx.collection;

import gj.InterfaceC1526a;
import ij.AbstractC1615i;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import yj.k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1611e(c = "androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1", f = "ScatterSet.kt", l = {1060}, m = "invokeSuspend")
public final class MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 extends AbstractC1615i implements Function2<k, InterfaceC1526a<? super Unit>, Object> {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ MutableScatterSet<E> this$0;
    final /* synthetic */ MutableScatterSet$MutableSetWrapper$iterator$1 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1(MutableScatterSet mutableScatterSet, MutableScatterSet$MutableSetWrapper$iterator$1 mutableScatterSet$MutableSetWrapper$iterator$1, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.this$0 = mutableScatterSet;
        this.this$1 = mutableScatterSet$MutableSetWrapper$iterator$1;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
        MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 mutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 = new MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1(this.this$0, this.this$1, interfaceC1526a);
        mutableScatterSet$MutableSetWrapper$iterator$1$iterator$1.L$0 = obj;
        return mutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0056 -> B:22:0x00a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0058 -> B:14:0x006c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0075 -> B:19:0x009b). Please report as a decompilation issue!!! */
    @Override // ij.AbstractC1607a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = 1
            hj.a r2 = hj.EnumC1578a.f17050a
            int r3 = r0.label
            r4 = 0
            r5 = 8
            if (r3 == 0) goto L35
            if (r3 != r1) goto L2d
            int r3 = r0.I$3
            int r6 = r0.I$2
            long r7 = r0.J$0
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r11 = r0.L$3
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.L$2
            androidx.collection.MutableScatterSet r12 = (androidx.collection.MutableScatterSet) r12
            java.lang.Object r13 = r0.L$1
            androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1 r13 = (androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1) r13
            java.lang.Object r14 = r0.L$0
            yj.k r14 = (yj.k) r14
            bj.AbstractC1039j.b(r22)
            goto L9b
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L35:
            bj.AbstractC1039j.b(r22)
            java.lang.Object r3 = r0.L$0
            yj.k r3 = (yj.k) r3
            androidx.collection.MutableScatterSet<E> r6 = r0.this$0
            androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1 r7 = r0.this$1
            long[] r8 = r6.metadata
            int r9 = r8.length
            int r9 = r9 + (-2)
            if (r9 < 0) goto Lab
            r10 = r4
        L48:
            r11 = r8[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto La7
            int r13 = r10 - r9
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r10
            r10 = r9
            r9 = r14
            r14 = r3
            r3 = r4
            r19 = r11
            r12 = r6
            r11 = r8
            r6 = r13
            r13 = r7
            r7 = r19
        L6c:
            if (r3 >= r6) goto L9e
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L9b
            int r4 = r9 << 3
            int r4 = r4 + r3
            r13.setCurrent(r4)
            java.lang.Object[] r5 = r12.elements
            r4 = r5[r4]
            r0.L$0 = r14
            r0.L$1 = r13
            r0.L$2 = r12
            r0.L$3 = r11
            r0.I$0 = r10
            r0.I$1 = r9
            r0.J$0 = r7
            r0.I$2 = r6
            r0.I$3 = r3
            r0.label = r1
            r14.b(r0, r4)
            hj.a r1 = hj.EnumC1578a.f17050a
            return r2
        L9b:
            long r7 = r7 >> r5
            int r3 = r3 + r1
            goto L6c
        L9e:
            if (r6 != r5) goto Lab
            r3 = r10
            r10 = r9
            r9 = r3
            r8 = r11
            r6 = r12
            r7 = r13
            r3 = r14
        La7:
            if (r10 == r9) goto Lab
            int r10 = r10 + r1
            goto L48
        Lab:
            kotlin.Unit r1 = kotlin.Unit.f18162a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(k kVar, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return ((MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1) create(kVar, interfaceC1526a)).invokeSuspend(Unit.f18162a);
    }
}

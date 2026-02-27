package Fj;

import Bj.E;
import Ej.InterfaceC0230h;
import Ej.InterfaceC0231i;
import androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1;
import gj.InterfaceC1526a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Dj.i f1669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f1670b;
    public int c;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1671g;
    public final /* synthetic */ InterfaceC0230h[] h;
    public final /* synthetic */ WorkConstraintsTracker$track$$inlined$combine$1.AnonymousClass2 i;
    public final /* synthetic */ WorkConstraintsTracker$track$$inlined$combine$1.AnonymousClass3 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0231i f1672k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(InterfaceC0230h[] interfaceC0230hArr, WorkConstraintsTracker$track$$inlined$combine$1.AnonymousClass2 anonymousClass2, WorkConstraintsTracker$track$$inlined$combine$1.AnonymousClass3 anonymousClass3, InterfaceC0231i interfaceC0231i, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.h = interfaceC0230hArr;
        this.i = anonymousClass2;
        this.j = anonymousClass3;
        this.f1672k = interfaceC0231i;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        WorkConstraintsTracker$track$$inlined$combine$1.AnonymousClass3 anonymousClass3 = this.j;
        r rVar = new r(this.h, this.i, anonymousClass3, this.f1672k, interfaceC1526a);
        rVar.f1671g = obj;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x009c, code lost:
    
        r18 = r10;
        r10 = r8;
        r8 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1 A[LOOP:0: B:29:0x00c1->B:51:?, LOOP_START, PHI: r7 r11
  0x00c1: PHI (r7v3 int) = (r7v2 int), (r7v4 int) binds: [B:26:0x00bc, B:51:?] A[DONT_GENERATE, DONT_INLINE]
  0x00c1: PHI (r11v4 kotlin.collections.IndexedValue) = (r11v3 kotlin.collections.IndexedValue), (r11v14 kotlin.collections.IndexedValue) binds: [B:26:0x00bc, B:51:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0131  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0128 -> B:46:0x012d). Please report as a decompilation issue!!! */
    @Override // ij.AbstractC1607a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Fj.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

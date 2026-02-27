package f5;

import Bj.E;
import com.paymaya.adkit.presentation.banneradcarousel.view.BannerAdCarousel;
import gj.InterfaceC1526a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f16713b;
    public final /* synthetic */ BannerAdCarousel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BannerAdCarousel bannerAdCarousel, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.c = bannerAdCarousel;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        d dVar = new d(this.c, interfaceC1526a);
        dVar.f16713b = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0033 -> B:14:0x0036). Please report as a decompilation issue!!! */
    @Override // ij.AbstractC1607a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            hj.a r0 = hj.EnumC1578a.f17050a
            int r1 = r7.f16712a
            com.paymaya.adkit.presentation.banneradcarousel.view.BannerAdCarousel r2 = r7.c
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 != r3) goto L13
            java.lang.Object r1 = r7.f16713b
            Bj.E r1 = (Bj.E) r1
            bj.AbstractC1039j.b(r8)
            goto L36
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            bj.AbstractC1039j.b(r8)
            java.lang.Object r8 = r7.f16713b
            Bj.E r8 = (Bj.E) r8
            r1 = r8
        L23:
            boolean r8 = Bj.H.t(r1)
            if (r8 == 0) goto L68
            long r4 = r2.j
            r7.f16713b = r1
            r7.f16712a = r3
            java.lang.Object r8 = Bj.O.b(r4, r7)
            if (r8 != r0) goto L36
            return r0
        L36:
            boolean r8 = r2.i
            if (r8 == 0) goto L23
            androidx.recyclerview.widget.RecyclerView r8 = r2.f10215a
            androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = r8.getLayoutManager()
            boolean r5 = r4 instanceof androidx.recyclerview.widget.LinearLayoutManager
            r6 = 0
            if (r5 == 0) goto L48
            androidx.recyclerview.widget.LinearLayoutManager r4 = (androidx.recyclerview.widget.LinearLayoutManager) r4
            goto L49
        L48:
            r4 = r6
        L49:
            if (r4 == 0) goto L23
            int r4 = r4.findFirstVisibleItemPosition()
            int r4 = r4 + r3
            r2.f10221n = r3
            if (r4 < 0) goto L23
            g5.a r5 = r2.c
            if (r5 == 0) goto L62
            int r5 = r5.getItemCount()
            if (r4 >= r5) goto L23
            r8.smoothScrollToPosition(r4)
            goto L23
        L62:
            java.lang.String r8 = "adapter"
            kotlin.jvm.internal.j.n(r8)
            throw r6
        L68:
            kotlin.Unit r8 = kotlin.Unit.f18162a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

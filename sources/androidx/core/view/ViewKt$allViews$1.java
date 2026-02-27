package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1615i;
import ij.InterfaceC1611e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1611e(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {410, 412}, m = "invokeSuspend")
public final class ViewKt$allViews$1 extends AbstractC1615i implements Function2<yj.k, InterfaceC1526a<? super Unit>, Object> {
    final /* synthetic */ View $this_allViews;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, InterfaceC1526a<? super ViewKt$allViews$1> interfaceC1526a) {
        super(2, interfaceC1526a);
        this.$this_allViews = view;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.$this_allViews, interfaceC1526a);
        viewKt$allViews$1.L$0 = obj;
        return viewKt$allViews$1;
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.label;
        if (i == 0) {
            AbstractC1039j.b(obj);
            yj.k kVar = (yj.k) this.L$0;
            View view = this.$this_allViews;
            this.L$0 = kVar;
            this.label = 1;
            kVar.b(this, view);
            return enumC1578a;
        }
        if (i == 1) {
            yj.k kVar2 = (yj.k) this.L$0;
            AbstractC1039j.b(obj);
            View view2 = this.$this_allViews;
            if (view2 instanceof ViewGroup) {
                Sequence<View> descendants = ViewGroupKt.getDescendants((ViewGroup) view2);
                this.L$0 = null;
                this.label = 2;
                kVar2.getClass();
                Object objC = kVar2.c(descendants.iterator(), this);
                if (objC != enumC1578a) {
                    objC = Unit.f18162a;
                }
                if (objC == enumC1578a) {
                    return enumC1578a;
                }
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
        }
        return Unit.f18162a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(yj.k kVar, InterfaceC1526a<? super Unit> interfaceC1526a) {
        return ((ViewKt$allViews$1) create(kVar, interfaceC1526a)).invokeSuspend(Unit.f18162a);
    }
}

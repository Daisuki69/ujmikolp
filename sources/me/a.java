package me;

import N5.i1;
import Q6.l;
import android.view.animation.DecelerateInterpolator;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.Decoration;
import com.paymaya.ui.sendmoney.view.fragment.impl.SendMoneyCardPreviewFragment;
import dOYHB6.tiZVw8.numX49;
import fa.ViewOnClickListenerC1479a;
import kotlin.jvm.internal.j;
import le.InterfaceC1826a;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends RecyclerView.ViewHolder implements InterfaceC1826a {
    public static final DecelerateInterpolator e = new DecelerateInterpolator();
    public static final float f = 1.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f18402g = 1.125f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1 f18403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SendMoneyCardPreviewFragment f18404b;
    public Decoration c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f18405d;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(i1 i1Var, SendMoneyCardPreviewFragment sendMoneyCardPreviewFragment) {
        j.g(sendMoneyCardPreviewFragment, numX49.tnTj78("bOfP"));
        CardView cardView = i1Var.f4120b;
        super(cardView);
        this.f18403a = i1Var;
        this.f18404b = sendMoneyCardPreviewFragment;
        l lVar = new l(29);
        this.f18405d = lVar;
        lVar.h(this);
        cardView.setOnClickListener(new ViewOnClickListenerC1479a(this, 16));
    }

    public static final void D(a aVar) {
        SendMoneyCardPreviewFragment sendMoneyCardPreviewFragment = aVar.f18404b;
        Decoration decoration = aVar.c;
        sendMoneyCardPreviewFragment.getClass();
        C1219h c1219h = new C1219h();
        c1219h.n(17);
        c1219h.t(EnumC1217f.THEME);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put(numX49.tnTj78("bOfb"), decoration != null ? decoration.getMId() : null);
        sendMoneyCardPreviewFragment.o1(c1219h);
        j.n(numX49.tnTj78("bOf2"));
        throw null;
    }
}

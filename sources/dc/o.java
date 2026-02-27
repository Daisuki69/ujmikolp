package dc;

import N5.H;
import ac.C0674C;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.domain.model.ShopPurchaseHistory;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopPurchaseHistoryPageFragment;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0674C f16343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintLayout f16344b;
    public final ImageView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f16345d;
    public final TextView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f16346g;
    public final TextView h;
    public final TextView i;
    public final LinearLayout j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Group f16347k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Group f16348l;
    public final Lh.c m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ShopPurchaseHistory f16349n;

    /* JADX WARN: Illegal instructions before constructor call */
    public o(H h, com.paymaya.data.preference.a mPreference, C0674C c0674c) {
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        ConstraintLayout constraintLayout = h.f3633b;
        super(constraintLayout);
        this.f16343a = c0674c;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) h.f3634d;
        kotlin.jvm.internal.j.f(constraintLayout2, "layoutContainerPmaViewSh…chaseHistoryCompletedItem");
        this.f16344b = constraintLayout2;
        this.c = (ImageView) h.f3638n;
        this.f16345d = (TextView) h.j;
        this.e = h.f3635g;
        this.f = (TextView) h.f3636k;
        this.f16346g = h.c;
        this.h = h.f;
        this.i = (TextView) h.f3639o;
        this.j = (LinearLayout) h.i;
        this.f16347k = (Group) h.f3637l;
        this.f16348l = (Group) h.f3641q;
        this.m = new Lh.c(mPreference, this);
        final int i = 0;
        constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: dc.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f16342b;

            {
                this.f16342b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        o oVar = this.f16342b;
                        Callback.onClick_enter(view);
                        try {
                            o oVar2 = (o) oVar.m.c;
                            ShopPurchaseHistory shopPurchaseHistory = oVar2.f16349n;
                            if (shopPurchaseHistory != null) {
                                oVar2.f16343a.e(shopPurchaseHistory);
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        o oVar3 = this.f16342b;
                        Callback.onClick_enter(view);
                        try {
                            ShopPurchaseHistory shopPurchaseHistory2 = oVar3.f16349n;
                            if (shopPurchaseHistory2 != null) {
                                C0674C c0674c2 = oVar3.f16343a;
                                c0674c2.getClass();
                                MayaShopPurchaseHistoryPageFragment mayaShopPurchaseHistoryPageFragment = c0674c2.c;
                                mayaShopPurchaseHistoryPageFragment.getClass();
                                mayaShopPurchaseHistoryPageFragment.P1(shopPurchaseHistory2);
                            }
                            return;
                        } finally {
                        }
                    default:
                        o oVar4 = this.f16342b;
                        Callback.onClick_enter(view);
                        try {
                            ShopPurchaseHistory shopPurchaseHistory3 = oVar4.f16349n;
                            if (shopPurchaseHistory3 != null) {
                                C0674C c0674c3 = oVar4.f16343a;
                                c0674c3.getClass();
                                MayaShopPurchaseHistoryPageFragment mayaShopPurchaseHistoryPageFragment2 = c0674c3.c;
                                mayaShopPurchaseHistoryPageFragment2.getClass();
                                mayaShopPurchaseHistoryPageFragment2.P1(shopPurchaseHistory3);
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        final int i4 = 1;
        ((ImageView) h.m).setOnClickListener(new View.OnClickListener(this) { // from class: dc.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f16342b;

            {
                this.f16342b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        o oVar = this.f16342b;
                        Callback.onClick_enter(view);
                        try {
                            o oVar2 = (o) oVar.m.c;
                            ShopPurchaseHistory shopPurchaseHistory = oVar2.f16349n;
                            if (shopPurchaseHistory != null) {
                                oVar2.f16343a.e(shopPurchaseHistory);
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        o oVar3 = this.f16342b;
                        Callback.onClick_enter(view);
                        try {
                            ShopPurchaseHistory shopPurchaseHistory2 = oVar3.f16349n;
                            if (shopPurchaseHistory2 != null) {
                                C0674C c0674c2 = oVar3.f16343a;
                                c0674c2.getClass();
                                MayaShopPurchaseHistoryPageFragment mayaShopPurchaseHistoryPageFragment = c0674c2.c;
                                mayaShopPurchaseHistoryPageFragment.getClass();
                                mayaShopPurchaseHistoryPageFragment.P1(shopPurchaseHistory2);
                            }
                            return;
                        } finally {
                        }
                    default:
                        o oVar4 = this.f16342b;
                        Callback.onClick_enter(view);
                        try {
                            ShopPurchaseHistory shopPurchaseHistory3 = oVar4.f16349n;
                            if (shopPurchaseHistory3 != null) {
                                C0674C c0674c3 = oVar4.f16343a;
                                c0674c3.getClass();
                                MayaShopPurchaseHistoryPageFragment mayaShopPurchaseHistoryPageFragment2 = c0674c3.c;
                                mayaShopPurchaseHistoryPageFragment2.getClass();
                                mayaShopPurchaseHistoryPageFragment2.P1(shopPurchaseHistory3);
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        final int i6 = 2;
        ((ImageView) h.f3640p).setOnClickListener(new View.OnClickListener(this) { // from class: dc.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f16342b;

            {
                this.f16342b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i6) {
                    case 0:
                        o oVar = this.f16342b;
                        Callback.onClick_enter(view);
                        try {
                            o oVar2 = (o) oVar.m.c;
                            ShopPurchaseHistory shopPurchaseHistory = oVar2.f16349n;
                            if (shopPurchaseHistory != null) {
                                oVar2.f16343a.e(shopPurchaseHistory);
                            }
                            return;
                        } finally {
                        }
                    case 1:
                        o oVar3 = this.f16342b;
                        Callback.onClick_enter(view);
                        try {
                            ShopPurchaseHistory shopPurchaseHistory2 = oVar3.f16349n;
                            if (shopPurchaseHistory2 != null) {
                                C0674C c0674c2 = oVar3.f16343a;
                                c0674c2.getClass();
                                MayaShopPurchaseHistoryPageFragment mayaShopPurchaseHistoryPageFragment = c0674c2.c;
                                mayaShopPurchaseHistoryPageFragment.getClass();
                                mayaShopPurchaseHistoryPageFragment.P1(shopPurchaseHistory2);
                            }
                            return;
                        } finally {
                        }
                    default:
                        o oVar4 = this.f16342b;
                        Callback.onClick_enter(view);
                        try {
                            ShopPurchaseHistory shopPurchaseHistory3 = oVar4.f16349n;
                            if (shopPurchaseHistory3 != null) {
                                C0674C c0674c3 = oVar4.f16343a;
                                c0674c3.getClass();
                                MayaShopPurchaseHistoryPageFragment mayaShopPurchaseHistoryPageFragment2 = c0674c3.c;
                                mayaShopPurchaseHistoryPageFragment2.getClass();
                                mayaShopPurchaseHistoryPageFragment2.P1(shopPurchaseHistory3);
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
    }

    public final void D(HashMap map) {
        Iterator it = map.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            LinearLayout linearLayout = this.j;
            if (i >= linearLayout.getChildCount()) {
                return;
            }
            Map.Entry entry = (Map.Entry) it.next();
            View childAt = linearLayout.getChildAt(i);
            TextView textView = (TextView) childAt.findViewById(R.id.shop_dynamic_field_label_text_view);
            TextView textView2 = (TextView) childAt.findViewById(R.id.shop_dynamic_field_value_text_view);
            textView.setText((CharSequence) entry.getKey());
            textView2.setText((CharSequence) entry.getValue());
            childAt.setVisibility(0);
            if (i == 0) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                kotlin.jvm.internal.j.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
                childAt.requestLayout();
            }
            if (it.hasNext()) {
                childAt.findViewById(R.id.shop_history_dynamic_field_divider).setVisibility(0);
            }
            i++;
        }
    }
}

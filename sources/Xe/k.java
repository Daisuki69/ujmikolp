package xe;

import N5.M;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.domain.model.ShopPurchaseHistory;
import java.util.HashMap;
import java.util.Map;
import pg.C2038a;
import ue.x;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f20968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f20969b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f20970d;
    public final TextView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f20971g;
    public final TextView h;
    public final LinearLayout i;
    public final Group j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Group f20972k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Group f20973l;
    public final C2038a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ShopPurchaseHistory f20974n;

    /* JADX WARN: Illegal instructions before constructor call */
    public k(M m, com.paymaya.data.preference.a mPreference, x xVar) {
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        ConstraintLayout constraintLayout = (ConstraintLayout) m.c;
        super(constraintLayout);
        this.f20968a = xVar;
        this.f20969b = (ImageView) m.f3762l;
        this.c = (TextView) m.m;
        this.f20970d = (TextView) m.f3761k;
        this.e = (TextView) m.f3763n;
        this.f = (TextView) m.h;
        this.f20971g = (TextView) m.f3758b;
        this.h = (TextView) m.f3764o;
        this.i = (LinearLayout) m.f3759d;
        this.j = (Group) m.f3760g;
        this.f20972k = (Group) m.e;
        this.f20973l = (Group) m.f3765p;
        this.m = new C2038a(mPreference, this);
        final int i = 0;
        constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: xe.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f20967b;

            {
                this.f20967b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        k kVar = this.f20967b;
                        Callback.onClick_enter(view);
                        try {
                            k kVar2 = (k) kVar.m.c;
                            ShopPurchaseHistory shopPurchaseHistory = kVar2.f20974n;
                            if (shopPurchaseHistory != null) {
                                kVar2.f20968a.e(shopPurchaseHistory);
                            }
                            return;
                        } finally {
                        }
                    default:
                        k kVar3 = this.f20967b;
                        Callback.onClick_enter(view);
                        try {
                            k.D(kVar3);
                            return;
                        } finally {
                        }
                }
            }
        });
        final int i4 = 1;
        ((TextView) m.f).setOnClickListener(new View.OnClickListener(this) { // from class: xe.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f20967b;

            {
                this.f20967b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        k kVar = this.f20967b;
                        Callback.onClick_enter(view);
                        try {
                            k kVar2 = (k) kVar.m.c;
                            ShopPurchaseHistory shopPurchaseHistory = kVar2.f20974n;
                            if (shopPurchaseHistory != null) {
                                kVar2.f20968a.e(shopPurchaseHistory);
                            }
                            return;
                        } finally {
                        }
                    default:
                        k kVar3 = this.f20967b;
                        Callback.onClick_enter(view);
                        try {
                            k.D(kVar3);
                            return;
                        } finally {
                        }
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void D(xe.k r9) {
        /*
            com.paymaya.domain.model.ShopPurchaseHistory r0 = r9.f20974n
            if (r0 == 0) goto L73
            ue.x r9 = r9.f20968a
            r9.getClass()
            com.paymaya.ui.shopv3.view.fragment.impl.ShopV3PurchaseHistoryPageFragment r9 = r9.c
            r9.getClass()
            androidx.fragment.app.FragmentActivity r1 = r9.requireActivity()
            java.lang.String r2 = "clipboard"
            java.lang.Object r1 = r1.getSystemService(r2)
            java.lang.String r2 = "null cannot be cast to non-null type android.content.ClipboardManager"
            kotlin.jvm.internal.j.e(r1, r2)
            android.content.ClipboardManager r1 = (android.content.ClipboardManager) r1
            java.lang.String r0 = r0.mCode()
            if (r0 == 0) goto L5e
            int r2 = r0.length()
            r3 = 1
            int r2 = r2 - r3
            r4 = 0
            r5 = r4
            r6 = r5
        L2e:
            if (r5 > r2) goto L53
            if (r6 != 0) goto L34
            r7 = r5
            goto L35
        L34:
            r7 = r2
        L35:
            char r7 = r0.charAt(r7)
            r8 = 32
            int r7 = kotlin.jvm.internal.j.i(r7, r8)
            if (r7 > 0) goto L43
            r7 = r3
            goto L44
        L43:
            r7 = r4
        L44:
            if (r6 != 0) goto L4d
            if (r7 != 0) goto L4a
            r6 = r3
            goto L2e
        L4a:
            int r5 = r5 + 1
            goto L2e
        L4d:
            if (r7 != 0) goto L50
            goto L53
        L50:
            int r2 = r2 + (-1)
            goto L2e
        L53:
            int r2 = r2 + r3
            java.lang.CharSequence r0 = r0.subSequence(r5, r2)
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L60
        L5e:
            java.lang.String r0 = ""
        L60:
            java.lang.String r2 = "Coupon Code"
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r2, r0)
            r1.setPrimaryClip(r0)
            androidx.fragment.app.FragmentActivity r9 = r9.getActivity()
            r0 = 2131955418(0x7f130eda, float:1.9547363E38)
            com.paymaya.common.utility.j0.a(r9, r0)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xe.k.D(xe.k):void");
    }

    public final void E(HashMap map) {
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            LinearLayout linearLayout = this.i;
            if (i >= linearLayout.getChildCount()) {
                return;
            }
            View childAt = linearLayout.getChildAt(i);
            TextView textView = (TextView) childAt.findViewById(R.id.label_text_view_pma_view_shop_v3_purchase_history_list_dynamic_field);
            TextView textView2 = (TextView) childAt.findViewById(R.id.value_text_view_pma_view_shop_v3_purchase_history_list_dynamic_field);
            textView.setText(this.itemView.getContext().getString(R.string.pma_label_format_dynamic_field_label_colon, entry.getKey()));
            textView2.setText((CharSequence) entry.getValue());
            childAt.setVisibility(0);
            i++;
        }
    }
}

package ic;

import N5.k1;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import lc.C1824a;
import mc.e;

/* JADX INFO: renamed from: ic.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1599c extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaBaseLoadingFragment f17131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f17132b = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public C1599c(InterfaceC1598b interfaceC1598b) {
        this.f17131a = (MayaBaseLoadingFragment) interfaceC1598b;
    }

    public final void e(ArrayList arrayList) {
        ArrayList arrayList2 = this.f17132b;
        j.g(arrayList2, numX49.tnTj78("bSmr"));
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new mc.b(arrayList2, arrayList));
        j.f(diffResultCalculateDiff, numX49.tnTj78("bSmZ"));
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        diffResultCalculateDiff.dispatchUpdatesTo(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f17132b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((e) this.f17132b.get(i)).f18401a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r5, int r6) {
        /*
            r4 = this;
            java.lang.String r0 = "bSmk"
            java.lang.String r0 = dOYHB6.tiZVw8.numX49.tnTj78(r0)
            kotlin.jvm.internal.j.g(r5, r0)
            java.util.ArrayList r0 = r4.f17132b
            java.lang.Object r6 = r0.get(r6)
            mc.e r6 = (mc.e) r6
            lc.a r5 = (lc.C1824a) r5
            java.lang.String r0 = "bSmB"
            java.lang.String r0 = dOYHB6.tiZVw8.numX49.tnTj78(r0)
            kotlin.jvm.internal.j.g(r6, r0)
            com.paymaya.domain.store.M r0 = r5.e
            r0.getClass()
            boolean r1 = r6 instanceof mc.c
            java.lang.Object r0 = r0.f11371b
            lc.a r0 = (lc.C1824a) r0
            android.widget.ImageView r2 = r0.c
            android.widget.TextView r0 = r0.f18288d
            if (r1 == 0) goto L86
            r1 = r6
            mc.c r1 = (mc.c) r1
            com.paymaya.domain.model.Operator r1 = r1.f18399b
            java.lang.String r3 = "bSmu"
            java.lang.String r3 = dOYHB6.tiZVw8.numX49.tnTj78(r3)
            kotlin.jvm.internal.j.g(r1, r3)
            java.lang.String r3 = r1.mName()
            r0.setText(r3)
            java.lang.String r0 = r1.mType()
            if (r0 == 0) goto L7f
            int r1 = r0.hashCode()
            r3 = 66144(0x10260, float:9.2687E-41)
            if (r1 == r3) goto L6b
            r3 = 66783482(0x3fb08fa, float:1.4754515E-36)
            if (r1 == r3) goto L57
            goto L7f
        L57:
            java.lang.String r1 = "bSmV"
            java.lang.String r1 = dOYHB6.tiZVw8.numX49.tnTj78(r1)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L64
            goto L7f
        L64:
            r0 = 2131231558(0x7f080346, float:1.80792E38)
            r2.setImageResource(r0)
            goto La5
        L6b:
            java.lang.String r1 = "bSmS"
            java.lang.String r1 = dOYHB6.tiZVw8.numX49.tnTj78(r1)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L78
            goto L7f
        L78:
            r0 = 2131231576(0x7f080358, float:1.8079237E38)
            r2.setImageResource(r0)
            goto La5
        L7f:
            r0 = 2131231575(0x7f080357, float:1.8079235E38)
            r2.setImageResource(r0)
            goto La5
        L86:
            boolean r1 = r6 instanceof mc.d
            if (r1 == 0) goto La5
            r1 = r6
            mc.d r1 = (mc.d) r1
            com.paymaya.domain.model.Route r1 = r1.f18400b
            java.lang.String r3 = "bSmj"
            java.lang.String r3 = dOYHB6.tiZVw8.numX49.tnTj78(r3)
            kotlin.jvm.internal.j.g(r1, r3)
            java.lang.String r1 = r1.mName()
            r0.setText(r1)
            r0 = 2131231475(0x7f0802f3, float:1.8079032E38)
            r2.setImageResource(r0)
        La5:
            com.paymaya.common.utility.H r0 = new com.paymaya.common.utility.H
            r1 = 2
            r0.<init>(r1, r5, r6)
            androidx.constraintlayout.widget.ConstraintLayout r5 = r5.f18287b
            r5.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ic.C1599c.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    /* JADX WARN: Type inference failed for: r9v11, types: [com.paymaya.common.base.MayaBaseLoadingFragment, ic.b] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        j.g(viewGroup, numX49.tnTj78("bSmd"));
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.maya_view_holder_travel_operator_route_selection, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i4 = R.id.image_view_travel_operator_route_arrow;
        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_travel_operator_route_arrow)) != null) {
            i4 = R.id.image_view_travel_operator_route_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_travel_operator_route_icon);
            if (imageView != null) {
                i4 = R.id.text_view_travel_operator_route_name;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_travel_operator_route_name);
                if (textView != null) {
                    i4 = R.id.view_divider_selection_item;
                    View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_divider_selection_item);
                    if (viewFindChildViewById != null) {
                        return new C1824a(new k1((ViewGroup) constraintLayout, (Object) constraintLayout, imageView, textView, viewFindChildViewById, 5), this.f17131a);
                    }
                }
            }
        }
        throw new NullPointerException(numX49.tnTj78("bSmi").concat(viewInflate.getResources().getResourceName(i4)));
    }
}

package ea;

import N5.C0450f;
import N5.w1;
import We.s;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import cj.C1112C;
import com.paymaya.R;
import com.paymaya.common.exception.PayMayaRuntimeException;
import com.paymaya.domain.model.Biller;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaBillersFragment;
import dOYHB6.tiZVw8.numX49;
import ja.C1674c;
import ja.C1675d;
import ja.C1676e;
import w5.C2383a;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends ListAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaBillersFragment f16620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16621b;
    public Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16622d;

    public l(MayaBillersFragment mayaBillersFragment, boolean z4) {
        super(new C2383a());
        this.f16620a = mayaBillersFragment;
        this.f16621b = z4;
        this.c = C1112C.f9377a;
    }

    public final void e(boolean z4) {
        if (z4 && !this.f16622d) {
            this.f16622d = true;
            notifyItemInserted(getItemCount());
        } else {
            if (z4 || !this.f16622d) {
                return;
            }
            this.f16622d = false;
            notifyItemRemoved(getItemCount() + 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.ListAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size() + (this.f16622d ? 1 : 0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        if (this.f16622d && i == getItemCount() - 1) {
            return -1;
        }
        return ((d) this.c.get(i)).f16611a;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        kotlin.jvm.internal.j.g(viewHolder, numX49.tnTj78("bdWD"));
        if (viewHolder instanceof C1675d) {
            d dVar = (d) this.c.get(i);
            if (dVar instanceof b) {
                ((C1675d) viewHolder).f17726a.setText(((b) dVar).f16609b);
                return;
            }
            return;
        }
        if (!(viewHolder instanceof C1676e)) {
            if (viewHolder instanceof C1674c) {
                return;
            }
            boolean z4 = viewHolder instanceof Z6.e;
            return;
        }
        d dVar2 = (d) this.c.get(i);
        if (dVar2 instanceof c) {
            C1676e c1676e = (C1676e) viewHolder;
            Biller biller = ((c) dVar2).f16610b;
            kotlin.jvm.internal.j.g(biller, numX49.tnTj78("bdWh"));
            c1676e.f = biller;
            c1676e.e.f(biller);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.j.g(viewGroup, numX49.tnTj78("bdWM"));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == -1) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.maya_view_loading, viewGroup, false);
            kotlin.jvm.internal.j.f(viewInflate, numX49.tnTj78("bdWX"));
            return new Z6.e(viewInflate);
        }
        String strTnTj78 = numX49.tnTj78("bdWN");
        if (i == 0) {
            View viewInflate2 = layoutInflaterFrom.inflate(R.layout.maya_view_pay_bills_billers_header, viewGroup, false);
            FrameLayout frameLayout = (FrameLayout) viewInflate2;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate2, R.id.biller_header_title_text_view);
            if (textView != null) {
                return new C1675d(new C0450f((ViewGroup) frameLayout, (Object) frameLayout, (Object) textView, 21));
            }
            throw new NullPointerException(strTnTj78.concat(viewInflate2.getResources().getResourceName(R.id.biller_header_title_text_view)));
        }
        if (i != 1) {
            if (i != 2) {
                throw new PayMayaRuntimeException(s.f(i, numX49.tnTj78("bdWa")));
            }
            View viewInflate3 = layoutInflaterFrom.inflate(R.layout.maya_view_pay_bills_billers_footer, viewGroup, false);
            if (viewInflate3 != null) {
                return new C1674c((FrameLayout) viewInflate3);
            }
            throw new NullPointerException(numX49.tnTj78("bdW6"));
        }
        View viewInflate4 = layoutInflaterFrom.inflate(R.layout.maya_view_pay_bills_billers_list, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate4;
        int i4 = R.id.billers_list_item_image_view;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(viewInflate4, R.id.billers_list_item_image_view);
        if (appCompatImageView != null) {
            i4 = R.id.billers_list_item_name_text_view;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate4, R.id.billers_list_item_name_text_view);
            if (textView2 != null) {
                i4 = R.id.billers_list_item_subtext_text_view;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate4, R.id.billers_list_item_subtext_text_view);
                if (textView3 != null) {
                    return new C1676e(new w1(constraintLayout, constraintLayout, appCompatImageView, textView2, textView3, 0), this, this.f16621b);
                }
            }
        }
        throw new NullPointerException(strTnTj78.concat(viewInflate4.getResources().getResourceName(i4)));
    }
}

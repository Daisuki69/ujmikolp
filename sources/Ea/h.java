package ea;

import N5.C0441c;
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
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsSearchFragment;
import dOYHB6.tiZVw8.numX49;
import ja.C1677f;
import java.util.ArrayList;
import java.util.List;
import w5.C2383a;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends ListAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaPayBillsSearchFragment f16612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16613b;
    public RecyclerView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f16614d;
    public Object e;

    public h(MayaPayBillsSearchFragment mayaPayBillsSearchFragment, boolean z4) {
        super(new C2383a());
        this.f16612a = mayaPayBillsSearchFragment;
        this.f16613b = z4;
        C1112C c1112c = C1112C.f9377a;
        this.f16614d = c1112c;
        this.e = c1112c;
    }

    public final void e(List list) {
        List list2;
        kotlin.jvm.internal.j.g(list, numX49.tnTj78("bdWS"));
        if (list.isEmpty()) {
            list2 = C1112C.f9377a;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new b(numX49.tnTj78("bdWj")));
            arrayList.addAll(list);
            arrayList.add(C1434a.f16608b);
            list2 = arrayList;
        }
        this.e = list;
        f(list2);
    }

    public final void f(List list) {
        this.f16614d = list;
        submitList(list);
        RecyclerView recyclerView = this.c;
        if (recyclerView != null) {
            recyclerView.post(new androidx.window.layout.adapter.extensions.a(this, 10));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.ListAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f16614d.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((d) this.f16614d.get(i)).f16611a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        kotlin.jvm.internal.j.g(recyclerView, numX49.tnTj78("bdWd"));
        super.onAttachedToRecyclerView(recyclerView);
        this.c = recyclerView;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        kotlin.jvm.internal.j.g(viewHolder, numX49.tnTj78("bdWi"));
        if (viewHolder instanceof C1677f) {
            Object obj = this.f16614d.get(i);
            kotlin.jvm.internal.j.e(obj, numX49.tnTj78("bdWE"));
            C1677f c1677f = (C1677f) viewHolder;
            Biller biller = ((c) obj).f16610b;
            kotlin.jvm.internal.j.g(biller, numX49.tnTj78("bdWF"));
            c1677f.f = biller;
            c1677f.e.f(biller);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        kotlin.jvm.internal.j.g(viewGroup, numX49.tnTj78("bdWH"));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == -1) {
            return new g((ConstraintLayout) C0441c.e(layoutInflaterFrom, viewGroup).f4066b);
        }
        String strTnTj78 = numX49.tnTj78("bdWO");
        if (i == 0) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.maya_view_pay_bills_billers_header_item, viewGroup, false);
            if (viewInflate != null) {
                return new e((FrameLayout) viewInflate);
            }
            throw new NullPointerException(strTnTj78);
        }
        if (i != 1) {
            if (i != 2) {
                throw new PayMayaRuntimeException(s.f(i, numX49.tnTj78("bdWQ")));
            }
            View viewInflate2 = layoutInflaterFrom.inflate(R.layout.maya_view_pay_bills_billers_footer_item, viewGroup, false);
            if (viewInflate2 != null) {
                return new f((FrameLayout) viewInflate2);
            }
            throw new NullPointerException(strTnTj78);
        }
        View viewInflate3 = layoutInflaterFrom.inflate(R.layout.maya_view_pay_bills_search_list, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate3;
        int i4 = R.id.billers_list_item_image_view;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(viewInflate3, R.id.billers_list_item_image_view);
        if (appCompatImageView != null) {
            i4 = R.id.billers_list_item_name_text_view;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate3, R.id.billers_list_item_name_text_view);
            if (textView != null) {
                i4 = R.id.billers_list_item_subtext_text_view;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate3, R.id.billers_list_item_subtext_text_view);
                if (textView2 != null) {
                    return new C1677f(new w1(constraintLayout, constraintLayout, appCompatImageView, textView, textView2, 1), this, this.f16613b);
                }
            }
        }
        throw new NullPointerException(numX49.tnTj78("bdWt").concat(viewInflate3.getResources().getResourceName(i4)));
    }
}

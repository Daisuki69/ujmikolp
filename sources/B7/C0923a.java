package b7;

import N5.C0441c;
import We.s;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import c7.AbstractC1082f;
import c7.C1078b;
import c7.C1079c;
import c7.C1081e;
import com.dynatrace.android.agent.Global;
import com.paymaya.R;
import com.paymaya.mayaui.common.view.widget.inforeviewlist.item.MayaBasicReviewInfoItem;
import com.paymaya.mayaui.common.view.widget.inforeviewlist.item.MayaEditTextReviewInfoItem;
import com.paymaya.mayaui.common.view.widget.inforeviewlist.item.MayaLabelValueReviewInfoItem;
import defpackage.AbstractC1414e;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;

/* JADX INFO: renamed from: b7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0923a extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f8542a = new ArrayList();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f8542a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        ArrayList arrayList = this.f8542a;
        AbstractC1082f abstractC1082f = (AbstractC1082f) arrayList.get(i);
        if (abstractC1082f instanceof C1078b) {
            return 1;
        }
        if (abstractC1082f instanceof C1081e) {
            return 2;
        }
        if (abstractC1082f instanceof C1079c) {
            return 3;
        }
        throw new IllegalArgumentException("Not supported ui model: " + arrayList.get(i) + Global.BLANK);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        e holder = (e) viewHolder;
        kotlin.jvm.internal.j.g(holder, "holder");
        boolean z4 = holder instanceof C0924b;
        ArrayList arrayList = this.f8542a;
        if (!z4) {
            if (!(holder instanceof d)) {
                if (!(holder instanceof c)) {
                    throw new NoWhenBranchMatchedException();
                }
                kotlin.jvm.internal.j.e(arrayList.get(i), "null cannot be cast to non-null type com.paymaya.mayaui.common.view.widget.inforeviewlist.model.ReviewInfoUiModel.EditTextReviewInfoUiModel");
                throw new ClassCastException();
            }
            Object obj = arrayList.get(i);
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type com.paymaya.mayaui.common.view.widget.inforeviewlist.model.ReviewInfoUiModel.LabelValueReviewInfoUiModel");
            C1081e c1081e = (C1081e) obj;
            MayaLabelValueReviewInfoItem mayaLabelValueReviewInfoItem = (MayaLabelValueReviewInfoItem) ((d) holder).f8544a.c;
            mayaLabelValueReviewInfoItem.setTitle(c1081e.f9306a);
            mayaLabelValueReviewInfoItem.setValue(c1081e.f9307b);
            ((ConstraintLayout) mayaLabelValueReviewInfoItem.f12098a.c).setBackground(ContextCompat.getDrawable(mayaLabelValueReviewInfoItem.getContext(), R.drawable.maya_bg_content_information));
            Context context = mayaLabelValueReviewInfoItem.getContext();
            kotlin.jvm.internal.j.f(context, "getContext(...)");
            mayaLabelValueReviewInfoItem.setTitleColor(jk.b.n(context, R.attr.mayaColorContentLinksAccent));
            Unit unit = Unit.f18162a;
            return;
        }
        Object obj2 = arrayList.get(i);
        kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type com.paymaya.mayaui.common.view.widget.inforeviewlist.model.ReviewInfoUiModel.BasicReviewInfoUiModel");
        C1078b c1078b = (C1078b) obj2;
        MayaBasicReviewInfoItem mayaBasicReviewInfoItem = (MayaBasicReviewInfoItem) ((C0924b) holder).f8543a.c;
        mayaBasicReviewInfoItem.setHeader(c1078b.f9296a);
        mayaBasicReviewInfoItem.setValue(c1078b.f9297b);
        if (c1078b.c.equals(Boolean.TRUE)) {
            Context context2 = mayaBasicReviewInfoItem.getContext();
            kotlin.jvm.internal.j.f(context2, "getContext(...)");
            mayaBasicReviewInfoItem.setValueColor(jk.b.n(context2, R.attr.mayaColorContentTertiary));
        } else {
            Context context3 = mayaBasicReviewInfoItem.getContext();
            kotlin.jvm.internal.j.f(context3, "getContext(...)");
            mayaBasicReviewInfoItem.setValueColor(jk.b.n(context3, R.attr.mayaColorContentPrimary));
        }
        Drawable drawable = c1078b.f;
        if (drawable != null) {
            mayaBasicReviewInfoItem.setActionImageView(drawable);
        }
        TextView textView = (TextView) mayaBasicReviewInfoItem.f12094a.f4132d;
        textView.setText((CharSequence) null);
        textView.setVisibility(8);
        textView.setEnabled(true);
        mayaBasicReviewInfoItem.setDescription(null);
        mayaBasicReviewInfoItem.setDescriptionSecondary(null);
        ((ConstraintLayout) mayaBasicReviewInfoItem.f12094a.f).setBackground(ContextCompat.getDrawable(mayaBasicReviewInfoItem.getContext(), R.drawable.maya_bg_content_information));
        Context context4 = mayaBasicReviewInfoItem.getContext();
        kotlin.jvm.internal.j.f(context4, "getContext(...)");
        mayaBasicReviewInfoItem.setTitleColor(jk.b.n(context4, R.attr.mayaColorContentLinksAccent));
        mayaBasicReviewInfoItem.setOnClickListener(c1078b.f9299g);
        Unit unit2 = Unit.f18162a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        kotlin.jvm.internal.j.g(parent, "parent");
        if (i == 1) {
            return new C0924b(C0441c.c(LayoutInflater.from(parent.getContext()), parent));
        }
        if (i == 2) {
            return new d(C0441c.d(LayoutInflater.from(parent.getContext()), parent));
        }
        if (i != 4) {
            throw new IllegalArgumentException(s.f(i, "Invalid view type "));
        }
        View viewE = AbstractC1414e.e(parent, R.layout.maya_edit_text_review_info_item, parent, false);
        if (viewE != null) {
            return new c((MayaEditTextReviewInfoItem) viewE);
        }
        throw new NullPointerException("rootView");
    }
}

package b7;

import N5.C0435a;
import N5.C0441c;
import N5.C0447e;
import N5.C0462k;
import We.s;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c7.AbstractC1082f;
import c7.C1077a;
import c7.C1078b;
import c7.C1079c;
import c7.C1080d;
import c7.C1081e;
import com.dynatrace.android.agent.Global;
import com.paymaya.R;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.mayaui.common.view.widget.inforeviewlist.item.MayaBasicReviewInfoHorizontalItem;
import com.paymaya.mayaui.common.view.widget.inforeviewlist.item.MayaBasicReviewInfoItem;
import com.paymaya.mayaui.common.view.widget.inforeviewlist.item.MayaLabelTwoValuesReviewInfoItem;
import com.paymaya.mayaui.common.view.widget.inforeviewlist.item.MayaLabelValueLinkReviewInfoItem;
import com.paymaya.mayaui.common.view.widget.inforeviewlist.item.MayaLabelValueReviewInfoItem;
import defpackage.AbstractC1414e;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f8545a = new ArrayList();

    public final void e(List data) {
        kotlin.jvm.internal.j.g(data, "data");
        ArrayList arrayList = this.f8545a;
        arrayList.clear();
        arrayList.addAll(data);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f8545a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        ArrayList arrayList = this.f8545a;
        AbstractC1082f abstractC1082f = (AbstractC1082f) arrayList.get(i);
        if (abstractC1082f instanceof C1078b) {
            return 1;
        }
        if (abstractC1082f instanceof C1077a) {
            return 5;
        }
        if (abstractC1082f instanceof C1081e) {
            return 2;
        }
        if (abstractC1082f instanceof C1079c) {
            return 3;
        }
        if (abstractC1082f instanceof C1080d) {
            return 4;
        }
        throw new IllegalArgumentException("Not supported ui model: " + arrayList.get(i) + Global.BLANK);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        o holder = (o) viewHolder;
        kotlin.jvm.internal.j.g(holder, "holder");
        boolean z4 = holder instanceof j;
        ArrayList arrayList = this.f8545a;
        if (z4) {
            Object obj = arrayList.get(i);
            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type com.paymaya.mayaui.common.view.widget.inforeviewlist.model.ReviewInfoUiModel.BasicReviewInfoUiModel");
            C1078b c1078b = (C1078b) obj;
            MayaBasicReviewInfoItem mayaBasicReviewInfoItem = (MayaBasicReviewInfoItem) ((j) holder).f8550a.c;
            mayaBasicReviewInfoItem.setHeader(c1078b.f9296a);
            mayaBasicReviewInfoItem.setValue(c1078b.f9297b);
            TextView textView = (TextView) mayaBasicReviewInfoItem.f12094a.f4132d;
            textView.setText((CharSequence) null);
            textView.setVisibility(8);
            textView.setEnabled(true);
            mayaBasicReviewInfoItem.setDescription(null);
            mayaBasicReviewInfoItem.setDescriptionSecondary(null);
            C0462k c0462k = mayaBasicReviewInfoItem.f12094a;
            HtmlTextView htmlTextView = (HtmlTextView) c0462k.h;
            String str = c1078b.f9298d;
            htmlTextView.setTextHTML(str);
            htmlTextView.setVisibility(str == null ? 8 : 0);
            htmlTextView.setOnLinkClickListener(c1078b.e);
            Unit unit = Unit.f18162a;
            TextView textView2 = (TextView) c0462k.c;
            textView2.setText((CharSequence) null);
            textView2.setVisibility(8);
            return;
        }
        if (holder instanceof i) {
            Object obj2 = arrayList.get(i);
            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type com.paymaya.mayaui.common.view.widget.inforeviewlist.model.ReviewInfoUiModel.BasicReviewInfoTableLayoutUiModel");
            C1077a c1077a = (C1077a) obj2;
            MayaBasicReviewInfoHorizontalItem mayaBasicReviewInfoHorizontalItem = (MayaBasicReviewInfoHorizontalItem) ((i) holder).f8549a.c;
            mayaBasicReviewInfoHorizontalItem.setHeader(c1077a.f9292a);
            mayaBasicReviewInfoHorizontalItem.setValue(c1077a.f9293b);
            C0435a c0435a = mayaBasicReviewInfoHorizontalItem.f12093a;
            TextView textView3 = (TextView) c0435a.f4048d;
            String str2 = c1077a.e;
            textView3.setText(str2);
            textView3.setVisibility(str2 != null ? 0 : 8);
            textView3.setEnabled(c1077a.f);
            mayaBasicReviewInfoHorizontalItem.setDescription(c1077a.f9295g);
            TextView textView4 = (TextView) c0435a.c;
            String str3 = c1077a.c;
            textView4.setText(str3);
            textView4.setVisibility(str3 == null ? 8 : 0);
            View.OnClickListener onClickListener = c1077a.f9294d;
            if (onClickListener != null) {
                textView4.setOnClickListener(onClickListener);
                Unit unit2 = Unit.f18162a;
                return;
            }
            return;
        }
        if (holder instanceof n) {
            Object obj3 = arrayList.get(i);
            kotlin.jvm.internal.j.e(obj3, "null cannot be cast to non-null type com.paymaya.mayaui.common.view.widget.inforeviewlist.model.ReviewInfoUiModel.LabelValueReviewInfoUiModel");
            C1081e c1081e = (C1081e) obj3;
            MayaLabelValueReviewInfoItem mayaLabelValueReviewInfoItem = (MayaLabelValueReviewInfoItem) ((n) holder).f8555a.c;
            mayaLabelValueReviewInfoItem.setTitle(c1081e.f9306a);
            mayaLabelValueReviewInfoItem.setValue(c1081e.f9307b);
            mayaLabelValueReviewInfoItem.setTextAlignment(false);
            return;
        }
        if (holder instanceof k) {
            Object obj4 = arrayList.get(i);
            kotlin.jvm.internal.j.e(obj4, "null cannot be cast to non-null type com.paymaya.mayaui.common.view.widget.inforeviewlist.model.ReviewInfoUiModel.LabelTwoValuesReviewInfoUiModel");
            C1079c c1079c = (C1079c) obj4;
            MayaLabelTwoValuesReviewInfoItem mayaLabelTwoValuesReviewInfoItem = (MayaLabelTwoValuesReviewInfoItem) ((k) holder).f8551a.c;
            mayaLabelTwoValuesReviewInfoItem.setTitle(c1079c.f9300a);
            mayaLabelTwoValuesReviewInfoItem.setValue(c1079c.f9301b);
            mayaLabelTwoValuesReviewInfoItem.setSecondValue(c1079c.c);
            mayaLabelTwoValuesReviewInfoItem.setTextAlignment(false);
            return;
        }
        if (!(holder instanceof m)) {
            throw new NoWhenBranchMatchedException();
        }
        Object obj5 = arrayList.get(i);
        kotlin.jvm.internal.j.e(obj5, "null cannot be cast to non-null type com.paymaya.mayaui.common.view.widget.inforeviewlist.model.ReviewInfoUiModel.LabelValueLinkReviewInfoUiModel");
        C1080d c1080d = (C1080d) obj5;
        MayaLabelValueLinkReviewInfoItem mayaLabelValueLinkReviewInfoItem = (MayaLabelValueLinkReviewInfoItem) ((m) holder).f8554a.c;
        mayaLabelValueLinkReviewInfoItem.setTitle(c1080d.f9303a);
        mayaLabelValueLinkReviewInfoItem.setValue(c1080d.f9304b);
        l lVar = new l(c1080d, i);
        String str4 = c1080d.c;
        C0447e c0447e = mayaLabelValueLinkReviewInfoItem.f12097a;
        ((TextView) c0447e.f).setText(str4);
        ((TextView) c0447e.f).setOnClickListener(lVar);
        mayaLabelValueLinkReviewInfoItem.setTextAlignment(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        kotlin.jvm.internal.j.g(parent, "parent");
        if (i == 1) {
            return new j(C0441c.c(LayoutInflater.from(parent.getContext()), parent));
        }
        if (i == 2) {
            return new n(C0441c.d(LayoutInflater.from(parent.getContext()), parent));
        }
        if (i == 3) {
            View viewE = AbstractC1414e.e(parent, R.layout.maya_label_two_values_review_info_item, parent, false);
            if (viewE == null) {
                throw new NullPointerException("rootView");
            }
            MayaLabelTwoValuesReviewInfoItem mayaLabelTwoValuesReviewInfoItem = (MayaLabelTwoValuesReviewInfoItem) viewE;
            return new k(new C0441c(mayaLabelTwoValuesReviewInfoItem, mayaLabelTwoValuesReviewInfoItem, 6));
        }
        if (i == 4) {
            View viewE2 = AbstractC1414e.e(parent, R.layout.maya_label_value_link_review_info_item, parent, false);
            if (viewE2 == null) {
                throw new NullPointerException("rootView");
            }
            MayaLabelValueLinkReviewInfoItem mayaLabelValueLinkReviewInfoItem = (MayaLabelValueLinkReviewInfoItem) viewE2;
            return new m(new C0441c(mayaLabelValueLinkReviewInfoItem, mayaLabelValueLinkReviewInfoItem, 7));
        }
        if (i != 5) {
            throw new IllegalArgumentException(s.f(i, "Invalid view type "));
        }
        View viewE3 = AbstractC1414e.e(parent, R.layout.maya_basic_review_info_horizontal_item, parent, false);
        if (viewE3 == null) {
            throw new NullPointerException("rootView");
        }
        MayaBasicReviewInfoHorizontalItem mayaBasicReviewInfoHorizontalItem = (MayaBasicReviewInfoHorizontalItem) viewE3;
        return new i(new C0441c(mayaBasicReviewInfoHorizontalItem, mayaBasicReviewInfoHorizontalItem, 4));
    }
}

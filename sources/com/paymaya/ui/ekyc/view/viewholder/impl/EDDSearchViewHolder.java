package com.paymaya.ui.ekyc.view.viewholder.impl;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.paymaya.R;
import com.paymaya.ui.ekyc.view.activity.impl.EDDSearchActivity;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDSearchFragment;
import kotlin.Unit;
import oi.C1983a;
import vd.C2346a;
import zd.p;

/* JADX INFO: loaded from: classes4.dex */
public final class EDDSearchViewHolder extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2346a f14593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1983a f14594b;

    @BindView(R.id.pma_item_edd_search_item_text)
    public TextView mItemTextView;

    public EDDSearchViewHolder(View view, C2346a c2346a) {
        super(view);
        this.f14593a = c2346a;
        this.f14594b = new C1983a(this, 10);
        ButterKnife.bind(this, view);
    }

    public static final void D(EDDSearchViewHolder eDDSearchViewHolder, String str) {
        C2346a c2346a = eDDSearchViewHolder.f14593a;
        c2346a.getClass();
        EDDSearchFragment eDDSearchFragment = c2346a.f20487a;
        eDDSearchFragment.getClass();
        p pVar = eDDSearchFragment.f14548U;
        if (pVar != null) {
            EDDSearchActivity eDDSearchActivity = (EDDSearchActivity) pVar;
            Intent intent = new Intent();
            intent.putExtra(TtmlNode.ATTR_ID, eDDSearchActivity.f14499l);
            intent.putExtra("selected_text", str);
            Unit unit = Unit.f18162a;
            eDDSearchActivity.setResult(8, intent);
            eDDSearchActivity.finish();
        }
    }
}

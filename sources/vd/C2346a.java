package vd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.R;
import com.paymaya.ui.ekyc.view.fragment.impl.EDDSearchFragment;
import com.paymaya.ui.ekyc.view.viewholder.impl.EDDSearchViewHolder;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import oi.C1983a;

/* JADX INFO: renamed from: vd.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2346a extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EDDSearchFragment f20487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f20488b = new ArrayList();
    public final LayoutInflater c;

    public C2346a(Context context, EDDSearchFragment eDDSearchFragment) {
        this.f20487a = eDDSearchFragment;
        Object systemService = context.getSystemService("layout_inflater");
        j.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.c = (LayoutInflater) systemService;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f20488b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        EDDSearchViewHolder holder = (EDDSearchViewHolder) viewHolder;
        j.g(holder, "holder");
        String text = (String) this.f20488b.get(i);
        j.g(text, "text");
        C1983a c1983a = holder.f14594b;
        c1983a.getClass();
        EDDSearchViewHolder eDDSearchViewHolder = (EDDSearchViewHolder) c1983a.f18892b;
        TextView textView = eDDSearchViewHolder.mItemTextView;
        if (textView == null) {
            j.n("mItemTextView");
            throw null;
        }
        textView.setText(text);
        TextView textView2 = eDDSearchViewHolder.mItemTextView;
        if (textView2 != null) {
            textView2.setOnClickListener(new Ad.a(0, eDDSearchViewHolder, text));
        } else {
            j.n("mItemTextView");
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        j.g(parent, "parent");
        View viewInflate = this.c.inflate(R.layout.pma_item_edd_search_item, parent, false);
        j.f(viewInflate, "inflate(...)");
        return new EDDSearchViewHolder(viewInflate, this);
    }
}

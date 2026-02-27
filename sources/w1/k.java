package w1;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.R;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f20570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f20571b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f20572d;

    public k(t tVar, String[] strArr, int[] iArr) {
        this.f20572d = tVar;
        this.f20570a = strArr;
        this.f20571b = iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f20570a.length;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        o oVar = (o) viewHolder;
        String[] strArr = this.f20570a;
        if (i < strArr.length) {
            oVar.f20579a.setText(strArr[i]);
        }
        oVar.f20580b.setVisibility(i == this.c ? 0 : 4);
        oVar.itemView.setOnClickListener(new M6.e(this, i, 2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new o(LayoutInflater.from(this.f20572d.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, (ViewGroup) null));
    }
}

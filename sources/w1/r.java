package w1;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.R;
import java.util.ArrayList;
import java.util.List;
import v1.C2335b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f20585a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f20586b = new ArrayList();
    public final /* synthetic */ t c;

    public r(t tVar) {
        this.c = tVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e */
    public void onBindViewHolder(o oVar, int i) {
        C2335b c2335b = this.c.f20640x0;
    }

    public abstract void f(o oVar);

    public abstract void g(String str);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        if (this.f20586b.isEmpty()) {
            return 0;
        }
        return this.f20586b.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new o(LayoutInflater.from(this.c.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, (ViewGroup) null));
    }
}

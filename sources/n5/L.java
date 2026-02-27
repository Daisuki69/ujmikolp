package N5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;

/* JADX INFO: loaded from: classes4.dex */
public final class L implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SpringView f3723b;
    public final RecyclerView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SpringView f3724d;

    public /* synthetic */ L(SpringView springView, RecyclerView recyclerView, SpringView springView2, int i) {
        this.f3722a = i;
        this.f3723b = springView;
        this.c = recyclerView;
        this.f3724d = springView2;
    }

    public static L a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_transactions, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_transactions);
        if (recyclerView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.recycler_view_transactions)));
        }
        SpringView springView = (SpringView) viewInflate;
        return new L(springView, recyclerView, springView, 1);
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f3722a) {
        }
        return this.f3723b;
    }
}

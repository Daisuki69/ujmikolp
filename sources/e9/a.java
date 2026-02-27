package E9;

import N5.C0491z;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.domain.model.MissionV2;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsHomeFragment;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends RecyclerView.Adapter implements H9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentActivity f1328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MayaMissionsHomeFragment f1329b;
    public final LayoutInflater c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f1330d;

    public a(FragmentActivity fragmentActivity, MayaMissionsHomeFragment mayaMissionsHomeFragment) {
        this.f1328a = fragmentActivity;
        this.f1329b = mayaMissionsHomeFragment;
        Object systemService = fragmentActivity.getSystemService("layout_inflater");
        kotlin.jvm.internal.j.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.c = (LayoutInflater) systemService;
        this.f1330d = new ArrayList();
    }

    @Override // H9.b
    public final void d(MissionV2 missionV2) {
        this.f1329b.k(missionV2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f1330d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((MissionV2) this.f1330d.get(i)).getViewTypeMissionV2().getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        kotlin.jvm.internal.j.g(holder, "holder");
        ((H9.c) holder).D((MissionV2) this.f1330d.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        kotlin.jvm.internal.j.g(parent, "parent");
        return new H9.c(C0491z.b(this.c, parent), this.f1328a, this);
    }
}

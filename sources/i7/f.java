package I7;

import N5.C0441c;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaServicesV2Fragment;
import com.paymaya.mayaui.dashboard.view.widget.MayaServicesCoreItemsView;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaServicesV2Fragment f2233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J5.a f2234b;
    public final MayaServicesCoreItemsView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2235d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C0441c c0441c, MayaServicesV2Fragment listener, com.paymaya.data.preference.a preference) {
        super((MayaServicesCoreItemsView) c0441c.f4066b);
        kotlin.jvm.internal.j.g(listener, "listener");
        kotlin.jvm.internal.j.g(preference, "preference");
        this.f2233a = listener;
        this.f2234b = new J5.a(this, preference);
        this.c = (MayaServicesCoreItemsView) c0441c.c;
        this.f2235d = -1;
    }
}

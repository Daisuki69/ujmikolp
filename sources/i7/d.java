package I7;

import N5.C0441c;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.mayaui.common.view.widget.MayaCarousel;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaServicesV2Fragment;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f2227b;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MayaCarousel f2228d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C0441c c0441c, MayaServicesV2Fragment listener, com.paymaya.data.preference.a preference) {
        super((FrameLayout) c0441c.f4066b);
        kotlin.jvm.internal.j.g(listener, "listener");
        kotlin.jvm.internal.j.g(preference, "preference");
        this.f2228d = (MayaCarousel) c0441c.c;
    }
}

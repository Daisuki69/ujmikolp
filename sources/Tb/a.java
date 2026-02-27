package Tb;

import G6.w;
import N5.l1;
import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaDeviceManagementMainFragment;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaDeviceManagementMainFragment f5818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f5819b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f5820d;
    public final TextView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f5821g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l1 l1Var, MayaDeviceManagementMainFragment listener) {
        super(l1Var.f4147b);
        j.g(listener, "listener");
        this.f5818a = listener;
        this.f5819b = this.itemView.getContext();
        this.c = l1Var.c;
        this.f5820d = l1Var.f;
        this.e = l1Var.f4148d;
        this.f = l1Var.e;
        this.f5821g = new w(this, 15);
    }
}

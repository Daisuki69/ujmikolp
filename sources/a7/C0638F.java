package a7;

import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.mayaui.common.view.widget.MayaStaticToolTipView;

/* JADX INFO: renamed from: a7.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0638F extends RecyclerView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MayaStaticToolTipView f7009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7010b;
    public final /* synthetic */ AppCompatCheckBox c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7011d;

    public C0638F(MayaStaticToolTipView mayaStaticToolTipView, String str, AppCompatCheckBox appCompatCheckBox, int i) {
        this.f7009a = mayaStaticToolTipView;
        this.f7010b = str;
        this.c = appCompatCheckBox;
        this.f7011d = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView rv, int i, int i4) {
        kotlin.jvm.internal.j.g(rv, "rv");
        MayaStaticToolTipView mayaStaticToolTipView = this.f7009a;
        if (mayaStaticToolTipView.getVisibility() == 0) {
            mayaStaticToolTipView.b(this.c, this.f7011d, this.f7010b);
        }
    }
}

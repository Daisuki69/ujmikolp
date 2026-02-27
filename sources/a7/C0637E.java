package a7;

import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.paymaya.mayaui.common.view.widget.MayaStaticToolTipView;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: a7.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0637E implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f7007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaStaticToolTipView f7008b;

    public C0637E(View view, MayaStaticToolTipView mayaStaticToolTipView) {
        this.f7007a = view;
        this.f7008b = mayaStaticToolTipView;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.b.a(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        kotlin.jvm.internal.j.g(owner, "owner");
        LinkedHashMap linkedHashMap = AbstractC0639G.f7012a;
        AbstractC0639G.a(this.f7007a, this.f7008b);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.b.c(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.b.d(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.b.e(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.b.f(this, lifecycleOwner);
    }
}

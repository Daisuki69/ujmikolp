package w1;

import android.view.TextureView;
import android.view.View;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import n1.C1892E;

/* JADX INFO: renamed from: w1.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnLayoutChangeListenerC2362A implements n1.t, View.OnLayoutChangeListener, x1.f, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StyledPlayerView f20519a;

    public ViewOnLayoutChangeListenerC2362A(StyledPlayerView styledPlayerView) {
        this.f20519a = styledPlayerView;
        new C1892E();
    }

    @Override // n1.t
    public final /* synthetic */ void a(n1.u uVar) {
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i4, int i6, int i10, int i11, int i12, int i13, int i14) {
        StyledPlayerView.applyTextureViewRotation((TextureView) view, this.f20519a.textureViewRotation);
    }
}

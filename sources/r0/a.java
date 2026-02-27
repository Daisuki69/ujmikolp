package r0;

import Xh.i;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.res.ResourcesCompat;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.google.android.exoplayer2.upstream.DataSource$Factory;
import com.google.android.exoplayer2.upstream.DefaultDataSource;
import com.paymaya.R;
import d4.AbstractC1331a;
import java.util.HashMap;
import kotlin.jvm.internal.j;
import n1.C1897c;
import n1.C1900f;
import p3.s;
import q0.InterfaceC2158a;
import v1.C2335b;
import y1.C2497b;
import y1.C2498c;
import z1.AbstractC2550e;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements InterfaceC2158a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1900f f19825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public StyledPlayerView f19826b;
    public ViewGroup.LayoutParams c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FrameLayout.LayoutParams f19827d;

    @Override // q0.InterfaceC2158a
    public final View a() {
        StyledPlayerView styledPlayerView = this.f19826b;
        j.d(styledPlayerView);
        return styledPlayerView;
    }

    @Override // q0.InterfaceC2158a
    public final void b() {
        C1900f c1900f = this.f19825a;
        if (c1900f != null) {
            c1900f.getCurrentPosition();
        }
    }

    @Override // q0.InterfaceC2158a
    public final void c(Context context, String url) {
        j.g(url, "url");
        if (this.f19825a != null) {
            return;
        }
        B1.a aVar = new B1.a(context);
        new C2497b((Context) aVar.c, (HashMap) aVar.f337d, (s) aVar.e, aVar.f336b);
        C2335b c2335b = new C2335b(context, new s());
        j.f(AbstractC2550e.f(context, context.getPackageName()), "getUserAgent(...)");
        DataSource$Factory factory = new DefaultDataSource.Factory(context, new C2498c());
        j.f(new HlsMediaSource.Factory(factory).createMediaSource(MediaItem.a(url)), "createMediaSource(...)");
        C1897c c1897c = new C1897c(context);
        i.f(false);
        c1897c.f18562a = c2335b;
        c1897c.a();
        throw null;
    }

    @Override // q0.InterfaceC2158a
    public final void d(boolean z4) {
        if (!z4) {
            StyledPlayerView styledPlayerView = this.f19826b;
            j.d(styledPlayerView);
            styledPlayerView.setLayoutParams(this.c);
        } else {
            StyledPlayerView styledPlayerView2 = this.f19826b;
            j.d(styledPlayerView2);
            this.c = styledPlayerView2.getLayoutParams();
            StyledPlayerView styledPlayerView3 = this.f19826b;
            j.d(styledPlayerView3);
            styledPlayerView3.setLayoutParams(this.f19827d);
        }
    }

    @Override // q0.InterfaceC2158a
    public final void e(Context context, boolean z4) {
        if (this.f19826b != null) {
            return;
        }
        int iJ = (int) AbstractC1331a.j(context, 1, z4 ? 408.0f : 240.0f);
        int iJ2 = (int) AbstractC1331a.j(context, 1, z4 ? 299.0f : 134.0f);
        StyledPlayerView styledPlayerView = new StyledPlayerView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iJ, iJ2);
        this.c = layoutParams;
        styledPlayerView.setLayoutParams(layoutParams);
        styledPlayerView.setShowBuffering(1);
        styledPlayerView.setUseArtwork(true);
        styledPlayerView.setControllerAutoShow(false);
        styledPlayerView.setDefaultArtwork(ResourcesCompat.getDrawable(context.getResources(), R.drawable.ct_audio, null));
        this.f19826b = styledPlayerView;
    }

    @Override // q0.InterfaceC2158a
    public final void pause() {
        C1900f c1900f = this.f19825a;
        if (c1900f != null) {
            c1900f.stop();
            c1900f.release();
            this.f19825a = null;
        }
    }

    @Override // q0.InterfaceC2158a
    public final void play() {
        StyledPlayerView styledPlayerView = this.f19826b;
        if (styledPlayerView != null) {
            styledPlayerView.requestFocus();
            styledPlayerView.setVisibility(0);
            styledPlayerView.setPlayer(this.f19825a);
        }
        C1900f c1900f = this.f19825a;
        if (c1900f != null) {
            c1900f.setPlayWhenReady(true);
        }
    }
}

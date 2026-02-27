package s0;

import D.C0190x;
import Xh.i;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.google.android.exoplayer2.upstream.DefaultDataSource;
import java.util.HashMap;
import kotlin.jvm.internal.j;
import n1.C1897c;
import n1.C1900f;
import p3.s;
import q0.InterfaceC2159b;
import s1.InterfaceC2230e;
import v1.C2335b;
import y1.C2497b;
import y1.C2498c;
import z1.AbstractC2550e;

/* JADX INFO: renamed from: s0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2224a implements InterfaceC2159b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public StyledPlayerView f19983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1900f f19984b;

    @Override // q0.InterfaceC2159b
    public final View a() {
        StyledPlayerView styledPlayerView = this.f19983a;
        j.d(styledPlayerView);
        return styledPlayerView;
    }

    @Override // q0.InterfaceC2159b
    public final void b() {
        C1900f c1900f = this.f19984b;
        if (c1900f != null) {
            float fE = e();
            if (fE > 0.0f) {
                c1900f.setVolume(0.0f);
            } else if (fE == 0.0f) {
                c1900f.setVolume(1.0f);
            }
        }
    }

    @Override // q0.InterfaceC2159b
    public final void c(Context context, C0190x c0190x) {
        if (this.f19983a != null) {
            return;
        }
        StyledPlayerView styledPlayerView = new StyledPlayerView(context);
        styledPlayerView.setBackgroundColor(0);
        styledPlayerView.setResizeMode(context.getResources().getConfiguration().orientation == 2 ? 3 : 0);
        styledPlayerView.setUseArtwork(true);
        styledPlayerView.setDefaultArtwork((Drawable) c0190x.invoke());
        styledPlayerView.setUseController(true);
        styledPlayerView.setControllerAutoShow(false);
        styledPlayerView.setPlayer(this.f19984b);
        this.f19983a = styledPlayerView;
    }

    @Override // q0.InterfaceC2159b
    public final void d(Context context, C0190x c0190x, C0190x c0190x2) {
        if (this.f19984b != null) {
            return;
        }
        C2335b c2335b = new C2335b(context, new s());
        C1897c c1897c = new C1897c(context);
        i.f(false);
        c1897c.f18562a = c2335b;
        c1897c.a();
        throw null;
    }

    @Override // q0.InterfaceC2159b
    public final float e() {
        C1900f c1900f = this.f19984b;
        if (c1900f != null) {
            return c1900f.getVolume();
        }
        return 0.0f;
    }

    @Override // q0.InterfaceC2159b
    public final void f(Context context, String uriString, boolean z4, boolean z5) {
        j.g(uriString, "uriString");
        StyledPlayerView styledPlayerView = this.f19983a;
        if (styledPlayerView != null) {
            styledPlayerView.requestFocus();
            styledPlayerView.setShowBuffering(0);
        }
        C1900f c1900f = this.f19984b;
        if (c1900f != null) {
            B1.a aVar = new B1.a(context);
            new C2497b((Context) aVar.c, (HashMap) aVar.f337d, (s) aVar.e, aVar.f336b);
            j.f(AbstractC2550e.f(context, context.getPackageName()), "getUserAgent(...)");
            HlsMediaSource hlsMediaSourceCreateMediaSource = new HlsMediaSource.Factory(new DefaultDataSource.Factory(context, new C2498c())).createMediaSource(MediaItem.a(uriString));
            j.f(hlsMediaSourceCreateMediaSource, "createMediaSource(...)");
            c1900f.setMediaSource((InterfaceC2230e) hlsMediaSourceCreateMediaSource);
            c1900f.prepare();
            if (!z4) {
                if (z5) {
                    c1900f.setPlayWhenReady(true);
                    c1900f.setVolume(e());
                    return;
                }
                return;
            }
            StyledPlayerView styledPlayerView2 = this.f19983a;
            if (styledPlayerView2 != null) {
                styledPlayerView2.showController();
            }
            c1900f.setPlayWhenReady(false);
            c1900f.setVolume(1.0f);
        }
    }

    @Override // q0.InterfaceC2159b
    public final void pause() {
        C1900f c1900f = this.f19984b;
        if (c1900f != null) {
            c1900f.stop();
            c1900f.release();
        }
        this.f19984b = null;
        this.f19983a = null;
    }

    @Override // q0.InterfaceC2159b
    public final void setPlayWhenReady(boolean z4) {
        C1900f c1900f = this.f19984b;
        if (c1900f != null) {
            c1900f.setPlayWhenReady(z4);
        }
    }
}

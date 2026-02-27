package w1;

import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.PopupWindow;
import com.dynatrace.android.callback.Callback;
import n1.InterfaceC1896b;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements n1.t, C, View.OnClickListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f20569a;

    public i(t tVar) {
        this.f20569a = tVar;
    }

    @Override // n1.t
    public final void a(n1.u uVar) {
        boolean zA = uVar.a(5, 6);
        t tVar = this.f20569a;
        if (zA) {
            tVar.l();
        }
        if (uVar.a(5, 6, 8)) {
            tVar.n();
        }
        SparseBooleanArray sparseBooleanArray = uVar.f18581a;
        if (sparseBooleanArray.get(9)) {
            tVar.o();
        }
        if (sparseBooleanArray.get(10)) {
            tVar.q();
        }
        if (uVar.a(9, 10, 12, 0)) {
            tVar.k();
        }
        if (uVar.a(12, 0)) {
            tVar.r();
        }
        if (sparseBooleanArray.get(13)) {
            tVar.m();
        }
        if (sparseBooleanArray.get(2)) {
            tVar.s();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        t tVar = this.f20569a;
        Callback.onClick_enter(view);
        try {
            n1.y yVar = tVar.f20603W;
            if (yVar == null) {
                Callback.onClick_exit();
                return;
            }
            tVar.f20627p0.h();
            if (tVar.f20609d == view) {
                ((T2.g) tVar.f20605a0).a(yVar);
            } else if (tVar.c == view) {
                ((T2.g) tVar.f20605a0).b(yVar);
            } else if (tVar.f == view) {
                if (yVar.getPlaybackState() != 4) {
                    T2.g gVar = (T2.g) tVar.f20605a0;
                    if (gVar.f5758b > 0 && yVar.isCurrentWindowSeekable()) {
                        T2.g.c(yVar, gVar.f5758b);
                    }
                }
            } else if (tVar.f20613g == view) {
                T2.g gVar2 = (T2.g) tVar.f20605a0;
                if (gVar2.f5757a > 0 && yVar.isCurrentWindowSeekable()) {
                    T2.g.c(yVar, -gVar2.f5757a);
                }
            } else if (tVar.e == view) {
                int playbackState = yVar.getPlaybackState();
                if (playbackState == 1 || playbackState == 4 || !yVar.getPlayWhenReady()) {
                    tVar.c(yVar);
                } else {
                    ((T2.g) tVar.f20605a0).getClass();
                    yVar.setPlayWhenReady(false);
                }
            } else if (tVar.h == view) {
                InterfaceC1896b interfaceC1896b = tVar.f20605a0;
                int repeatMode = yVar.getRepeatMode();
                int i = tVar.f20615h0;
                for (int i4 = 1; i4 <= 2; i4++) {
                    int i6 = (repeatMode + i4) % 3;
                    if (i6 != 0) {
                        if (i6 != 1) {
                            if (i6 == 2 && (i & 2) != 0) {
                            }
                        } else if ((i & 1) == 0) {
                        }
                    }
                    repeatMode = i6;
                }
                ((T2.g) interfaceC1896b).getClass();
                yVar.setRepeatMode(repeatMode);
            } else if (tVar.i == view) {
                InterfaceC1896b interfaceC1896b2 = tVar.f20605a0;
                boolean z4 = !yVar.getShuffleModeEnabled();
                ((T2.g) interfaceC1896b2).getClass();
                yVar.setShuffleModeEnabled(z4);
            } else if (tVar.f20592E0 == view) {
                tVar.f20627p0.g();
                tVar.d(tVar.f20633s0);
            } else if (tVar.f20593F0 == view) {
                tVar.f20627p0.g();
                tVar.d(tVar.t0);
            } else if (tVar.f20594G0 == view) {
                tVar.f20627p0.g();
                tVar.d(tVar.f20642z0);
            } else if (tVar.f20589B0 == view) {
                tVar.f20627p0.g();
                tVar.d(tVar.y0);
            }
            Callback.onClick_exit();
        } catch (Throwable th2) {
            Callback.onClick_exit();
            throw th2;
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        t tVar = this.f20569a;
        if (tVar.f20637v0) {
            tVar.f20627p0.h();
        }
    }
}

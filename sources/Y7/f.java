package Y7;

import Lh.h;
import Lh.i;
import T3.l;
import androidx.core.app.NotificationCompat;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import cj.M;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.store.C1269l;
import com.paymaya.domain.store.C1286u;
import com.paymaya.domain.store.Q;
import com.paymaya.mayaui.favorite.view.fragment.impl.MayaFavoriteFragment;
import d8.ViewOnClickListenerC1340e;
import java.util.LinkedHashMap;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends AbstractC2509a implements X7.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Q f6781d;
    public final C1286u e;
    public final C1269l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.paymaya.data.preference.a f6782g;
    public boolean h;

    public f(Q q9, C1286u c1286u, C1269l c1269l, com.paymaya.data.preference.a aVar, Uh.d dVar) {
        super(dVar);
        this.f6781d = q9;
        this.e = c1286u;
        this.f = c1269l;
        this.f6782g = aVar;
    }

    @Override // y5.AbstractC2509a
    public final void i() {
        super.i();
        this.h = false;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        super.j();
        l();
    }

    public final void k() {
        h hVarH;
        boolean zIsMayaBillerReminderEnabled = this.f6782g.e().isMayaBillerReminderEnabled();
        Q q9 = this.f6781d;
        if (zIsMayaBillerReminderEnabled) {
            q9.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            I5.b.b(linkedHashMap, SessionDescription.ATTR_TYPE, null);
            I5.b.b(linkedHashMap, NotificationCompat.CATEGORY_REMINDER, String.valueOf(true));
            hVarH = q9.f11382b.getFavorites(M.m(linkedHashMap)).h(Th.e.c);
        } else {
            hVarH = q9.f11382b.getAllFavorites().h(Th.e.c);
        }
        new Lh.d(new h(new Lh.f(hVarH, new U8.c(6, new i(new Lh.f(q9.f11382b.getAllFavoriteLimits().h(Th.e.c), e.f6780a, 0), new Xa.c(this, 7), null), this.f.a(), this), 0), zh.b.a(), 0), new l(this, 15), 0).e();
    }

    public final void l() {
        if (this.h) {
            return;
        }
        this.h = true;
        ((MayaFavoriteFragment) ((c8.c) this.c.get())).O1();
        k();
    }

    public final void m(PayMayaError payMayaError) {
        if (!payMayaError.isSessionTimeout()) {
            if (payMayaError.isNetworkError()) {
                c8.c cVar = (c8.c) this.c.get();
                String strMSpiel = payMayaError.mSpiel();
                MayaFavoriteFragment mayaFavoriteFragment = (MayaFavoriteFragment) cVar;
                mayaFavoriteFragment.getClass();
                MayaBaseLoadingFragment.N1(mayaFavoriteFragment, 100, strMSpiel, null, new ViewOnClickListenerC1340e(mayaFavoriteFragment, 1), 28);
            } else {
                c8.c cVar2 = (c8.c) this.c.get();
                String strMSpiel2 = payMayaError.mSpiel();
                MayaFavoriteFragment mayaFavoriteFragment2 = (MayaFavoriteFragment) cVar2;
                mayaFavoriteFragment2.getClass();
                MayaBaseLoadingFragment.N1(mayaFavoriteFragment2, 200, strMSpiel2, null, new ViewOnClickListenerC1340e(mayaFavoriteFragment2, 2), 28);
            }
        }
        this.h = false;
    }
}

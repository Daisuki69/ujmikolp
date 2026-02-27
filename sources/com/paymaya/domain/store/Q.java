package com.paymaya.domain.store;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.paymaya.data.api.PayMayaCardApi;
import com.paymaya.domain.model.FavoriteDetails;

/* JADX INFO: loaded from: classes4.dex */
public final class Q extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PayMayaCardApi f11382b;

    public Q(PayMayaCardApi payMayaCardApi) {
        this.f11382b = payMayaCardApi;
    }

    public final Lh.h a(String str) {
        return this.f11382b.getFavoriteLimit(str).d(new Z.m(str, 8)).h(Th.e.c);
    }

    public final Lh.h b(String str) {
        return this.f11382b.getFavoriteDetails(str).h(Th.e.c);
    }

    public final Lh.h c(String str) {
        return this.f11382b.getFavorites(androidx.media3.datasource.cache.c.p(SessionDescription.ATTR_TYPE, str)).h(Th.e.c);
    }

    public final Hh.f d(FavoriteDetails favoriteDetails) {
        return this.f11382b.updateFavorite(favoriteDetails.mId(), favoriteDetails).f(Th.e.c);
    }
}

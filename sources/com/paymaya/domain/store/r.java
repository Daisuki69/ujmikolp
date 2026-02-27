package com.paymaya.domain.store;

import android.util.Pair;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.domain.model.Config;
import dOYHB6.yFtIp6.svM7M6;
import org.joda.time.LocalDateTime;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r implements Ch.f, Ch.c, Ch.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1282s f11476b;

    public /* synthetic */ r(C1282s c1282s, int i) {
        this.f11475a = i;
        this.f11476b = c1282s;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        Pair pair = (Pair) obj;
        C1282s c1282s = this.f11476b;
        c1282s.getClass();
        if (pair.first == null || ((String) pair.second).isEmpty()) {
            return;
        }
        Config config = (Config) pair.first;
        com.paymaya.data.preference.a aVar = c1282s.f11479b;
        aVar.S(config);
        androidx.media3.datasource.cache.c.u(aVar.f11330b, "key_app_settings_date", (String) pair.second);
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        switch (this.f11475a) {
            case 0:
                C1282s c1282s = this.f11476b;
                c1282s.getClass();
                String str = ((Response) obj).headers().get("Last-Modified");
                LocalDateTime localDateTimeE = AbstractC1234x.e(str);
                String string = svM7M6.getString(c1282s.f11479b.f11330b, "key_app_settings_date", null);
                LocalDateTime localDateTimeE2 = string != null ? AbstractC1234x.e(string) : null;
                if (localDateTimeE2 != null && localDateTimeE != null && (localDateTimeE.isEqual(localDateTimeE2) || !localDateTimeE.isAfter(localDateTimeE2))) {
                    return Ah.p.c(new Pair(null, ""));
                }
                Ah.p<Config> appSettings = c1282s.c.getAppSettings();
                Z.m mVar = new Z.m(str, 7);
                appSettings.getClass();
                return new Lh.f(appSettings, mVar, 0);
            default:
                return this.f11476b.f11479b.e();
        }
    }

    @Override // Ch.a
    public void run() {
        this.f11476b.f11479b.getClass();
    }
}

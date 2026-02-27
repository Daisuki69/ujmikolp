package io.flutter.embedding.engine.systemchannels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.flutter.embedding.engine.dart.DartExecutor;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import org.json.JSONException;
import org.json.JSONObject;
import pg.p;
import pg.r;
import pg.s;
import pg.t;
import pg.u;

/* JADX INFO: loaded from: classes4.dex */
public class LocalizationChannel {
    private static final String TAG = "LocalizationChannel";

    @NonNull
    public final u channel;

    @NonNull
    @VisibleForTesting
    public final s handler;

    @Nullable
    private LocalizationMessageHandler localizationMessageHandler;

    public interface LocalizationMessageHandler {
        @NonNull
        String getStringResource(@NonNull String str, @NonNull String str2);
    }

    public LocalizationChannel(@NonNull DartExecutor dartExecutor) {
        s sVar = new s() { // from class: io.flutter.embedding.engine.systemchannels.LocalizationChannel.1
            @Override // pg.s
            public void onMethodCall(@NonNull r rVar, @NonNull t tVar) {
                if (LocalizationChannel.this.localizationMessageHandler == null) {
                    return;
                }
                String str = rVar.f19112a;
                str.getClass();
                if (!str.equals("Localization.getStringResource")) {
                    tVar.notImplemented();
                    return;
                }
                JSONObject jSONObject = (JSONObject) rVar.f19113b;
                try {
                    tVar.success(LocalizationChannel.this.localizationMessageHandler.getStringResource(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
                } catch (JSONException e) {
                    tVar.error(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, e.getMessage(), null);
                }
            }
        };
        this.handler = sVar;
        u uVar = new u(dartExecutor, "flutter/localization", p.f19111a, null);
        this.channel = uVar;
        uVar.b(sVar);
    }

    public void sendLocales(@NonNull List<Locale> list) {
        ArrayList arrayList = new ArrayList();
        for (Locale locale : list) {
            locale.getLanguage();
            locale.getCountry();
            locale.getVariant();
            arrayList.add(locale.getLanguage());
            arrayList.add(locale.getCountry());
            arrayList.add(locale.getScript());
            arrayList.add(locale.getVariant());
        }
        this.channel.a("setLocale", arrayList, null);
    }

    public void setLocalizationMessageHandler(@Nullable LocalizationMessageHandler localizationMessageHandler) {
        this.localizationMessageHandler = localizationMessageHandler;
    }
}

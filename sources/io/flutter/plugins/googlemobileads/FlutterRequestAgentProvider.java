package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
class FlutterRequestAgentProvider {
    static final String GAME_VERSION_KEY = "io.flutter.plugins.googlemobileads.FLUTTER_GAME_TEMPLATE_VERSION";
    static final String NEWS_VERSION_KEY = "io.flutter.plugins.googlemobileads.FLUTTER_NEWS_TEMPLATE_VERSION";

    @Nullable
    private String gameTemplateVersion;

    @Nullable
    private String newsTemplateVersion;

    public FlutterRequestAgentProvider(Context context) {
        processGameAndNewsTemplateVersions(context);
    }

    private void processGameAndNewsTemplateVersions(Context context) {
        try {
            ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? context.getApplicationContext().getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L)) : context.getApplicationContext().getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                this.gameTemplateVersion = bundle.getString(GAME_VERSION_KEY);
                this.newsTemplateVersion = applicationInfo.metaData.getString(NEWS_VERSION_KEY);
            }
        } catch (PackageManager.NameNotFoundException | ClassCastException unused) {
        }
    }

    public String getRequestAgent() {
        StringBuilder sb2 = new StringBuilder(Constants.REQUEST_AGENT_PREFIX_VERSIONED);
        if (this.newsTemplateVersion != null) {
            sb2.append("_News-");
            sb2.append(this.newsTemplateVersion);
        }
        if (this.gameTemplateVersion != null) {
            sb2.append("_Game-");
            sb2.append(this.gameTemplateVersion);
        }
        return sb2.toString();
    }
}

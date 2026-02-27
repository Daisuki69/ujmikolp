package androidx.privacysandbox.ads.adservices.adselection;

import android.adservices.appsetid.AppSetId;
import android.adservices.appsetid.AppSetIdManager;
import android.adservices.common.AdData;
import android.adservices.customaudience.CustomAudienceManager;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ Class D() {
        return CustomAudienceManager.class;
    }

    public static /* synthetic */ android.adservices.adselection.ReportImpressionRequest b(long j, android.adservices.adselection.AdSelectionConfig adSelectionConfig) {
        return new android.adservices.adselection.ReportImpressionRequest(j, adSelectionConfig);
    }

    public static /* bridge */ /* synthetic */ AppSetId c(Object obj) {
        return (AppSetId) obj;
    }

    public static /* bridge */ /* synthetic */ AppSetIdManager e(Object obj) {
        return (AppSetIdManager) obj;
    }

    public static /* synthetic */ AdData.Builder f() {
        return new AdData.Builder();
    }

    public static /* bridge */ /* synthetic */ CustomAudienceManager u(Object obj) {
        return (CustomAudienceManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class x() {
        return AppSetIdManager.class;
    }

    public static /* synthetic */ void z() {
    }
}

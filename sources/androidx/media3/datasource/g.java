package androidx.media3.datasource;

import android.adservices.adid.AdId;
import android.adservices.adid.AdIdManager;
import android.adservices.adselection.AdSelectionConfig;
import android.adservices.adselection.AdSelectionManager;
import android.adservices.adselection.AdSelectionOutcome;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class g {
    public static /* bridge */ /* synthetic */ Class B() {
        return AdSelectionManager.class;
    }

    public static /* bridge */ /* synthetic */ AdId c(Object obj) {
        return (AdId) obj;
    }

    public static /* bridge */ /* synthetic */ AdIdManager e(Object obj) {
        return (AdIdManager) obj;
    }

    public static /* synthetic */ AdSelectionConfig.Builder f() {
        return new AdSelectionConfig.Builder();
    }

    public static /* bridge */ /* synthetic */ AdSelectionManager n(Object obj) {
        return (AdSelectionManager) obj;
    }

    public static /* bridge */ /* synthetic */ AdSelectionOutcome o(Object obj) {
        return (AdSelectionOutcome) obj;
    }

    public static /* bridge */ /* synthetic */ Class p() {
        return AdIdManager.class;
    }

    public static /* bridge */ /* synthetic */ void x(Object obj) {
    }
}

package androidx.core.os;

import android.adservices.adselection.AdSelectionFromOutcomesConfig;
import android.adservices.adselection.GetAdSelectionDataOutcome;
import android.adservices.adselection.GetAdSelectionDataRequest;
import android.adservices.adselection.PersistAdSelectionResultRequest;
import android.os.ProfilingManager;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ AdSelectionFromOutcomesConfig.Builder b() {
        return new AdSelectionFromOutcomesConfig.Builder();
    }

    public static /* bridge */ /* synthetic */ GetAdSelectionDataOutcome h(Object obj) {
        return (GetAdSelectionDataOutcome) obj;
    }

    public static /* synthetic */ GetAdSelectionDataRequest.Builder i() {
        return new GetAdSelectionDataRequest.Builder();
    }

    public static /* synthetic */ PersistAdSelectionResultRequest.Builder m() {
        return new PersistAdSelectionResultRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ ProfilingManager s(Object obj) {
        return (ProfilingManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class t() {
        return ProfilingManager.class;
    }
}

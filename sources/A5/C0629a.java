package a5;

import a.AbstractC0617a;
import android.util.Log;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import java.util.Map;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: a5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0629a implements OnInitializationCompleteListener {
    @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
    public final void onInitializationComplete(InitializationStatus initializationStatus) {
        Map<String, AdapterStatus> adapterStatusMap = initializationStatus.getAdapterStatusMap();
        j.f(adapterStatusMap, "getAdapterStatusMap(...)");
        Log.d("AdKitManager", "Ads initialization complete: " + adapterStatusMap);
        AbstractC0617a.f6972a = true;
    }
}

package L1;

import android.app.Activity;

/* JADX INFO: loaded from: classes2.dex */
public interface g {
    boolean canRequestAds();

    int getConsentStatus();

    f getPrivacyOptionsRequirementStatus();

    boolean isConsentFormAvailable();

    void requestConsentInfoUpdate(Activity activity, h hVar, e eVar, d dVar);

    void reset();
}

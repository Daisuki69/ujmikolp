package io.flutter.plugins.googlemobileads.usermessagingplatform;

import A3.i;
import L1.h;
import android.content.Context;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
class ConsentRequestParametersWrapper {

    @Nullable
    private final ConsentDebugSettingsWrapper debugSettings;

    @Nullable
    private final Boolean tfuac;

    public ConsentRequestParametersWrapper(@Nullable Boolean bool, @Nullable ConsentDebugSettingsWrapper consentDebugSettingsWrapper) {
        this.tfuac = bool;
        this.debugSettings = consentDebugSettingsWrapper;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConsentRequestParametersWrapper)) {
            return false;
        }
        ConsentRequestParametersWrapper consentRequestParametersWrapper = (ConsentRequestParametersWrapper) obj;
        return Objects.equals(this.tfuac, consentRequestParametersWrapper.getTfuac()) && Objects.equals(this.debugSettings, consentRequestParametersWrapper.getDebugSettings());
    }

    public h getAsConsentRequestParameters(Context context) {
        i iVar = new i();
        Boolean bool = this.tfuac;
        if (bool != null) {
            iVar.f41b = bool.booleanValue();
        }
        ConsentDebugSettingsWrapper consentDebugSettingsWrapper = this.debugSettings;
        if (consentDebugSettingsWrapper != null) {
            iVar.c = consentDebugSettingsWrapper.getAsConsentDebugSettings(context);
        }
        return new h(iVar);
    }

    @Nullable
    public ConsentDebugSettingsWrapper getDebugSettings() {
        return this.debugSettings;
    }

    @Nullable
    public Boolean getTfuac() {
        return this.tfuac;
    }

    public int hashCode() {
        return Objects.hash(this.tfuac, this.debugSettings);
    }
}

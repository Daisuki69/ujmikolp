package io.flutter.plugins.googlemobileads.usermessagingplatform;

import F.i;
import android.content.Context;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
class ConsentDebugSettingsWrapper {

    @Nullable
    private final Integer debugGeography;

    @Nullable
    private final List<String> testIdentifiers;

    public ConsentDebugSettingsWrapper(@Nullable Integer num, @Nullable List<String> list) {
        this.debugGeography = num;
        this.testIdentifiers = list;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConsentDebugSettingsWrapper)) {
            return false;
        }
        ConsentDebugSettingsWrapper consentDebugSettingsWrapper = (ConsentDebugSettingsWrapper) obj;
        return Objects.equals(this.debugGeography, consentDebugSettingsWrapper.getDebugGeography()) && Objects.equals(this.testIdentifiers, consentDebugSettingsWrapper.getTestIdentifiers());
    }

    public L1.a getAsConsentDebugSettings(Context context) {
        i iVar = new i(context);
        Integer num = this.debugGeography;
        if (num != null) {
            iVar.c = num.intValue();
        }
        List<String> list = this.testIdentifiers;
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                ((ArrayList) iVar.f1504d).add(it.next());
            }
        }
        return iVar.d();
    }

    @Nullable
    public Integer getDebugGeography() {
        return this.debugGeography;
    }

    @Nullable
    public List<String> getTestIdentifiers() {
        return this.testIdentifiers;
    }

    public int hashCode() {
        return Objects.hash(this.debugGeography, this.testIdentifiers);
    }
}

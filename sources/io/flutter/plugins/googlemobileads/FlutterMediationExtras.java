package io.flutter.plugins.googlemobileads;

import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FlutterMediationExtras {
    Map<String, Object> extras;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FlutterMediationExtras) {
            return Objects.equals(this.extras, ((FlutterMediationExtras) obj).extras);
        }
        return false;
    }

    public abstract Pair<Class<? extends MediationExtrasReceiver>, Bundle> getMediationExtras();

    public int hashCode() {
        return Objects.hash(this.extras);
    }

    public void setMediationExtras(Map<String, Object> map) {
        this.extras = map;
    }
}

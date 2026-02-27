package X2;

import We.s;
import androidx.camera.video.AudioStats;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements W2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6524b;

    public q(String str, int i) {
        this.f6523a = str;
        this.f6524b = i;
    }

    public final boolean a() {
        if (this.f6524b == 0) {
            return false;
        }
        String strTrim = d().trim();
        if (k.e.matcher(strTrim).matches()) {
            return true;
        }
        if (k.f.matcher(strTrim).matches()) {
            return false;
        }
        throw new IllegalArgumentException(s.j("[Value: ", strTrim, "] cannot be converted to a boolean."));
    }

    public final double b() {
        if (this.f6524b == 0) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        String strTrim = d().trim();
        try {
            return Double.valueOf(strTrim).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(s.j("[Value: ", strTrim, "] cannot be converted to a double."), e);
        }
    }

    public final long c() {
        if (this.f6524b == 0) {
            return 0L;
        }
        String strTrim = d().trim();
        try {
            return Long.valueOf(strTrim).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(s.j("[Value: ", strTrim, "] cannot be converted to a long."), e);
        }
    }

    public final String d() {
        return this.f6524b == 0 ? "" : this.f6523a;
    }
}

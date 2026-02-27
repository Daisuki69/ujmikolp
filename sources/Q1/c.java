package Q1;

import androidx.camera.video.AudioStats;
import qk.i;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5200a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d10) {
        if (Math.getExponent(d10) <= 1023) {
            if (d10 != AudioStats.AUDIO_AMPLITUDE_NONE) {
                i.g("not a normal value", Math.getExponent(d10) <= 1023);
                int exponent = Math.getExponent(d10);
                long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10) & 4503599627370495L;
                if (52 - Long.numberOfTrailingZeros(exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L) <= Math.getExponent(d10)) {
                }
            }
            return true;
        }
        return false;
    }
}

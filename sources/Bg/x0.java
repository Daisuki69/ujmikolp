package bg;

import com.dynatrace.android.agent.Global;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f9138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f9139b;

    public x0(double d10) {
        this.f9138a = Math.cos(Math.toRadians(d10));
        this.f9139b = Math.sin(Math.toRadians(d10));
    }

    public final w0 a(double d10, double d11) {
        double radians = Math.toRadians(d10);
        double radians2 = Math.toRadians(d11);
        double dCos = Math.cos(radians2) * Math.cos(radians) * 6378137.0d;
        double dSin = Math.sin(radians2) * Math.cos(radians) * 6378137.0d;
        double dSin2 = Math.sin(radians) * 6378137.0d;
        double d12 = this.f9138a;
        double d13 = this.f9139b;
        double d14 = (d12 * dSin) - (d13 * dSin2);
        double d15 = (dSin2 * d12) + (dSin * d13);
        double d16 = (d13 * d15) + (d12 * dCos);
        return new w0(Math.toDegrees(Math.asin(((d15 * d12) + ((-dCos) * d13)) / 6378137.0d)), Math.toDegrees(Math.atan2((d12 * d14) + (d13 * d16), (d12 * d16) - (d13 * d14))));
    }

    public final String b(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Object[] array = C2576A.T(str, new String[]{Global.SEMICOLON}, 6).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String[] strArr = (String[]) array;
        try {
            w0 w0VarA = a(Double.parseDouble(strArr[0]), Double.parseDouble(strArr[1]));
            return String.valueOf(w0VarA.f9134a) + Global.SEMICOLON + w0VarA.f9135b;
        } catch (Exception unused) {
            return null;
        }
    }
}

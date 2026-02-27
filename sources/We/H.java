package We;

import android.graphics.BitmapFactory;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes4.dex */
public abstract class H {
    public static void a(int i, int i4, int i6, int i10, BitmapFactory.Options options, F f) {
        int iMin;
        double dFloor;
        if (i10 > i4 || i6 > i) {
            if (i4 == 0) {
                dFloor = Math.floor(i6 / i);
            } else if (i == 0) {
                dFloor = Math.floor(i10 / i4);
            } else {
                int iFloor = (int) Math.floor(i10 / i4);
                int iFloor2 = (int) Math.floor(i6 / i);
                f.getClass();
                iMin = Math.min(iFloor, iFloor2);
            }
            iMin = (int) dFloor;
        } else {
            iMin = 1;
        }
        options.inSampleSize = iMin;
        options.inJustDecodeBounds = false;
    }

    public static BitmapFactory.Options c(F f) {
        boolean zA = f.a();
        if (!zA) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = zA;
        options.inInputShareable = false;
        options.inPurgeable = false;
        return options;
    }

    public abstract boolean b(F f);

    public int d() {
        return 0;
    }

    public abstract Q3.b e(F f, int i);

    public boolean f(NetworkInfo networkInfo) {
        return false;
    }
}

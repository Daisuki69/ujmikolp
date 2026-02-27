package of;

import dOYHB6.tiZVw8.numX49;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f18845a = Charset.forName(numX49.tnTj78("bQuPf"));

    public static short a(short s9) {
        return (short) (((s9 & 255) << 8) | ((65280 & s9) >>> 8));
    }

    public static void b(long j, long j6, long j7) {
        if ((j6 | j7) < 0 || j6 > j || j - j6 < j7) {
            StringBuilder sbS = androidx.camera.core.impl.a.s(j, numX49.tnTj78("bQuP1"), numX49.tnTj78("bQuPn"));
            sbS.append(j6);
            throw new ArrayIndexOutOfBoundsException(androidx.media3.datasource.cache.c.j(j7, numX49.tnTj78("bQuPx"), sbS));
        }
    }
}

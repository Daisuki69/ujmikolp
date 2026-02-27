package Je;

import G7.F;
import android.media.MediaDrm;
import android.os.Build;
import cj.C1129o;
import cj.C1132s;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.UUID;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UUID f2511a = new UUID(-1301668207276963122L, -6645017420763422227L);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final UUID f2512b = new UUID(-7348484286925749626L, -6083546864340672619L);
    public static final UUID c = new UUID(-2129748144642739255L, 8654423357094679310L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final UUID f2513d = new UUID(1186680826959645954L, -5988876978535335093L);

    public static String a(byte[] bArr) {
        if (bArr.length == 0) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            j.f(messageDigest, "getInstance(...)");
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            j.f(bArrDigest, "digest(...)");
            return C1129o.v(bArrDigest, "", new F(9), 30);
        } catch (Exception unused) {
            yk.a.e();
            return null;
        }
    }

    public static final String b() {
        Iterator it = C1132s.g(f2511a, f2512b, c, f2513d).iterator();
        while (true) {
            MediaDrm mediaDrm = null;
            if (!it.hasNext()) {
                return null;
            }
            UUID uuid = (UUID) it.next();
            try {
                try {
                    if (MediaDrm.isCryptoSchemeSupported(uuid)) {
                        MediaDrm mediaDrm2 = new MediaDrm(uuid);
                        try {
                            byte[] propertyByteArray = new MediaDrm(uuid).getPropertyByteArray("deviceUniqueId");
                            j.f(propertyByteArray, "getPropertyByteArray(...)");
                            String strA = a(propertyByteArray);
                            if (strA != null) {
                                if (Build.VERSION.SDK_INT >= 28) {
                                    mediaDrm2.release();
                                } else {
                                    mediaDrm2.release();
                                }
                                return strA;
                            }
                            mediaDrm = mediaDrm2;
                        } catch (Exception unused) {
                            mediaDrm = mediaDrm2;
                            yk.a.e();
                            if (Build.VERSION.SDK_INT >= 28) {
                                if (mediaDrm != null) {
                                    mediaDrm.release();
                                }
                            } else if (mediaDrm != null) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            mediaDrm = mediaDrm2;
                            if (Build.VERSION.SDK_INT >= 28) {
                                if (mediaDrm != null) {
                                    mediaDrm.release();
                                }
                            } else if (mediaDrm != null) {
                                mediaDrm.release();
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception unused2) {
            }
            if (Build.VERSION.SDK_INT >= 28) {
                if (mediaDrm != null) {
                    mediaDrm.release();
                }
            } else if (mediaDrm != null) {
                mediaDrm.release();
            }
        }
    }
}

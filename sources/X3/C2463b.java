package x3;

import We.s;
import android.graphics.Bitmap;
import android.media.Image;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.mlkit.common.MlKitException;
import java.nio.ByteBuffer;
import w3.C2376a;

/* JADX INFO: renamed from: x3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2463b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final GmsLogger f20894a = new GmsLogger("MLKitImageUtils", "");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2463b f20895b = new C2463b();

    public static IObjectWrapper a(C2376a c2376a) throws MlKitException {
        int i = c2376a.f;
        if (i == -1) {
            return ObjectWrapper.wrap((Bitmap) Preconditions.checkNotNull(c2376a.f20685a));
        }
        if (i != 17) {
            if (i == 35) {
                return ObjectWrapper.wrap(null);
            }
            if (i != 842094169) {
                throw new MlKitException(s.f(c2376a.f, "Unsupported image format: "), 3);
            }
        }
        return ObjectWrapper.wrap((ByteBuffer) Preconditions.checkNotNull(c2376a.f20686b));
    }

    public static int b(C2376a c2376a) {
        int i = c2376a.f;
        if (i == -1) {
            return ((Bitmap) Preconditions.checkNotNull(c2376a.f20685a)).getAllocationByteCount();
        }
        if (i == 17 || i == 842094169) {
            return ((ByteBuffer) Preconditions.checkNotNull(c2376a.f20686b)).limit();
        }
        if (i != 35) {
            return 0;
        }
        return (((Image.Plane[]) Preconditions.checkNotNull(null))[0].getBuffer().limit() * 3) / 2;
    }
}

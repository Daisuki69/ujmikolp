package Q4;

import M8.A0;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import bj.AbstractC1039j;
import bj.C1030a;
import bj.C1037h;
import cj.C1132s;
import com.paymaya.PayMayaApplication;
import defpackage.Dimension;
import defpackage.Media;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class D extends F4.a {
    public static final Uri e;
    public static final Uri f;
    public final PayMayaApplication c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f5224d;

    static {
        Uri contentUri = MediaStore.Files.getContentUri("external");
        kotlin.jvm.internal.j.f(contentUri, "getContentUri(\"external\")");
        e = contentUri;
        Uri contentUri2 = MediaStore.Files.getContentUri("internal");
        kotlin.jvm.internal.j.f(contentUri2, "getContentUri(\"internal\")");
        f = contentUri2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(PayMayaApplication context) {
        super(context);
        kotlin.jvm.internal.j.g(context, "context");
        this.c = context;
        this.f5224d = new ArrayList();
    }

    @Override // F4.a
    public final void a() {
        Bj.H.w(F4.a.c(), null, null, new C(this, Build.VERSION.SDK_INT >= 33 ? C1132s.g("android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES") : cj.r.c("android.permission.READ_EXTERNAL_STORAGE"), null), 3);
    }

    @Override // F4.a
    public final String b() {
        return "media";
    }

    public final void e(Cursor cursor, int i, int i4, int i6, int i10, int i11, int i12, int i13, Integer num) {
        Object objA;
        try {
            C1037h.a aVar = C1037h.f9166b;
            String string = cursor.getString(i);
            String string2 = cursor.getString(i4);
            int i14 = cursor.getInt(i6);
            int i15 = cursor.getInt(i10);
            String string3 = cursor.getString(i11);
            String string4 = cursor.getString(i12);
            Long lValueOf = cursor.isNull(i13) ? null : Long.valueOf(cursor.getLong(i13));
            if (lValueOf != null) {
                long jLongValue = lValueOf.longValue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                long millis = TimeUnit.SECONDS.toMillis(jLongValue);
                if (millis <= jCurrentTimeMillis) {
                    lValueOf = Long.valueOf(millis);
                }
            } else {
                lValueOf = null;
            }
            this.f5224d.add(new Media(string, string4, string2, new Dimension(Integer.valueOf(i14), Integer.valueOf(i15), null, 4, null), lValueOf != null ? E1.c.q(lValueOf) : null, string3, num != null ? cursor.getString(num.intValue()) : null, null, 128, null));
            objA = Unit.f18162a;
        } catch (Throwable th2) {
            C1037h.a aVar2 = C1037h.f9166b;
            objA = AbstractC1039j.a(th2);
        }
        Throwable thA = C1037h.a(objA);
        if (thA != null) {
            String strB = C1030a.b(thA);
            String strC = kotlin.jvm.internal.z.a(D.class).c();
            if (strC == null) {
                strC = "CoroutineScopedExtractor";
            }
            A0.w(2, strB, strC);
            G4.b bVar = this.f1548b;
            if (bVar != null) {
                bVar.a(thA);
            }
        }
    }
}

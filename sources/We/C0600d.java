package We;

import android.graphics.Path;
import android.graphics.PathMeasure;
import dOYHB6.tiZVw8.numX49;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: renamed from: We.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0600d extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6384a;

    public /* synthetic */ C0600d(int i) {
        this.f6384a = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f6384a) {
            case 0:
                return new StringBuilder(numX49.tnTj78("bkRW"));
            case 1:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(numX49.tnTj78("bkRl"), Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(ef.c.f16666g);
                return simpleDateFormat;
            case 2:
                return new char[1024];
            case 3:
                return new PathMeasure();
            case 4:
                return new Path();
            case 5:
                return new Path();
            default:
                return new float[4];
        }
    }
}

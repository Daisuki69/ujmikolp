package w2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import u2.InterfaceC2297e;
import u2.InterfaceC2298f;

/* JADX INFO: renamed from: w2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2372c implements InterfaceC2297e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f20677a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f20677a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // u2.InterfaceC2293a
    public final void encode(Object obj, Object obj2) {
        ((InterfaceC2298f) obj2).add(f20677a.format((Date) obj));
    }
}

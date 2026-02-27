package Tg;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeZone f5826a = TimeZone.getTimeZone("GMT");

    public static final d a(Long l6) {
        Calendar calendar = Calendar.getInstance(f5826a, Locale.ROOT);
        j.d(calendar);
        if (l6 != null) {
            calendar.setTimeInMillis(l6.longValue());
        }
        int i = calendar.get(16) + calendar.get(15);
        int i4 = calendar.get(13);
        int i6 = calendar.get(12);
        int i10 = calendar.get(11);
        int i11 = (calendar.get(7) + 5) % 7;
        f.f5834a.getClass();
        f fVar = (f) f.c.get(i11);
        int i12 = calendar.get(5);
        int i13 = calendar.get(6);
        mg.c cVar = e.f5832a;
        int i14 = calendar.get(2);
        cVar.getClass();
        return new d(i4, i6, i10, fVar, i12, i13, (e) e.c.get(i14), calendar.get(1), calendar.getTimeInMillis() + ((long) i));
    }
}

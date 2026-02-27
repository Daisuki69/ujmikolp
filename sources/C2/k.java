package C2;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p3.C2011b;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f686b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static k f687d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2011b f688a;

    public k(C2011b c2011b) {
        this.f688a = c2011b;
    }

    public final boolean a(D2.b bVar) {
        if (TextUtils.isEmpty(bVar.c)) {
            return true;
        }
        long j = bVar.f + bVar.e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f688a.getClass();
        return j < timeUnit.toSeconds(System.currentTimeMillis()) + f686b;
    }
}

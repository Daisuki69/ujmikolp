package V1;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f6031g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};
    public static final SimpleDateFormat h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6033b;
    public final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Date f6034d;
    public final long e;
    public final long f;

    public a(String str, String str2, String str3, Date date, long j, long j6) {
        this.f6032a = str;
        this.f6033b = str2;
        this.c = str3;
        this.f6034d = date;
        this.e = j;
        this.f = j6;
    }

    public final Y1.a a() {
        Y1.a aVar = new Y1.a();
        aVar.f6722a = "frc";
        aVar.m = this.f6034d.getTime();
        aVar.f6723b = this.f6032a;
        aVar.c = this.f6033b;
        String str = this.c;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        aVar.f6724d = str;
        aVar.e = this.e;
        aVar.j = this.f;
        return aVar;
    }
}

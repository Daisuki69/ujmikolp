package E;

import We.s;
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import dOYHB6.tiZVw8.numX49;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1204b;
    public final Context c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CleverTapInstanceConfig f1205d;
    public final long e;
    public final int f;

    public a(String str, boolean z4, Context context, CleverTapInstanceConfig cleverTapInstanceConfig, long j) {
        this.f1203a = str;
        this.f1204b = z4;
        this.c = context;
        this.f1205d = cleverTapInstanceConfig;
        this.e = j;
        this.f = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.b(this.f1203a, aVar.f1203a) && this.f1204b == aVar.f1204b && j.b(this.c, aVar.c) && j.b(this.f1205d, aVar.f1205d) && this.e == aVar.e && this.f == aVar.f;
    }

    public final int hashCode() {
        String str = this.f1203a;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + (this.f1204b ? 1231 : 1237)) * 31;
        Context context = this.c;
        int iHashCode2 = (iHashCode + (context == null ? 0 : context.hashCode())) * 31;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f1205d;
        int iHashCode3 = cleverTapInstanceConfig != null ? cleverTapInstanceConfig.hashCode() : 0;
        long j = this.e;
        return ((((iHashCode2 + iHashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(numX49.tnTj78("P4e"));
        sb2.append(this.f1203a);
        sb2.append(numX49.tnTj78("P48"));
        sb2.append(this.f1204b);
        sb2.append(numX49.tnTj78("P4C"));
        sb2.append(this.c);
        sb2.append(numX49.tnTj78("P44"));
        sb2.append(this.f1205d);
        sb2.append(numX49.tnTj78("P4o"));
        sb2.append(this.e);
        sb2.append(numX49.tnTj78("P4K"));
        return s.m(sb2, this.f, ')');
    }

    public /* synthetic */ a(String str, boolean z4, Context context, CleverTapInstanceConfig cleverTapInstanceConfig, long j, int i) {
        this(str, (i & 2) != 0 ? false : z4, (i & 4) != 0 ? null : context, (i & 8) != 0 ? null : cleverTapInstanceConfig, (i & 16) != 0 ? -1L : j);
    }
}

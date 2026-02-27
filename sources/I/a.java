package I;

import androidx.room.FtsOptions;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes2.dex */
public enum a {
    f2192b(FtsOptions.TOKENIZER_SIMPLE),
    c("simple-image"),
    f2193d(numX49.tnTj78("P32")),
    e(numX49.tnTj78("P3r")),
    f(numX49.tnTj78("P3k")),
    f2194g(numX49.tnTj78("P3u"));


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2195a;

    a(String str) {
        this.f2195a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f2195a;
    }
}

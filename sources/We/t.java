package We;

import android.content.Context;
import android.net.Uri;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends C0606j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f6421d = {numX49.tnTj78("bkRS")};
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Context context, int i) {
        super(context, 0);
        this.c = i;
    }

    @Override // We.C0606j, We.H
    public final boolean b(F f) {
        switch (this.c) {
            case 0:
                Uri uri = f.f6354a;
                return numX49.tnTj78("bkRd").equals(uri.getScheme()) && numX49.tnTj78("bkRi").equals(uri.getAuthority());
            default:
                return numX49.tnTj78("bkRj").equals(f.f6354a.getScheme());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012d  */
    @Override // We.C0606j, We.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Q3.b e(We.F r20, int r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: We.t.e(We.F, int):Q3.b");
    }
}

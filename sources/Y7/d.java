package Y7;

import cj.C1132s;
import cj.t;
import com.paymaya.domain.model.Favorite;
import com.paymaya.domain.model.FavoriteCount;
import com.paymaya.domain.store.Q;
import java.util.ArrayList;
import java.util.List;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends AbstractC2509a implements X7.c {
    public static final List e = C1132s.g("billspay", "bank", "moneysend");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Q f6779d;

    public d(Q q9, Uh.d dVar) {
        super(dVar);
        this.f6779d = q9;
    }

    public static ArrayList k(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(W7.e.f6331a);
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(t.l(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i4 = i + 1;
            if (i < 0) {
                C1132s.k();
                throw null;
            }
            arrayList2.add(new W7.d((Favorite) obj, i == C1132s.f(list)));
            i = i4;
        }
        arrayList.addAll(arrayList2);
        arrayList.add(W7.a.f6323a);
        return arrayList;
    }

    public static String l(FavoriteCount favoriteCount) {
        return favoriteCount == null ? "" : androidx.camera.core.impl.a.h(" (", favoriteCount.mUsed(), "/", favoriteCount.mLimit(), ")");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0230  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(java.util.List r19) {
        /*
            Method dump skipped, instruction units count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y7.d.m(java.util.List):void");
    }
}

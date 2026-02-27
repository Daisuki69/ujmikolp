package Y7;

import com.paymaya.domain.model.FavoriteDetails;
import com.paymaya.domain.store.Q;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends AbstractC2509a implements X7.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f6777d;
    public final Q e;
    public FavoriteDetails f;

    public b(com.paymaya.data.preference.a aVar, Q q9, Uh.d dVar) {
        super(dVar);
        this.f6777d = aVar;
        this.e = q9;
    }

    public static String k(FavoriteDetails favoriteDetails) {
        String strMType = favoriteDetails != null ? favoriteDetails.mType() : null;
        if (strMType == null) {
            return "";
        }
        int iHashCode = strMType.hashCode();
        return iHashCode != -1712615352 ? iHashCode != 3016252 ? (iHashCode == 890552284 && strMType.equals("billspay")) ? "bills_pay" : "" : !strMType.equals("bank") ? "" : "bank_transfer" : !strMType.equals("moneysend") ? "" : "send_money";
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0397 A[PHI: r1
  0x0397: PHI (r1v14 java.lang.String) = (r1v5 java.lang.String), (r1v16 java.lang.String) binds: [B:137:0x03a5, B:130:0x0394] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0399  */
    @Override // y5.AbstractC2509a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instruction units count: 1199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y7.b.j():void");
    }
}

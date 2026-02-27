package D8;

import com.paymaya.domain.model.KycBenefit;
import ej.C1449a;
import java.util.Comparator;

/* JADX INFO: renamed from: D8.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0213v implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return C1449a.a(((KycBenefit) obj).getOrder(), ((KycBenefit) obj2).getOrder());
    }
}

package L9;

import com.paymaya.domain.model.CreditTransactionItem;
import ej.C1449a;
import java.util.Comparator;

/* JADX INFO: renamed from: L9.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0330h implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return C1449a.a(((CreditTransactionItem) obj2).getTransactionId(), ((CreditTransactionItem) obj).getTransactionId());
    }
}

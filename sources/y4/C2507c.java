package y4;

import com.mastercard.mpqr.pushpayment.exception.InvalidTagValueException;
import com.mastercard.mpqr.pushpayment.exception.MissingTagException;
import java.util.List;

/* JADX INFO: renamed from: y4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2507c extends AbstractC2505a {
    public List e;

    @Override // y4.AbstractC2505a
    public final void j() throws InvalidTagValueException, MissingTagException {
        super.j();
        x4.d dVar = x4.d.f20911d;
        String strC = c(dVar);
        if (!this.e.contains(strC.toLowerCase())) {
            throw new InvalidTagValueException(x4.f.f20924q.f20927a, dVar, strC);
        }
    }
}

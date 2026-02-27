package y4;

import M8.A0;
import com.mastercard.mpqr.pushpayment.exception.InvalidTagValueException;
import com.mastercard.mpqr.pushpayment.exception.MissingTagException;
import java.io.Serializable;
import x4.EnumC2464a;

/* JADX INFO: renamed from: y4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2506b extends AbstractC2505a {
    public C2506b() {
        super(EnumC2464a.class, "", "62");
    }

    @Override // y4.AbstractC2505a
    public final void j() throws InvalidTagValueException, MissingTagException {
        super.j();
        for (int i = 50; i < 100; i++) {
            String strValueOf = String.valueOf(i);
            A0.t(strValueOf);
            strValueOf.getClass();
            if (this.f21056d.containsKey(strValueOf)) {
                Serializable serializableD = d(strValueOf);
                if (serializableD instanceof AbstractC2505a) {
                    ((AbstractC2505a) serializableD).j();
                }
            }
        }
    }
}

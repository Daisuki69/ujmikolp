package q6;

import android.view.View;
import com.paymaya.domain.model.BankTransferV3;
import com.paymaya.mayaui.banktransfer.view.activity.impl.MayaBankTransferActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: q6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2165b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaBankTransferActivity f19745b;
    public final /* synthetic */ BankTransferV3 c;

    public /* synthetic */ C2165b(MayaBankTransferActivity mayaBankTransferActivity, BankTransferV3 bankTransferV3, int i) {
        this.f19744a = i;
        this.f19745b = mayaBankTransferActivity;
        this.c = bankTransferV3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BankTransferV3 bankTransferV3 = this.c;
        MayaBankTransferActivity mayaBankTransferActivity = this.f19745b;
        View it = (View) obj;
        switch (this.f19744a) {
            case 0:
                int i = MayaBankTransferActivity.f11530s;
                j.g(it, "it");
                mayaBankTransferActivity.e2(bankTransferV3);
                break;
            default:
                int i4 = MayaBankTransferActivity.f11530s;
                j.g(it, "it");
                mayaBankTransferActivity.e2(bankTransferV3);
                break;
        }
        return Unit.f18162a;
    }
}

package q6;

import android.view.View;
import com.paymaya.mayaui.banktransfer.view.activity.impl.MayaBankTransferActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: q6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2164a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaBankTransferActivity f19743b;

    public /* synthetic */ C2164a(MayaBankTransferActivity mayaBankTransferActivity, int i) {
        this.f19742a = i;
        this.f19743b = mayaBankTransferActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MayaBankTransferActivity mayaBankTransferActivity = this.f19743b;
        View it = (View) obj;
        switch (this.f19742a) {
            case 0:
                int i = MayaBankTransferActivity.f11530s;
                j.g(it, "it");
                mayaBankTransferActivity.X1();
                break;
            default:
                int i4 = MayaBankTransferActivity.f11530s;
                j.g(it, "it");
                mayaBankTransferActivity.X1();
                break;
        }
        return Unit.f18162a;
    }
}

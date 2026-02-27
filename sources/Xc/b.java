package xc;

import com.paymaya.mayaui.common.view.widget.MayaDropDown;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f20933b = new b(0);
    public static final b c = new b(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20934a;

    public /* synthetic */ b(int i) {
        this.f20934a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20934a) {
            case 0:
                return Boolean.valueOf(obj instanceof MayaDropDown);
            default:
                return Boolean.valueOf(obj instanceof MayaProfileInputLayout);
        }
    }
}

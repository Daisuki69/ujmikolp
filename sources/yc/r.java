package yc;

import com.paymaya.mayaui.common.view.widget.MayaDropDown;
import com.paymaya.mayaui.common.view.widget.MayaProfileInputLayout;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class r implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f21127b = new r(0);
    public static final r c = new r(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f21128d = new r(2);
    public static final r e = new r(3);
    public static final r f = new r(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21129a;

    public /* synthetic */ r(int i) {
        this.f21129a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f21129a) {
            case 0:
                return Boolean.valueOf(obj instanceof MayaProfileInputLayout);
            case 1:
                return Boolean.valueOf(obj instanceof MayaDropDown);
            case 2:
                return Boolean.valueOf(obj instanceof MayaProfileInputLayout);
            case 3:
                return Boolean.valueOf(obj instanceof MayaDropDown);
            default:
                return Boolean.valueOf(obj instanceof MayaProfileInputLayout);
        }
    }
}

package M8;

import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class S implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final S f3221b = new S(0);
    public static final S c = new S(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3222a;

    public /* synthetic */ S(int i) {
        this.f3222a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3222a) {
        }
        return Boolean.valueOf(obj instanceof MayaInputLayout);
    }
}
